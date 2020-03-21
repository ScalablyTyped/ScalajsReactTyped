package typingsJapgolly.paypalCordovaPlugin.PayPalCordovaPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.paypalCordovaPlugin.PayPalConfiguration
import typingsJapgolly.paypalCordovaPlugin.PayPalPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalMobileStatic extends js.Object {
  /**
    * @deprecated
    * Once a user has consented to future payments, when the user subsequently initiates a PayPal payment
    * from their device to be completed by your server, PayPal uses a Correlation ID to verify that the
    * payment is originating from a valid, user-consented device+application.
    * This helps reduce fraud and decrease declines.
    * This method MUST be called prior to initiating a pre-consented payment (a "future payment") from a mobile device.
    * Pass the result to your server, to include in the payment request sent to PayPal.
    * Do not otherwise cache or store this value.
    *
    * @param environment available options are "PayPalEnvironmentNoNetwork", "PayPalEnvironmentProduction" and "PayPalEnvironmentSandbox"
    * @param callback applicationCorrelationID Your server will send this to PayPal in a 'Paypal-Application-Correlation-Id' header.
    */
  def applicationCorrelationIDForEnvironment(environment: String, completionCallback: js.Function1[/* applicationCorrelationId */ String, Unit]): Unit
  /**
    * Once a user has consented to future payments, when the user subsequently initiates a PayPal payment
    * from their device to be completed by your server, PayPal uses a Correlation ID to verify that the
    * payment is originating from a valid, user-consented device+application.
    * This helps reduce fraud and decrease declines.
    * This method MUST be called prior to initiating a pre-consented payment (a "future payment") from a mobile device.
    * Pass the result to your server, to include in the payment request sent to PayPal.
    * Do not otherwise cache or store this value.
    *
    * @param callback clientMetadataID Your server will send this to PayPal in a 'PayPal-Client-Metadata-Id' header.
    */
  def clientMetadataID(completionCallback: js.Function1[/* clientMetadataId */ String, Unit]): Unit
  /**
    * You MUST call this method to initialize the PayPal Mobile SDK.
    *
    * The PayPal Mobile SDK can operate in different environments to facilitate development and testing.
    *
    * @param clientIdsForEnvironments set of client ids for environments
    * Example: var clientIdsForEnvironments = {
    *  PayPalEnvironmentProduction : @"my-client-id-for-Production",
    *  PayPalEnvironmentSandbox : @"my-client-id-for-Sandbox"
    *  }
    * @param completionCallback a callback function on success
    */
  def init(clientIdsForEnvironments: PayPalClientIds, completionCallback: js.Function0[Unit]): Unit
  /**
    * You must preconnect to PayPal to prepare the device for processing payments.
    * This improves the user experience, by making the presentation of the
    * UI faster. The preconnect is valid for a limited time, so
    * the recommended time to preconnect is on page load.
    *
    * @param environment available options are "PayPalEnvironmentNoNetwork", "PayPalEnvironmentProduction" and "PayPalEnvironmentSandbox"
    * @param configuration PayPalConfiguration object, for Future Payments merchantName, merchantPrivacyPolicyURL
    *      and merchantUserAgreementURL must be set be set
    * @param completionCallback a callback function on success
    */
  def prepareToRender(environment: String, configuration: PayPalConfiguration, completionCallback: js.Function0[Unit]): Unit
  /**
    * Please Read Docs on Future Payments at https://github.com/paypal/PayPal-iOS-SDK#future-payments
    *
    * @param completionCallback a callback function accepting a js object with future payment authorization
    * @param cancelCallback a callback function accepting a reason string, called when the user canceled without agreement
    */
  def renderFuturePaymentUI(
    completionCallback: js.Function1[/* result */ FuturePaymentResult, Unit],
    cancelCallback: js.Function1[/* cancelReason */ String, Unit]
  ): Unit
  /**
    * Please Read Docs on Profile Sharing at https://github.com/paypal/PayPal-iOS-SDK#profile-sharing
    *
    * @param scopes scopes Set of requested scope-values. Accepted scopes are: openid, profile, address, email, phone, futurepayments and paypalattributes
    * See https://developer.paypal.com/docs/integration/direct/identity/attributes/ for more details
    * @param completionCallback a callback function accepting a js object with future payment authorization
    * @param cancelCallback a callback function accepting a reason string, called when the user canceled without agreement
    */
  def renderProfileSharingUI(
    scopes: js.Array[String],
    completionCallback: js.Function1[/* result */ js.Any, Unit],
    cancelCallback: js.Function1[/* cancelReason */ String, Unit]
  ): Unit
  /**
    * Start PayPal UI to collect payment from the user.
    * See https://developer.paypal.com/webapps/developer/docs/integration/mobile/ios-integration-guide/
    * for more documentation of the params.
    *
    * @param payment PayPalPayment object
    * @param completionCallback a callback function accepting a js object, called when the user has completed payment
    * @param cancelCallback a callback function accepting a reason string, called when the user cancels the payment
    */
  def renderSinglePaymentUI(
    payment: PayPalPayment,
    completionCallback: js.Function1[/* result */ SinglePaymentResult, Unit],
    cancelCallback: js.Function1[/* cancelReason */ String, Unit]
  ): Unit
  /**
    * Retrieve the version of the PayPal iOS SDK library. Useful when contacting support.
    *
    * @param completionCallback a callback function accepting a string
    */
  def version(completionCallback: js.Function1[/* result */ String, Unit]): Unit
}

