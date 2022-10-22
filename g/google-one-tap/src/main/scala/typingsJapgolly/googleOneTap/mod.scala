package typingsJapgolly.googleOneTap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleOneTap.anon.Cancel
import typingsJapgolly.googleOneTap.googleOneTapStrings.auto
import typingsJapgolly.googleOneTap.googleOneTapStrings.auto_cancel
import typingsJapgolly.googleOneTap.googleOneTapStrings.browser_not_supported
import typingsJapgolly.googleOneTap.googleOneTapStrings.btn
import typingsJapgolly.googleOneTap.googleOneTapStrings.btn_add_session
import typingsJapgolly.googleOneTap.googleOneTapStrings.btn_confirm
import typingsJapgolly.googleOneTap.googleOneTapStrings.btn_confirm_add_session
import typingsJapgolly.googleOneTap.googleOneTapStrings.cancel_called
import typingsJapgolly.googleOneTap.googleOneTapStrings.center
import typingsJapgolly.googleOneTap.googleOneTapStrings.circle
import typingsJapgolly.googleOneTap.googleOneTapStrings.continue_with
import typingsJapgolly.googleOneTap.googleOneTapStrings.credential_returned
import typingsJapgolly.googleOneTap.googleOneTapStrings.debug
import typingsJapgolly.googleOneTap.googleOneTapStrings.dismissed
import typingsJapgolly.googleOneTap.googleOneTapStrings.display
import typingsJapgolly.googleOneTap.googleOneTapStrings.filled_black
import typingsJapgolly.googleOneTap.googleOneTapStrings.filled_blue
import typingsJapgolly.googleOneTap.googleOneTapStrings.flow_restarted
import typingsJapgolly.googleOneTap.googleOneTapStrings.icon
import typingsJapgolly.googleOneTap.googleOneTapStrings.info
import typingsJapgolly.googleOneTap.googleOneTapStrings.invalid_client
import typingsJapgolly.googleOneTap.googleOneTapStrings.issuing_failed
import typingsJapgolly.googleOneTap.googleOneTapStrings.large
import typingsJapgolly.googleOneTap.googleOneTapStrings.left
import typingsJapgolly.googleOneTap.googleOneTapStrings.medium
import typingsJapgolly.googleOneTap.googleOneTapStrings.missing_client_id
import typingsJapgolly.googleOneTap.googleOneTapStrings.opt_out_or_no_session
import typingsJapgolly.googleOneTap.googleOneTapStrings.outline
import typingsJapgolly.googleOneTap.googleOneTapStrings.pill
import typingsJapgolly.googleOneTap.googleOneTapStrings.popup
import typingsJapgolly.googleOneTap.googleOneTapStrings.rectangular
import typingsJapgolly.googleOneTap.googleOneTapStrings.redirect
import typingsJapgolly.googleOneTap.googleOneTapStrings.secure_http_required
import typingsJapgolly.googleOneTap.googleOneTapStrings.signin
import typingsJapgolly.googleOneTap.googleOneTapStrings.signin_with
import typingsJapgolly.googleOneTap.googleOneTapStrings.signup
import typingsJapgolly.googleOneTap.googleOneTapStrings.signup_with
import typingsJapgolly.googleOneTap.googleOneTapStrings.skipped
import typingsJapgolly.googleOneTap.googleOneTapStrings.small
import typingsJapgolly.googleOneTap.googleOneTapStrings.square
import typingsJapgolly.googleOneTap.googleOneTapStrings.standard
import typingsJapgolly.googleOneTap.googleOneTapStrings.suppressed_by_user
import typingsJapgolly.googleOneTap.googleOneTapStrings.tap_outside
import typingsJapgolly.googleOneTap.googleOneTapStrings.unknown_reason
import typingsJapgolly.googleOneTap.googleOneTapStrings.unregistered_origin
import typingsJapgolly.googleOneTap.googleOneTapStrings.use
import typingsJapgolly.googleOneTap.googleOneTapStrings.user
import typingsJapgolly.googleOneTap.googleOneTapStrings.user_1tap
import typingsJapgolly.googleOneTap.googleOneTapStrings.user_2tap
import typingsJapgolly.googleOneTap.googleOneTapStrings.user_cancel
import typingsJapgolly.googleOneTap.googleOneTapStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait accounts extends StObject {
    
    var id: Cancel
  }
  object accounts {
    
    @JSImport("google-one-tap", "accounts")
    @js.native
    val ^ : accounts = js.native
    
    extension [Self <: accounts](x: Self) {
      
      inline def setId(value: Cancel): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait CredentialResponse extends StObject {
    
    var credential: String
    
    var select_by: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
  }
  object CredentialResponse {
    
    inline def apply(
      credential: String,
      select_by: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
    ): CredentialResponse = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], select_by = select_by.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialResponse]
    }
    
    extension [Self <: CredentialResponse](x: Self) {
      
      inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setSelect_by(
        value: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
      ): Self = StObject.set(x, "select_by", value.asInstanceOf[js.Any])
    }
  }
  
  trait GsiButtonConfiguration extends StObject {
    
    var locale: js.UndefOr[String] = js.undefined
    
    var logo_alignment: js.UndefOr[left | center] = js.undefined
    
    var shape: js.UndefOr[rectangular | pill | circle | square] = js.undefined
    
    var size: js.UndefOr[large | medium | small] = js.undefined
    
    var text: js.UndefOr[signin_with | signup_with | continue_with | signin] = js.undefined
    
    var theme: js.UndefOr[outline | filled_blue | filled_black] = js.undefined
    
    var `type`: js.UndefOr[standard | icon] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object GsiButtonConfiguration {
    
    inline def apply(): GsiButtonConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GsiButtonConfiguration]
    }
    
    extension [Self <: GsiButtonConfiguration](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLogo_alignment(value: left | center): Self = StObject.set(x, "logo_alignment", value.asInstanceOf[js.Any])
      
      inline def setLogo_alignmentUndefined: Self = StObject.set(x, "logo_alignment", js.undefined)
      
      inline def setShape(value: rectangular | pill | circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: large | medium | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: signin_with | signup_with | continue_with | signin): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheme(value: outline | filled_blue | filled_black): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: standard | icon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IdConfiguration extends StObject {
    
    var allowed_parent_origin: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var auto_select: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[js.Function1[/* credentialResponse */ CredentialResponse, Unit]] = js.undefined
    
    var cancel_on_tap_outside: js.UndefOr[Boolean] = js.undefined
    
    var client_id: String
    
    var context: js.UndefOr[signin | signup | use] = js.undefined
    
    var intermediate_iframe_close_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var itp_support: js.UndefOr[Boolean] = js.undefined
    
    // Undocumented, but extraordinarily helpful: https://stackoverflow.com/a/72883451/229792
    var log_level: js.UndefOr[debug | info | warn] = js.undefined
    
    var login_uri: js.UndefOr[String] = js.undefined
    
    var native_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var prompt_parent_id: js.UndefOr[String] = js.undefined
    
    var state_cookie_domain: js.UndefOr[String] = js.undefined
    
    var ux_mode: js.UndefOr[popup | redirect] = js.undefined
  }
  object IdConfiguration {
    
    inline def apply(client_id: String): IdConfiguration = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdConfiguration]
    }
    
    extension [Self <: IdConfiguration](x: Self) {
      
      inline def setAllowed_parent_origin(value: String | js.Array[String]): Self = StObject.set(x, "allowed_parent_origin", value.asInstanceOf[js.Any])
      
      inline def setAllowed_parent_originUndefined: Self = StObject.set(x, "allowed_parent_origin", js.undefined)
      
      inline def setAllowed_parent_originVarargs(value: String*): Self = StObject.set(x, "allowed_parent_origin", js.Array(value*))
      
      inline def setAuto_select(value: Boolean): Self = StObject.set(x, "auto_select", value.asInstanceOf[js.Any])
      
      inline def setAuto_selectUndefined: Self = StObject.set(x, "auto_select", js.undefined)
      
      inline def setCallback(value: /* credentialResponse */ CredentialResponse => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* credentialResponse */ CredentialResponse) => value(t0).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCancel_on_tap_outside(value: Boolean): Self = StObject.set(x, "cancel_on_tap_outside", value.asInstanceOf[js.Any])
      
      inline def setCancel_on_tap_outsideUndefined: Self = StObject.set(x, "cancel_on_tap_outside", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setContext(value: signin | signup | use): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntermediate_iframe_close_callback(value: Callback): Self = StObject.set(x, "intermediate_iframe_close_callback", value.toJsFn)
      
      inline def setIntermediate_iframe_close_callbackUndefined: Self = StObject.set(x, "intermediate_iframe_close_callback", js.undefined)
      
      inline def setItp_support(value: Boolean): Self = StObject.set(x, "itp_support", value.asInstanceOf[js.Any])
      
      inline def setItp_supportUndefined: Self = StObject.set(x, "itp_support", js.undefined)
      
      inline def setLog_level(value: debug | info | warn): Self = StObject.set(x, "log_level", value.asInstanceOf[js.Any])
      
      inline def setLog_levelUndefined: Self = StObject.set(x, "log_level", js.undefined)
      
      inline def setLogin_uri(value: String): Self = StObject.set(x, "login_uri", value.asInstanceOf[js.Any])
      
      inline def setLogin_uriUndefined: Self = StObject.set(x, "login_uri", js.undefined)
      
      inline def setNative_callback(value: Callback): Self = StObject.set(x, "native_callback", value.toJsFn)
      
      inline def setNative_callbackUndefined: Self = StObject.set(x, "native_callback", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrompt_parent_id(value: String): Self = StObject.set(x, "prompt_parent_id", value.asInstanceOf[js.Any])
      
      inline def setPrompt_parent_idUndefined: Self = StObject.set(x, "prompt_parent_id", js.undefined)
      
      inline def setState_cookie_domain(value: String): Self = StObject.set(x, "state_cookie_domain", value.asInstanceOf[js.Any])
      
      inline def setState_cookie_domainUndefined: Self = StObject.set(x, "state_cookie_domain", js.undefined)
      
      inline def setUx_mode(value: popup | redirect): Self = StObject.set(x, "ux_mode", value.asInstanceOf[js.Any])
      
      inline def setUx_modeUndefined: Self = StObject.set(x, "ux_mode", js.undefined)
    }
  }
  
  trait PromptMomentNotification extends StObject {
    
    def getDismissedReason(): credential_returned | cancel_called | flow_restarted
    
    def getMomentType(): display | skipped | dismissed
    
    def getNotDisplayedReason(): browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
    
    def getSkippedReason(): auto_cancel | user_cancel | tap_outside | issuing_failed
    
    def isDismissedMoment(): Boolean
    
    def isDisplayMoment(): Boolean
    
    def isDisplayed(): Boolean
    
    def isNotDisplayed(): Boolean
    
    def isSkippedMoment(): Boolean
  }
  object PromptMomentNotification {
    
    inline def apply(
      getDismissedReason: CallbackTo[credential_returned | cancel_called | flow_restarted],
      getMomentType: CallbackTo[display | skipped | dismissed],
      getNotDisplayedReason: CallbackTo[
          browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
        ],
      getSkippedReason: CallbackTo[auto_cancel | user_cancel | tap_outside | issuing_failed],
      isDismissedMoment: CallbackTo[Boolean],
      isDisplayMoment: CallbackTo[Boolean],
      isDisplayed: CallbackTo[Boolean],
      isNotDisplayed: CallbackTo[Boolean],
      isSkippedMoment: CallbackTo[Boolean]
    ): PromptMomentNotification = {
      val __obj = js.Dynamic.literal(getDismissedReason = getDismissedReason.toJsFn, getMomentType = getMomentType.toJsFn, getNotDisplayedReason = getNotDisplayedReason.toJsFn, getSkippedReason = getSkippedReason.toJsFn, isDismissedMoment = isDismissedMoment.toJsFn, isDisplayMoment = isDisplayMoment.toJsFn, isDisplayed = isDisplayed.toJsFn, isNotDisplayed = isNotDisplayed.toJsFn, isSkippedMoment = isSkippedMoment.toJsFn)
      __obj.asInstanceOf[PromptMomentNotification]
    }
    
    extension [Self <: PromptMomentNotification](x: Self) {
      
      inline def setGetDismissedReason(value: CallbackTo[credential_returned | cancel_called | flow_restarted]): Self = StObject.set(x, "getDismissedReason", value.toJsFn)
      
      inline def setGetMomentType(value: CallbackTo[display | skipped | dismissed]): Self = StObject.set(x, "getMomentType", value.toJsFn)
      
      inline def setGetNotDisplayedReason(
        value: CallbackTo[
              browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
            ]
      ): Self = StObject.set(x, "getNotDisplayedReason", value.toJsFn)
      
      inline def setGetSkippedReason(value: CallbackTo[auto_cancel | user_cancel | tap_outside | issuing_failed]): Self = StObject.set(x, "getSkippedReason", value.toJsFn)
      
      inline def setIsDismissedMoment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDismissedMoment", value.toJsFn)
      
      inline def setIsDisplayMoment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisplayMoment", value.toJsFn)
      
      inline def setIsDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisplayed", value.toJsFn)
      
      inline def setIsNotDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNotDisplayed", value.toJsFn)
      
      inline def setIsSkippedMoment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSkippedMoment", value.toJsFn)
    }
  }
  
  trait RevocationResponse extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var successful: Boolean
  }
  object RevocationResponse {
    
    inline def apply(successful: Boolean): RevocationResponse = {
      val __obj = js.Dynamic.literal(successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[RevocationResponse]
    }
    
    extension [Self <: RevocationResponse](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSuccessful(value: Boolean): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    }
  }
}
