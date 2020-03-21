package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.mod.Platform
import typingsJapgolly.appBuilderLib.mod.Target
import typingsJapgolly.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsJapgolly.builderUtil.archMod.Arch
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/targetFactory", JSImport.Namespace)
@js.native
object targetFactoryMod extends js.Object {
  @js.native
  class NoOpTarget protected () extends Target {
    def this(name: String) = this()
    @JSName("options")
    val options_NoOpTarget: Null = js.native
  }
  
  def computeArchToTargetNamesMap(raw: Map[Arch, js.Array[String]], platformPackager: PlatformPackager[_], platform: Platform): Map[Arch, js.Array[String]] = js.native
  def createCommonTarget(target: String, outDir: String, packager: PlatformPackager[_]): Target = js.native
  def createTargets(
    nameToTarget: Map[String, Target],
    rawList: js.Array[String],
    outDir: String,
    packager: PlatformPackager[_]
  ): js.Array[Target] = js.native
}

