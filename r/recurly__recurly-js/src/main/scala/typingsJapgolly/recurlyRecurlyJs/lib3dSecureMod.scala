package typingsJapgolly.recurlyRecurlyJs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.recurlyRecurlyJs.libEmitterMod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lib3dSecureMod {
  
  type Risk = js.Function0[typingsJapgolly.recurlyRecurlyJs.anon.ThreeDSecure]
  
  trait RiskOptions extends StObject {
    
    /**
      * `three_d_secure_action_token_id` returned by the Recurly API when 3-D Secure authentication is required for a
      * transaction.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-recurlythreedsecure|ThreeDSecure}
      */
    var actionTokenId: js.UndefOr[String] = js.undefined
  }
  object RiskOptions {
    
    inline def apply(): RiskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RiskOptions]
    }
    
    extension [Self <: RiskOptions](x: Self) {
      
      inline def setActionTokenId(value: String): Self = StObject.set(x, "actionTokenId", value.asInstanceOf[js.Any])
      
      inline def setActionTokenIdUndefined: Self = StObject.set(x, "actionTokenId", js.undefined)
    }
  }
  
  type ThreeDSecure = js.Function1[/* riskOptions */ RiskOptions, ThreeDSecureEmitter]
  
  @js.native
  trait ThreeDSecureEmitter
    extends StObject
       with Emitter[ThreeDSecureEvent] {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-threedsecureattach|ThreeDSecure.attach}
      */
    def attach(el: HTMLElement): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
  */
  trait ThreeDSecureEvent extends StObject
  object ThreeDSecureEvent {
    
    inline def error: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    inline def token: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
}
