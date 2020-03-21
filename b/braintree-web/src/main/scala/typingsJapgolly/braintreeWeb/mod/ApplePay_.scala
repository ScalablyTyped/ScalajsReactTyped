package typingsJapgolly.braintreeWeb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintreeWeb.AnonClient
import typingsJapgolly.braintreeWeb.AnonDisplayName
import typingsJapgolly.braintreeWeb.AnonToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplePay_ extends js.Object {
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
    * @param {callback} callback The second argument, `data`, is the {@link ApplePay} instance.
    * @returns {void}
    */
  def create(options: AnonClient, callback: callback): Unit
  /**
    * Merges a payment request with Braintree defaults
    * The following properties are assigned to `paymentRequest` if not already defined
    * - countryCode
    * - currencyCode
    * - merchantCapabilities
    * - supportedNetworks
    * @public
    * @param {external:ApplePayPaymentRequest} paymentRequest The payment request details to apply on top of those from Braintree.
    * @returns {external:ApplePayPaymentRequest} The decorated `paymentRequest`.
    * @example
    * var applePay = require('braintree-web/apple-pay');
    *
    * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
    *   // ...
    *   var paymentRequest = applePay.createPaymentRequest({
    *    total: {
    *      label: 'My Company',
    *      amount: '19.99'
    *   });
    *
    *   console.log(paymentRequest);
    *   // { total: { }, countryCode: 'US', currencyCode: 'USD', merchantCapabilities: [ ], supportedNetworks: [ ] }
    *
    */
  def createPaymentRequest(paymentRequest: ApplePayPaymentRequest): ApplePayPaymentRequest
  /**
    * Validates the merchant website, as required by ApplePaySession before payment can be authorized.
    * @public
    * @param {object} options Options
    * @param {string} options.validationURL The validationURL fram an ApplePayValidateMerchantEvent.
    * @param {string} [options.displayName]
    * - The canonical name for your store.
    * - The system may display this name to the user.
    * - Use a 128-character or less, UTF-8 string.
    * - Do not localize the name.
    * @param {string} [options.merchantIdentifier]
    * Your Apple merchant identifier. This is the Apple Merchant ID created on the Apple Developer Portal.
    * Defaults to the merchant identifier specified in the Braintree Control Panel.
    * You can use this field to override the merchant identifier for this transaction.
    * @param {callback} callback The second argument, <code>data</code>, is the Apple Pay merchant session object.
    * Pass the merchant session to your Apple Pay session's completeMerchantValidation method.
    * @returns {void}
    * @example
    * var applePay = require('braintree-web/apple-pay');
    *
    * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
    *   var session = new ApplePaySession(1, {
    *     // This should be the payment request object that
    *     // contains the information needed to display the payment sheet.
    *   });
    *
    *   session.onvalidatemerchant = function (event) {
    *     applePay.performValidation({
    *       validationURL: event.validationURL
    *     }, function(err, validationData) {
    *       if (err) {
    *         console.error(err);
    *         session.abort();
    *         return;
    *       }
    *       session.completeMerchantValidation(validationData);
    *     });
    *   };
    * });
    */
  def performValidation(options: AnonDisplayName, callback: callback): Unit
  /**
    * Tokenizes an Apple Pay payment.
    * @public
    * @param {object} options Options
    * @param {object} options.token The `payment.token` property of an {@link external:ApplePayPaymentAuthorizedEvent}
    * @param {callback} callback The second argument, <code>data</code>, is the tokenized payload.
    * @returns {void}
    * @example
    * var applePay = require('braintree-web/apple-pay');
    *
    * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
    *   var session = new ApplePaySession(1, { });
    *
    *   session.onpaymentauthorized = function (event) {
    *     applePay.tokenize({
    *       token: event.payment.token
    *     }, function (err, tokenizedPayload) {
    *       if (err) {
    *         session.completePayment(ApplePaySession.STATUS_FAILURE);
    *         return;
    *       }
    *       session.completePayment(ApplePaySession.STATUS_SUCCESS);
    *
    *       // Send the tokenizedPayload to your server.
    *     });
    *  };
    * });
    */
  def tokenize(options: AnonToken, callback: callback): Unit
}

object ApplePay_ {
  @scala.inline
  def apply(
    VERSION: String,
    create: (AnonClient, callback) => Callback,
    createPaymentRequest: ApplePayPaymentRequest => CallbackTo[ApplePayPaymentRequest],
    performValidation: (AnonDisplayName, callback) => Callback,
    tokenize: (AnonToken, callback) => Callback
  ): ApplePay_ = {
    val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.braintreeWeb.AnonClient, t1: typingsJapgolly.braintreeWeb.mod.callback) => create(t0, t1).runNow()))
    __obj.updateDynamic("createPaymentRequest")(js.Any.fromFunction1((t0: typingsJapgolly.braintreeWeb.mod.ApplePayPaymentRequest) => createPaymentRequest(t0).runNow()))
    __obj.updateDynamic("performValidation")(js.Any.fromFunction2((t0: typingsJapgolly.braintreeWeb.AnonDisplayName, t1: typingsJapgolly.braintreeWeb.mod.callback) => performValidation(t0, t1).runNow()))
    __obj.updateDynamic("tokenize")(js.Any.fromFunction2((t0: typingsJapgolly.braintreeWeb.AnonToken, t1: typingsJapgolly.braintreeWeb.mod.callback) => tokenize(t0, t1).runNow()))
    __obj.asInstanceOf[ApplePay_]
  }
}

