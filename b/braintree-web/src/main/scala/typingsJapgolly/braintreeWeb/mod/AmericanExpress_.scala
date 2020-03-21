package typingsJapgolly.braintreeWeb.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.braintreeWeb.AnonClient
import typingsJapgolly.braintreeWeb.AnonNonce
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmericanExpress_ extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    * @type {string}
    */
  var VERSION: String
  /**
    * @static
    * @function create
    * @param {object} options Creation options:
    * @param {Client} options.client A {@link Client} instance.
    * @param {callback} callback The second argument, `data`, is the {@link AmericanExpress} instance.
    * @returns {void}
    */
  def create(options: AnonClient, callback: callback): Unit
  /**
    * Gets the Express Checkout nonce profile given a nonce from American Express.
    * @public
    * @param {object} options Request options
    * @param {string} options.nonce An existing nonce from American Express (note that this is <em>not</em> a nonce from Braintree).
    * @param {callback} callback The second argument, <code>data</code>, is the returned server data.
    * @returns {void}
    * @example
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
  def getExpressCheckoutProfile(options: AnonNonce, callback: callback): Unit
  /**
    * Gets the rewards balance associated with a Braintree nonce.
    * @public
    * @param {object} options Request options
    * @param {string} options.nonce An existing Braintree nonce.
    * @param {callback} callback The second argument, <code>data</code>, is the returned server data.
    * @returns {void}
    * @example
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
  def getRewardsBalance(options: AnonNonce, callback: callback): Unit
}

object AmericanExpress_ {
  @scala.inline
  def apply(
    VERSION: String,
    create: (AnonClient, callback) => Callback,
    getExpressCheckoutProfile: (AnonNonce, callback) => Callback,
    getRewardsBalance: (AnonNonce, callback) => Callback
  ): AmericanExpress_ = {
    val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.braintreeWeb.AnonClient, t1: typingsJapgolly.braintreeWeb.mod.callback) => create(t0, t1).runNow()))
    __obj.updateDynamic("getExpressCheckoutProfile")(js.Any.fromFunction2((t0: typingsJapgolly.braintreeWeb.AnonNonce, t1: typingsJapgolly.braintreeWeb.mod.callback) => getExpressCheckoutProfile(t0, t1).runNow()))
    __obj.updateDynamic("getRewardsBalance")(js.Any.fromFunction2((t0: typingsJapgolly.braintreeWeb.AnonNonce, t1: typingsJapgolly.braintreeWeb.mod.callback) => getRewardsBalance(t0, t1).runNow()))
    __obj.asInstanceOf[AmericanExpress_]
  }
}

