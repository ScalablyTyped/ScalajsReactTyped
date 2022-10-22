package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.sketchappStrings.styleBorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStyleBorder extends StObject {
  
  var _class: styleBorder
  
  var color: SketchMSColor
  
  var contextSettings: SketchMSGraphicsContextSettings
  
  var fillType: Double
  
  var gradient: SketchMSGradient
  
  var isEnabled: Double
  
  var position: Double
  
  var thickness: Double
}
object SketchMSStyleBorder {
  
  inline def apply(
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: Double,
    gradient: SketchMSGradient,
    isEnabled: Double,
    position: Double,
    thickness: Double
  ): SketchMSStyleBorder = {
    val __obj = js.Dynamic.literal(_class = "styleBorder", color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBorder]
  }
  
  extension [Self <: SketchMSStyleBorder](x: Self) {
    
    inline def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setContextSettings(value: SketchMSGraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    inline def setFillType(value: Double): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: SketchMSGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def set_class(value: styleBorder): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
