package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseInstallations.appConfigMod.AppConfig
import typingsJapgolly.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/testing/fake-generators", JSImport.Namespace)
@js.native
object fakeGeneratorsMod extends js.Object {
  def getFakeApp(): FirebaseApp = js.native
  def getFakeAppConfig(): AppConfig = js.native
  def getFakeAppConfig(customValues: PartialAppConfig): AppConfig = js.native
  def getFakeDependencies(): FirebaseDependencies = js.native
}

