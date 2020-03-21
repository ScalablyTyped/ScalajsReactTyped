package typingsJapgolly.workboxBuild

import typingsJapgolly.workboxBuild.generateSwMod.GenerateSWConfig
import typingsJapgolly.workboxBuild.generateSwMod.GenerateSWResult
import typingsJapgolly.workboxBuild.getManifestMod.GetManifestConfig
import typingsJapgolly.workboxBuild.getManifestMod.GetManifestResult
import typingsJapgolly.workboxBuild.injectManifestMod.InjectManifestConfig
import typingsJapgolly.workboxBuild.injectManifestMod.InjectManifestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def copyWorkboxLibraries(destDirectory: String): js.Promise[String] = js.native
  def generateSW(config: GenerateSWConfig): GenerateSWResult = js.native
  def getManifest(config: GetManifestConfig): GetManifestResult = js.native
  def getModuleURL(moduleName: String): String = js.native
  def getModuleURL(moduleName: String, buildType: String): String = js.native
  def injectManifest(config: InjectManifestConfig): InjectManifestResult = js.native
}

