package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.outCoreMod.Target
import typingsJapgolly.appBuilderLib.outCoreMod.TargetSpecificOptions
import typingsJapgolly.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsArchiveTargetMod {
  
  @JSImport("app-builder-lib/out/targets/ArchiveTarget", "ArchiveTarget")
  @js.native
  open class ArchiveTarget protected () extends Target {
    def this(name: String, outDir: String, packager: PlatformPackager[Any]) = this()
    def this(name: String, outDir: String, packager: PlatformPackager[Any], isWriteUpdateInfo: Boolean) = this()
    
    /* private */ val isWriteUpdateInfo: Any = js.native
    
    @JSName("options")
    val options_ArchiveTarget: TargetSpecificOptions = js.native
    
    /* private */ val packager: Any = js.native
  }
}
