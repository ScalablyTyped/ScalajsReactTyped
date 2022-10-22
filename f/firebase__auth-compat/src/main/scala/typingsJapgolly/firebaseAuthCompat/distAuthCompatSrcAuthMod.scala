package typingsJapgolly.firebaseAuthCompat

import typingsJapgolly.firebaseAppCompat.mod.FirebaseServiceInternals
import typingsJapgolly.firebaseAuth.internalMod.AuthImpl
import typingsJapgolly.firebaseAuthCompat.anon.DisableWarnings
import typingsJapgolly.firebaseAuthCompat.anon.LOCAL
import typingsJapgolly.firebaseAuthCompat.appCompatMod.FirebaseApp
import typingsJapgolly.firebaseAuthCompat.distAuthCompatSrcWrapMod.Wrapper
import typingsJapgolly.firebaseAuthTypes.mod.AuthSettings
import typingsJapgolly.firebaseAuthTypes.mod.EmulatorConfig
import typingsJapgolly.firebaseAuthTypes.mod.FirebaseAuth
import typingsJapgolly.firebaseAuthTypes.mod.User
import typingsJapgolly.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthCompatSrcAuthMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.firebaseAppCompat.mod.FirebaseService because var conflicts: app. Inlined INTERNAL */ @JSImport("@firebase/auth-compat/dist/auth-compat/src/auth", "Auth")
  @js.native
  open class Auth protected ()
    extends FirebaseAuth
       with Wrapper[typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Auth]
       with Compat[Any] {
    def this(
      app: FirebaseApp,
      provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'auth'> */ Any
    ) = this()
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.native
    
    /* CompleteClass */
    var _delegate: Any = js.native
    @JSName("_delegate")
    val _delegate_Auth: AuthImpl = js.native
    
    def _delete(): js.Promise[Unit] = js.native
    
    def addFrameworkForLogging(framework: String): Unit = js.native
    
    @JSName("app")
    val app_Auth: FirebaseApp = js.native
    
    @JSName("currentUser")
    def currentUser_MAuth: User | Null = js.native
    
    @JSName("emulatorConfig")
    def emulatorConfig_MAuth: EmulatorConfig | Null = js.native
    
    def fetchProvidersForEmail(email: String): js.Promise[js.Array[String]] = js.native
    
    @JSName("languageCode")
    def languageCode_MAuth: String | Null = js.native
    
    /* private */ var linkUnderlyingAuth: Any = js.native
    
    @JSName("settings")
    def settings_MAuth: AuthSettings = js.native
    
    @JSName("tenantId")
    def tenantId_MAuth: String | Null = js.native
    
    /* CompleteClass */
    override def unwrap(): typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Auth = js.native
    
    def useEmulator(url: String, options: DisableWarnings): Unit = js.native
  }
  /* static members */
  object Auth {
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/auth", "Auth")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/auth", "Auth.Persistence")
    @js.native
    def Persistence: LOCAL = js.native
    inline def Persistence_=(x: LOCAL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Persistence")(x.asInstanceOf[js.Any])
  }
}
