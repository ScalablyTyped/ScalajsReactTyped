package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.EmitFlags
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.TsEmitArguments
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.TsEmitCallback
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.TsMergeEmitResultsCallback
import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.EmitResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTransformers extends StObject {
  
  var customTransformers: js.UndefOr[typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CustomTransformers] = js.undefined
  
  var emitCallback: js.UndefOr[TsEmitCallback] = js.undefined
  
  var emitFlags: js.UndefOr[EmitFlags] = js.undefined
  
  var forceEmit: js.UndefOr[Boolean] = js.undefined
  
  var gatherDiagnostics: js.UndefOr[
    js.Function1[
      /* program */ typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program, 
      js.Array[Diagnostic]
    ]
  ] = js.undefined
  
  var host: js.UndefOr[CompilerHost] = js.undefined
  
  var mergeEmitResultsCallback: js.UndefOr[TsMergeEmitResultsCallback] = js.undefined
  
  var modifiedResourceFiles: js.UndefOr[Set[String] | Null] = js.undefined
  
  var oldProgram: js.UndefOr[typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program] = js.undefined
  
  var options: CompilerOptions
  
  var rootNames: js.Array[String]
}
object CustomTransformers {
  
  inline def apply(options: CompilerOptions, rootNames: js.Array[String]): CustomTransformers = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTransformers]
  }
  
  extension [Self <: CustomTransformers](x: Self) {
    
    inline def setCustomTransformers(value: typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CustomTransformers): Self = StObject.set(x, "customTransformers", value.asInstanceOf[js.Any])
    
    inline def setCustomTransformersUndefined: Self = StObject.set(x, "customTransformers", js.undefined)
    
    inline def setEmitCallback(value: /* args */ TsEmitArguments => EmitResult): Self = StObject.set(x, "emitCallback", js.Any.fromFunction1(value))
    
    inline def setEmitCallbackUndefined: Self = StObject.set(x, "emitCallback", js.undefined)
    
    inline def setEmitFlags(value: EmitFlags): Self = StObject.set(x, "emitFlags", value.asInstanceOf[js.Any])
    
    inline def setEmitFlagsUndefined: Self = StObject.set(x, "emitFlags", js.undefined)
    
    inline def setForceEmit(value: Boolean): Self = StObject.set(x, "forceEmit", value.asInstanceOf[js.Any])
    
    inline def setForceEmitUndefined: Self = StObject.set(x, "forceEmit", js.undefined)
    
    inline def setGatherDiagnostics(
      value: /* program */ typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program => js.Array[Diagnostic]
    ): Self = StObject.set(x, "gatherDiagnostics", js.Any.fromFunction1(value))
    
    inline def setGatherDiagnosticsUndefined: Self = StObject.set(x, "gatherDiagnostics", js.undefined)
    
    inline def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setMergeEmitResultsCallback(value: /* results */ js.Array[EmitResult] => EmitResult): Self = StObject.set(x, "mergeEmitResultsCallback", js.Any.fromFunction1(value))
    
    inline def setMergeEmitResultsCallbackUndefined: Self = StObject.set(x, "mergeEmitResultsCallback", js.undefined)
    
    inline def setModifiedResourceFiles(value: Set[String]): Self = StObject.set(x, "modifiedResourceFiles", value.asInstanceOf[js.Any])
    
    inline def setModifiedResourceFilesNull: Self = StObject.set(x, "modifiedResourceFiles", null)
    
    inline def setModifiedResourceFilesUndefined: Self = StObject.set(x, "modifiedResourceFiles", js.undefined)
    
    inline def setOldProgram(value: typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program): Self = StObject.set(x, "oldProgram", value.asInstanceOf[js.Any])
    
    inline def setOldProgramUndefined: Self = StObject.set(x, "oldProgram", js.undefined)
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRootNames(value: js.Array[String]): Self = StObject.set(x, "rootNames", value.asInstanceOf[js.Any])
    
    inline def setRootNamesVarargs(value: String*): Self = StObject.set(x, "rootNames", js.Array(value*))
  }
}
