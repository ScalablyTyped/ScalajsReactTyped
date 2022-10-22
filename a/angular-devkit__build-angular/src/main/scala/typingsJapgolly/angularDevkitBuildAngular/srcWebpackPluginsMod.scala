package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Budget
import typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsCommonJsUsageWarnPluginMod.CommonJsUsageWarnPluginOptions
import typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsDedupeModuleResolvePluginMod.DedupeModuleResolvePluginOptions
import typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsJavascriptOptimizerPluginMod.JavaScriptOptimizerOptions
import typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsPostcssCliResourcesMod.PostcssCliResourcesOptions
import typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsRemoveHashPluginMod.RemoveHashPluginOptions
import typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsScriptsWebpackPluginMod.ScriptsWebpackPluginOptions
import typingsJapgolly.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", "AnyComponentStyleBudgetChecker")
  @js.native
  open class AnyComponentStyleBudgetChecker protected ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsAnyComponentStyleBudgetCheckerMod.AnyComponentStyleBudgetChecker {
    def this(budgets: js.Array[Budget]) = this()
  }
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", "CommonJsUsageWarnPlugin")
  @js.native
  open class CommonJsUsageWarnPlugin ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsCommonJsUsageWarnPluginMod.CommonJsUsageWarnPlugin {
    def this(options: CommonJsUsageWarnPluginOptions) = this()
  }
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", "DedupeModuleResolvePlugin")
  @js.native
  open class DedupeModuleResolvePlugin ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsDedupeModuleResolvePluginMod.DedupeModuleResolvePlugin {
    def this(options: DedupeModuleResolvePluginOptions) = this()
  }
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", "JavaScriptOptimizerPlugin")
  @js.native
  open class JavaScriptOptimizerPlugin protected ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsJavascriptOptimizerPluginMod.JavaScriptOptimizerPlugin {
    def this(options: JavaScriptOptimizerOptions) = this()
  }
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", "JsonStatsPlugin")
  @js.native
  open class JsonStatsPlugin protected ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsJsonStatsPluginMod.JsonStatsPlugin {
    def this(statsOutputPath: String) = this()
  }
  
  inline def PostcssCliResources(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("PostcssCliResources")().asInstanceOf[Plugin]
  inline def PostcssCliResources(options: PostcssCliResourcesOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("PostcssCliResources")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", "RemoveHashPlugin")
  @js.native
  open class RemoveHashPlugin protected ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsRemoveHashPluginMod.RemoveHashPlugin {
    def this(options: RemoveHashPluginOptions) = this()
  }
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", "ScriptsWebpackPlugin")
  @js.native
  open class ScriptsWebpackPlugin protected ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsScriptsWebpackPluginMod.ScriptsWebpackPlugin {
    def this(options: ScriptsWebpackPluginOptions) = this()
  }
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins", "SuppressExtractedTextChunksWebpackPlugin")
  @js.native
  open class SuppressExtractedTextChunksWebpackPlugin ()
    extends typingsJapgolly.angularDevkitBuildAngular.srcWebpackPluginsSuppressEntryChunksWebpackPluginMod.SuppressExtractedTextChunksWebpackPlugin
}
