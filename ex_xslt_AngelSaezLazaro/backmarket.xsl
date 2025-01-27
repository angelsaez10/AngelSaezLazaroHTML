<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <head>
    <link rel="stylesheet" href="backmarket.css"></link>
    <title>Backmarket</title>
  </head>
  <body>  
    <h2>Backmarket</h2>
    <xsl:apply-templates select="backmarket/telefono"/>
  </body>
  </html>
</xsl:template>

<xsl:template match="telefono">
  <xsl:variable name="currency">
    <xsl:choose>
      <xsl:when test="precio/@moneda = 'euro'">€</xsl:when>
      <xsl:when test="precio/@moneda = 'dolar'">$</xsl:when>
      <xsl:otherwise>Incorrecto</xsl:otherwise>
    </xsl:choose>
  </xsl:variable>

  <div>
    <table>
        <td colspan="2" class="telefono"><b>Teléfono</b></td>
      <br/>
      
      <tr>
        <td><b>Marca:</b><xsl:value-of select="marca"/></td>
        <td><b>Modelo:</b><xsl:value-of select="modelo"/></td>
      </tr>

      <tr>
      <td><b>Sistema Operativo:</b><xsl:value-of select="sistop"/></td>
      <td><b>Pantalla:</b> <xsl:value-of select="pantalla"/><b> pulgadas</b></td>
      <tr/>

      <tr>
        <td colspan="2"><b>Almacenamiento</b></td>
      </tr>

      <tr>
      <td><b>Almacenamiento Interno:</b><xsl:value-of select="almacenamiento/interno"/><b> GB</b> </td>
      <td><b>RAM:</b> <xsl:value-of select="almacenamiento/ram"/><b> GB</b> </td>
      </tr>

      <tr>
        <td colspan="2"><b>Camaras</b></td>
      </tr>

      <tr>
      <td><b>Cámara Principal:</b> <xsl:value-of select="camaras/camara/@tamano"/><b><xsl:value-of select="camaras/camara/@medida"/></b></td>
      <td><b>Cámara Selfi:</b> <xsl:value-of select="camaras/camara/@tamano"/> <b><xsl:value-of select="camaras/camara/@medida"/></b></td>
      </tr>
      
      <tr>
      <td colspan="2" style="text-align: center;"><b>Precio:</b><xsl:value-of select="precio"/> <xsl:value-of select="$currency"/></td>
      </tr>

    </tr>
    <br/>
    </table>
  </div>
</xsl:template>

</xsl:stylesheet>
