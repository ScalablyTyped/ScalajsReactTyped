package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.distSrcInterfacesInstallationEntryMod.CompletedAuthToken
import typingsJapgolly.firebaseInstallations.distSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry
import typingsJapgolly.firebaseInstallations.distSrcInterfacesInstallationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFunctionsGenerateAuthTokenRequestMod {
  
  @JSImport("@firebase/installations/dist/src/functions/generate-auth-token-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateAuthTokenRequest(
    hasAppConfigHeartbeatServiceProvider: FirebaseInstallationsImpl,
    installationEntry: RegisteredInstallationEntry
  ): js.Promise[CompletedAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthTokenRequest")(hasAppConfigHeartbeatServiceProvider.asInstanceOf[js.Any], installationEntry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompletedAuthToken]]
}
