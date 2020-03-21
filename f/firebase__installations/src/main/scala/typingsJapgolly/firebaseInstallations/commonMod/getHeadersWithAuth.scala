package typingsJapgolly.firebaseInstallations.commonMod

import org.scalajs.dom.experimental.Headers
import typingsJapgolly.firebaseInstallations.appConfigMod.AppConfig
import typingsJapgolly.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/common", "getHeadersWithAuth")
@js.native
object getHeadersWithAuth extends js.Object {
  def apply(appConfig: AppConfig, hasRefreshToken: RegisteredInstallationEntry): Headers = js.native
}

