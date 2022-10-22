package typingsJapgolly.angularDevkitBuildWebpack

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildWebpack.anon.DevServerConfig
import typingsJapgolly.angularDevkitBuildWebpack.anon.Logging
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackDevServerMod.DevServerBuildOutput
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackDevServerSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackMod.BuildResult
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular-devkit/build-webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-webpack", JSImport.Default)
  @js.native
  val default: Builder[
    Schema & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src.JsonObject */ Any)
  ] = js.native
  
  inline def runWebpack(config: Configuration, context: BuilderContext): Observable_[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuildResult]]
  inline def runWebpack(config: Configuration, context: BuilderContext, options: Logging): Observable_[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuildResult]]
  
  inline def runWebpackDevServer(config: Configuration, context: BuilderContext): Observable_[DevServerBuildOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpackDevServer")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuildOutput]]
  inline def runWebpackDevServer(config: Configuration, context: BuilderContext, options: DevServerConfig): Observable_[DevServerBuildOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpackDevServer")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuildOutput]]
}
