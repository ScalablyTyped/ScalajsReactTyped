package typingsJapgolly.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chargeback extends StObject {
  
  var Chargeback: String
}
object Chargeback {
  
  inline def apply(Chargeback: String): Chargeback = {
    val __obj = js.Dynamic.literal(Chargeback = Chargeback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chargeback]
  }
  
  extension [Self <: Chargeback](x: Self) {
    
    inline def setChargeback(value: String): Self = StObject.set(x, "Chargeback", value.asInstanceOf[js.Any])
  }
}
