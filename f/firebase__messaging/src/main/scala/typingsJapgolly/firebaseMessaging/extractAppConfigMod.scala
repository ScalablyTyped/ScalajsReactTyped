package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseMessaging.appConfigMod.AppConfig
import typingsJapgolly.firebaseMessaging.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/helpers/extract-app-config", JSImport.Namespace)
@js.native
object extractAppConfigMod extends js.Object {
  def extractAppConfig(app: FirebaseApp): AppConfig = js.native
}

