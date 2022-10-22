package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.sketchappStrings.MSInnerShadow
import typingsJapgolly.sketchapp.sketchappStrings.shadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSShadow extends StObject {
  
  var _class: shadow | MSInnerShadow
  
  var blurRadius: Double
  
  var color: SketchMSColor
  
  var contextSettings: SketchMSGraphicsContextSettings
  
  var isEnabled: Boolean
  
  var offsetX: Double
  
  var offsetY: Double
  
  var spread: Double
}
object SketchMSShadow {
  
  inline def apply(
    _class: shadow | MSInnerShadow,
    blurRadius: Double,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    isEnabled: Boolean,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): SketchMSShadow = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSShadow]
  }
  
  extension [Self <: SketchMSShadow](x: Self) {
    
    inline def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    inline def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setContextSettings(value: SketchMSGraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def set_class(value: shadow | MSInnerShadow): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
