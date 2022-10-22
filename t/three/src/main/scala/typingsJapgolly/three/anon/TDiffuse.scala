package typingsJapgolly.three.anon

import typingsJapgolly.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TDiffuse extends StObject {
  
  var color: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object TDiffuse {
  
  inline def apply(color: IUniform[Any], tDiffuse: IUniform[Any]): TDiffuse = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDiffuse]
  }
  
  extension [Self <: TDiffuse](x: Self) {
    
    inline def setColor(value: IUniform[Any]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
