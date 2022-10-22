package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var name: String
  
  var `type`: ivec2
}
object Type {
  
  inline def apply(name: String): Type = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ivec2")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ivec2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