object PayPalMobileStatic {
  @scala.inline
  def apply(
    applicationCorrelationIDForEnvironment: (String, js.Function1[/* applicationCorrelationId */ String, Unit]) => Callback,
    clientMetadataID: js.Function1[/* clientMetadataId */ String, Unit] => Callback,
    init: (PayPalClientIds, js.Function0[Unit]) => Callback,
    prepareToRender: (String, PayPalConfiguration, js.Function0[Unit]) => Callback,
    renderFuturePaymentUI: (js.Function1[/* result */ FuturePaymentResult, Unit], js.Function1[/* cancelReason */ String, Unit]) => Callback,
    renderProfileSharingUI: (js.Array[String], js.Function1[/* result */ js.Any, Unit], js.Function1[/* cancelReason */ String, Unit]) => Callback,
    renderSinglePaymentUI: (PayPalPayment, js.Function1[/* result */ SinglePaymentResult, Unit], js.Function1[/* cancelReason */ String, Unit]) => Callback,
    version: js.Function1[/* result */ String, Unit] => Callback
  ): PayPalMobileStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applicationCorrelationIDForEnvironment")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* applicationCorrelationId */ java.lang.String, scala.Unit]) => applicationCorrelationIDForEnvironment(t0, t1).runNow()))
    __obj.updateDynamic("clientMetadataID")(js.Any.fromFunction1((t0: js.Function1[/* clientMetadataId */ java.lang.String, scala.Unit]) => clientMetadataID(t0).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction2((t0: typingsJapgolly.paypalCordovaPlugin.PayPalCordovaPlugin.PayPalClientIds, t1: js.Function0[scala.Unit]) => init(t0, t1).runNow()))
    __obj.updateDynamic("prepareToRender")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.paypalCordovaPlugin.PayPalConfiguration, t2: js.Function0[scala.Unit]) => prepareToRender(t0, t1, t2).runNow()))
    __obj.updateDynamic("renderFuturePaymentUI")(js.Any.fromFunction2((t0: js.Function1[
  /* result */ typingsJapgolly.paypalCordovaPlugin.PayPalCordovaPlugin.FuturePaymentResult, 
  scala.Unit], t1: js.Function1[/* cancelReason */ java.lang.String, scala.Unit]) => renderFuturePaymentUI(t0, t1).runNow()))
    __obj.updateDynamic("renderProfileSharingUI")(js.Any.fromFunction3((t0: js.Array[java.lang.String], t1: js.Function1[/* result */ js.Any, scala.Unit], t2: js.Function1[/* cancelReason */ java.lang.String, scala.Unit]) => renderProfileSharingUI(t0, t1, t2).runNow()))
    __obj.updateDynamic("renderSinglePaymentUI")(js.Any.fromFunction3((t0: typingsJapgolly.paypalCordovaPlugin.PayPalPayment, t1: js.Function1[
  /* result */ typingsJapgolly.paypalCordovaPlugin.PayPalCordovaPlugin.SinglePaymentResult, 
  scala.Unit], t2: js.Function1[/* cancelReason */ java.lang.String, scala.Unit]) => renderSinglePaymentUI(t0, t1, t2).runNow()))
    __obj.updateDynamic("version")(js.Any.fromFunction1((t0: js.Function1[/* result */ java.lang.String, scala.Unit]) => version(t0).runNow()))
    __obj.asInstanceOf[PayPalMobileStatic]
  }
}

