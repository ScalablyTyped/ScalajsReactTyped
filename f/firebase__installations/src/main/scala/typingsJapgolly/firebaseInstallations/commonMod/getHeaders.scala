package typingsJapgolly.firebaseInstallations.commonMod

import org.scalajs.dom.experimental.Headers
import typingsJapgolly.firebaseInstallations.appConfigMod.AppConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/common", "getHeaders")
@js.native
object getHeaders extends js.Object {
  def apply(hasApiKey: AppConfig): Headers = js.native
}

