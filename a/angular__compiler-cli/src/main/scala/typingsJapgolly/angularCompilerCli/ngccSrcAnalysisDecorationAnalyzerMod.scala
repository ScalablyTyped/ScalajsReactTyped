package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisNgccTraitCompilerMod.NgccTraitCompiler
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisTypesMod.CompiledFile
import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisTypesMod.DecorationAnalyses
import typingsJapgolly.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typingsJapgolly.angularCompilerCli.ngccSrcMigrationsMigrationMod.Migration
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointBundleMod.EntryPointBundle
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsCommonSrcApiMod.ResourceLoader
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscCyclesMod.CycleAnalyzer
import typingsJapgolly.angularCompilerCli.srcNgtscCyclesMod.ImportGraph
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ModuleResolver
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.PrivateExportAliasingHost
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.CompoundMetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.CompoundMetadataRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.DtsMetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.LocalMetadataRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.MetadataDtsModuleScopeResolver
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.TypeCheckScopeRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcAnalysisDecorationAnalyzerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/decoration_analyzer", "DecorationAnalyzer")
  @js.native
  open class DecorationAnalyzer protected () extends StObject {
    def this(
      fs: ReadonlyFileSystem,
      bundle: EntryPointBundle,
      reflectionHost: NgccReflectionHost,
      referencesRegistry: ReferencesRegistry
    ) = this()
    def this(
      fs: ReadonlyFileSystem,
      bundle: EntryPointBundle,
      reflectionHost: NgccReflectionHost,
      referencesRegistry: ReferencesRegistry,
      diagnosticHandler: js.Function1[/* error */ Diagnostic, Unit]
    ) = this()
    def this(
      fs: ReadonlyFileSystem,
      bundle: EntryPointBundle,
      reflectionHost: NgccReflectionHost,
      referencesRegistry: ReferencesRegistry,
      diagnosticHandler: js.Function1[/* error */ Diagnostic, Unit],
      tsConfig: ParsedConfiguration
    ) = this()
    def this(
      fs: ReadonlyFileSystem,
      bundle: EntryPointBundle,
      reflectionHost: NgccReflectionHost,
      referencesRegistry: ReferencesRegistry,
      diagnosticHandler: Unit,
      tsConfig: ParsedConfiguration
    ) = this()
    
    var aliasingHost: PrivateExportAliasingHost | Null = js.native
    
    /**
      * Analyze a program to find all the decorated files should be transformed.
      *
      * @returns a map of the source files to the analysis for those files.
      */
    def analyzeProgram(): DecorationAnalyses = js.native
    
    /* protected */ def applyMigrations(): Unit = js.native
    
    /* private */ var bundle: Any = js.native
    
    /* protected */ def compileFile(sourceFile: SourceFile): CompiledFile = js.native
    
    var compiler: NgccTraitCompiler = js.native
    
    /* private */ var compilerOptions: Any = js.native
    
    var cycleAnalyzer: CycleAnalyzer = js.native
    
    /* private */ var diagnosticHandler: Any = js.native
    
    var dtsMetaReader: DtsMetadataReader = js.native
    
    var dtsModuleScopeResolver: MetadataDtsModuleScopeResolver = js.native
    
    var evaluator: PartialEvaluator = js.native
    
    /* private */ var fs: Any = js.native
    
    var fullMetaReader: CompoundMetadataReader = js.native
    
    var fullRegistry: CompoundMetadataRegistry = js.native
    
    /* private */ var getReexportsForSourceFile: Any = js.native
    
    var handlers: js.Array[DecoratorHandler[Any, Any, SemanticSymbol | Null, Any]] = js.native
    
    /* private */ var host: Any = js.native
    
    var importGraph: ImportGraph = js.native
    
    var injectableRegistry: InjectableClassRegistry = js.native
    
    /* private */ var isCore: Any = js.native
    
    var metaRegistry: LocalMetadataRegistry = js.native
    
    var migrations: js.Array[Migration] = js.native
    
    var moduleResolver: ModuleResolver = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var packagePath: Any = js.native
    
    /* private */ var program: Any = js.native
    
    var refEmitter: ReferenceEmitter = js.native
    
    /* private */ var referencesRegistry: Any = js.native
    
    /* private */ var reflectionHost: Any = js.native
    
    /* protected */ def reportDiagnostics(): Unit = js.native
    
    var resourceManager: NgccResourceLoader = js.native
    
    /* private */ var rootDirs: Any = js.native
    
    var scopeRegistry: LocalModuleScopeRegistry = js.native
    
    /* private */ var tsConfig: Any = js.native
    
    var typeCheckScopeRegistry: TypeCheckScopeRegistry = js.native
    
    /* private */ var typeChecker: Any = js.native
  }
  
  /**
    * Simple class that resolves and loads files directly from the filesystem.
    */
  trait NgccResourceLoader
    extends StObject
       with ResourceLoader {
    
    /* private */ var fs: Any
    
    def preload(): js.UndefOr[js.Promise[Unit]]
    
    def preprocessInline(): js.Promise[String]
  }
  object NgccResourceLoader {
    
    inline def apply(
      canPreload: Boolean,
      canPreprocess: Boolean,
      fs: Any,
      load: String => String,
      preload: CallbackTo[js.UndefOr[js.Promise[Unit]]],
      preprocessInline: CallbackTo[js.Promise[String]],
      resolve: (String, String) => String
    ): NgccResourceLoader = {
      val __obj = js.Dynamic.literal(canPreload = canPreload.asInstanceOf[js.Any], canPreprocess = canPreprocess.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), preload = preload.toJsFn, preprocessInline = preprocessInline.toJsFn, resolve = js.Any.fromFunction2(resolve))
      __obj.asInstanceOf[NgccResourceLoader]
    }
    
    extension [Self <: NgccResourceLoader](x: Self) {
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setPreload(value: CallbackTo[js.UndefOr[js.Promise[Unit]]]): Self = StObject.set(x, "preload", value.toJsFn)
      
      inline def setPreprocessInline(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "preprocessInline", value.toJsFn)
    }
  }
}
