package typingsJapgolly.three.anon

import typingsJapgolly.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmissiveMap extends StObject {
  
  var emissiveMap: IUniform[Any]
}
object EmissiveMap {
  
  inline def apply(emissiveMap: IUniform[Any]): EmissiveMap = {
    val __obj = js.Dynamic.literal(emissiveMap = emissiveMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmissiveMap]
  }
  
  extension [Self <: EmissiveMap](x: Self) {
    
    inline def setEmissiveMap(value: IUniform[Any]): Self = StObject.set(x, "emissiveMap", value.asInstanceOf[js.Any])
  }
}
