<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
<html>
<head>
  <link rel="stylesheet" href="catalogoCD.css"></link>
</head>
<body>
  <h2>My CD Collection</h2>
  <table>
    <tr>    
      <th>Title</th><th>Artist</th><th>Country</th><th>Price</th>
    </tr>
    <!-- Se llama a otra plantilla con apply-templates -->
    <xsl:apply-templates select="catalog"/>
  </table>
</body>
</html>
</xsl:template>

<xsl:template match="catalog">
  <xsl:for-each select="cd">
    <xsl:sort select="artist" />
    <tr>
      <td><xsl:value-of select="title"/></td>
      <td><xsl:value-of select="artist"/></td>

      <!-- Se llama a otra plantilla con apply-templates -->
      <xsl:apply-templates select="country" />
      <xsl:apply-templates select="price" />
    </tr>
    </xsl:for-each>
</xsl:template>

<xsl:template match="country">
  <!-- choose para el COUNTRY mmmmmmmmmmmmmmm -->
  <xsl:choose>
    <xsl:when test=". = 'USA'">
      <td class="amarillo"><xsl:value-of select="."/></td>
    </xsl:when>
    <xsl:when test=". = 'UK'">
      <td class="celeste"><xsl:value-of select="."/></td>
    </xsl:when>
    <xsl:otherwise>
      <td><xsl:value-of select="."/></td>
    </xsl:otherwise>
  </xsl:choose>
  <!-- FIN choose mmmmmmmmmmmmmmmmmmmmmmmmmmm -->
</xsl:template>

<xsl:template match="price">
  <!-- choose para el PRICE mmmmmmmmmmmmmmm -->
  <xsl:choose>
    <xsl:when test=". > 9">
      <td class="amarillo"><xsl:value-of select="."/></td>
    </xsl:when>
    <xsl:when test=". > 8.50">
      <td class="celeste"><xsl:value-of select="."/></td>
    </xsl:when>
    <xsl:otherwise>
      <td><xsl:value-of select="."/></td>
    </xsl:otherwise>
  </xsl:choose>
  <!-- FIN choose mmmmmmmmmmmmmmmmmmmmmmmmmmm -->
</xsl:template>

</xsl:stylesheet>
