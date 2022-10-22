package typingsJapgolly.glaze.anon

import typingsJapgolly.glaze.distTypesThemeMod.ScaleTokens
import typingsJapgolly.glaze.glazeStrings.animationDuration
import typingsJapgolly.glaze.glazeStrings.border
import typingsJapgolly.glaze.glazeStrings.borderRadius
import typingsJapgolly.glaze.glazeStrings.borderWidth
import typingsJapgolly.glaze.glazeStrings.boxShadow
import typingsJapgolly.glaze.glazeStrings.color
import typingsJapgolly.glaze.glazeStrings.fontFamily
import typingsJapgolly.glaze.glazeStrings.fontSize
import typingsJapgolly.glaze.glazeStrings.fontWeight
import typingsJapgolly.glaze.glazeStrings.letterSpacing
import typingsJapgolly.glaze.glazeStrings.lineHeight
import typingsJapgolly.glaze.glazeStrings.margin
import typingsJapgolly.glaze.glazeStrings.opacity
import typingsJapgolly.glaze.glazeStrings.width
import typingsJapgolly.glaze.glazeStrings.zIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderWidth extends StObject {
  
  var border: ScaleTokens[typingsJapgolly.glaze.glazeStrings.border]
  
  var borderWidth: ScaleTokens[typingsJapgolly.glaze.glazeStrings.borderWidth]
  
  var color: ScaleTokens[typingsJapgolly.glaze.glazeStrings.color]
  
  var duration: ScaleTokens[animationDuration]
  
  var fontFamily: ScaleTokens[typingsJapgolly.glaze.glazeStrings.fontFamily]
  
  var fontSize: ScaleTokens[typingsJapgolly.glaze.glazeStrings.fontSize]
  
  var fontWeight: ScaleTokens[typingsJapgolly.glaze.glazeStrings.fontWeight]
  
  var letterSpacing: ScaleTokens[typingsJapgolly.glaze.glazeStrings.letterSpacing]
  
  var lineHeight: ScaleTokens[typingsJapgolly.glaze.glazeStrings.lineHeight]
  
  var opacity: ScaleTokens[typingsJapgolly.glaze.glazeStrings.opacity]
  
  var radius: ScaleTokens[borderRadius]
  
  var shadow: ScaleTokens[boxShadow]
  
  var size: ScaleTokens[width]
  
  var spacing: ScaleTokens[margin]
  
  var zIndex: ScaleTokens[typingsJapgolly.glaze.glazeStrings.zIndex]
}
object BorderWidth {
  
  inline def apply(
    border: ScaleTokens[border],
    borderWidth: ScaleTokens[borderWidth],
    color: ScaleTokens[color],
    duration: ScaleTokens[animationDuration],
    fontFamily: ScaleTokens[fontFamily],
    fontSize: ScaleTokens[fontSize],
    fontWeight: ScaleTokens[fontWeight],
    letterSpacing: ScaleTokens[letterSpacing],
    lineHeight: ScaleTokens[lineHeight],
    opacity: ScaleTokens[opacity],
    radius: ScaleTokens[borderRadius],
    shadow: ScaleTokens[boxShadow],
    size: ScaleTokens[width],
    spacing: ScaleTokens[margin],
    zIndex: ScaleTokens[zIndex]
  ): BorderWidth = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidth]
  }
  
  extension [Self <: BorderWidth](x: Self) {
    
    inline def setBorder(value: ScaleTokens[border]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: ScaleTokens[borderWidth]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ScaleTokens[color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: ScaleTokens[animationDuration]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: ScaleTokens[fontFamily]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: ScaleTokens[fontSize]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: ScaleTokens[fontWeight]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: ScaleTokens[letterSpacing]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: ScaleTokens[lineHeight]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: ScaleTokens[opacity]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: ScaleTokens[borderRadius]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: ScaleTokens[boxShadow]): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setSize(value: ScaleTokens[width]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: ScaleTokens[margin]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: ScaleTokens[zIndex]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
