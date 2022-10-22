package typingsJapgolly.angularDevkitBuildWebpack

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildWebpack.anon.Logging
import typingsJapgolly.angularDevkitBuildWebpack.srcUtilsMod.EmittedFiles
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackSchemaMod.Schema
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpack.mod.Stats
import typingsJapgolly.webpack.mod.StatsCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackMod {
  
  @JSImport("@angular-devkit/build-webpack/src/webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-webpack/src/webpack", JSImport.Default)
  @js.native
  val default: Builder[
    Schema & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src.JsonObject */ Any)
  ] = js.native
  
  inline def runWebpack(config: Configuration, context: BuilderContext): Observable_[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuildResult]]
  inline def runWebpack(config: Configuration, context: BuilderContext, options: Logging): Observable_[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuildResult]]
  
  trait BuildResult
    extends StObject
       with BuilderOutput {
    
    var emittedFiles: js.UndefOr[js.Array[EmittedFiles]] = js.undefined
    
    var outputPath: String
    
    var webpackStats: js.UndefOr[StatsCompilation] = js.undefined
  }
  object BuildResult {
    
    inline def apply(outputPath: String, success: Boolean): BuildResult = {
      val __obj = js.Dynamic.literal(outputPath = outputPath.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildResult]
    }
    
    extension [Self <: BuildResult](x: Self) {
      
      inline def setEmittedFiles(value: js.Array[EmittedFiles]): Self = StObject.set(x, "emittedFiles", value.asInstanceOf[js.Any])
      
      inline def setEmittedFilesUndefined: Self = StObject.set(x, "emittedFiles", js.undefined)
      
      inline def setEmittedFilesVarargs(value: EmittedFiles*): Self = StObject.set(x, "emittedFiles", js.Array(value*))
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setWebpackStats(value: StatsCompilation): Self = StObject.set(x, "webpackStats", value.asInstanceOf[js.Any])
      
      inline def setWebpackStatsUndefined: Self = StObject.set(x, "webpackStats", js.undefined)
    }
  }
  
  type WebpackBuilderSchema = Schema
  
  type WebpackFactory = js.Function1[/* config */ Configuration, Observable_[Compiler] | Compiler]
  
  type WebpackLoggingCallback = js.Function2[/* stats */ Stats, /* config */ Configuration, Unit]
}
