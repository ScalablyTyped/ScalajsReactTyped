package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameStringType extends StObject {
  
  var name: String
  
  var `type`: ivec3
}
object NameStringType {
  
  inline def apply(name: String): NameStringType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ivec3")
    __obj.asInstanceOf[NameStringType]
  }
  
  extension [Self <: NameStringType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ivec3): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
