package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseFirestore.anon.GetAuthHeaderValueForFirstParty
import typingsJapgolly.firebaseFirestore.distFirestoreSrcAuthUserMod.User
import typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.gapi
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.provider
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcApiCredentialsMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "AppCheckToken")
  @js.native
  open class AppCheckToken protected ()
    extends StObject
       with Token {
    def this(value: String) = this()
    
    /** Header values to set for this token */
    /* CompleteClass */
    var headers: Map[String, String] = js.native
    @JSName("headers")
    var headers_AppCheckToken: Map[Any, Any] = js.native
    
    /** Type of token. */
    /* CompleteClass */
    var `type`: TokenType = js.native
    
    /* private */ var value: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "EmptyAppCheckTokenProvider")
  @js.native
  open class EmptyAppCheckTokenProvider ()
    extends StObject
       with CredentialsProvider[String] {
    
    /** Requests a token for the current user. */
    /* CompleteClass */
    override def getToken(): js.Promise[Token | Null] = js.native
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    /* CompleteClass */
    override def invalidateToken(): Unit = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    /* CompleteClass */
    override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[String]): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "EmptyAuthCredentialsProvider")
  @js.native
  open class EmptyAuthCredentialsProvider ()
    extends StObject
       with CredentialsProvider[User] {
    
    /** Requests a token for the current user. */
    /* CompleteClass */
    override def getToken(): js.Promise[Token | Null] = js.native
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    /* CompleteClass */
    override def invalidateToken(): Unit = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    /* CompleteClass */
    override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[User]): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "EmulatorAuthCredentialsProvider")
  @js.native
  open class EmulatorAuthCredentialsProvider protected ()
    extends StObject
       with CredentialsProvider[User] {
    def this(token: Token) = this()
    
    /**
      * Stores the listener registered with setChangeListener()
      * This isn't actually necessary since the UID never changes, but we use this
      * to verify the listen contract is adhered to in tests.
      */
    /* private */ var changeListener: Any = js.native
    
    /** Requests a token for the current user. */
    /* CompleteClass */
    override def getToken(): js.Promise[Token | Null] = js.native
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    /* CompleteClass */
    override def invalidateToken(): Unit = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    /* CompleteClass */
    override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[User]): Unit = js.native
    
    /* private */ var token: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "FirebaseAppCheckTokenProvider")
  @js.native
  open class FirebaseAppCheckTokenProvider protected ()
    extends StObject
       with CredentialsProvider[String] {
    def this(appCheckProvider: Provider[AppCheckInternalComponentName]) = this()
    
    /* private */ var appCheck: Any = js.native
    
    /* private */ var appCheckProvider: Any = js.native
    
    /* private */ var forceRefresh: Any = js.native
    
    /** Requests a token for the current user. */
    /* CompleteClass */
    override def getToken(): js.Promise[Token | Null] = js.native
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    /* CompleteClass */
    override def invalidateToken(): Unit = js.native
    
    /* private */ var latestAppCheckToken: Any = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    /* CompleteClass */
    override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[String]): Unit = js.native
    
    /**
      * The AppCheck token listener registered with FirebaseApp, retained here so
      * we can unregister it.
      */
    /* private */ var tokenListener: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "FirebaseAuthCredentialsProvider")
  @js.native
  open class FirebaseAuthCredentialsProvider protected ()
    extends StObject
       with CredentialsProvider[User] {
    def this(authProvider: Provider[FirebaseAuthInternalName]) = this()
    
    /* private */ var auth: Any = js.native
    
    /* private */ var authProvider: Any = js.native
    
    /** Tracks the current User. */
    /* private */ var currentUser: Any = js.native
    
    /* private */ var forceRefresh: Any = js.native
    
    /** Requests a token for the current user. */
    /* CompleteClass */
    override def getToken(): js.Promise[Token | Null] = js.native
    
    /* private */ var getUser: Any = js.native
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    /* CompleteClass */
    override def invalidateToken(): Unit = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    /* CompleteClass */
    override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[User]): Unit = js.native
    
    /**
      * Counter used to detect if the token changed while a getToken request was
      * outstanding.
      */
    /* private */ var tokenCounter: Any = js.native
    
    /**
      * The auth token listener registered with FirebaseApp, retained here so we
      * can unregister it.
      */
    /* private */ var tokenListener: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "FirstPartyAuthCredentialsProvider")
  @js.native
  open class FirstPartyAuthCredentialsProvider protected ()
    extends StObject
       with CredentialsProvider[User] {
    def this(gapi: Null, sessionIndex: String) = this()
    def this(gapi: Gapi, sessionIndex: String) = this()
    def this(gapi: Null, sessionIndex: String, iamToken: String) = this()
    def this(gapi: Gapi, sessionIndex: String, iamToken: String) = this()
    def this(gapi: Null, sessionIndex: String, iamToken: String, authTokenFactory: AuthTokenFactory) = this()
    def this(gapi: Null, sessionIndex: String, iamToken: Null, authTokenFactory: AuthTokenFactory) = this()
    def this(gapi: Gapi, sessionIndex: String, iamToken: String, authTokenFactory: AuthTokenFactory) = this()
    def this(gapi: Gapi, sessionIndex: String, iamToken: Null, authTokenFactory: AuthTokenFactory) = this()
    
    /* private */ var authTokenFactory: Any = js.native
    
    /* private */ var gapi: Any = js.native
    
    /** Requests a token for the current user. */
    /* CompleteClass */
    override def getToken(): js.Promise[Token | Null] = js.native
    
    /* private */ var iamToken: Any = js.native
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    /* CompleteClass */
    override def invalidateToken(): Unit = js.native
    
    /* private */ var sessionIndex: Any = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    /* CompleteClass */
    override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[User]): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "FirstPartyToken")
  @js.native
  open class FirstPartyToken protected ()
    extends StObject
       with Token {
    def this(gapi: Null, sessionIndex: String) = this()
    def this(gapi: Gapi, sessionIndex: String) = this()
    def this(gapi: Null, sessionIndex: String, iamToken: String) = this()
    def this(gapi: Gapi, sessionIndex: String, iamToken: String) = this()
    def this(gapi: Null, sessionIndex: String, iamToken: String, authTokenFactory: AuthTokenFactory) = this()
    def this(gapi: Null, sessionIndex: String, iamToken: Null, authTokenFactory: AuthTokenFactory) = this()
    def this(gapi: Gapi, sessionIndex: String, iamToken: String, authTokenFactory: AuthTokenFactory) = this()
    def this(gapi: Gapi, sessionIndex: String, iamToken: Null, authTokenFactory: AuthTokenFactory) = this()
    
    /* private */ var _headers: Any = js.native
    
    /* private */ val authTokenFactory: Any = js.native
    
    /* private */ val gapi: Any = js.native
    
    /** Gets an authorization token, using a provided factory function, or falling back to First Party GAPI. */
    /* private */ var getAuthToken: Any = js.native
    
    /** Header values to set for this token */
    /* CompleteClass */
    var headers: Map[String, String] = js.native
    @JSName("headers")
    def headers_MFirstPartyToken: Map[String, String] = js.native
    
    /* private */ val iamToken: Any = js.native
    
    /* private */ val sessionIndex: Any = js.native
    
    /** Type of token. */
    /* CompleteClass */
    var `type`: TokenType = js.native
    
    @JSName("user")
    var user_FirstPartyToken: User = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "LiteAppCheckTokenProvider")
  @js.native
  open class LiteAppCheckTokenProvider protected ()
    extends StObject
       with CredentialsProvider[String] {
    def this(appCheckProvider: Provider[AppCheckInternalComponentName]) = this()
    
    /* private */ var appCheck: Any = js.native
    
    /* private */ var appCheckProvider: Any = js.native
    
    /** Requests a token for the current user. */
    /* CompleteClass */
    override def getToken(): js.Promise[Token | Null] = js.native
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    /* CompleteClass */
    override def invalidateToken(): Unit = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    /* CompleteClass */
    override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[String]): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "LiteAuthCredentialsProvider")
  @js.native
  open class LiteAuthCredentialsProvider protected ()
    extends StObject
       with CredentialsProvider[User] {
    def this(authProvider: Provider[FirebaseAuthInternalName]) = this()
    
    /* private */ var auth: Any = js.native
    
    /** Requests a token for the current user. */
    /* CompleteClass */
    override def getToken(): js.Promise[Token | Null] = js.native
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    /* CompleteClass */
    override def invalidateToken(): Unit = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    /* CompleteClass */
    override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[User]): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/credentials", "OAuthToken")
  @js.native
  open class OAuthToken protected ()
    extends StObject
       with Token {
    def this(value: String, user: User) = this()
    
    /** Header values to set for this token */
    /* CompleteClass */
    var headers: Map[String, String] = js.native
    @JSName("headers")
    var headers_OAuthToken: Map[Any, Any] = js.native
    
    /** Type of token. */
    /* CompleteClass */
    var `type`: TokenType = js.native
    
    @JSName("user")
    var user_OAuthToken: User = js.native
  }
  
  inline def makeAuthCredentialsProvider(): CredentialsProvider[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAuthCredentialsProvider")().asInstanceOf[CredentialsProvider[User]]
  inline def makeAuthCredentialsProvider(credentials: CredentialsSettings): CredentialsProvider[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAuthCredentialsProvider")(credentials.asInstanceOf[js.Any]).asInstanceOf[CredentialsProvider[User]]
  
  type AuthTokenFactory = js.Function0[String]
  
  type CredentialChangeListener[T] = js.Function1[/* credential */ T, js.Promise[Unit]]
  
  trait CredentialsProvider[T] extends StObject {
    
    /** Requests a token for the current user. */
    def getToken(): js.Promise[Token | Null]
    
    /**
      * Marks the last retrieved token as invalid, making the next GetToken request
      * force-refresh the token.
      */
    def invalidateToken(): Unit
    
    def shutdown(): Unit
    
    /**
      * Starts the credentials provider and specifies a listener to be notified of
      * credential changes (sign-in / sign-out, token changes). It is immediately
      * called once with the initial user.
      *
      * The change listener is invoked on the provided AsyncQueue.
      */
    def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[T]): Unit
  }
  object CredentialsProvider {
    
    inline def apply[T](
      getToken: CallbackTo[js.Promise[Token | Null]],
      invalidateToken: Callback,
      shutdown: Callback,
      start: (AsyncQueue, CredentialChangeListener[T]) => Callback
    ): CredentialsProvider[T] = {
      val __obj = js.Dynamic.literal(getToken = getToken.toJsFn, invalidateToken = invalidateToken.toJsFn, shutdown = shutdown.toJsFn, start = js.Any.fromFunction2((t0: AsyncQueue, t1: CredentialChangeListener[T]) => (start(t0, t1)).runNow()))
      __obj.asInstanceOf[CredentialsProvider[T]]
    }
    
    extension [Self <: CredentialsProvider[?], T](x: Self & CredentialsProvider[T]) {
      
      inline def setGetToken(value: CallbackTo[js.Promise[Token | Null]]): Self = StObject.set(x, "getToken", value.toJsFn)
      
      inline def setInvalidateToken(value: Callback): Self = StObject.set(x, "invalidateToken", value.toJsFn)
      
      inline def setShutdown(value: Callback): Self = StObject.set(x, "shutdown", value.toJsFn)
      
      inline def setStart(value: (AsyncQueue, CredentialChangeListener[T]) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: AsyncQueue, t1: CredentialChangeListener[T]) => (value(t0, t1)).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.FirstPartyCredentialsSettings
    - typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.ProviderCredentialsSettings
  */
  trait CredentialsSettings extends StObject
  object CredentialsSettings {
    
    inline def FirstPartyCredentialsSettings(client: Any, sessionIndex: String): typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.FirstPartyCredentialsSettings = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any], authTokenFactory = null, iamToken = null)
      __obj.updateDynamic("type")("gapi")
      __obj.asInstanceOf[typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.FirstPartyCredentialsSettings]
    }
    
    inline def ProviderCredentialsSettings(client: CredentialsProvider[User]): typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.ProviderCredentialsSettings = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("provider")
      __obj.asInstanceOf[typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.ProviderCredentialsSettings]
    }
  }
  
  trait FirstPartyCredentialsSettings
    extends StObject
       with CredentialsSettings {
    
    var authTokenFactory: AuthTokenFactory | Null
    
    var client: Any
    
    var iamToken: String | Null
    
    var sessionIndex: String
    
    var `type`: gapi
  }
  object FirstPartyCredentialsSettings {
    
    inline def apply(client: Any, sessionIndex: String): FirstPartyCredentialsSettings = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any], authTokenFactory = null, iamToken = null)
      __obj.updateDynamic("type")("gapi")
      __obj.asInstanceOf[FirstPartyCredentialsSettings]
    }
    
    extension [Self <: FirstPartyCredentialsSettings](x: Self) {
      
      inline def setAuthTokenFactory(value: CallbackTo[String]): Self = StObject.set(x, "authTokenFactory", value.toJsFn)
      
      inline def setAuthTokenFactoryNull: Self = StObject.set(x, "authTokenFactory", null)
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setIamToken(value: String): Self = StObject.set(x, "iamToken", value.asInstanceOf[js.Any])
      
      inline def setIamTokenNull: Self = StObject.set(x, "iamToken", null)
      
      inline def setSessionIndex(value: String): Self = StObject.set(x, "sessionIndex", value.asInstanceOf[js.Any])
      
      inline def setType(value: gapi): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Gapi extends StObject {
    
    var auth: GetAuthHeaderValueForFirstParty
  }
  object Gapi {
    
    inline def apply(auth: GetAuthHeaderValueForFirstParty): Gapi = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gapi]
    }
    
    extension [Self <: Gapi](x: Self) {
      
      inline def setAuth(value: GetAuthHeaderValueForFirstParty): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProviderCredentialsSettings
    extends StObject
       with CredentialsSettings {
    
    var client: CredentialsProvider[User]
    
    var `type`: provider
  }
  object ProviderCredentialsSettings {
    
    inline def apply(client: CredentialsProvider[User]): ProviderCredentialsSettings = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("provider")
      __obj.asInstanceOf[ProviderCredentialsSettings]
    }
    
    extension [Self <: ProviderCredentialsSettings](x: Self) {
      
      inline def setClient(value: CredentialsProvider[User]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setType(value: provider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token extends StObject {
    
    /** Header values to set for this token */
    var headers: Map[String, String]
    
    /** Type of token. */
    var `type`: TokenType
    
    /**
      * The user with which the token is associated (used for persisting user
      * state on disk, etc.).
      * This will be null for Tokens of the type 'AppCheck'.
      */
    var user: js.UndefOr[User] = js.undefined
  }
  object Token {
    
    inline def apply(headers: Map[String, String], `type`: TokenType): Token = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setHeaders(value: Map[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OAuth
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.FirstParty
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.AppCheck
  */
  trait TokenType extends StObject
  object TokenType {
    
    inline def AppCheck: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.AppCheck = "AppCheck".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.AppCheck]
    
    inline def FirstParty: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.FirstParty = "FirstParty".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.FirstParty]
    
    inline def OAuth: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OAuth = "OAuth".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OAuth]
  }
}
