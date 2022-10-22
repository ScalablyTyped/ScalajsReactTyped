package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ConstantPool
import typingsJapgolly.angularCompilerCli.anon.ReadonlyComponentAnalysis
import typingsJapgolly.angularCompilerCli.anon.ReadonlyComponentResoluti
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsCommonSrcApiMod.ResourceLoader
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsComponentSrcMetadataMod.ComponentAnalysisData
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsComponentSrcMetadataMod.ComponentResolutionData
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsComponentSrcSymbolMod.ComponentSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscCyclesMod.CycleAnalyzer
import typingsJapgolly.angularCompilerCli.srcNgtscCyclesSrcAnalyzerMod.CycleHandlingStrategy
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ModuleResolver
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerMod.IndexingContext
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.ResourceRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.TypeCheckScopeRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcDependencyMod.DtsModuleScopeResolver
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.ResolveResult
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiContextMod.TypeCheckContext
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckExtendedApiExtendedTemplateCheckerMod.ExtendedTemplateChecker
import typingsJapgolly.angularCompilerCli.srcNgtscXi18nSrcContextMod.Xi18nContext
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsComponentSrcHandlerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component/src/handler", "ComponentDecoratorHandler")
  @js.native
  open class ComponentDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator, ComponentAnalysisData, ComponentSymbol, ComponentResolutionData] {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      metaReader: MetadataReader,
      scopeReader: ComponentScopeReader,
      dtsScopeReader: DtsModuleScopeResolver,
      scopeRegistry: LocalModuleScopeRegistry,
      typeCheckScopeRegistry: TypeCheckScopeRegistry,
      resourceRegistry: ResourceRegistry,
      isCore: Boolean,
      resourceLoader: ResourceLoader,
      rootDirs: js.Array[String],
      defaultPreserveWhitespaces: Boolean,
      i18nUseExternalIds: Boolean,
      enableI18nLegacyMessageIdFormat: Boolean,
      usePoisonedData: Boolean,
      i18nNormalizeLineEndingsInICUs: Boolean,
      moduleResolver: ModuleResolver,
      cycleAnalyzer: CycleAnalyzer,
      cycleHandlingStrategy: CycleHandlingStrategy,
      refEmitter: ReferenceEmitter,
      depTracker: DependencyTracker[SourceFile] | Null,
      injectableRegistry: InjectableClassRegistry,
      semanticDepGraphUpdater: SemanticDepGraphUpdater | Null,
      annotateForClosureCompiler: Boolean,
      perf: PerfRecorder
    ) = this()
    
    /**
      * Check whether adding an import from `origin` to the source-file corresponding to `expr` would
      * create a cyclic import.
      *
      * @returns a `Cycle` object if a cycle would be created, otherwise `null`.
      */
    /* private */ var _checkForCyclicImport: Any = js.native
    
    /* private */ var annotateForClosureCompiler: Any = js.native
    
    def compileFull(
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyComponentAnalysis,
      resolution: ReadonlyComponentResoluti,
      pool: ConstantPool
    ): js.Array[CompileResult] = js.native
    
    @JSName("compilePartial")
    def compilePartial_MComponentDecoratorHandler(
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyComponentAnalysis,
      resolution: ReadonlyComponentResoluti
    ): js.Array[CompileResult] = js.native
    
    /* private */ var cycleAnalyzer: Any = js.native
    
    /* private */ var cycleHandlingStrategy: Any = js.native
    
    /* private */ var defaultPreserveWhitespaces: Any = js.native
    
    /* private */ var depTracker: Any = js.native
    
    /* private */ var dtsScopeReader: Any = js.native
    
    /* private */ var elementSchemaRegistry: Any = js.native
    
    /* private */ var enableI18nLegacyMessageIdFormat: Any = js.native
    
    /* private */ var evaluator: Any = js.native
    
    @JSName("extendedTemplateCheck")
    def extendedTemplateCheck_MComponentDecoratorHandler(
      component: typingsJapgolly.typescript.mod.ClassDeclaration,
      extendedTemplateChecker: ExtendedTemplateChecker
    ): js.Array[Diagnostic] = js.native
    
    /* private */ var extractTemplateOptions: Any = js.native
    
    /* private */ var i18nNormalizeLineEndingsInICUs: Any = js.native
    
    /* private */ var i18nUseExternalIds: Any = js.native
    
    @JSName("index")
    def index_MComponentDecoratorHandler(
      context: IndexingContext,
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyComponentAnalysis
    ): js.UndefOr[Null] = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var literalCache: Any = js.native
    
    /* private */ var maybeRecordSyntheticImport: Any = js.native
    
    /* private */ var metaReader: Any = js.native
    
    /* private */ var metaRegistry: Any = js.native
    
    /* private */ var moduleResolver: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    /* private */ var preanalyzeStylesCache: Any = js.native
    
    /**
      * During the asynchronous preanalyze phase, it's necessary to parse the template to extract
      * any potential <link> tags which might need to be loaded. This cache ensures that work is not
      * thrown away, and the parsed template is reused during the analyze phase.
      */
    /* private */ var preanalyzeTemplateCache: Any = js.native
    
    @JSName("preanalyze")
    def preanalyze_MComponentDecoratorHandler(node: ClassDeclaration[DeclarationNode], decorator: Decorator): js.UndefOr[js.Promise[Unit]] = js.native
    
    @JSName("precedence")
    val precedence_ComponentDecoratorHandler: String | Double = js.native
    
    /* private */ var refEmitter: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MComponentDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ComponentAnalysisData): Unit = js.native
    
    @JSName("resolve")
    def resolve_MComponentDecoratorHandler(
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyComponentAnalysis,
      symbol: ComponentSymbol
    ): ResolveResult[ComponentResolutionData] = js.native
    
    /* private */ var resourceLoader: Any = js.native
    
    /* private */ var resourceRegistry: Any = js.native
    
    /* private */ var rootDirs: Any = js.native
    
    /* private */ var scopeReader: Any = js.native
    
    /* private */ var scopeRegistry: Any = js.native
    
    /* private */ var semanticDepGraphUpdater: Any = js.native
    
    def symbol(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyComponentAnalysis): ComponentSymbol = js.native
    
    /* private */ var typeCheckScopeRegistry: Any = js.native
    
    @JSName("typeCheck")
    def typeCheck_MComponentDecoratorHandler(ctx: TypeCheckContext, node: ClassDeclaration[DeclarationNode], meta: ReadonlyComponentAnalysis): Unit = js.native
    
    @JSName("updateResources")
    def updateResources_MComponentDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ComponentAnalysisData): Unit = js.native
    
    /* private */ var usePoisonedData: Any = js.native
    
    @JSName("xi18n")
    def xi18n_MComponentDecoratorHandler(ctx: Xi18nContext, node: ClassDeclaration[DeclarationNode], analysis: ReadonlyComponentAnalysis): Unit = js.native
  }
}
