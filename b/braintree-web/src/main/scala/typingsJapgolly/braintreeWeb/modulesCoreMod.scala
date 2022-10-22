package typingsJapgolly.braintreeWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesCoreMod {
  
  @JSImport("braintree-web/modules/core", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  trait BraintreeError extends StObject {
    
    /**
      * @description A code that corresponds to specific errors.
      */
    var code: String
    
    /**
      * @description Additional information about the error, such as an underlying network error response.
      */
    var details: Any
    
    /**
      * @description A short description of the error.
      */
    var message: String
    
    /**
      * @description The type of error.
      */
    var `type`: BraintreeErrorTypes
  }
  object BraintreeError {
    
    inline def apply(code: String, details: Any, message: String, `type`: BraintreeErrorTypes): BraintreeError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BraintreeError]
    }
    
    extension [Self <: BraintreeError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: BraintreeErrorTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.braintreeWeb.braintreeWebStrings.CUSTOMER
    - typingsJapgolly.braintreeWeb.braintreeWebStrings.MERCHANT
    - typingsJapgolly.braintreeWeb.braintreeWebStrings.NETWORK
    - typingsJapgolly.braintreeWeb.braintreeWebStrings.INTERNAL
    - typingsJapgolly.braintreeWeb.braintreeWebStrings.UNKNOWN
  */
  trait BraintreeErrorTypes extends StObject
  object BraintreeErrorTypes {
    
    inline def CUSTOMER: typingsJapgolly.braintreeWeb.braintreeWebStrings.CUSTOMER = "CUSTOMER".asInstanceOf[typingsJapgolly.braintreeWeb.braintreeWebStrings.CUSTOMER]
    
    inline def INTERNAL: typingsJapgolly.braintreeWeb.braintreeWebStrings.INTERNAL = "INTERNAL".asInstanceOf[typingsJapgolly.braintreeWeb.braintreeWebStrings.INTERNAL]
    
    inline def MERCHANT: typingsJapgolly.braintreeWeb.braintreeWebStrings.MERCHANT = "MERCHANT".asInstanceOf[typingsJapgolly.braintreeWeb.braintreeWebStrings.MERCHANT]
    
    inline def NETWORK: typingsJapgolly.braintreeWeb.braintreeWebStrings.NETWORK = "NETWORK".asInstanceOf[typingsJapgolly.braintreeWeb.braintreeWebStrings.NETWORK]
    
    inline def UNKNOWN: typingsJapgolly.braintreeWeb.braintreeWebStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsJapgolly.braintreeWeb.braintreeWebStrings.UNKNOWN]
  }
  
  type callback[T] = js.Function2[/* err */ js.UndefOr[BraintreeError], /* data */ js.UndefOr[T], Unit]
}
