package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.coreMod.Target
import typingsJapgolly.appBuilderLib.msiOptionsMod.MsiOptions
import typingsJapgolly.appBuilderLib.winPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/MsiTarget", JSImport.Namespace)
@js.native
object msiTargetMod extends js.Object {
  @js.native
  trait MsiTarget extends Target {
    var computeFileDeclaration: js.Any = js.native
    var getCommonWixArgs: js.Any = js.native
    var light: js.Any = js.native
    @JSName("options")
    val options_MsiTarget: MsiOptions = js.native
    val packager: js.Any = js.native
    val vm: js.Any = js.native
    var writeManifest: js.Any = js.native
  }
  
  @js.native
  class default protected () extends MsiTarget {
    def this(packager: WinPackager, outDir: String) = this()
  }
  
}

