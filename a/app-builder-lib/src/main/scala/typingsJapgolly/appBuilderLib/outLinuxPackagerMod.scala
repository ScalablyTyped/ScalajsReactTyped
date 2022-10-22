package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.outOptionsLinuxOptionsMod.LinuxConfiguration
import typingsJapgolly.appBuilderLib.outPackagerMod.Packager
import typingsJapgolly.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typingsJapgolly.builderUtil.outArchMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLinuxPackagerMod {
  
  @JSImport("app-builder-lib/out/linuxPackager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/linuxPackager", "LinuxPackager")
  @js.native
  open class LinuxPackager protected () extends PlatformPackager[LinuxConfiguration] {
    def this(info: Packager) = this()
    
    val executableName: String = js.native
  }
  
  inline def toAppImageOrSnapArch(arch: Arch): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAppImageOrSnapArch")(arch.asInstanceOf[js.Any]).asInstanceOf[String]
}
