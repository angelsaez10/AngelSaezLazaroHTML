<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!-- CIERRE CABECERA -->

<!-- TEMPLATE 1 -->
<xsl:template match="/viviendas"><!-- CARPETA 1 -->
        <html>
            <head>
                <link rel="stylesheet" href="Viviendas.css"/>
            </head>

            <body>
                <h2>Viviendas</h2>
                <div>
                    <xsl:apply-templates select="vivienda"/>
                </div>
            </body>
        </html>
</xsl:template> 
<!-- CIERRE TEMPLATE 1 -->


<!-- TEMPLATE 2 -->
<xsl:template match="vivienda"><!-- CARPETA 1.1 -->
<fieldset>
    <b><legend>Vivienda</legend></b><br/>
    <b>Direccion</b><br/>
    <xsl:value-of select="direccion"/><br/><br/>
    <b>Referencia Catastral</b><br/>
    <xsl:value-of select="refCatastral"/><br/><br/>
    <xsl:apply-templates select="habitaciones"/><br/>
    <xsl:apply-templates select="servicios"/><br/>
</fieldset>
</xsl:template>
<!-- CIERRE TEMPLATE 2 -->


<!-- TEMPLATE 3 -->
<xsl:template match="habitaciones"><!-- CARPETA 1.1.3 -->
<ul>
    <b>Habitaciones</b><br/><br/>
    <xsl:for-each select="habitacion"><!-- CARPETA 1.1.3.1 -->
        <li>
        Area:<xsl:value-of select="./@area"/> m2
        <xsl:text>&#x3000;</xsl:text><!-- &#x3000; PARA TABULAR -->
        Tipo:<xsl:value-of select="./@tipo"/><br/>
        </li>
    </xsl:for-each>
</ul>
</xsl:template>
<!-- CIERRE TEMPLATE 3 -->


<!-- TEMPLATE 4 -->
<xsl:template match="servicios"><!-- CARPETA 1.1.4 -->
<ul>
    <b>Servicios</b><br/><br/>
    <xsl:for-each select="servicio"><!-- CARPETA 1.1.4.1 -->
        <li>
        Servicio:<xsl:value-of select="."/> m2<!-- . PORQUE YA ESTAMOS EN LA RAIZ QUE SE NECESITA -->
        </li>
    </xsl:for-each>
</ul>
</xsl:template>
<!-- CIERRE TEMPLATE 4 -->


</xsl:stylesheet>