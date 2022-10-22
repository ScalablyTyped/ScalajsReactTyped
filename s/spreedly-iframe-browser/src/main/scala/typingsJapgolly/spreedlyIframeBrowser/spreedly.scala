package typingsJapgolly.spreedlyIframeBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.apple_pay
import typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.bank_account
import typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cached
import typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.credit_card
import typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.google_pay
import typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.redacted
import typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.retained
import typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.third_party_token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spreedly {
  
  trait InitOptions extends StObject {
    
    var cvvEl: String
    
    var numberEl: String
  }
  object InitOptions {
    
    inline def apply(cvvEl: String, numberEl: String): InitOptions = {
      val __obj = js.Dynamic.literal(cvvEl = cvvEl.asInstanceOf[js.Any], numberEl = numberEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setCvvEl(value: String): Self = StObject.set(x, "cvvEl", value.asInstanceOf[js.Any])
      
      inline def setNumberEl(value: String): Self = StObject.set(x, "numberEl", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetRecacheOptions extends StObject {
    
    var card_type: SpreedlyCardType
    
    var last_four_digits: String
  }
  object SetRecacheOptions {
    
    inline def apply(card_type: SpreedlyCardType, last_four_digits: String): SetRecacheOptions = {
      val __obj = js.Dynamic.literal(card_type = card_type.asInstanceOf[js.Any], last_four_digits = last_four_digits.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetRecacheOptions]
    }
    
    extension [Self <: SetRecacheOptions](x: Self) {
      
      inline def setCard_type(value: SpreedlyCardType): Self = StObject.set(x, "card_type", value.asInstanceOf[js.Any])
      
      inline def setLast_four_digits(value: String): Self = StObject.set(x, "last_four_digits", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alelo
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alia
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.american_express
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cabal
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.carnet
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.dankort
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.diners_club
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.discover
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.elo
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.jcb
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maestro
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.master
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.naranja
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.olimpica
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.sodexo
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.visa
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.vr
  */
  trait SpreedlyCardType extends StObject
  object SpreedlyCardType {
    
    inline def alelo: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alelo = "alelo".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alelo]
    
    inline def alia: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alia = "alia".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alia]
    
    inline def american_express: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.american_express = "american_express".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.american_express]
    
    inline def cabal: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cabal = "cabal".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cabal]
    
    inline def carnet: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.carnet = "carnet".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.carnet]
    
    inline def dankort: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.dankort = "dankort".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.dankort]
    
    inline def diners_club: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.diners_club = "diners_club".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.diners_club]
    
    inline def discover: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.discover = "discover".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.discover]
    
    inline def elo: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.elo = "elo".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.elo]
    
    inline def jcb: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.jcb = "jcb".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.jcb]
    
    inline def maestro: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maestro = "maestro".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maestro]
    
    inline def master: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.master = "master".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.master]
    
    inline def naranja: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.naranja = "naranja".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.naranja]
    
    inline def olimpica: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.olimpica = "olimpica".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.olimpica]
    
    inline def sodexo: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.sodexo = "sodexo".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.sodexo]
    
    inline def visa: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.visa = "visa".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.visa]
    
    inline def vr: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.vr = "vr".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.vr]
  }
  
  trait SpreedlyConsoleError extends StObject {
    
    var col: String
    
    var line: String
    
    var msg: String
    
    var url: String
  }
  object SpreedlyConsoleError {
    
    inline def apply(col: String, line: String, msg: String, url: String): SpreedlyConsoleError = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpreedlyConsoleError]
    }
    
    extension [Self <: SpreedlyConsoleError](x: Self) {
      
      inline def setCol(value: String): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpreedlyError extends StObject {
    
    var attribute: String
    
    var key: SpreedlyErrorKey
    
    var message: String
  }
  object SpreedlyError {
    
    inline def apply(attribute: String, key: SpreedlyErrorKey, message: String): SpreedlyError = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpreedlyError]
    }
    
    extension [Self <: SpreedlyError](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setKey(value: SpreedlyErrorKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotaccount_inactive
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotenvironment_key_parameter_required
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_environment_key_parameter
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank_card_type
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotexpired
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotunknown_referrer
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_referrer
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotconfiguration
  */
  trait SpreedlyErrorKey extends StObject
  object SpreedlyErrorKey {
    
    inline def errorsDotaccount_inactive: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotaccount_inactive = "errors.account_inactive".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotaccount_inactive]
    
    inline def errorsDotblank: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank = "errors.blank".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank]
    
    inline def errorsDotblank_card_type: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank_card_type = "errors.blank_card_type".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank_card_type]
    
    inline def errorsDotconfiguration: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotconfiguration = "errors.configuration".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotconfiguration]
    
    inline def errorsDotenvironment_key_parameter_required: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotenvironment_key_parameter_required = "errors.environment_key_parameter_required".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotenvironment_key_parameter_required]
    
    inline def errorsDotexpired: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotexpired = "errors.expired".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotexpired]
    
    inline def errorsDotinvalid: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid = "errors.invalid".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid]
    
    inline def errorsDotinvalid_environment_key_parameter: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_environment_key_parameter = "errors.invalid_environment_key_parameter".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_environment_key_parameter]
    
    inline def errorsDotinvalid_referrer: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_referrer = "errors.invalid_referrer".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_referrer]
    
    inline def errorsDotunknown_referrer: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotunknown_referrer = "errors.unknown_referrer".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotunknown_referrer]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cvv
  */
  trait SpreedlyField extends StObject
  object SpreedlyField {
    
    inline def cvv: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cvv = "cvv".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cvv]
    
    inline def number: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number = "number".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number]
  }
  
  trait SpreedlyFieldEventInputProperties extends StObject {
    
    var activeElement: js.UndefOr[SpreedlyField] = js.undefined
    
    var cardType: js.UndefOr[SpreedlyCardType | Null] = js.undefined
    
    var cvvLength: js.UndefOr[Double] = js.undefined
    
    var numberLength: js.UndefOr[Double] = js.undefined
    
    var validCvv: js.UndefOr[Boolean] = js.undefined
    
    var validNumber: js.UndefOr[Boolean] = js.undefined
  }
  object SpreedlyFieldEventInputProperties {
    
    inline def apply(): SpreedlyFieldEventInputProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpreedlyFieldEventInputProperties]
    }
    
    extension [Self <: SpreedlyFieldEventInputProperties](x: Self) {
      
      inline def setActiveElement(value: SpreedlyField): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
      
      inline def setActiveElementUndefined: Self = StObject.set(x, "activeElement", js.undefined)
      
      inline def setCardType(value: SpreedlyCardType): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setCardTypeNull: Self = StObject.set(x, "cardType", null)
      
      inline def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
      
      inline def setCvvLength(value: Double): Self = StObject.set(x, "cvvLength", value.asInstanceOf[js.Any])
      
      inline def setCvvLengthUndefined: Self = StObject.set(x, "cvvLength", js.undefined)
      
      inline def setNumberLength(value: Double): Self = StObject.set(x, "numberLength", value.asInstanceOf[js.Any])
      
      inline def setNumberLengthUndefined: Self = StObject.set(x, "numberLength", js.undefined)
      
      inline def setValidCvv(value: Boolean): Self = StObject.set(x, "validCvv", value.asInstanceOf[js.Any])
      
      inline def setValidCvvUndefined: Self = StObject.set(x, "validCvv", js.undefined)
      
      inline def setValidNumber(value: Boolean): Self = StObject.set(x, "validNumber", value.asInstanceOf[js.Any])
      
      inline def setValidNumberUndefined: Self = StObject.set(x, "validNumber", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.focus
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.blur
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseover
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseout
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.input
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.enter
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.escape
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tab
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.shiftTab
  */
  trait SpreedlyFieldEventType extends StObject
  object SpreedlyFieldEventType {
    
    inline def blur: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.blur = "blur".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.blur]
    
    inline def enter: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.enter = "enter".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.enter]
    
    inline def escape: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.escape = "escape".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.escape]
    
    inline def focus: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.focus = "focus".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.focus]
    
    inline def input: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.input = "input".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.input]
    
    inline def mouseout: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseout = "mouseout".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseout]
    
    inline def mouseover: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseover = "mouseover".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseover]
    
    inline def shiftTab: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.shiftTab = "shiftTab".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.shiftTab]
    
    inline def tab: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tab = "tab".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tab]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.text
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tel
  */
  trait SpreedlyFieldType extends StObject
  object SpreedlyFieldType {
    
    inline def number: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number = "number".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number]
    
    inline def tel: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tel = "tel".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tel]
    
    inline def text: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.text = "text".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.text]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.prettyFormat
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maskedFormat
    - typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.toggleMask
  */
  trait SpreedlyNumberFormat extends StObject
  object SpreedlyNumberFormat {
    
    inline def maskedFormat: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maskedFormat = "maskedFormat".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maskedFormat]
    
    inline def prettyFormat: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.prettyFormat = "prettyFormat".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.prettyFormat]
    
    inline def toggleMask: typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.toggleMask = "toggleMask".asInstanceOf[typingsJapgolly.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.toggleMask]
  }
  
  // TODO: Validate this
  trait SpreedlyPaymentMethod extends StObject {
    
    var address1: String | Null
    
    var address2: String | Null
    
    var callback_url: String | Null
    
    var card_type: SpreedlyCardType
    
    var city: String | Null
    
    var company: String | Null
    
    var country: String | Null
    
    var created_at: String
    
    var data: Null
    
    var eligible_for_card_updater: Boolean
    
    var email: String | Null
    
    var errors: js.Array[Any]
    
    var fingerprint: String | Null
    
    var first_name: String | Null
    
    var first_six_digits: String | Null
    
    var full_name: String | Null
    
    var last_four_digits: String | Null
    
    var last_name: String | Null
    
    var metadata: StringDictionary[String]
    
    var month: Double | Null
    
    var number: String | Null
    
    var payment_method_type: credit_card | bank_account | apple_pay | google_pay | third_party_token
    
    var phone_number: String | Null
    
    var shipping_address1: String | Null
    
    var shipping_address2: String | Null
    
    var shipping_city: String | Null
    
    var shipping_country: String | Null
    
    var shipping_phone_number: String | Null
    
    var shipping_state: String | Null
    
    var shipping_zip: String | Null
    
    var state: String | Null
    
    var storage_state: cached | retained | redacted
    
    var test: Boolean
    
    var token: String
    
    var updated_at: String
    
    var verification_value: String | Null
    
    var year: Double | Null
    
    var zip: String | Null
  }
  object SpreedlyPaymentMethod {
    
    inline def apply(
      card_type: SpreedlyCardType,
      created_at: String,
      data: Null,
      eligible_for_card_updater: Boolean,
      errors: js.Array[Any],
      metadata: StringDictionary[String],
      payment_method_type: credit_card | bank_account | apple_pay | google_pay | third_party_token,
      storage_state: cached | retained | redacted,
      test: Boolean,
      token: String,
      updated_at: String
    ): SpreedlyPaymentMethod = {
      val __obj = js.Dynamic.literal(card_type = card_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eligible_for_card_updater = eligible_for_card_updater.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], payment_method_type = payment_method_type.asInstanceOf[js.Any], storage_state = storage_state.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], address1 = null, address2 = null, callback_url = null, city = null, company = null, country = null, email = null, fingerprint = null, first_name = null, first_six_digits = null, full_name = null, last_four_digits = null, last_name = null, month = null, number = null, phone_number = null, shipping_address1 = null, shipping_address2 = null, shipping_city = null, shipping_country = null, shipping_phone_number = null, shipping_state = null, shipping_zip = null, state = null, verification_value = null, year = null, zip = null)
      __obj.asInstanceOf[SpreedlyPaymentMethod]
    }
    
    extension [Self <: SpreedlyPaymentMethod](x: Self) {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress1Null: Self = StObject.set(x, "address1", null)
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setAddress2Null: Self = StObject.set(x, "address2", null)
      
      inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
      
      inline def setCallback_urlNull: Self = StObject.set(x, "callback_url", null)
      
      inline def setCard_type(value: SpreedlyCardType): Self = StObject.set(x, "card_type", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityNull: Self = StObject.set(x, "city", null)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyNull: Self = StObject.set(x, "company", null)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryNull: Self = StObject.set(x, "country", null)
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEligible_for_card_updater(value: Boolean): Self = StObject.set(x, "eligible_for_card_updater", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameNull: Self = StObject.set(x, "first_name", null)
      
      inline def setFirst_six_digits(value: String): Self = StObject.set(x, "first_six_digits", value.asInstanceOf[js.Any])
      
      inline def setFirst_six_digitsNull: Self = StObject.set(x, "first_six_digits", null)
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setFull_nameNull: Self = StObject.set(x, "full_name", null)
      
      inline def setLast_four_digits(value: String): Self = StObject.set(x, "last_four_digits", value.asInstanceOf[js.Any])
      
      inline def setLast_four_digitsNull: Self = StObject.set(x, "last_four_digits", null)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameNull: Self = StObject.set(x, "last_name", null)
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthNull: Self = StObject.set(x, "month", null)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberNull: Self = StObject.set(x, "number", null)
      
      inline def setPayment_method_type(value: credit_card | bank_account | apple_pay | google_pay | third_party_token): Self = StObject.set(x, "payment_method_type", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberNull: Self = StObject.set(x, "phone_number", null)
      
      inline def setShipping_address1(value: String): Self = StObject.set(x, "shipping_address1", value.asInstanceOf[js.Any])
      
      inline def setShipping_address1Null: Self = StObject.set(x, "shipping_address1", null)
      
      inline def setShipping_address2(value: String): Self = StObject.set(x, "shipping_address2", value.asInstanceOf[js.Any])
      
      inline def setShipping_address2Null: Self = StObject.set(x, "shipping_address2", null)
      
      inline def setShipping_city(value: String): Self = StObject.set(x, "shipping_city", value.asInstanceOf[js.Any])
      
      inline def setShipping_cityNull: Self = StObject.set(x, "shipping_city", null)
      
      inline def setShipping_country(value: String): Self = StObject.set(x, "shipping_country", value.asInstanceOf[js.Any])
      
      inline def setShipping_countryNull: Self = StObject.set(x, "shipping_country", null)
      
      inline def setShipping_phone_number(value: String): Self = StObject.set(x, "shipping_phone_number", value.asInstanceOf[js.Any])
      
      inline def setShipping_phone_numberNull: Self = StObject.set(x, "shipping_phone_number", null)
      
      inline def setShipping_state(value: String): Self = StObject.set(x, "shipping_state", value.asInstanceOf[js.Any])
      
      inline def setShipping_stateNull: Self = StObject.set(x, "shipping_state", null)
      
      inline def setShipping_zip(value: String): Self = StObject.set(x, "shipping_zip", value.asInstanceOf[js.Any])
      
      inline def setShipping_zipNull: Self = StObject.set(x, "shipping_zip", null)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStorage_state(value: cached | retained | redacted): Self = StObject.set(x, "storage_state", value.asInstanceOf[js.Any])
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setVerification_value(value: String): Self = StObject.set(x, "verification_value", value.asInstanceOf[js.Any])
      
      inline def setVerification_valueNull: Self = StObject.set(x, "verification_value", null)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearNull: Self = StObject.set(x, "year", null)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipNull: Self = StObject.set(x, "zip", null)
    }
  }
  
  trait TokenizeCreditCardAdditionalFields extends StObject {
    
    var address1: js.UndefOr[String] = js.undefined
    
    var address2: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var month: js.UndefOr[String] = js.undefined
    
    var phone_number: js.UndefOr[String] = js.undefined
    
    var shipping_address1: js.UndefOr[String] = js.undefined
    
    var shipping_address2: js.UndefOr[String] = js.undefined
    
    var shipping_city: js.UndefOr[String] = js.undefined
    
    var shipping_country: js.UndefOr[String] = js.undefined
    
    var shipping_phone_number: js.UndefOr[String] = js.undefined
    
    var shipping_state: js.UndefOr[String] = js.undefined
    
    var shipping_zip: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var year: js.UndefOr[String] = js.undefined
    
    var zip: js.UndefOr[String] = js.undefined
  }
  object TokenizeCreditCardAdditionalFields {
    
    inline def apply(): TokenizeCreditCardAdditionalFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeCreditCardAdditionalFields]
    }
    
    extension [Self <: TokenizeCreditCardAdditionalFields](x: Self) {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setShipping_address1(value: String): Self = StObject.set(x, "shipping_address1", value.asInstanceOf[js.Any])
      
      inline def setShipping_address1Undefined: Self = StObject.set(x, "shipping_address1", js.undefined)
      
      inline def setShipping_address2(value: String): Self = StObject.set(x, "shipping_address2", value.asInstanceOf[js.Any])
      
      inline def setShipping_address2Undefined: Self = StObject.set(x, "shipping_address2", js.undefined)
      
      inline def setShipping_city(value: String): Self = StObject.set(x, "shipping_city", value.asInstanceOf[js.Any])
      
      inline def setShipping_cityUndefined: Self = StObject.set(x, "shipping_city", js.undefined)
      
      inline def setShipping_country(value: String): Self = StObject.set(x, "shipping_country", value.asInstanceOf[js.Any])
      
      inline def setShipping_countryUndefined: Self = StObject.set(x, "shipping_country", js.undefined)
      
      inline def setShipping_phone_number(value: String): Self = StObject.set(x, "shipping_phone_number", value.asInstanceOf[js.Any])
      
      inline def setShipping_phone_numberUndefined: Self = StObject.set(x, "shipping_phone_number", js.undefined)
      
      inline def setShipping_state(value: String): Self = StObject.set(x, "shipping_state", value.asInstanceOf[js.Any])
      
      inline def setShipping_stateUndefined: Self = StObject.set(x, "shipping_state", js.undefined)
      
      inline def setShipping_zip(value: String): Self = StObject.set(x, "shipping_zip", value.asInstanceOf[js.Any])
      
      inline def setShipping_zipUndefined: Self = StObject.set(x, "shipping_zip", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  trait TokenizeCreditCardAdditionalFieldsFirstLastNames
    extends StObject
       with TokenizeCreditCardAdditionalFields {
    
    var first_name: String
    
    var last_name: String
  }
  object TokenizeCreditCardAdditionalFieldsFirstLastNames {
    
    inline def apply(first_name: String, last_name: String): TokenizeCreditCardAdditionalFieldsFirstLastNames = {
      val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizeCreditCardAdditionalFieldsFirstLastNames]
    }
    
    extension [Self <: TokenizeCreditCardAdditionalFieldsFirstLastNames](x: Self) {
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizeCreditCardAdditionalFieldsFullName
    extends StObject
       with TokenizeCreditCardAdditionalFields {
    
    var full_name: String
  }
  object TokenizeCreditCardAdditionalFieldsFullName {
    
    inline def apply(full_name: String): TokenizeCreditCardAdditionalFieldsFullName = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizeCreditCardAdditionalFieldsFullName]
    }
    
    extension [Self <: TokenizeCreditCardAdditionalFieldsFullName](x: Self) {
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    }
  }
}
