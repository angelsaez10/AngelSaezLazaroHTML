<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/persona">
  <html>
  <body>
    <h2 style="text-align:center;">Persona</h2>
    <div style="width:50%;border:1px solid;margin:auto;padding:5px;">
    <b>Nombre:</b>
    <xsl:value-of select="nombre"/><br/>
    <b>Edad:</b>
    <xsl:value-of select="edad"/><br/>
    <b>Contraseña:</b>
    <xsl:value-of select="password"/><br/>
    <b>Color favorito:</b>
    <xsl:value-of select="micolor"/><br/>
    <b>Sueldo:</b>
    <xsl:value-of select="sueldo"/>
    <xsl:value-of select="sueldo/@moneda"/>
    </div>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>