package typingsJapgolly.angularDevkitBuildWebpack

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitArchitect.srcOutputSchemaMod.Target
import typingsJapgolly.angularDevkitBuildWebpack.anon.DevServerConfig
import typingsJapgolly.angularDevkitBuildWebpack.anon.TypeofWebpackDevServer
import typingsJapgolly.angularDevkitBuildWebpack.srcUtilsMod.EmittedFiles
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackDevServerSchemaMod.Schema
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpack.mod.StatsCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackDevServerMod {
  
  @JSImport("@angular-devkit/build-webpack/src/webpack-dev-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-webpack/src/webpack-dev-server", JSImport.Default)
  @js.native
  val default: Builder[
    Schema & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src.JsonObject */ Any)
  ] = js.native
  
  inline def runWebpackDevServer(config: Configuration, context: BuilderContext): Observable_[DevServerBuildOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpackDevServer")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuildOutput]]
  inline def runWebpackDevServer(config: Configuration, context: BuilderContext, options: DevServerConfig): Observable_[DevServerBuildOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpackDevServer")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuildOutput]]
  
  /* Inlined @angular-devkit/build-webpack.@angular-devkit/build-webpack/src/webpack.BuildResult & {  port :number,   family :string,   address :string} */
  trait DevServerBuildOutput
    extends StObject
       with /* prop */ StringDictionary[JsonValue] {
    
    var address: String
    
    var emittedFiles: js.UndefOr[js.Array[EmittedFiles]] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var family: String
    
    var info: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var outputPath: String
    
    var port: Double
    
    var success: Boolean
    
    var target: js.UndefOr[Target] = js.undefined
    
    var webpackStats: js.UndefOr[StatsCompilation] = js.undefined
  }
  object DevServerBuildOutput {
    
    inline def apply(address: String, family: String, outputPath: String, port: Double, success: Boolean): DevServerBuildOutput = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevServerBuildOutput]
    }
    
    extension [Self <: DevServerBuildOutput](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setEmittedFiles(value: js.Array[EmittedFiles]): Self = StObject.set(x, "emittedFiles", value.asInstanceOf[js.Any])
      
      inline def setEmittedFilesUndefined: Self = StObject.set(x, "emittedFiles", js.undefined)
      
      inline def setEmittedFilesVarargs(value: EmittedFiles*): Self = StObject.set(x, "emittedFiles", js.Array(value*))
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: StringDictionary[Any]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWebpackStats(value: StatsCompilation): Self = StObject.set(x, "webpackStats", value.asInstanceOf[js.Any])
      
      inline def setWebpackStatsUndefined: Self = StObject.set(x, "webpackStats", js.undefined)
    }
  }
  
  type WebpackDevServerFactory = TypeofWebpackDevServer & (Instantiable2[
    /* options */ Compiler, 
    /* compiler */ typingsJapgolly.webpackDevServer.mod.Compiler, 
    typingsJapgolly.webpackDevServer.mod.^
  ])
}
