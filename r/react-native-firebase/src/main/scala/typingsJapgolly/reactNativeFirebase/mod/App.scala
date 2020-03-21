package typingsJapgolly.reactNativeFirebase.mod

import typingsJapgolly.reactNativeFirebase.mod.Firebase.Options
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.Analytics
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.auth.Auth
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.config.Config
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.crashlytics.Crashlytics
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.Database
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Firestore
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.functions.Functions
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.iid.InstanceId
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.links.Links
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.messaging.Messaging
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Notifications
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.perf.Perf
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.storage.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "App")
@js.native
class App protected () extends js.Object {
  // utils(): RNFirebase.utils.Utils;
  val name: String = js.native
  val options: Options = js.native
  // admob(): RNFirebase.admob.AdMob;
  def analytics(): Analytics = js.native
  def auth(): Auth = js.native
  def config(): Config = js.native
  def crashlytics(): Crashlytics = js.native
  def database(): Database = js.native
  def firestore(): Firestore = js.native
  def functions(): Functions = js.native
  def functions(appOrRegion: String): Functions = js.native
  def functions(appOrRegion: String, region: String): Functions = js.native
  def functions(appOrRegion: App): Functions = js.native
  def functions(appOrRegion: App, region: String): Functions = js.native
  def iid(): InstanceId = js.native
  def links(): Links = js.native
  def messaging(): Messaging = js.native
  def notifications(): Notifications = js.native
  def onReady(): js.Promise[App] = js.native
  def perf(): Perf = js.native
  def storage(): Storage = js.native
}

