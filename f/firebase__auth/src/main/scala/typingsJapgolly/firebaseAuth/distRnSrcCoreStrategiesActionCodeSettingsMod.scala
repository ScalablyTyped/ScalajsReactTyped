package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distRnSrcApiAuthenticationEmailAndPasswordMod.GetOobCodeRequest
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.ActionCodeSettings
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcCoreStrategiesActionCodeSettingsMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/strategies/action_code_settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setActionCodeSettingsOnRequest(auth: Auth, request: GetOobCodeRequest, actionCodeSettings: ActionCodeSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setActionCodeSettingsOnRequest")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
