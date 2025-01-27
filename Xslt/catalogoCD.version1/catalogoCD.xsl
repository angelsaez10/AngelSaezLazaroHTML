<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/catalog">
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
    <xsl:for-each select="cd">
    <xsl:sort select="artist" />
    <!-- una FILA tr para cada CD -->
    <tr>
      <td><xsl:value-of select="title"/></td>
      <td><xsl:value-of select="artist"/></td>

      <!-- choose para el COUNTRY mmmmmmmmmmmmmmm -->
      <xsl:choose>
        <xsl:when test="country = 'USA'">
          <td class="amarillo"><xsl:value-of select="country"/></td>
        </xsl:when>
        <xsl:when test="country = 'UK'">
          <td class="celeste"><xsl:value-of select="country"/></td>
        </xsl:when>
        <xsl:otherwise>
          <td><xsl:value-of select="country"/></td>
        </xsl:otherwise>
      </xsl:choose>
      <!-- FIN choose mmmmmmmmmmmmmmmmmmmmmmmmmmm -->
     
      <td><xsl:value-of select="price"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>

</xsl:stylesheet>
