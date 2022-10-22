package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOriginPaymentMethod extends StObject {
  
  val UsBankAccount: Any
}
object TypeofOriginPaymentMethod {
  
  inline def apply(UsBankAccount: Any): TypeofOriginPaymentMethod = {
    val __obj = js.Dynamic.literal(UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOriginPaymentMethod]
  }
  
  extension [Self <: TypeofOriginPaymentMethod](x: Self) {
    
    inline def setUsBankAccount(value: Any): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
