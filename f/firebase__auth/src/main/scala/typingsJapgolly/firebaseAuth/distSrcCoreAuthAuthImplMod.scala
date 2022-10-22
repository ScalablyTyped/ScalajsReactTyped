package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAuth.distSrcCorePersistenceMod.PersistenceInternal
import typingsJapgolly.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distSrcModelAuthMod.ConfigInternal
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.AuthErrorMap
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.PopupRedirectResolver
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distSrcModelUserMod.UserInternal
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.heartbeat
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.https
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.identitytoolkitDotgoogleapisDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.securetokenDotgoogleapisDotcom
import typingsJapgolly.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreAuthAuthImplMod {
  
  @JSImport("@firebase/auth/dist/src/core/auth/auth_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/auth/dist/src/core/auth/auth_impl", "AuthImpl")
  @js.native
  open class AuthImpl protected ()
    extends StObject
       with AuthInternal {
    def this(app: FirebaseApp, heartbeatServiceProvider: Provider[heartbeat], config: ConfigInternal) = this()
    
    /** Returns the current user cast as the internal type */
    def _currentUser: UserInternal = js.native
    
    def _delete(): js.Promise[Unit] = js.native
    
    var _deleted: Boolean = js.native
    
    def _initializeWithPersistence(persistenceHierarchy: js.Array[PersistenceInternal]): js.Promise[Unit] = js.native
    def _initializeWithPersistence(persistenceHierarchy: js.Array[PersistenceInternal], popupRedirectResolver: PopupRedirectResolver): js.Promise[Unit] = js.native
    
    def _updateCurrentUser(user: Null, skipBeforeStateCallbacks: Boolean): js.Promise[Unit] = js.native
    def _updateCurrentUser(user: User): js.Promise[Unit] = js.native
    def _updateCurrentUser(user: User, skipBeforeStateCallbacks: Boolean): js.Promise[Unit] = js.native
    
    def _updateErrorMap(errorMap: AuthErrorMap): Unit = js.native
    
    /* private */ def assertedPersistence: Any = js.native
    
    /* private */ var authStateSubscription: Any = js.native
    
    /* private */ val beforeStateQueue: Any = js.native
    
    /* private */ var clientVersion: Any = js.native
    
    /**
      * Unprotected (from race conditions) method to set the current user. This
      * should only be called from within a queued callback. This is necessary
      * because the queue shouldn't rely on another queued callback.
      */
    /* private */ var directlySetCurrentUser: Any = js.native
    
    /* private */ var frameworks: Any = js.native
    
    /* private */ var getOrInitRedirectPersistenceManager: Any = js.native
    
    /* private */ val heartbeatServiceProvider: Any = js.native
    
    /* private */ var idTokenSubscription: Any = js.native
    
    /* private */ var initializeCurrentUser: Any = js.native
    
    /* private */ var isProactiveRefreshEnabled: Any = js.native
    
    /* private */ var lastNotifiedUid: Any = js.native
    
    /* private */ var notifyAuthListeners: Any = js.native
    
    /* private */ var operations: Any = js.native
    
    /* private */ var persistenceManager: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    /* private */ var redirectPersistenceManager: Any = js.native
    
    /* private */ var redirectUser: Any = js.native
    
    /* private */ var registerStateListener: Any = js.native
    
    /* private */ var reloadAndSetCurrentUserOrClear: Any = js.native
    
    def toJSON(): js.Object = js.native
    
    /* private */ var tryRedirectSignIn: Any = js.native
  }
  
  inline def castAuth(auth: Auth): AuthInternal = ^.asInstanceOf[js.Dynamic].applyDynamic("_castAuth")(auth.asInstanceOf[js.Any]).asInstanceOf[AuthInternal]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.securetokenDotgoogleapisDotcom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.identitytoolkitDotgoogleapisDotcom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.https
  */
  trait DefaultConfig extends StObject
  object DefaultConfig {
    
    inline def API_HOST: identitytoolkitDotgoogleapisDotcom = "identitytoolkit.googleapis.com".asInstanceOf[identitytoolkitDotgoogleapisDotcom]
    
    inline def API_SCHEME: https = "https".asInstanceOf[https]
    
    inline def TOKEN_API_HOST: securetokenDotgoogleapisDotcom = "securetoken.googleapis.com".asInstanceOf[securetokenDotgoogleapisDotcom]
  }
}
