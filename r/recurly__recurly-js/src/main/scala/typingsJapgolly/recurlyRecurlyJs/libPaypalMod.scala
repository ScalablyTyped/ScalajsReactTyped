package typingsJapgolly.recurlyRecurlyJs

import typingsJapgolly.recurlyRecurlyJs.anon.ClientAuthorization
import typingsJapgolly.recurlyRecurlyJs.anon.Description
import typingsJapgolly.recurlyRecurlyJs.anon.DisplayName
import typingsJapgolly.recurlyRecurlyJs.libEmitterMod.Emitter
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaypalMod {
  
  trait BraintreeConfig
    extends StObject
       with PayPalConfig {
    
    var braintree: ClientAuthorization
  }
  object BraintreeConfig {
    
    inline def apply(braintree: ClientAuthorization): BraintreeConfig = {
      val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
      __obj.asInstanceOf[BraintreeConfig]
    }
    
    extension [Self <: BraintreeConfig](x: Self) {
      
      inline def setBraintree(value: ClientAuthorization): Self = StObject.set(x, "braintree", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectConfig
    extends StObject
       with PayPalConfig {
    
    var display: js.UndefOr[DisplayName] = js.undefined
  }
  object DirectConfig {
    
    inline def apply(): DirectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectConfig]
    }
    
    extension [Self <: DirectConfig](x: Self) {
      
      inline def setDisplay(value: DisplayName): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
  
  type PayPal = js.Function1[/* config */ js.UndefOr[PayPalConfig], PayPalInstance]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.recurlyRecurlyJs.libPaypalMod.BraintreeConfig
    - typingsJapgolly.recurlyRecurlyJs.libPaypalMod.DirectConfig
  */
  trait PayPalConfig extends StObject
  object PayPalConfig {
    
    inline def BraintreeConfig(braintree: ClientAuthorization): typingsJapgolly.recurlyRecurlyJs.libPaypalMod.BraintreeConfig = {
      val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.recurlyRecurlyJs.libPaypalMod.BraintreeConfig]
    }
    
    inline def DirectConfig(): typingsJapgolly.recurlyRecurlyJs.libPaypalMod.DirectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.recurlyRecurlyJs.libPaypalMod.DirectConfig]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready
  */
  trait PayPalEvent extends StObject
  object PayPalEvent {
    
    inline def cancel: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel = "cancel".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel]
    
    inline def error: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    inline def ready: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready = "ready".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready]
    
    inline def token: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
  
  @js.native
  trait PayPalInstance
    extends StObject
       with Emitter[PayPalEvent] {
    
    def destroy(): Unit = js.native
    @JSName("destroy")
    var destroy_Original: VoidFunction = js.native
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-paypalstart|PayPal.start}
      */
    def start(): Unit = js.native
    def start(payPalStartOptions: PayPalStartOptions): Unit = js.native
  }
  
  trait PayPalStartOptions extends StObject {
    
    var options: Description
  }
  object PayPalStartOptions {
    
    inline def apply(options: Description): PayPalStartOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalStartOptions]
    }
    
    extension [Self <: PayPalStartOptions](x: Self) {
      
      inline def setOptions(value: Description): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
