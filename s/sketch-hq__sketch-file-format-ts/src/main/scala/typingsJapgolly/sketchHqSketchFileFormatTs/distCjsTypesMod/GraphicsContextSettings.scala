package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.graphicsContextSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsContextSettings
  extends StObject
     with AnyObject {
  
  var _class: graphicsContextSettings
  
  var blendMode: BlendMode
  
  var opacity: Double
}
object GraphicsContextSettings {
  
  inline def apply(blendMode: BlendMode, opacity: Double): GraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = "graphicsContextSettings", blendMode = blendMode.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsContextSettings]
  }
  
  extension [Self <: GraphicsContextSettings](x: Self) {
    
    inline def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def set_class(value: graphicsContextSettings): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
