package typingsJapgolly.three.anon

import typingsJapgolly.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brightness extends StObject {
  
  var brightness: IUniform[Any]
  
  var contrast: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object Brightness {
  
  inline def apply(brightness: IUniform[Any], contrast: IUniform[Any], tDiffuse: IUniform[Any]): Brightness = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brightness]
  }
  
  extension [Self <: Brightness](x: Self) {
    
    inline def setBrightness(value: IUniform[Any]): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: IUniform[Any]): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
