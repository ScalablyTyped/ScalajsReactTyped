package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.outCoreMod.Target
import typingsJapgolly.appBuilderLib.outLinuxPackagerMod.LinuxPackager
import typingsJapgolly.appBuilderLib.outOptionsLinuxOptionsMod.AppImageOptions
import typingsJapgolly.appBuilderLib.outTargetsLinuxTargetHelperMod.LinuxTargetHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsAppImageTargetMod {
  
  @JSImport("app-builder-lib/out/targets/AppImageTarget", JSImport.Default)
  @js.native
  open class default protected () extends AppImageTarget {
    def this(ignored: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait AppImageTarget extends Target {
    
    /* private */ val desktopEntry: Any = js.native
    
    /* private */ val helper: Any = js.native
    
    @JSName("options")
    val options_AppImageTarget: AppImageOptions = js.native
    
    /* private */ val packager: Any = js.native
  }
}
