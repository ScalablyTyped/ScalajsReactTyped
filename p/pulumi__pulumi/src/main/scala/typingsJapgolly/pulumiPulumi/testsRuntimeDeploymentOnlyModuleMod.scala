package typingsJapgolly.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testsRuntimeDeploymentOnlyModuleMod {
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "Config")
  @js.native
  open class Config protected ()
    extends typingsJapgolly.pulumiPulumi.testsRuntimeDeploymentOnlyModuleConfigMod.Config {
    def this(name: String) = this()
  }
  
  inline def allConfig(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConfig")().asInstanceOf[StringDictionary[String]]
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "deploymentOnlyModule")
  @js.native
  val deploymentOnlyModule: /* true */ Boolean = js.native
  
  inline def getConfig(k: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(k.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def setConfig(k: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
