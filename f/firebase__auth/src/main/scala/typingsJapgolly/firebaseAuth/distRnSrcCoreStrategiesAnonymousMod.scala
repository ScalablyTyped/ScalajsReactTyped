package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcCoreStrategiesAnonymousMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/strategies/anonymous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInAnonymously(auth: Auth): js.Promise[UserCredential] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInAnonymously")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential]]
}
