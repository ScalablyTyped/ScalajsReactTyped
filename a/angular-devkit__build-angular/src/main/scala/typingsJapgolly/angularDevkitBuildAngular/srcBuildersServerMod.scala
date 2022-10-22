package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildAngular.anon.Path
import typingsJapgolly.angularDevkitBuildAngular.anon.WebpackConfiguration
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.Schema
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersServerMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/builders/server", JSImport.Default)
  @js.native
  val default: Builder[Schema & JsonObject] = js.native
  
  inline def execute(options: Schema, context: BuilderContext): Observable_[ServerBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[ServerBuilderOutput]]
  inline def execute(options: Schema, context: BuilderContext, transforms: WebpackConfiguration): Observable_[ServerBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Observable_[ServerBuilderOutput]]
  
  trait ServerBuilderOutput
    extends StObject
       with BuilderOutput {
    
    var baseOutputPath: String
    
    /**
      * @deprecated in version 9. Use 'outputs' instead.
      */
    var outputPath: String
    
    /**
      * @deprecated in version 14. Use 'outputs' instead.
      */
    var outputPaths: js.Array[String]
    
    var outputs: js.Array[Path]
  }
  object ServerBuilderOutput {
    
    inline def apply(
      baseOutputPath: String,
      outputPath: String,
      outputPaths: js.Array[String],
      outputs: js.Array[Path],
      success: Boolean
    ): ServerBuilderOutput = {
      val __obj = js.Dynamic.literal(baseOutputPath = baseOutputPath.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], outputPaths = outputPaths.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerBuilderOutput]
    }
    
    extension [Self <: ServerBuilderOutput](x: Self) {
      
      inline def setBaseOutputPath(value: String): Self = StObject.set(x, "baseOutputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPaths(value: js.Array[String]): Self = StObject.set(x, "outputPaths", value.asInstanceOf[js.Any])
      
      inline def setOutputPathsVarargs(value: String*): Self = StObject.set(x, "outputPaths", js.Array(value*))
      
      inline def setOutputs(value: js.Array[Path]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: Path*): Self = StObject.set(x, "outputs", js.Array(value*))
    }
  }
}
