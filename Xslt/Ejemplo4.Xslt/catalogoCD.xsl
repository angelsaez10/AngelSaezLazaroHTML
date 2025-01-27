<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
  <head>
    <style>
      .amarillo{
        background-color:yellow;
      }

      .morado{
        background-color:purple;
      }

      .naranja{
        background-color:orange;
      }

      .cian{
        background-color:cyan;
      }
    </style>
  </head>
<body>
  <h2>My CD Collection</h2>
  <table style="margin 0 auto" border="1">
    <tr bgcolor="#9acd32">
      <th>Title</th>
      <th>Artist</th>
      <th>Country</th>
    </tr>
    <xsl:for-each select="catalog/cd">
    <tr>
      <td><xsl:value-of select="title"/></td>
      <td><xsl:value-of select="artist"/></td>

  <xsl:choose>
        <xsl:when test="country='USA'">
            <td class="amarillo"><xsl:value-of select="country"/></td>
        </xsl:when>
        
        <xsl:when test="country='UK'">
            <td class="morado"><xsl:value-of select="country"/></td>
        </xsl:when>

        <xsl:when test="country='EU'">
            <td class="naranja"><xsl:value-of select="country"/></td>
        </xsl:when>

        <xsl:when test="country='Norway'">
            <td class="cian"><xsl:value-of select="country"/></td>
        </xsl:when>
    <xsl:otherwise>
      <td><xsl:value-of select="country"/></td>
    </xsl:otherwise>
  </xsl:choose> 
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
