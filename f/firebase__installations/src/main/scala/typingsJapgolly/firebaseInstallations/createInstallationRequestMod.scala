package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.appConfigMod.AppConfig
import typingsJapgolly.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
import typingsJapgolly.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/create-installation-request", JSImport.Namespace)
@js.native
object createInstallationRequestMod extends js.Object {
  def createInstallationRequest(appConfig: AppConfig, hasFid: InProgressInstallationEntry): js.Promise[RegisteredInstallationEntry] = js.native
}

