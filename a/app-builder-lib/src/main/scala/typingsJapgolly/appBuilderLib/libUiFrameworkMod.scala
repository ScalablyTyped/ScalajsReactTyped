package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.appBuilderLibBooleans.`false`
import typingsJapgolly.appBuilderLib.configurationMod.AfterPackContext
import typingsJapgolly.appBuilderLib.coreMod.Platform
import typingsJapgolly.appBuilderLib.frameworkMod.Framework
import typingsJapgolly.appBuilderLib.frameworkMod.PrepareApplicationStageDirectoryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/frameworks/LibUiFramework", JSImport.Namespace)
@js.native
object libUiFrameworkMod extends js.Object {
  @js.native
  class LibUiFramework protected () extends Framework {
    def this(version: String, distMacOsAppName: String, isUseLaunchUi: Boolean) = this()
    /* CompleteClass */
    override val defaultAppIdPrefix: String = js.native
    /* CompleteClass */
    override val distMacOsAppName: String = js.native
    /* CompleteClass */
    override val isCopyElevateHelper: Boolean = js.native
    @JSName("isCopyElevateHelper")
    val isCopyElevateHelper_LibUiFramework: `false` = js.native
    /* CompleteClass */
    override val isNpmRebuildRequired: Boolean = js.native
    @JSName("isNpmRebuildRequired")
    val isNpmRebuildRequired_LibUiFramework: `false` = js.native
    val isUseLaunchUi: Boolean = js.native
    var isUseLaunchUiForPlatform: js.Any = js.native
    /* CompleteClass */
    override val macOsDefaultTargets: js.Array[String] = js.native
    /* CompleteClass */
    override val name: String = js.native
    var prepareLinuxApplicationStageDirectory: js.Any = js.native
    var prepareMacosApplicationStageDirectory: js.Any = js.native
    /* CompleteClass */
    override val version: String = js.native
    @JSName("afterPack")
    def afterPack_MLibUiFramework(context: AfterPackContext): js.Promise[Unit] = js.native
    @JSName("getExcludedDependencies")
    def getExcludedDependencies_MLibUiFramework(platform: Platform): js.Array[String] | Null = js.native
    @JSName("getMainFile")
    def getMainFile_MLibUiFramework(platform: Platform): String | Null = js.native
    /* CompleteClass */
    override def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[_] = js.native
  }
  
}

