package typingsJapgolly.dmgBuilder

import typingsJapgolly.appBuilderLib.mod.Target
import typingsJapgolly.appBuilderLib.outMacPackagerMod.default
import typingsJapgolly.appBuilderLib.outOptionsMacOptionsMod.DmgOptions
import typingsJapgolly.builderUtil.outArchMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dmg-builder", "DmgTarget")
  @js.native
  open class DmgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    
    def computeDmgOptions(): js.Promise[DmgOptions] = js.native
    
    def computeVolumeName(arch: Arch): String = js.native
    def computeVolumeName(arch: Arch, custom: String): String = js.native
    
    @JSName("options")
    val options_DmgTarget: DmgOptions = js.native
    
    /* private */ val packager: Any = js.native
    
    /* private */ var signDmg: Any = js.native
  }
}
