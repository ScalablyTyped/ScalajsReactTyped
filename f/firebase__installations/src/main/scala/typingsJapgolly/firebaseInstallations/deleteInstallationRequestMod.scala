package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.appConfigMod.AppConfig
import typingsJapgolly.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/delete-installation-request", JSImport.Namespace)
@js.native
object deleteInstallationRequestMod extends js.Object {
  def deleteInstallationRequest(appConfig: AppConfig, installationEntry: RegisteredInstallationEntry): js.Promise[Unit] = js.native
}

