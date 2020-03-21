package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.nsisOptionsMod.NsisOptions
import typingsJapgolly.appBuilderLib.nsisScriptGeneratorMod.NsisScriptGenerator
import typingsJapgolly.appBuilderLib.winPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/nsis/nsisLicense", JSImport.Namespace)
@js.native
object nsisLicenseMod extends js.Object {
  def computeLicensePage(
    packager: WinPackager,
    options: NsisOptions,
    scriptGenerator: NsisScriptGenerator,
    languages: js.Array[String]
  ): js.Promise[Unit] = js.native
}

