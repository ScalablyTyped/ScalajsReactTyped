package typingsJapgolly.firebaseAuth

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseAuth.distRnSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.Persistence
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.PopupRedirectResolver
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.UserCredential
import typingsJapgolly.firebaseAuth.distRnSrcModelUserMod.UserCredentialInternal
import typingsJapgolly.firebaseAuth.distRnSrcPlatformBrowserUtilPopupMod.AuthPopup
import typingsJapgolly.firebaseAuth.firebaseAuthInts.`0`
import typingsJapgolly.firebaseAuth.firebaseAuthInts.`1`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.linkViaPopup
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.linkViaRedirect
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthViaPopup
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthViaRedirect
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signInViaPopup
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signInViaRedirect
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.unknown
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.verifyApp
import typingsJapgolly.firebaseAuth.gapi.iframes.Message
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcModelPopupRedirectMod {
  
  trait AuthEvent extends StObject {
    
    var error: js.UndefOr[AuthEventError] = js.undefined
    
    var eventId: String | Null
    
    var postBody: String | Null
    
    var sessionId: String | Null
    
    var tenantId: String | Null
    
    var `type`: AuthEventType
    
    var urlResponse: String | Null
  }
  object AuthEvent {
    
    inline def apply(`type`: AuthEventType): AuthEvent = {
      val __obj = js.Dynamic.literal(eventId = null, postBody = null, sessionId = null, tenantId = null, urlResponse = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthEvent]
    }
    
    extension [Self <: AuthEvent](x: Self) {
      
      inline def setError(value: AuthEventError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
      
      inline def setPostBody(value: String): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
      
      inline def setPostBodyNull: Self = StObject.set(x, "postBody", null)
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
      
      inline def setType(value: AuthEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrlResponse(value: String): Self = StObject.set(x, "urlResponse", value.asInstanceOf[js.Any])
      
      inline def setUrlResponseNull: Self = StObject.set(x, "urlResponse", null)
    }
  }
  
  trait AuthEventConsumer extends StObject {
    
    var eventId: String | Null
    
    val filter: js.Array[AuthEventType]
    
    def onAuthEvent(event: AuthEvent): Any
    
    def onError(error: FirebaseError): Any
  }
  object AuthEventConsumer {
    
    inline def apply(filter: js.Array[AuthEventType], onAuthEvent: AuthEvent => Any, onError: FirebaseError => Any): AuthEventConsumer = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], onAuthEvent = js.Any.fromFunction1(onAuthEvent), onError = js.Any.fromFunction1(onError), eventId = null)
      __obj.asInstanceOf[AuthEventConsumer]
    }
    
    extension [Self <: AuthEventConsumer](x: Self) {
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
      
      inline def setFilter(value: js.Array[AuthEventType]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterVarargs(value: AuthEventType*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setOnAuthEvent(value: AuthEvent => Any): Self = StObject.set(x, "onAuthEvent", js.Any.fromFunction1(value))
      
      inline def setOnError(value: FirebaseError => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    }
  }
  
  trait AuthEventError
    extends StObject
       with Error {
    
    var code: String
  }
  object AuthEventError {
    
    inline def apply(code: String, message: String, name: String): AuthEventError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthEventError]
    }
    
    extension [Self <: AuthEventError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.linkViaPopup
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.linkViaRedirect
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthViaPopup
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthViaRedirect
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.signInViaPopup
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.signInViaRedirect
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.unknown
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.verifyApp
  */
  trait AuthEventType extends StObject
  object AuthEventType {
    
    inline def LINK_VIA_POPUP: linkViaPopup = "linkViaPopup".asInstanceOf[linkViaPopup]
    
    inline def LINK_VIA_REDIRECT: linkViaRedirect = "linkViaRedirect".asInstanceOf[linkViaRedirect]
    
    inline def REAUTH_VIA_POPUP: reauthViaPopup = "reauthViaPopup".asInstanceOf[reauthViaPopup]
    
    inline def REAUTH_VIA_REDIRECT: reauthViaRedirect = "reauthViaRedirect".asInstanceOf[reauthViaRedirect]
    
    inline def SIGN_IN_VIA_POPUP: signInViaPopup = "signInViaPopup".asInstanceOf[signInViaPopup]
    
    inline def SIGN_IN_VIA_REDIRECT: signInViaRedirect = "signInViaRedirect".asInstanceOf[signInViaRedirect]
    
    inline def UNKNOWN: unknown = "unknown".asInstanceOf[unknown]
    
    inline def VERIFY_APP: verifyApp = "verifyApp".asInstanceOf[verifyApp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthInts.`0`
    - typingsJapgolly.firebaseAuth.firebaseAuthInts.`1`
  */
  trait EventFilter extends StObject
  object EventFilter {
    
    inline def POPUP: `0` = 0.asInstanceOf[`0`]
    
    inline def REDIRECT: `1` = 1.asInstanceOf[`1`]
  }
  
  trait EventManager extends StObject {
    
    def registerConsumer(authEventConsumer: AuthEventConsumer): Unit
    
    def unregisterConsumer(authEventConsumer: AuthEventConsumer): Unit
  }
  object EventManager {
    
    inline def apply(registerConsumer: AuthEventConsumer => Callback, unregisterConsumer: AuthEventConsumer => Callback): EventManager = {
      val __obj = js.Dynamic.literal(registerConsumer = js.Any.fromFunction1((t0: AuthEventConsumer) => registerConsumer(t0).runNow()), unregisterConsumer = js.Any.fromFunction1((t0: AuthEventConsumer) => unregisterConsumer(t0).runNow()))
      __obj.asInstanceOf[EventManager]
    }
    
    extension [Self <: EventManager](x: Self) {
      
      inline def setRegisterConsumer(value: AuthEventConsumer => Callback): Self = StObject.set(x, "registerConsumer", js.Any.fromFunction1((t0: AuthEventConsumer) => value(t0).runNow()))
      
      inline def setUnregisterConsumer(value: AuthEventConsumer => Callback): Self = StObject.set(x, "unregisterConsumer", js.Any.fromFunction1((t0: AuthEventConsumer) => value(t0).runNow()))
    }
  }
  
  trait GapiAuthEvent
    extends StObject
       with Message {
    
    var authEvent: AuthEvent
  }
  object GapiAuthEvent {
    
    inline def apply(authEvent: AuthEvent, `type`: String): GapiAuthEvent = {
      val __obj = js.Dynamic.literal(authEvent = authEvent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GapiAuthEvent]
    }
    
    extension [Self <: GapiAuthEvent](x: Self) {
      
      inline def setAuthEvent(value: AuthEvent): Self = StObject.set(x, "authEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.ACK
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.ERROR
  */
  trait GapiOutcome extends StObject
  object GapiOutcome {
    
    inline def ACK: typingsJapgolly.firebaseAuth.firebaseAuthStrings.ACK = "ACK".asInstanceOf[typingsJapgolly.firebaseAuth.firebaseAuthStrings.ACK]
    
    inline def ERROR: typingsJapgolly.firebaseAuth.firebaseAuthStrings.ERROR = "ERROR".asInstanceOf[typingsJapgolly.firebaseAuth.firebaseAuthStrings.ERROR]
  }
  
  @js.native
  trait PopupRedirectResolverInternal
    extends StObject
       with PopupRedirectResolver {
    
    def _completeRedirectFn(auth: Auth, resolver: PopupRedirectResolver, bypassAuthState: Boolean): js.Promise[UserCredential | Null] = js.native
    
    def _initialize(auth: AuthInternal): js.Promise[EventManager] = js.native
    
    def _isIframeWebStorageSupported(auth: AuthInternal, cb: js.Function1[/* support */ Boolean, Any]): Unit = js.native
    
    def _openPopup(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType): js.Promise[AuthPopup] = js.native
    def _openPopup(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType, eventId: String): js.Promise[AuthPopup] = js.native
    
    def _openRedirect(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType): js.Promise[Unit | scala.Nothing] = js.native
    def _openRedirect(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType, eventId: String): js.Promise[Unit | scala.Nothing] = js.native
    
    def _originValidation(auth: Auth): js.Promise[Unit] = js.native
    
    def _overrideRedirectResult(auth: AuthInternal, resultGetter: js.Function0[js.Promise[UserCredentialInternal | Null]]): Unit = js.native
    
    var _redirectPersistence: Persistence = js.native
    
    var _shouldInitProactively: Boolean = js.native
  }
}
