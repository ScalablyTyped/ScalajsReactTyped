package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersAnalyses
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersInfo
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisPrivateDeclarationsAnalyzerMod.ExportInfo
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisPrivateDeclarationsAnalyzerMod.PrivateDeclarationsAnalyses
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisTypesMod.DecorationAnalyses
import typingsJapgolly.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointBundleMod.EntryPointBundle
import typingsJapgolly.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RenderingFormatter
import typingsJapgolly.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcReexportMod.Reexport
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcRenderingDtsRendererMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/dts_renderer", "DtsRenderer")
  @js.native
  open class DtsRenderer protected () extends StObject {
    def this(
      dtsFormatter: RenderingFormatter,
      fs: ReadonlyFileSystem,
      logger: Logger,
      host: NgccReflectionHost,
      bundle: EntryPointBundle
    ) = this()
    
    /* private */ var bundle: Any = js.native
    
    /* private */ var dtsFormatter: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var getTypingsFilesToRender: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    def renderDtsFile(dtsFile: SourceFile, renderInfo: DtsRenderInfo): js.Array[FileToWrite] = js.native
    
    def renderProgram(decorationAnalyses: DecorationAnalyses, privateDeclarationsAnalyses: PrivateDeclarationsAnalyses): js.Array[FileToWrite] = js.native
    def renderProgram(
      decorationAnalyses: DecorationAnalyses,
      privateDeclarationsAnalyses: PrivateDeclarationsAnalyses,
      moduleWithProvidersAnalyses: ModuleWithProvidersAnalyses
    ): js.Array[FileToWrite] = js.native
  }
  
  trait DtsClassInfo extends StObject {
    
    var compilation: js.Array[CompileResult]
    
    var dtsDeclaration: Declaration
  }
  object DtsClassInfo {
    
    inline def apply(compilation: js.Array[CompileResult], dtsDeclaration: Declaration): DtsClassInfo = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], dtsDeclaration = dtsDeclaration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DtsClassInfo]
    }
    
    extension [Self <: DtsClassInfo](x: Self) {
      
      inline def setCompilation(value: js.Array[CompileResult]): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      inline def setCompilationVarargs(value: CompileResult*): Self = StObject.set(x, "compilation", js.Array(value*))
      
      inline def setDtsDeclaration(value: Declaration): Self = StObject.set(x, "dtsDeclaration", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A structure that captures information about what needs to be rendered
    * in a typings file.
    *
    * It is created as a result of processing the analysis passed to the renderer.
    *
    * The `renderDtsFile()` method consumes it when rendering a typings file.
    */
  trait DtsRenderInfo extends StObject {
    
    var classInfo: js.Array[DtsClassInfo]
    
    var moduleWithProviders: js.Array[ModuleWithProvidersInfo]
    
    var privateExports: js.Array[ExportInfo]
    
    var reexports: js.Array[Reexport]
  }
  object DtsRenderInfo {
    
    inline def apply(
      classInfo: js.Array[DtsClassInfo],
      moduleWithProviders: js.Array[ModuleWithProvidersInfo],
      privateExports: js.Array[ExportInfo],
      reexports: js.Array[Reexport]
    ): DtsRenderInfo = {
      val __obj = js.Dynamic.literal(classInfo = classInfo.asInstanceOf[js.Any], moduleWithProviders = moduleWithProviders.asInstanceOf[js.Any], privateExports = privateExports.asInstanceOf[js.Any], reexports = reexports.asInstanceOf[js.Any])
      __obj.asInstanceOf[DtsRenderInfo]
    }
    
    extension [Self <: DtsRenderInfo](x: Self) {
      
      inline def setClassInfo(value: js.Array[DtsClassInfo]): Self = StObject.set(x, "classInfo", value.asInstanceOf[js.Any])
      
      inline def setClassInfoVarargs(value: DtsClassInfo*): Self = StObject.set(x, "classInfo", js.Array(value*))
      
      inline def setModuleWithProviders(value: js.Array[ModuleWithProvidersInfo]): Self = StObject.set(x, "moduleWithProviders", value.asInstanceOf[js.Any])
      
      inline def setModuleWithProvidersVarargs(value: ModuleWithProvidersInfo*): Self = StObject.set(x, "moduleWithProviders", js.Array(value*))
      
      inline def setPrivateExports(value: js.Array[ExportInfo]): Self = StObject.set(x, "privateExports", value.asInstanceOf[js.Any])
      
      inline def setPrivateExportsVarargs(value: ExportInfo*): Self = StObject.set(x, "privateExports", js.Array(value*))
      
      inline def setReexports(value: js.Array[Reexport]): Self = StObject.set(x, "reexports", value.asInstanceOf[js.Any])
      
      inline def setReexportsVarargs(value: Reexport*): Self = StObject.set(x, "reexports", js.Array(value*))
    }
  }
}
