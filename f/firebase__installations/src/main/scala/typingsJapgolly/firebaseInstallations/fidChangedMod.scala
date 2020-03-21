package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.appConfigMod.AppConfig
import typingsJapgolly.firebaseInstallations.onIdChangeMod.IdChangeCallbackFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/fid-changed", JSImport.Namespace)
@js.native
object fidChangedMod extends js.Object {
  def addCallback(appConfig: AppConfig, callback: IdChangeCallbackFn): Unit = js.native
  def fidChanged(appConfig: AppConfig, fid: String): Unit = js.native
  def removeCallback(appConfig: AppConfig, callback: IdChangeCallbackFn): Unit = js.native
}

