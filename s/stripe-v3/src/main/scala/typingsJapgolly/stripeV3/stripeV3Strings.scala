package typingsJapgolly.stripeV3

import typingsJapgolly.stripeV3.stripe.ErrorType
import typingsJapgolly.stripeV3.stripe.billingAddressCollectionType
import typingsJapgolly.stripeV3.stripe.brandType
import typingsJapgolly.stripeV3.stripe.checkType
import typingsJapgolly.stripeV3.stripe.elements.elementsType
import typingsJapgolly.stripeV3.stripe.elements.eventTypes
import typingsJapgolly.stripeV3.stripe.fundingType
import typingsJapgolly.stripeV3.stripe.paymentIntents.PaymentIntentCancelationReason
import typingsJapgolly.stripeV3.stripe.paymentIntents.PaymentIntentStatus
import typingsJapgolly.stripeV3.stripe.paymentMethod.paymentMethodCardBrand
import typingsJapgolly.stripeV3.stripe.paymentMethod.paymentMethodType
import typingsJapgolly.stripeV3.stripe.setupIntents.SetupIntentCancelationReason
import typingsJapgolly.stripeV3.stripe.setupIntents.SetupIntentStatus
import typingsJapgolly.stripeV3.stripe.statusType
import typingsJapgolly.stripeV3.stripe.tokenizationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripeV3Strings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `American Express`
    extends StObject
       with brandType
  inline def `American Express`: `American Express` = ("American Express").asInstanceOf[`American Express`]
  
  @js.native
  sealed trait `Diners Club`
    extends StObject
       with brandType
  inline def `Diners Club`: `Diners Club` = ("Diners Club").asInstanceOf[`Diners Club`]
  
  @js.native
  sealed trait Discover
    extends StObject
       with brandType
  inline def Discover: Discover = "Discover".asInstanceOf[Discover]
  
  @js.native
  sealed trait JCB
    extends StObject
       with brandType
  inline def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @js.native
  sealed trait MasterCard
    extends StObject
       with brandType
  inline def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with brandType
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait Visa
    extends StObject
       with brandType
  inline def Visa: Visa = "Visa".asInstanceOf[Visa]
  
  @js.native
  sealed trait _empty
    extends StObject
       with billingAddressCollectionType
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait abandoned
    extends StObject
       with PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  inline def abandoned: abandoned = "abandoned".asInstanceOf[abandoned]
  
  @js.native
  sealed trait abn_amro extends StObject
  inline def abn_amro: abn_amro = "abn_amro".asInstanceOf[abn_amro]
  
  @js.native
  sealed trait accepted extends StObject
  inline def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait ach_credit_transfer extends StObject
  inline def ach_credit_transfer: ach_credit_transfer = "ach_credit_transfer".asInstanceOf[ach_credit_transfer]
  
  @js.native
  sealed trait ach_debit extends StObject
  inline def ach_debit: ach_debit = "ach_debit".asInstanceOf[ach_debit]
  
  @js.native
  sealed trait alipay extends StObject
  inline def alipay: alipay = "alipay".asInstanceOf[alipay]
  
  @js.native
  sealed trait amex
    extends StObject
       with paymentMethodCardBrand
  inline def amex: amex = "amex".asInstanceOf[amex]
  
  @js.native
  sealed trait amex_express_checkout extends StObject
  inline def amex_express_checkout: amex_express_checkout = "amex_express_checkout".asInstanceOf[amex_express_checkout]
  
  @js.native
  sealed trait android_pay
    extends StObject
       with tokenizationType
  inline def android_pay: android_pay = "android_pay".asInstanceOf[android_pay]
  
  @js.native
  sealed trait api_connection_error
    extends StObject
       with ErrorType
  inline def api_connection_error: api_connection_error = "api_connection_error".asInstanceOf[api_connection_error]
  
  @js.native
  sealed trait api_error
    extends StObject
       with ErrorType
  inline def api_error: api_error = "api_error".asInstanceOf[api_error]
  
  @js.native
  sealed trait apple_pay
    extends StObject
       with tokenizationType
  inline def apple_pay: apple_pay = "apple_pay".asInstanceOf[apple_pay]
  
  @js.native
  sealed trait approved_by_network extends StObject
  inline def approved_by_network: approved_by_network = "approved_by_network".asInstanceOf[approved_by_network]
  
  @js.native
  sealed trait asn_bank extends StObject
  inline def asn_bank: asn_bank = "asn_bank".asInstanceOf[asn_bank]
  
  @js.native
  sealed trait auBankAccount
    extends StObject
       with elementsType
  inline def auBankAccount: auBankAccount = "auBankAccount".asInstanceOf[auBankAccount]
  
  @js.native
  sealed trait authentication_error
    extends StObject
       with ErrorType
  inline def authentication_error: authentication_error = "authentication_error".asInstanceOf[authentication_error]
  
  @js.native
  sealed trait authorized extends StObject
  inline def authorized: authorized = "authorized".asInstanceOf[authorized]
  
  @js.native
  sealed trait auto
    extends StObject
       with billingAddressCollectionType
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait automatic
    extends StObject
       with PaymentIntentCancelationReason
  inline def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait bancontact extends StObject
  inline def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait bank_account extends StObject
  inline def bank_account: bank_account = "bank_account".asInstanceOf[bank_account]
  
  @js.native
  sealed trait blocked extends StObject
  inline def blocked: blocked = "blocked".asInstanceOf[blocked]
  
  @js.native
  sealed trait blur
    extends StObject
       with eventTypes
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait bunq extends StObject
  inline def bunq: bunq = "bunq".asInstanceOf[bunq]
  
  @js.native
  sealed trait buy extends StObject
  inline def buy: buy = "buy".asInstanceOf[buy]
  
  @js.native
  sealed trait cancel extends StObject
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canceled
    extends StObject
       with PaymentIntentStatus
       with SetupIntentStatus
  inline def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait card
    extends StObject
       with elementsType
       with paymentMethodType
  inline def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait cardCvc
    extends StObject
       with elementsType
  inline def cardCvc: cardCvc = "cardCvc".asInstanceOf[cardCvc]
  
  @js.native
  sealed trait cardExpiry
    extends StObject
       with elementsType
  inline def cardExpiry: cardExpiry = "cardExpiry".asInstanceOf[cardExpiry]
  
  @js.native
  sealed trait cardNumber
    extends StObject
       with elementsType
  inline def cardNumber: cardNumber = "cardNumber".asInstanceOf[cardNumber]
  
  @js.native
  sealed trait card_error
    extends StObject
       with ErrorType
  inline def card_error: card_error = "card_error".asInstanceOf[card_error]
  
  @js.native
  sealed trait card_present
    extends StObject
       with paymentMethodType
  inline def card_present: card_present = "card_present".asInstanceOf[card_present]
  
  @js.native
  sealed trait change
    extends StObject
       with eventTypes
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait charge extends StObject
  inline def charge: charge = "charge".asInstanceOf[charge]
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait code_verification extends StObject
  inline def code_verification: code_verification = "code_verification".asInstanceOf[code_verification]
  
  @js.native
  sealed trait company extends StObject
  inline def company: company = "company".asInstanceOf[company]
  
  @js.native
  sealed trait credit
    extends StObject
       with fundingType
  inline def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait dark extends StObject
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait de extends StObject
  inline def de: de = "de".asInstanceOf[de]
  
  @js.native
  sealed trait debit
    extends StObject
       with fundingType
  inline def debit: debit = "debit".asInstanceOf[debit]
  
  @js.native
  sealed trait declined_by_network extends StObject
  inline def declined_by_network: declined_by_network = "declined_by_network".asInstanceOf[declined_by_network]
  
  @js.native
  sealed trait diners
    extends StObject
       with paymentMethodCardBrand
  inline def diners: diners = "diners".asInstanceOf[diners]
  
  @js.native
  sealed trait discover_
    extends StObject
       with paymentMethodCardBrand
  inline def discover_ : discover_ = "discover".asInstanceOf[discover_]
  
  @js.native
  sealed trait donate extends StObject
  inline def donate: donate = "donate".asInstanceOf[donate]
  
  @js.native
  sealed trait duplicate
    extends StObject
       with PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  inline def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  
  @js.native
  sealed trait elevated extends StObject
  inline def elevated: elevated = "elevated".asInstanceOf[elevated]
  
  @js.native
  sealed trait elevated_risk_level extends StObject
  inline def elevated_risk_level: elevated_risk_level = "elevated_risk_level".asInstanceOf[elevated_risk_level]
  
  @js.native
  sealed trait email extends StObject
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait en extends StObject
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait eps extends StObject
  inline def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait errored
    extends StObject
       with statusType
  inline def errored: errored = "errored".asInstanceOf[errored]
  
  @js.native
  sealed trait es extends StObject
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait expired_or_canceled_card extends StObject
  inline def expired_or_canceled_card: expired_or_canceled_card = "expired_or_canceled_card".asInstanceOf[expired_or_canceled_card]
  
  @js.native
  sealed trait fail
    extends StObject
       with checkType
  inline def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait failed extends StObject
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait failed_invoice
    extends StObject
       with PaymentIntentCancelationReason
  inline def failed_invoice: failed_invoice = "failed_invoice".asInstanceOf[failed_invoice]
  
  @js.native
  sealed trait focus
    extends StObject
       with eventTypes
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait fr extends StObject
  inline def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait fraudulent
    extends StObject
       with PaymentIntentCancelationReason
  inline def fraudulent: fraudulent = "fraudulent".asInstanceOf[fraudulent]
  
  @js.native
  sealed trait giropay extends StObject
  inline def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait google_pay extends StObject
  inline def google_pay: google_pay = "google_pay".asInstanceOf[google_pay]
  
  @js.native
  sealed trait handelsbanken extends StObject
  inline def handelsbanken: handelsbanken = "handelsbanken".asInstanceOf[handelsbanken]
  
  @js.native
  sealed trait highest extends StObject
  inline def highest: highest = "highest".asInstanceOf[highest]
  
  @js.native
  sealed trait highest_risk_level extends StObject
  inline def highest_risk_level: highest_risk_level = "highest_risk_level".asInstanceOf[highest_risk_level]
  
  @js.native
  sealed trait iban
    extends StObject
       with elementsType
  inline def iban: iban = "iban".asInstanceOf[iban]
  
  @js.native
  sealed trait ideal extends StObject
  inline def ideal: ideal = "ideal".asInstanceOf[ideal]
  
  @js.native
  sealed trait idealBank
    extends StObject
       with elementsType
  inline def idealBank: idealBank = "idealBank".asInstanceOf[idealBank]
  
  @js.native
  sealed trait idempotency_error
    extends StObject
       with ErrorType
  inline def idempotency_error: idempotency_error = "idempotency_error".asInstanceOf[idempotency_error]
  
  @js.native
  sealed trait individual extends StObject
  inline def individual: individual = "individual".asInstanceOf[individual]
  
  @js.native
  sealed trait ing extends StObject
  inline def ing: ing = "ing".asInstanceOf[ing]
  
  @js.native
  sealed trait invalid extends StObject
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait invalid_request_error
    extends StObject
       with ErrorType
  inline def invalid_request_error: invalid_request_error = "invalid_request_error".asInstanceOf[invalid_request_error]
  
  @js.native
  sealed trait invalid_shipping_address extends StObject
  inline def invalid_shipping_address: invalid_shipping_address = "invalid_shipping_address".asInstanceOf[invalid_shipping_address]
  
  @js.native
  sealed trait issuer_declined extends StObject
  inline def issuer_declined: issuer_declined = "issuer_declined".asInstanceOf[issuer_declined]
  
  @js.native
  sealed trait it extends StObject
  inline def it: it = "it".asInstanceOf[it]
  
  @js.native
  sealed trait jcb_
    extends StObject
       with paymentMethodCardBrand
  inline def jcb_ : jcb_ = "jcb".asInstanceOf[jcb_]
  
  @js.native
  sealed trait knab extends StObject
  inline def knab: knab = "knab".asInstanceOf[knab]
  
  @js.native
  sealed trait light extends StObject
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait `light-outline` extends StObject
  inline def `light-outline`: `light-outline` = "light-outline".asInstanceOf[`light-outline`]
  
  @js.native
  sealed trait list extends StObject
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait lost_or_stolen_card extends StObject
  inline def lost_or_stolen_card: lost_or_stolen_card = "lost_or_stolen_card".asInstanceOf[lost_or_stolen_card]
  
  @js.native
  sealed trait manual extends StObject
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait manual_review extends StObject
  inline def manual_review: manual_review = "manual_review".asInstanceOf[manual_review]
  
  @js.native
  sealed trait mastercard_
    extends StObject
       with paymentMethodCardBrand
  inline def mastercard_ : mastercard_ = "mastercard".asInstanceOf[mastercard_]
  
  @js.native
  sealed trait masterpass extends StObject
  inline def masterpass: masterpass = "masterpass".asInstanceOf[masterpass]
  
  @js.native
  sealed trait moneyou extends StObject
  inline def moneyou: moneyou = "moneyou".asInstanceOf[moneyou]
  
  @js.native
  sealed trait multibanco extends StObject
  inline def multibanco: multibanco = "multibanco".asInstanceOf[multibanco]
  
  @js.native
  sealed trait `new`
    extends StObject
       with statusType
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait nl extends StObject
  inline def nl: nl = "nl".asInstanceOf[nl]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal extends StObject
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait not_assessed extends StObject
  inline def not_assessed: not_assessed = "not_assessed".asInstanceOf[not_assessed]
  
  @js.native
  sealed trait not_sent_to_network extends StObject
  inline def not_sent_to_network: not_sent_to_network = "not_sent_to_network".asInstanceOf[not_sent_to_network]
  
  @js.native
  sealed trait not_supported extends StObject
  inline def not_supported: not_supported = "not_supported".asInstanceOf[not_supported]
  
  @js.native
  sealed trait off_session extends StObject
  inline def off_session: off_session = "off_session".asInstanceOf[off_session]
  
  @js.native
  sealed trait offline extends StObject
  inline def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait on_session extends StObject
  inline def on_session: on_session = "on_session".asInstanceOf[on_session]
  
  @js.native
  sealed trait one_time extends StObject
  inline def one_time: one_time = "one_time".asInstanceOf[one_time]
  
  @js.native
  sealed trait online extends StObject
  inline def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait optional extends StObject
  inline def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait p24 extends StObject
  inline def p24: p24 = "p24".asInstanceOf[p24]
  
  @js.native
  sealed trait pass
    extends StObject
       with checkType
  inline def pass: pass = "pass".asInstanceOf[pass]
  
  @js.native
  sealed trait paymentRequestButton
    extends StObject
       with elementsType
  inline def paymentRequestButton: paymentRequestButton = "paymentRequestButton".asInstanceOf[paymentRequestButton]
  
  @js.native
  sealed trait payment_intent extends StObject
  inline def payment_intent: payment_intent = "payment_intent".asInstanceOf[payment_intent]
  
  @js.native
  sealed trait payment_method extends StObject
  inline def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  
  @js.native
  sealed trait paymentmethod extends StObject
  inline def paymentmethod: paymentmethod = "paymentmethod".asInstanceOf[paymentmethod]
  
  @js.native
  sealed trait pending extends StObject
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait pii extends StObject
  inline def pii: pii = "pii".asInstanceOf[pii]
  
  @js.native
  sealed trait pl extends StObject
  inline def pl: pl = "pl".asInstanceOf[pl]
  
  @js.native
  sealed trait postalCode
    extends StObject
       with elementsType
  inline def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @js.native
  sealed trait prepaid
    extends StObject
       with fundingType
  inline def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  
  @js.native
  sealed trait processing
    extends StObject
       with PaymentIntentStatus
       with SetupIntentStatus
  inline def processing: processing = "processing".asInstanceOf[processing]
  
  @js.native
  sealed trait rabobank extends StObject
  inline def rabobank: rabobank = "rabobank".asInstanceOf[rabobank]
  
  @js.native
  sealed trait rate_limit_error
    extends StObject
       with ErrorType
  inline def rate_limit_error: rate_limit_error = "rate_limit_error".asInstanceOf[rate_limit_error]
  
  @js.native
  sealed trait ready
    extends StObject
       with eventTypes
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait receiver extends StObject
  inline def receiver: receiver = "receiver".asInstanceOf[receiver]
  
  @js.native
  sealed trait recommended extends StObject
  inline def recommended: recommended = "recommended".asInstanceOf[recommended]
  
  @js.native
  sealed trait redirect extends StObject
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait redirect_to_url extends StObject
  inline def redirect_to_url: redirect_to_url = "redirect_to_url".asInstanceOf[redirect_to_url]
  
  @js.native
  sealed trait refund extends StObject
  inline def refund: refund = "refund".asInstanceOf[refund]
  
  @js.native
  sealed trait refused extends StObject
  inline def refused: refused = "refused".asInstanceOf[refused]
  
  @js.native
  sealed trait regiobank extends StObject
  inline def regiobank: regiobank = "regiobank".asInstanceOf[regiobank]
  
  @js.native
  sealed trait requested_by_customer
    extends StObject
       with PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  inline def requested_by_customer: requested_by_customer = "requested_by_customer".asInstanceOf[requested_by_customer]
  
  @js.native
  sealed trait required
    extends StObject
       with billingAddressCollectionType
  inline def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait requires_action
    extends StObject
       with PaymentIntentStatus
       with SetupIntentStatus
  inline def requires_action: requires_action = "requires_action".asInstanceOf[requires_action]
  
  @js.native
  sealed trait requires_capture
    extends StObject
       with PaymentIntentStatus
  inline def requires_capture: requires_capture = "requires_capture".asInstanceOf[requires_capture]
  
  @js.native
  sealed trait requires_confirmation
    extends StObject
       with PaymentIntentStatus
       with SetupIntentStatus
  inline def requires_confirmation: requires_confirmation = "requires_confirmation".asInstanceOf[requires_confirmation]
  
  @js.native
  sealed trait requires_payment_method
    extends StObject
       with PaymentIntentStatus
       with SetupIntentStatus
  inline def requires_payment_method: requires_payment_method = "requires_payment_method".asInstanceOf[requires_payment_method]
  
  @js.native
  sealed trait reusable extends StObject
  inline def reusable: reusable = "reusable".asInstanceOf[reusable]
  
  @js.native
  sealed trait reversed_after_approval extends StObject
  inline def reversed_after_approval: reversed_after_approval = "reversed_after_approval".asInstanceOf[reversed_after_approval]
  
  @js.native
  sealed trait rule extends StObject
  inline def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait safe extends StObject
  inline def safe: safe = "safe".asInstanceOf[safe]
  
  @js.native
  sealed trait samsung_pay extends StObject
  inline def samsung_pay: samsung_pay = "samsung_pay".asInstanceOf[samsung_pay]
  
  @js.native
  sealed trait scheduled extends StObject
  inline def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  
  @js.native
  sealed trait sepa_debit extends StObject
  inline def sepa_debit: sepa_debit = "sepa_debit".asInstanceOf[sepa_debit]
  
  @js.native
  sealed trait setup_intent extends StObject
  inline def setup_intent: setup_intent = "setup_intent".asInstanceOf[setup_intent]
  
  @js.native
  sealed trait shippingaddresschange extends StObject
  inline def shippingaddresschange: shippingaddresschange = "shippingaddresschange".asInstanceOf[shippingaddresschange]
  
  @js.native
  sealed trait shippingoptionchange extends StObject
  inline def shippingoptionchange: shippingoptionchange = "shippingoptionchange".asInstanceOf[shippingoptionchange]
  
  @js.native
  sealed trait single_use extends StObject
  inline def single_use: single_use = "single_use".asInstanceOf[single_use]
  
  @js.native
  sealed trait sns_bank extends StObject
  inline def sns_bank: sns_bank = "sns_bank".asInstanceOf[sns_bank]
  
  @js.native
  sealed trait sofort extends StObject
  inline def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait solid extends StObject
  inline def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait source extends StObject
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait stripe_account extends StObject
  inline def stripe_account: stripe_account = "stripe_account".asInstanceOf[stripe_account]
  
  @js.native
  sealed trait succeeded
    extends StObject
       with PaymentIntentStatus
       with SetupIntentStatus
  inline def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait token extends StObject
  inline def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait triodos_bank extends StObject
  inline def triodos_bank: triodos_bank = "triodos_bank".asInstanceOf[triodos_bank]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with checkType
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unchecked
    extends StObject
       with checkType
  inline def unchecked: unchecked = "unchecked".asInstanceOf[unchecked]
  
  @js.native
  sealed trait unionpay
    extends StObject
       with paymentMethodCardBrand
  inline def unionpay: unionpay = "unionpay".asInstanceOf[unionpay]
  
  @js.native
  sealed trait unknown_
    extends StObject
       with fundingType
       with paymentMethodCardBrand
  inline def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait use_stripe_sdk extends StObject
  inline def use_stripe_sdk: use_stripe_sdk = "use_stripe_sdk".asInstanceOf[use_stripe_sdk]
  
  @js.native
  sealed trait validated
    extends StObject
       with statusType
  inline def validated: validated = "validated".asInstanceOf[validated]
  
  @js.native
  sealed trait validation_error
    extends StObject
       with ErrorType
  inline def validation_error: validation_error = "validation_error".asInstanceOf[validation_error]
  
  @js.native
  sealed trait van_lanschot extends StObject
  inline def van_lanschot: van_lanschot = "van_lanschot".asInstanceOf[van_lanschot]
  
  @js.native
  sealed trait variable extends StObject
  inline def variable: variable = "variable".asInstanceOf[variable]
  
  @js.native
  sealed trait verification_failed
    extends StObject
       with statusType
  inline def verification_failed: verification_failed = "verification_failed".asInstanceOf[verification_failed]
  
  @js.native
  sealed trait verified
    extends StObject
       with statusType
  inline def verified: verified = "verified".asInstanceOf[verified]
  
  @js.native
  sealed trait visa_
    extends StObject
       with paymentMethodCardBrand
  inline def visa_ : visa_ = "visa".asInstanceOf[visa_]
  
  @js.native
  sealed trait visa_checkout extends StObject
  inline def visa_checkout: visa_checkout = "visa_checkout".asInstanceOf[visa_checkout]
  
  @js.native
  sealed trait void_invoice
    extends StObject
       with PaymentIntentCancelationReason
  inline def void_invoice: void_invoice = "void_invoice".asInstanceOf[void_invoice]
  
  @js.native
  sealed trait wechat extends StObject
  inline def wechat: wechat = "wechat".asInstanceOf[wechat]
}
