package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreAuthFirebaseInternalMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/auth/firebase_internal", "AuthInterop")
  @js.native
  open class AuthInterop protected ()
    extends StObject
       with FirebaseAuthInternal {
    def this(auth: AuthInternal) = this()
    
    /* private */ var assertAuthConfigured: Any = js.native
    
    /* private */ val auth: Any = js.native
    
    /* private */ val internalListeners: Any = js.native
    
    /* private */ var updateProactiveRefresh: Any = js.native
  }
  
  type TokenListener = js.Function1[/* tok */ String | Null, Any]
}
