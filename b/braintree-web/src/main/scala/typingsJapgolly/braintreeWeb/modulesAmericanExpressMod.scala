package typingsJapgolly.braintreeWeb

import japgolly.scalajs.react.Callback
import typingsJapgolly.braintreeWeb.anon.Client
import typingsJapgolly.braintreeWeb.anon.Nonce
import typingsJapgolly.braintreeWeb.modulesCoreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesAmericanExpressMod {
  
  trait AmericanExpress extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String
    
    def create(options: Client, callback: callback[Any]): Unit
    
    /**
      * Gets the Express Checkout nonce profile given a nonce from American Express.     * @example
      * var americanExpress = require('braintree-web/american-express');
      *
      * americanExpress.create({client: clientInstance}, function (createErr, americanExpressInstance) {
      *   var options = {nonce: existingAmericanExpressNonce};
      *   americanExpressInstance.getExpressCheckoutProfile(options, function (getErr, payload) {
      *     if (getErr) {
      *       // Handle error
      *       return;
      *     }
      *
      *     console.log('Number of cards: ' + payload.amexExpressCheckoutCards.length);
      *   });
      * });
      */
    def getExpressCheckoutProfile(options: Nonce, callback: callback[Any]): Unit
    
    /**
      * Gets the rewards balance associated with a Braintree nonce.     * @example
      * var americanExpress = require('braintree-web/american-express');
      *
      * americanExpress.create({client: clientInstance}, function (createErr, americanExpressInstance) {
      *   var options = {nonce: existingBraintreeNonce};
      *   americanExpressInstance.getRewardsBalance(options, function (getErr, payload) {
      *     if (getErr || payload.error) {
      *       // Handle error
      *       return;
      *     }
      *
      *     console.log('Rewards amount: ' + payload.rewardsAmount);
      *   });
      * });
      */
    def getRewardsBalance(options: Nonce, callback: callback[Any]): Unit
  }
  object AmericanExpress {
    
    inline def apply(
      VERSION: String,
      create: (Client, callback[Any]) => Callback,
      getExpressCheckoutProfile: (Nonce, callback[Any]) => Callback,
      getRewardsBalance: (Nonce, callback[Any]) => Callback
    ): AmericanExpress = {
      val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], create = js.Any.fromFunction2((t0: Client, t1: callback[Any]) => (create(t0, t1)).runNow()), getExpressCheckoutProfile = js.Any.fromFunction2((t0: Nonce, t1: callback[Any]) => (getExpressCheckoutProfile(t0, t1)).runNow()), getRewardsBalance = js.Any.fromFunction2((t0: Nonce, t1: callback[Any]) => (getRewardsBalance(t0, t1)).runNow()))
      __obj.asInstanceOf[AmericanExpress]
    }
    
    extension [Self <: AmericanExpress](x: Self) {
      
      inline def setCreate(value: (Client, callback[Any]) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Client, t1: callback[Any]) => (value(t0, t1)).runNow()))
      
      inline def setGetExpressCheckoutProfile(value: (Nonce, callback[Any]) => Callback): Self = StObject.set(x, "getExpressCheckoutProfile", js.Any.fromFunction2((t0: Nonce, t1: callback[Any]) => (value(t0, t1)).runNow()))
      
      inline def setGetRewardsBalance(value: (Nonce, callback[Any]) => Callback): Self = StObject.set(x, "getRewardsBalance", js.Any.fromFunction2((t0: Nonce, t1: callback[Any]) => (value(t0, t1)).runNow()))
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
}
