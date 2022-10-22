package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildAngular.anon.WebpackConfiguration
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackMod.BuildResult
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersExtractI18nMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/extract-i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/builders/extract-i18n", JSImport.Default)
  @js.native
  val default: Builder[Schema & JsonObject] = js.native
  
  inline def execute(options: ExtractI18nBuilderOptions, context: BuilderContext): js.Promise[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuildResult]]
  inline def execute(options: ExtractI18nBuilderOptions, context: BuilderContext, transforms: WebpackConfiguration): js.Promise[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuildResult]]
  
  type ExtractI18nBuilderOptions = Schema
}
