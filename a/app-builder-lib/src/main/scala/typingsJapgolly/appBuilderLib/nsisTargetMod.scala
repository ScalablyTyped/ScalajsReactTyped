package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.coreMod.Target
import typingsJapgolly.appBuilderLib.nsisOptionsMod.NsisOptions
import typingsJapgolly.appBuilderLib.nsisUtilMod.AppPackageHelper
import typingsJapgolly.appBuilderLib.winPackagerMod.WinPackager
import typingsJapgolly.builderUtil.archMod.Arch
import typingsJapgolly.builderUtilRuntime.updateInfoMod.PackageFileInfo
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/nsis/NsisTarget", JSImport.Namespace)
@js.native
object nsisTargetMod extends js.Object {
  @js.native
  class NsisTarget protected () extends Target {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
    /** @private */
    val archs: Map[Arch, String] = js.native
    var buildInstaller: js.Any = js.native
    var computeCommonInstallerScriptHeader: js.Any = js.native
    var computeFinalScript: js.Any = js.native
    var computeScriptAndSignUninstaller: js.Any = js.native
    var computeVersionKey: js.Any = js.native
    var configureDefinesForAllTypeOfInstaller: js.Any = js.native
    var executeMakensis: js.Any = js.native
    var getPreCompressedFileExtensions: js.Any = js.native
    val installerFilenamePattern: String = js.native
    val isBuildDifferentialAware: Boolean = js.native
    val isPortable: js.Any = js.native
    val isUnicodeEnabled: js.Any = js.native
    val isWebInstaller: Boolean = js.native
    @JSName("options")
    val options_NsisTarget: NsisOptions = js.native
    val packageHelper: AppPackageHelper = js.native
    val packager: WinPackager = js.native
    /** @private */
    def buildAppPackage(appOutDir: String, arch: Arch): js.Promise[PackageFileInfo] = js.native
    /* protected */ def configureDefines(oneClick: Boolean, defines: js.Any): js.Promise[_] = js.native
    /* protected */ def generateGitHubInstallerName(): String = js.native
  }
  
}

