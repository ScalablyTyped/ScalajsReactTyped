package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.mod.AppInfo
import typingsJapgolly.appBuilderLib.mod.Target
import typingsJapgolly.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typingsJapgolly.builderUtil.outArchMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsTargetUtilMod {
  
  @JSImport("app-builder-lib/out/targets/targetUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/targets/targetUtil", "StageDir")
  @js.native
  open class StageDir protected () extends StObject {
    def this(dir: String) = this()
    
    def cleanup(): js.Promise[Unit] = js.native
    
    val dir: String = js.native
    
    def getTempFile(name: String): String = js.native
  }
  
  inline def createStageDir(target: Target, packager: PlatformPackager[Any], arch: Arch): js.Promise[StageDir] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStageDir")(target.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StageDir]]
  
  inline def createStageDirPath(target: Target, packager: PlatformPackager[Any], arch: Arch): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStageDirPath")(target.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getWindowsInstallationAppPackageName(appName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowsInstallationAppPackageName")(appName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getWindowsInstallationDirName(appInfo: AppInfo, isTryToUseProductName: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getWindowsInstallationDirName")(appInfo.asInstanceOf[js.Any], isTryToUseProductName.asInstanceOf[js.Any])).asInstanceOf[String]
}
