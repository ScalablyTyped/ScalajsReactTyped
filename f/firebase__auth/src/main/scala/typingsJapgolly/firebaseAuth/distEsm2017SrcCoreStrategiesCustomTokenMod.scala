package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcCoreStrategiesCustomTokenMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/strategies/custom_token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInWithCustomToken(auth: Auth, customToken: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], customToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
}
