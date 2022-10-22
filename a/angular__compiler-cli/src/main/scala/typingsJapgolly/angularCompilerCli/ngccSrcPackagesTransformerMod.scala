package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersAnalyses
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisPrivateDeclarationsAnalyzerMod.ExportInfo
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisTypesMod.CompiledFile
import typingsJapgolly.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointBundleMod.EntryPointBundle
import typingsJapgolly.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RenderingFormatter
import typingsJapgolly.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPackagesTransformerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/transformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/transformer", "Transformer")
  @js.native
  open class Transformer protected () extends StObject {
    def this(fs: ReadonlyFileSystem, logger: Logger) = this()
    def this(fs: ReadonlyFileSystem, logger: Logger, tsConfig: ParsedConfiguration) = this()
    
    def analyzeProgram(reflectionHost: NgccReflectionHost, bundle: EntryPointBundle): ProgramAnalyses = js.native
    
    /* private */ var fs: Any = js.native
    
    def getHost(bundle: EntryPointBundle): NgccReflectionHost = js.native
    
    def getRenderingFormatter(host: NgccReflectionHost, bundle: EntryPointBundle): RenderingFormatter = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Transform the source (and typings) files of a bundle.
      * @param bundle the bundle to transform.
      * @returns information about the files that were transformed.
      */
    def transform(bundle: EntryPointBundle): TransformResult = js.native
    
    /* private */ var tsConfig: Any = js.native
  }
  
  inline def hasErrors(diagnostics: js.Array[Diagnostic]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasErrors")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ProgramAnalyses extends StObject {
    
    var decorationAnalyses: Map[SourceFile, CompiledFile]
    
    var diagnostics: js.Array[Diagnostic]
    
    var moduleWithProvidersAnalyses: ModuleWithProvidersAnalyses | Null
    
    var privateDeclarationsAnalyses: js.Array[ExportInfo]
  }
  object ProgramAnalyses {
    
    inline def apply(
      decorationAnalyses: Map[SourceFile, CompiledFile],
      diagnostics: js.Array[Diagnostic],
      privateDeclarationsAnalyses: js.Array[ExportInfo]
    ): ProgramAnalyses = {
      val __obj = js.Dynamic.literal(decorationAnalyses = decorationAnalyses.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], privateDeclarationsAnalyses = privateDeclarationsAnalyses.asInstanceOf[js.Any], moduleWithProvidersAnalyses = null)
      __obj.asInstanceOf[ProgramAnalyses]
    }
    
    extension [Self <: ProgramAnalyses](x: Self) {
      
      inline def setDecorationAnalyses(value: Map[SourceFile, CompiledFile]): Self = StObject.set(x, "decorationAnalyses", value.asInstanceOf[js.Any])
      
      inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
      
      inline def setModuleWithProvidersAnalyses(value: ModuleWithProvidersAnalyses): Self = StObject.set(x, "moduleWithProvidersAnalyses", value.asInstanceOf[js.Any])
      
      inline def setModuleWithProvidersAnalysesNull: Self = StObject.set(x, "moduleWithProvidersAnalyses", null)
      
      inline def setPrivateDeclarationsAnalyses(value: js.Array[ExportInfo]): Self = StObject.set(x, "privateDeclarationsAnalyses", value.asInstanceOf[js.Any])
      
      inline def setPrivateDeclarationsAnalysesVarargs(value: ExportInfo*): Self = StObject.set(x, "privateDeclarationsAnalyses", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCompilerCli.anon.Diagnostics
    - typingsJapgolly.angularCompilerCli.anon.Success
  */
  trait TransformResult extends StObject
  object TransformResult {
    
    inline def Diagnostics(diagnostics: js.Array[Diagnostic], transformedFiles: js.Array[FileToWrite]): typingsJapgolly.angularCompilerCli.anon.Diagnostics = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], success = true, transformedFiles = transformedFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.anon.Diagnostics]
    }
    
    inline def Success(diagnostics: js.Array[Diagnostic]): typingsJapgolly.angularCompilerCli.anon.Success = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], success = false)
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.anon.Success]
    }
  }
}
