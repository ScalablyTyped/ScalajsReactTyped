package typingsJapgolly.nivoCore.mod

import typingsJapgolly.nivoCore.anon.Basic
import typingsJapgolly.nivoCore.anon.Domain
import typingsJapgolly.nivoCore.anon.FontSize
import typingsJapgolly.nivoCore.anon.Hidden
import typingsJapgolly.nivoCore.anon.Line
import typingsJapgolly.nivoCore.anon.LinePartialCSSProperties
import typingsJapgolly.nivoCore.anon.Link
import typingsJapgolly.nivoCore.anon.TextPartialCSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteTheme extends StObject {
  
  var annotations: Link
  
  var axis: Domain
  
  var background: String
  
  var crosshair: Line
  
  var dots: TextPartialCSSProperties
  
  var fontFamily: String
  
  var fontSize: Double
  
  var grid: LinePartialCSSProperties
  
  var labels: TextPartialCSSProperties
  
  var legends: Hidden
  
  var markers: FontSize
  
  var textColor: String
  
  var tooltip: Basic
}
object CompleteTheme {
  
  inline def apply(
    annotations: Link,
    axis: Domain,
    background: String,
    crosshair: Line,
    dots: TextPartialCSSProperties,
    fontFamily: String,
    fontSize: Double,
    grid: LinePartialCSSProperties,
    labels: TextPartialCSSProperties,
    legends: Hidden,
    markers: FontSize,
    textColor: String,
    tooltip: Basic
  ): CompleteTheme = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], crosshair = crosshair.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteTheme]
  }
  
  extension [Self <: CompleteTheme](x: Self) {
    
    inline def setAnnotations(value: Link): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAxis(value: Domain): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setCrosshair(value: Line): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    inline def setDots(value: TextPartialCSSProperties): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: LinePartialCSSProperties): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: TextPartialCSSProperties): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLegends(value: Hidden): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: FontSize): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Basic): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
