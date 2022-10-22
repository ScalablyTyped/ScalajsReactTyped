package typingsJapgolly.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a shipping method for delivering physical goods.
  */
trait ApplePayShippingMethod extends StObject {
  
  /**
    * The amount associated with this shipping method.
    */
  var amount: String
  
  /**
    * A further description of the shipping method.
    */
  var detail: String
  
  /**
    * A client-defined identifier.
    */
  var identifier: String
  
  /**
    * A short description of the shipping method.
    */
  var label: String
}
object ApplePayShippingMethod {
  
  inline def apply(amount: String, detail: String, identifier: String, label: String): ApplePayShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingMethod]
  }
  
  extension [Self <: ApplePayShippingMethod](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
