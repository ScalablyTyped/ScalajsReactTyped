package typingsJapgolly.dmgBuilder

import typingsJapgolly.appBuilderLib.macOptionsMod.DmgOptions
import typingsJapgolly.appBuilderLib.macPackagerMod.default
import typingsJapgolly.appBuilderLib.mod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dmg-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DmgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    @JSName("options")
    val options_DmgTarget: DmgOptions = js.native
    val packager: js.Any = js.native
    var signDmg: js.Any = js.native
    def computeDmgOptions(): js.Promise[DmgOptions] = js.native
    def computeVolumeName(): String = js.native
    def computeVolumeName(custom: String): String = js.native
  }
  
}

