package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcApiAuthenticationEmailAndPasswordMod.GetOobCodeRequest
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.ActionCodeSettings
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreStrategiesActionCodeSettingsMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/strategies/action_code_settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setActionCodeSettingsOnRequest(auth: Auth, request: GetOobCodeRequest, actionCodeSettings: ActionCodeSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setActionCodeSettingsOnRequest")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
