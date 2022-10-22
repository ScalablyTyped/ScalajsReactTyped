package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.outCoreMod.Platform
import typingsJapgolly.appBuilderLib.outCoreMod.Target
import typingsJapgolly.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typingsJapgolly.builderUtil.outArchMod.Arch
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsTargetFactoryMod {
  
  @JSImport("app-builder-lib/out/targets/targetFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/targets/targetFactory", "NoOpTarget")
  @js.native
  open class NoOpTarget protected () extends Target {
    def this(name: String) = this()
    
    @JSName("options")
    val options_NoOpTarget: Null = js.native
    
    @JSName("outDir")
    def outDir_MNoOpTarget: String = js.native
  }
  
  inline def computeArchToTargetNamesMap(raw: Map[Arch, js.Array[String]], platformPackager: PlatformPackager[Any], platform: Platform): Map[Arch, js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArchToTargetNamesMap")(raw.asInstanceOf[js.Any], platformPackager.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Map[Arch, js.Array[String]]]
  
  inline def createCommonTarget(target: String, outDir: String, packager: PlatformPackager[Any]): Target = (^.asInstanceOf[js.Dynamic].applyDynamic("createCommonTarget")(target.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[Target]
  
  inline def createTargets(
    nameToTarget: Map[String, Target],
    rawList: js.Array[String],
    outDir: String,
    packager: PlatformPackager[Any]
  ): js.Array[Target] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTargets")(nameToTarget.asInstanceOf[js.Any], rawList.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Array[Target]]
}
