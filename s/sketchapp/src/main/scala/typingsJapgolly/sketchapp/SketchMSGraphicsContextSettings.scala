package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.sketchappStrings.graphicsContextSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSGraphicsContextSettings extends StObject {
  
  var _class: graphicsContextSettings
  
  var blendMode: SketchMSGraphicsContextSettingsBlendMode
  
  var opacity: Double
}
object SketchMSGraphicsContextSettings {
  
  inline def apply(blendMode: SketchMSGraphicsContextSettingsBlendMode, opacity: Double): SketchMSGraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = "graphicsContextSettings", blendMode = blendMode.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGraphicsContextSettings]
  }
  
  extension [Self <: SketchMSGraphicsContextSettings](x: Self) {
    
    inline def setBlendMode(value: SketchMSGraphicsContextSettingsBlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def set_class(value: graphicsContextSettings): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
