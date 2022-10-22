package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.outTargetsNsisNsisTargetMod.NsisTarget
import typingsJapgolly.appBuilderLib.outTargetsNsisNsisUtilMod.AppPackageHelper
import typingsJapgolly.appBuilderLib.outWinPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsNsisWebInstallerTargetMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/WebInstallerTarget", "WebInstallerTarget")
  @js.native
  open class WebInstallerTarget protected () extends NsisTarget {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
    
    /* protected */ def configureDefines(oneClick: Boolean, defines: Any): js.Promise[Any] = js.native
  }
}
