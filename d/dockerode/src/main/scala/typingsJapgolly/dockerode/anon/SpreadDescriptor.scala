package typingsJapgolly.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadDescriptor extends StObject {
  
  var SpreadDescriptor: String
}
object SpreadDescriptor {
  
  inline def apply(SpreadDescriptor: String): SpreadDescriptor = {
    val __obj = js.Dynamic.literal(SpreadDescriptor = SpreadDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadDescriptor]
  }
  
  extension [Self <: SpreadDescriptor](x: Self) {
    
    inline def setSpreadDescriptor(value: String): Self = StObject.set(x, "SpreadDescriptor", value.asInstanceOf[js.Any])
  }
}
