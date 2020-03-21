package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.angularCompilerStrings.ngComponentType
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileNgModuleSummary
import typingsJapgolly.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileTypeSummary
import typingsJapgolly.angularCompiler.compileMetadataMod.ProviderMeta
import typingsJapgolly.angularCompiler.compileMetadataMod.ProxyClass
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import typingsJapgolly.angularCompiler.configMod.CompilerConfig
import typingsJapgolly.angularCompiler.coreMod.Type
import typingsJapgolly.angularCompiler.directiveNormalizerMod.DirectiveNormalizer
import typingsJapgolly.angularCompiler.directiveResolverMod.DirectiveResolver
import typingsJapgolly.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry
import typingsJapgolly.angularCompiler.htmlParserMod.HtmlParser
import typingsJapgolly.angularCompiler.ngModuleResolverMod.NgModuleResolver
import typingsJapgolly.angularCompiler.pipeResolverMod.PipeResolver
import typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typingsJapgolly.angularCompiler.srcUtilMod.Console
import typingsJapgolly.angularCompiler.srcUtilMod.SyncAsync
import typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol
import typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbolCache
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/metadata_resolver", JSImport.Namespace)
@js.native
object metadataResolverMod extends js.Object {
  @js.native
  class CompileMetadataResolver protected () extends js.Object {
    def this(
      _config: CompilerConfig,
      _htmlParser: HtmlParser,
      _ngModuleResolver: NgModuleResolver,
      _directiveResolver: DirectiveResolver,
      _pipeResolver: PipeResolver,
      _summaryResolver: SummaryResolver[_],
      _schemaRegistry: ElementSchemaRegistry,
      _directiveNormalizer: DirectiveNormalizer,
      _console: Console,
      _staticSymbolCache: StaticSymbolCache,
      _reflector: CompileReflector
    ) = this()
    def this(
      _config: CompilerConfig,
      _htmlParser: HtmlParser,
      _ngModuleResolver: NgModuleResolver,
      _directiveResolver: DirectiveResolver,
      _pipeResolver: PipeResolver,
      _summaryResolver: SummaryResolver[_],
      _schemaRegistry: ElementSchemaRegistry,
      _directiveNormalizer: DirectiveNormalizer,
      _console: Console,
      _staticSymbolCache: StaticSymbolCache,
      _reflector: CompileReflector,
      _errorCollector: ErrorCollector
    ) = this()
    var _addTypeToModule: js.Any = js.native
    var _checkSelfImport: js.Any = js.native
    var _config: js.Any = js.native
    var _console: js.Any = js.native
    var _createProxyClass: js.Any = js.native
    var _directiveCache: js.Any = js.native
    var _directiveNormalizer: js.Any = js.native
    var _directiveResolver: js.Any = js.native
    var _errorCollector: js.UndefOr[js.Any] = js.native
    var _getDependenciesMetadata: js.Any = js.native
    var _getEntryComponentMetadata: js.Any = js.native
    var _getEntryComponentsFromProvider: js.Any = js.native
    var _getFactoryMetadata: js.Any = js.native
    var _getIdentifierMetadata: js.Any = js.native
    var _getInjectableTypeMetadata: js.Any = js.native
    var _getProvidersMetadata: js.Any = js.native
    var _getQueriesMetadata: js.Any = js.native
    var _getQueryMetadata: js.Any = js.native
    var _getTokenMetadata: js.Any = js.native
    var _getTransitiveNgModuleMetadata: js.Any = js.native
    var _getTypeDescriptor: js.Any = js.native
    var _getTypeMetadata: js.Any = js.native
    var _htmlParser: js.Any = js.native
    var _loadPipeMetadata: js.Any = js.native
    var _loadSummary: js.Any = js.native
    var _ngModuleCache: js.Any = js.native
    var _ngModuleOfTypes: js.Any = js.native
    var _ngModuleResolver: js.Any = js.native
    var _nonNormalizedDirectiveCache: js.Any = js.native
    var _pipeCache: js.Any = js.native
    var _pipeResolver: js.Any = js.native
    var _queryVarBindings: js.Any = js.native
    var _reflector: js.Any = js.native
    var _reportError: js.Any = js.native
    var _schemaRegistry: js.Any = js.native
    var _shallowModuleCache: js.Any = js.native
    var _staticSymbolCache: js.Any = js.native
    var _summaryCache: js.Any = js.native
    var _summaryResolver: js.Any = js.native
    var _validateProvider: js.Any = js.native
    var getComponentFactory: js.Any = js.native
    var getComponentViewClass: js.Any = js.native
    var getGeneratedClass: js.Any = js.native
    var getRendererType: js.Any = js.native
    var initComponentFactory: js.Any = js.native
    def clearCache(): Unit = js.native
    def clearCacheFor(`type`: Type): Unit = js.native
    /**
      * Gets the metadata for the given directive.
      * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
      */
    def getDirectiveMetadata(directiveType: js.Any): CompileDirectiveMetadata = js.native
    def getDirectiveSummary(dirType: js.Any): CompileDirectiveSummary = js.native
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata): CompileDirectiveMetadata = js.native
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata, hostViewType: ProxyClass): CompileDirectiveMetadata = js.native
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata, hostViewType: StaticSymbol): CompileDirectiveMetadata = js.native
    def getHostComponentType(dirType: js.Any): StaticSymbol | ProxyClass = js.native
    def getHostComponentViewClass(dirType: js.Any): StaticSymbol | ProxyClass = js.native
    def getInjectableMetadata(`type`: js.Any): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: js.Array[_]): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: js.Array[_], throwOnUnknownDeps: Boolean): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: Null, throwOnUnknownDeps: Boolean): CompileInjectableMetadata | Null = js.native
    def getInjectableSummary(`type`: js.Any): CompileTypeSummary = js.native
    def getNgModuleMetadata(moduleType: js.Any): CompileNgModuleMetadata | Null = js.native
    def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: Boolean): CompileNgModuleMetadata | Null = js.native
    def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: Boolean, alreadyCollecting: Set[_]): CompileNgModuleMetadata | Null = js.native
    def getNgModuleSummary(moduleType: js.Any): CompileNgModuleSummary | Null = js.native
    def getNgModuleSummary(moduleType: js.Any, alreadyCollecting: Set[_]): CompileNgModuleSummary | Null = js.native
    def getNonNormalizedDirectiveMetadata(directiveType: js.Any): AnonAnnotation | Null = js.native
    def getOrLoadPipeMetadata(pipeType: js.Any): CompilePipeMetadata = js.native
    /**
      * Gets the metadata for the given pipe.
      * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
      */
    def getPipeMetadata(pipeType: js.Any): CompilePipeMetadata | Null = js.native
    def getPipeSummary(pipeType: js.Any): CompilePipeSummary = js.native
    def getProviderMetadata(provider: ProviderMeta): CompileProviderMetadata = js.native
    def getReflector(): CompileReflector = js.native
    def getShallowModuleMetadata(moduleType: js.Any): CompileShallowModuleMetadata | Null = js.native
    def isDirective(`type`: js.Any): Boolean = js.native
    def isInjectable(`type`: js.Any): Boolean = js.native
    def isNgModule(`type`: js.Any): Boolean = js.native
    def isPipe(`type`: js.Any): Boolean = js.native
    def loadDirectiveMetadata(ngModuleType: js.Any, directiveType: js.Any, isSync: Boolean): SyncAsync[Null] = js.native
    /**
      * Loads the declared directives and pipes of an NgModule.
      */
    def loadNgModuleDirectiveAndPipeMetadata(moduleType: js.Any, isSync: Boolean): js.Promise[_] = js.native
    def loadNgModuleDirectiveAndPipeMetadata(moduleType: js.Any, isSync: Boolean, throwIfNotFound: Boolean): js.Promise[_] = js.native
  }
  
  val ERROR_COMPONENT_TYPE: ngComponentType = js.native
  type ErrorCollector = js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
}

