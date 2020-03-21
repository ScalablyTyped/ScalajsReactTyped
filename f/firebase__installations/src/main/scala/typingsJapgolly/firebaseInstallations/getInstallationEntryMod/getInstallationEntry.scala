package typingsJapgolly.firebaseInstallations.getInstallationEntryMod

import typingsJapgolly.firebaseInstallations.appConfigMod.AppConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/get-installation-entry", "getInstallationEntry")
@js.native
object getInstallationEntry extends js.Object {
  def apply(appConfig: AppConfig): js.Promise[InstallationEntryWithRegistrationPromise] = js.native
}

