package typingsJapgolly.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PayPalConfiguration")
@js.native
/**
  * @param options A set of options to use. Any options not specified will assume default values.
  */
class PayPalConfiguration () extends js.Object {
  def this(options: PayPalConfigurationOptions) = this()
  /**
    * If set to false, the SDK will only support paying with PayPal, not with credit cards.
    * This applies only to single payments (via PayPalPaymentViewController).
    * Future payments (via PayPalFuturePaymentViewController) always use PayPal.
    * Defaults to true.
    */
  var acceptCreditCards: Boolean = js.native
  /**
    * Will be overridden by email used in most recent PayPal login.
    */
  var defaultUserEmail: String = js.native
  /**
    * Will be overridden by phone country code used in most recent PayPal login
    */
  var defaultUserPhoneCountryCode: String = js.native
  /**
    * Will be overridden by phone number used in most recent PayPal login.
    * @note If you set defaultUserPhoneNumber, be sure to also set defaultUserPhoneCountryCode.
    */
  var defaultUserPhoneNumber: String = js.native
  /**
    * Normally, the SDK blurs the screen when the app is backgrounded,
    * to obscure credit card or PayPal account details in the iOS-saved screenshot.
    * If your app already does its own blurring upon backgrounding, you might choose to disable this.
    * Defaults to false.
    */
  var disableBlurWhenBackgrounding: Boolean = js.native
  /**
    * Sandbox credentials can be difficult to type on a mobile device. Setting this flag to true will
    * cause the sandboxUserPassword and sandboxUserPin to always be pre-populated into login fields.
    *
    * This setting will have no effect if the operation mode is production.
    * Defaults to false.
    */
  var forceDefaultsInSandbox: Boolean = js.native
  /**
    * If not set, or if set to nil, defaults to the device's current language setting.
    *
    * Can be specified as a language code ("en", "fr", "zh-Hans", etc.) or as a locale ("en_AU", "fr_FR", "zh-Hant_HK", etc.).
    * If the library does not contain localized strings for a specified locale, then will fall back to the language. E.g., "es_CO" -> "es".
    * If the library does not contain localized strings for a specified language, then will fall back to American English.
    *
    * If you specify only a language code, and that code matches the device's currently preferred language,
    * then the library will attempt to use the device's current region as well.
    * E.g., specifying "en" on a device set to "English" and "United Kingdom" will result in "en_GB".
    *
    * These localizations are currently included:
    * da,de,en,en_AU,en_GB,en_SV,es,es_MX,fr,he,it,ja,ko,nb,nl,pl,pt,pt_BR,ru,sv,tr,zh-Hans,zh-Hant_HK,zh-Hant_TW.
    */
  var languageOrLocale: String = js.native
  /**
    * Your company name, as it should be displayed to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantName: String = js.native
  /**
    * URL of your company's privacy policy, which will be offered to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantPrivacyPolicyURL: String = js.native
  /**
    * URL of your company's user agreement, which will be offered to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantUserAgreementURL: String = js.native
  /**
    * For single payments, options for the shipping address.
    *
    * - 0 - PayPalShippingAddressOptionNone: no shipping address applies.
    *
    * - 1 - PayPalShippingAddressOptionProvided: shipping address will be provided by your app,
    *   in the shippingAddress property of PayPalPayment.
    *
    * - 2 - PayPalShippingAddressOptionPayPal: user will choose from shipping addresses on file
    *   for their PayPal account.
    *
    * - 3 - PayPalShippingAddressOptionBoth: user will choose from the shipping address provided by your app,
    *   in the shippingAddress property of PayPalPayment, plus the shipping addresses on file for the user's PayPal account.
    *
    * Defaults to 0 (PayPalShippingAddressOptionNone).
    */
  var payPalShippingAddressOption: Double = js.native
  /**
    * If you will present the SDK's view controller within a popover, then set this property to true.
    * Defaults to false. (iOS only)
    */
  var presentingInPopover: Boolean = js.native
  /**
    * If set to true, then if the user pays via their PayPal account,
    * the SDK will remember the user's PayPal username or phone number;
    * if the user pays via their credit card, then the SDK will remember
    * the PayPal Vault token representing the user's credit card.
    *
    * If set to false, then any previously-remembered username, phone number, or
    * credit card token will be erased, and subsequent payment information will
    * not be remembered.
    *
    * Defaults to true.
    */
  var rememberUser: Boolean = js.native
  /**
    * Password to use for sandbox if 'forceDefaultsInSandbox' is set.
    */
  var sandboxUserPassword: String = js.native
  /**
    * PIN to use for sandbox if 'forceDefaultsInSandbox' is set.
    */
  var sandboxUserPin: String = js.native
}

