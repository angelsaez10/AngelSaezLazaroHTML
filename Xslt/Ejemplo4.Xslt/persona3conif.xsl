<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/personas">
  <html>
  <body>
    <h2 style="text-align:center;">Personas</h2>
    <div style="width:50%;border:1px solid;margin:auto;padding:5px;">

    <xsl:for-each select="persona">
      <xsl:sort select="nombre"/>
      <p style="border:1px dotted; padding:3px;">
      <b>Nombre: </b>
      <xsl:value-of select="nombre"/><br/>
      <b>Edad: </b>

     
        <xsl:if test="edad >= 40">
          <span style="color:red;background-color:#ccc">
          <xsl:value-of select="edad"/><br/>
          </span>
        </xsl:if>
        <xsl:if test="30 > edad">
          <span style="color:yellow;background-color:#ccc">
          <xsl:value-of select="edad"/><br/>
          </span>
        </xsl:if>
        <xsl:if test="number(edad) &gt;= 30 and 50 &gt; number(edad)">
          <xsl:value-of select="edad"/><br/>
        </xsl:if>
      

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