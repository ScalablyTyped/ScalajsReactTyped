package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.Expression
import typingsJapgolly.angularCompiler.mod.R3ClassMetadata
import typingsJapgolly.angularCompiler.mod.R3FactoryMetadata
import typingsJapgolly.angularCompiler.mod.R3NgModuleMetadata
import typingsJapgolly.angularCompiler.mod.SchemaMetadata
import typingsJapgolly.angularCompilerCli.anon.OmitR3InjectorMetadataimp
import typingsJapgolly.angularCompilerCli.anon.ReadonlyNgModuleAnalysis
import typingsJapgolly.angularCompilerCli.anon.ReadonlyNgModuleResolutio
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphSrcApiMod.SemanticReference
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscShimsApiMod.FactoryTracker
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.ResolveResult
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsNgModuleSrcHandlerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/handler", "NgModuleDecoratorHandler")
  @js.native
  open class NgModuleDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator, NgModuleAnalysis, NgModuleSymbol, NgModuleResolution] {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaReader: MetadataReader,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      referencesRegistry: ReferencesRegistry,
      isCore: Boolean,
      refEmitter: ReferenceEmitter,
      factoryTracker: Null,
      annotateForClosureCompiler: Boolean,
      onlyPublishPublicTypings: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaReader: MetadataReader,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      referencesRegistry: ReferencesRegistry,
      isCore: Boolean,
      refEmitter: ReferenceEmitter,
      factoryTracker: FactoryTracker,
      annotateForClosureCompiler: Boolean,
      onlyPublishPublicTypings: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder
    ) = this()
    
    /* private */ var _toR3Reference: Any = js.native
    
    /* private */ var annotateForClosureCompiler: Any = js.native
    
    /**
      * Add remote scoping statements, as needed, to the `ngModuleStatements`.
      */
    /* private */ var appendRemoteScopingStatements: Any = js.native
    
    def compileFull(
      node: ClassDeclaration[DeclarationNode],
      hasInjModFacClassMetadataDeclarationsRemoteScopesMayRequireCycleProtection: ReadonlyNgModuleAnalysis,
      hasInjectorImports: ReadonlyNgModuleResolutio
    ): js.Array[CompileResult] = js.native
    
    /* private */ var compileNgModule: Any = js.native
    
    @JSName("compilePartial")
    def compilePartial_MNgModuleDecoratorHandler(
      node: ClassDeclaration[DeclarationNode],
      hasInjFacModClassMetadata: ReadonlyNgModuleAnalysis,
      hasInjectorImports: ReadonlyNgModuleResolutio
    ): js.Array[CompileResult] = js.native
    
    /* private */ var evaluator: Any = js.native
    
    /* private */ var factoryTracker: Any = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /**
      * Add class metadata statements, if provided, to the `ngModuleStatements`.
      */
    /* private */ var insertMetadataStatement: Any = js.native
    
    /* private */ var isClassDeclarationReference: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var metaReader: Any = js.native
    
    /* private */ var metaRegistry: Any = js.native
    
    /* private */ var onlyPublishPublicTypings: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    @JSName("precedence")
    val precedence_NgModuleDecoratorHandler: String | Double = js.native
    
    /* private */ var refEmitter: Any = js.native
    
    /* private */ var referencesRegistry: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MNgModuleDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: NgModuleAnalysis): Unit = js.native
    
    /**
      * Compute a list of `Reference`s from a resolved metadata value.
      */
    /* private */ var resolveTypeList: Any = js.native
    
    @JSName("resolve")
    def resolve_MNgModuleDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyNgModuleAnalysis): ResolveResult[NgModuleResolution] = js.native
    
    /* private */ var scopeRegistry: Any = js.native
    
    def symbol(node: ClassDeclaration[DeclarationNode]): NgModuleSymbol = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/handler", "NgModuleSymbol")
  @js.native
  open class NgModuleSymbol protected () extends SemanticSymbol {
    def this(/**
      * The declaration for this symbol.
      */
    decl: ClassDeclaration[DeclarationNode]) = this()
    
    def addRemotelyScopedComponent(
      component: SemanticSymbol,
      usedDirectives: js.Array[SemanticReference],
      usedPipes: js.Array[SemanticReference]
    ): Unit = js.native
    
    @JSName("isEmitAffected")
    def isEmitAffected_MNgModuleSymbol(previousSymbol: SemanticSymbol): Boolean = js.native
    
    def isPublicApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    def isTypeCheckApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    /* private */ var remotelyScopedComponents: Any = js.native
  }
  
  trait NgModuleAnalysis extends StObject {
    
    var classMetadata: R3ClassMetadata | Null
    
    var declarations: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    
    var decorator: typingsJapgolly.typescript.mod.Decorator | Null
    
    var exports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    
    var fac: R3FactoryMetadata
    
    var factorySymbolName: String
    
    var id: Expression | Null
    
    var importRefs: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    
    var imports: js.Array[TopLevelImportedExpression]
    
    var inj: OmitR3InjectorMetadataimp
    
    var mod: R3NgModuleMetadata
    
    var providers: typingsJapgolly.typescript.mod.Expression | Null
    
    var providersRequiringFactory: Set[Reference[ClassDeclaration[DeclarationNode]]] | Null
    
    var rawDeclarations: typingsJapgolly.typescript.mod.Expression | Null
    
    var rawExports: typingsJapgolly.typescript.mod.Expression | Null
    
    var rawImports: typingsJapgolly.typescript.mod.Expression | Null
    
    var remoteScopesMayRequireCycleProtection: Boolean
    
    var schemas: js.Array[SchemaMetadata]
  }
  object NgModuleAnalysis {
    
    inline def apply(
      declarations: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
      exports: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
      fac: R3FactoryMetadata,
      factorySymbolName: String,
      importRefs: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
      imports: js.Array[TopLevelImportedExpression],
      inj: OmitR3InjectorMetadataimp,
      mod: R3NgModuleMetadata,
      remoteScopesMayRequireCycleProtection: Boolean,
      schemas: js.Array[SchemaMetadata]
    ): NgModuleAnalysis = {
      val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fac = fac.asInstanceOf[js.Any], factorySymbolName = factorySymbolName.asInstanceOf[js.Any], importRefs = importRefs.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], inj = inj.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], remoteScopesMayRequireCycleProtection = remoteScopesMayRequireCycleProtection.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], classMetadata = null, decorator = null, id = null, providers = null, providersRequiringFactory = null, rawDeclarations = null, rawExports = null, rawImports = null)
      __obj.asInstanceOf[NgModuleAnalysis]
    }
    
    extension [Self <: NgModuleAnalysis](x: Self) {
      
      inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
      
      inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
      
      inline def setDeclarations(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setDeclarationsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "declarations", js.Array(value*))
      
      inline def setDecorator(value: typingsJapgolly.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setExports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "exports", js.Array(value*))
      
      inline def setFac(value: R3FactoryMetadata): Self = StObject.set(x, "fac", value.asInstanceOf[js.Any])
      
      inline def setFactorySymbolName(value: String): Self = StObject.set(x, "factorySymbolName", value.asInstanceOf[js.Any])
      
      inline def setId(value: Expression): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setImportRefs(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "importRefs", value.asInstanceOf[js.Any])
      
      inline def setImportRefsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "importRefs", js.Array(value*))
      
      inline def setImports(value: js.Array[TopLevelImportedExpression]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsVarargs(value: TopLevelImportedExpression*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setInj(value: OmitR3InjectorMetadataimp): Self = StObject.set(x, "inj", value.asInstanceOf[js.Any])
      
      inline def setMod(value: R3NgModuleMetadata): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setProviders(value: typingsJapgolly.typescript.mod.Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersNull: Self = StObject.set(x, "providers", null)
      
      inline def setProvidersRequiringFactory(value: Set[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "providersRequiringFactory", value.asInstanceOf[js.Any])
      
      inline def setProvidersRequiringFactoryNull: Self = StObject.set(x, "providersRequiringFactory", null)
      
      inline def setRawDeclarations(value: typingsJapgolly.typescript.mod.Expression): Self = StObject.set(x, "rawDeclarations", value.asInstanceOf[js.Any])
      
      inline def setRawDeclarationsNull: Self = StObject.set(x, "rawDeclarations", null)
      
      inline def setRawExports(value: typingsJapgolly.typescript.mod.Expression): Self = StObject.set(x, "rawExports", value.asInstanceOf[js.Any])
      
      inline def setRawExportsNull: Self = StObject.set(x, "rawExports", null)
      
      inline def setRawImports(value: typingsJapgolly.typescript.mod.Expression): Self = StObject.set(x, "rawImports", value.asInstanceOf[js.Any])
      
      inline def setRawImportsNull: Self = StObject.set(x, "rawImports", null)
      
      inline def setRemoteScopesMayRequireCycleProtection(value: Boolean): Self = StObject.set(x, "remoteScopesMayRequireCycleProtection", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    }
  }
  
  trait NgModuleResolution extends StObject {
    
    var injectorImports: js.Array[Expression]
  }
  object NgModuleResolution {
    
    inline def apply(injectorImports: js.Array[Expression]): NgModuleResolution = {
      val __obj = js.Dynamic.literal(injectorImports = injectorImports.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgModuleResolution]
    }
    
    extension [Self <: NgModuleResolution](x: Self) {
      
      inline def setInjectorImports(value: js.Array[Expression]): Self = StObject.set(x, "injectorImports", value.asInstanceOf[js.Any])
      
      inline def setInjectorImportsVarargs(value: Expression*): Self = StObject.set(x, "injectorImports", js.Array(value*))
    }
  }
  
  trait TopLevelImportedExpression extends StObject {
    
    var expression: typingsJapgolly.typescript.mod.Expression
    
    var hasModuleWithProviders: Boolean
    
    var resolvedReferences: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
  }
  object TopLevelImportedExpression {
    
    inline def apply(
      expression: typingsJapgolly.typescript.mod.Expression,
      hasModuleWithProviders: Boolean,
      resolvedReferences: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    ): TopLevelImportedExpression = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], hasModuleWithProviders = hasModuleWithProviders.asInstanceOf[js.Any], resolvedReferences = resolvedReferences.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelImportedExpression]
    }
    
    extension [Self <: TopLevelImportedExpression](x: Self) {
      
      inline def setExpression(value: typingsJapgolly.typescript.mod.Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setHasModuleWithProviders(value: Boolean): Self = StObject.set(x, "hasModuleWithProviders", value.asInstanceOf[js.Any])
      
      inline def setResolvedReferences(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "resolvedReferences", value.asInstanceOf[js.Any])
      
      inline def setResolvedReferencesVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "resolvedReferences", js.Array(value*))
    }
  }
}
