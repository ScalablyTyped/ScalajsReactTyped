package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  @JSName("$ref")
  var $ref: String
}
object Ref {
  
  inline def apply($ref: String): Ref = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
