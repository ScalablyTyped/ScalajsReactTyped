package typingsJapgolly.grpcGrpcJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1 extends StObject {
  
  var v1: Address
}
object V1 {
  
  inline def apply(v1: Address): V1 = {
    val __obj = js.Dynamic.literal(v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[V1]
  }
  
  extension [Self <: V1](x: Self) {
    
    inline def setV1(value: Address): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
  }
}
