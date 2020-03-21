package typingsJapgolly.firebaseAnalytics

import typingsJapgolly.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import typingsJapgolly.firebaseAnalyticsTypes.mod.SettingsOptions
import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/src/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  def factory(app: FirebaseApp, installations: FirebaseInstallations): FirebaseAnalytics = js.native
  def resetGlobalVars(): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: Boolean): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: Boolean, newGaInitializedPromise: js.Object): Unit = js.native
  def settings(options: SettingsOptions): Unit = js.native
}

