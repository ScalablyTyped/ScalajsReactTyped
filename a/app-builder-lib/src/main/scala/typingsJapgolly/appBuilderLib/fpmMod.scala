package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.coreMod.Target
import typingsJapgolly.appBuilderLib.linuxOptionsMod.LinuxTargetSpecificOptions
import typingsJapgolly.appBuilderLib.linuxPackagerMod.LinuxPackager
import typingsJapgolly.appBuilderLib.linuxTargetHelperMod.LinuxTargetHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/fpm", JSImport.Namespace)
@js.native
object fpmMod extends js.Object {
  @js.native
  trait FpmTarget extends Target {
    var computeFpmMetaInfoOptions: js.Any = js.native
    var createScripts: js.Any = js.native
    val helper: js.Any = js.native
    @JSName("options")
    val options_FpmTarget: LinuxTargetSpecificOptions = js.native
    val packager: js.Any = js.native
    val scriptFiles: js.Any = js.native
  }
  
  @js.native
  class default protected () extends FpmTarget {
    def this(name: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
}

