package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I extends StObject {
  
  var i: String
}
object I {
  
  inline def apply(i: String): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  
  extension [Self <: I](x: Self) {
    
    inline def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
  }
}
