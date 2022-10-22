package typingsJapgolly.paypalPayoutsSdk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.paypalPayoutsSdk.mod.payouts.PayoutsGetRequest
import typingsJapgolly.paypalPayoutsSdk.mod.payouts.PayoutsItemCancelRequest
import typingsJapgolly.paypalPayoutsSdk.mod.payouts.PayoutsItemGetRequest
import typingsJapgolly.paypalPayoutsSdk.mod.payouts.PayoutsPostRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  /**
    * Live Environment
    */
  type LiveEnvironment = PayPalEnvironment
  
  /**
    * Base class for PayPal environments
    */
  trait PayPalEnvironment extends StObject {
    
    // Authorization header string for basic authentication with the current client id and secret
    def authorizationString(): String
  }
  object PayPalEnvironment {
    
    inline def apply(authorizationString: CallbackTo[String]): PayPalEnvironment = {
      val __obj = js.Dynamic.literal(authorizationString = authorizationString.toJsFn)
      __obj.asInstanceOf[PayPalEnvironment]
    }
    
    extension [Self <: PayPalEnvironment](x: Self) {
      
      inline def setAuthorizationString(value: CallbackTo[String]): Self = StObject.set(x, "authorizationString", value.toJsFn)
    }
  }
  
  /**
    * PayPal HTTP client
    */
  @js.native
  trait PayPalHttpClient extends StObject {
    
    def execute(request: PayoutsGetRequest): js.Promise[HttpResponse[GetBatchPayoutResponse]] = js.native
    def execute(request: PayoutsItemCancelRequest): js.Promise[HttpResponse[GetPayoutsItemResponse]] = js.native
    def execute(request: PayoutsItemGetRequest): js.Promise[HttpResponse[GetPayoutsItemResponse]] = js.native
    def execute(request: PayoutsPostRequest): js.Promise[HttpResponse[CreateBatchPayoutResponse]] = js.native
  }
  
  /**
    * Sandbox Environment
    */
  type SandboxEnvironment = PayPalEnvironment
}
