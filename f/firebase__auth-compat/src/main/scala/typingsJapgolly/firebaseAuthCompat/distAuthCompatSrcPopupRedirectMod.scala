package typingsJapgolly.firebaseAuthCompat

import typingsJapgolly.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distSrcModelPopupRedirectMod.AuthEventType
import typingsJapgolly.firebaseAuth.distSrcModelPopupRedirectMod.EventManager
import typingsJapgolly.firebaseAuth.distSrcModelPopupRedirectMod.PopupRedirectResolverInternal
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.firebaseAuth.distSrcModelUserMod.UserCredentialInternal
import typingsJapgolly.firebaseAuth.internalMod.AuthImpl
import typingsJapgolly.firebaseAuth.internalMod.AuthPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthCompatSrcPopupRedirectMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/popup_redirect", "CompatPopupRedirectResolver")
  @js.native
  open class CompatPopupRedirectResolver ()
    extends StObject
       with PopupRedirectResolverInternal {
    
    def _initialize(auth: AuthImpl): js.Promise[EventManager] = js.native
    
    def _isIframeWebStorageSupported(auth: AuthImpl, cb: js.Function1[/* support */ Boolean, Any]): Unit = js.native
    
    def _openPopup(auth: AuthImpl, provider: AuthProvider, authType: AuthEventType): js.Promise[AuthPopup] = js.native
    def _openPopup(auth: AuthImpl, provider: AuthProvider, authType: AuthEventType, eventId: String): js.Promise[AuthPopup] = js.native
    
    def _openRedirect(auth: AuthImpl, provider: AuthProvider, authType: AuthEventType): js.Promise[Unit] = js.native
    def _openRedirect(auth: AuthImpl, provider: AuthProvider, authType: AuthEventType, eventId: String): js.Promise[Unit] = js.native
    
    @JSName("_overrideRedirectResult")
    var _overrideRedirectResult_Original: js.Function2[
        /* auth */ AuthInternal, 
        /* result */ js.Function0[js.Promise[UserCredentialInternal | Null]], 
        Unit
      ] = js.native
    
    @JSName("_shouldInitProactively")
    def _shouldInitProactively_MCompatPopupRedirectResolver: Boolean = js.native
    
    /* private */ def assertedUnderlyingResolver: Any = js.native
    
    /* private */ val browserResolver: Any = js.native
    
    /* private */ val cordovaResolver: Any = js.native
    
    /* private */ var selectUnderlyingResolver: Any = js.native
    
    /* private */ var underlyingResolver: Any = js.native
  }
}
