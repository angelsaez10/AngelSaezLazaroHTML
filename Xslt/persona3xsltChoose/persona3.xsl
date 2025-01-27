<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <body>
    <h2 style="text-align:center;">Personas</h2>
    <div style="width:50%;border:1px solid;margin:auto;padding:5px;">

    <xsl:for-each select="persona">
      <p style="border:1px dotted; padding:3px;">
      <b>Nombre: </b>
      <xsl:value-of select="nombre"/><br/>
      <b>Edad: </b>

      <xsl:choose>
        <xsl:when test="edad &gt; 40">
          <span style="color:red;">
          <xsl:value-of select="edad"/><br/>
          </span>
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="edad"/><br/>
        </xsl:otherwise>
      </xsl:choose>

      <b>Contraseña: </b>
      <xsl:value-of select="password"/><br/>
      <b>Color favorito: </b>
      <xsl:value-of select="micolor"/><br/>
      <b>Sueldo: </b>
      <xsl:value-of select="sueldo"/><xsl:text> </xsl:text>
      <xsl:value-of select="sueldo/@moneda"/>
      </p>
    </xsl:for-each>

    </div>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>