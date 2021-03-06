package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.nsisTargetMod.NsisTarget
import typingsJapgolly.appBuilderLib.nsisUtilMod.AppPackageHelper
import typingsJapgolly.appBuilderLib.winPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/nsis/WebInstallerTarget", JSImport.Namespace)
@js.native
object webInstallerTargetMod extends js.Object {
  @js.native
  class WebInstallerTarget protected () extends NsisTarget {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
  }
  
}

