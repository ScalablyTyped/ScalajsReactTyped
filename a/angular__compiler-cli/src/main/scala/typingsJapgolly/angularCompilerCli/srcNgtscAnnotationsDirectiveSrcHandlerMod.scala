package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ConstantPool
import typingsJapgolly.angularCompiler.mod.R3ClassMetadata
import typingsJapgolly.angularCompiler.mod.R3DirectiveMetadata
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.dynamic
import typingsJapgolly.angularCompilerCli.anon.ReadonlyDirectiveHandlerD
import typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsDirectiveSrcSymbolMod.DirectiveSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.ResolveResult
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsDirectiveSrcHandlerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive/src/handler", "DirectiveDecoratorHandler")
  @js.native
  open class DirectiveDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator | Null, DirectiveHandlerData, DirectiveSymbol, Any] {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      semanticDepGraphUpdater: Null,
      annotateForClosureCompiler: Boolean,
      compileUndecoratedClassesWithAngularFeatures: Boolean,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      annotateForClosureCompiler: Boolean,
      compileUndecoratedClassesWithAngularFeatures: Boolean,
      perf: PerfRecorder
    ) = this()
    
    /* private */ var annotateForClosureCompiler: Any = js.native
    
    def compileFull(
      node: ClassDeclaration[DeclarationNode],
      analysis: ReadonlyDirectiveHandlerD,
      resolution: Any,
      pool: ConstantPool
    ): js.Array[CompileResult] = js.native
    
    @JSName("compilePartial")
    def compilePartial_MDirectiveDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyDirectiveHandlerD, resolution: Any): js.Array[CompileResult] = js.native
    
    /* private */ var compileUndecoratedClassesWithAngularFeatures: Any = js.native
    
    /* private */ var evaluator: Any = js.native
    
    /**
      * Checks if a given class uses Angular features and returns the TypeScript node
      * that indicated the usage. Classes are considered using Angular features if they
      * contain class members that are either decorated with a known Angular decorator,
      * or if they correspond to a known Angular lifecycle hook.
      */
    /* private */ var findClassFieldWithAngularFeatures: Any = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var metaReader: Any = js.native
    
    /* private */ var metaRegistry: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    @JSName("precedence")
    val precedence_DirectiveDecoratorHandler: String | Double = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MDirectiveDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyDirectiveHandlerD): Unit = js.native
    
    @JSName("resolve")
    def resolve_MDirectiveDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: DirectiveHandlerData, symbol: DirectiveSymbol): ResolveResult[Any] = js.native
    
    /* private */ var scopeRegistry: Any = js.native
    
    /* private */ var semanticDepGraphUpdater: Any = js.native
    
    def symbol(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyDirectiveHandlerD): DirectiveSymbol = js.native
  }
  
  trait DirectiveHandlerData extends StObject {
    
    var baseClass: Reference[ClassDeclaration[DeclarationNode]] | dynamic | Null
    
    var classMetadata: R3ClassMetadata | Null
    
    var decorator: typingsJapgolly.typescript.mod.Decorator | Null
    
    var inputs: ClassPropertyMapping
    
    var isPoisoned: Boolean
    
    var isStructural: Boolean
    
    var meta: R3DirectiveMetadata
    
    var outputs: ClassPropertyMapping
    
    var providersRequiringFactory: Set[Reference[ClassDeclaration[DeclarationNode]]] | Null
    
    var typeCheckMeta: DirectiveTypeCheckMeta
  }
  object DirectiveHandlerData {
    
    inline def apply(
      inputs: ClassPropertyMapping,
      isPoisoned: Boolean,
      isStructural: Boolean,
      meta: R3DirectiveMetadata,
      outputs: ClassPropertyMapping,
      typeCheckMeta: DirectiveTypeCheckMeta
    ): DirectiveHandlerData = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], typeCheckMeta = typeCheckMeta.asInstanceOf[js.Any], baseClass = null, classMetadata = null, decorator = null, providersRequiringFactory = null)
      __obj.asInstanceOf[DirectiveHandlerData]
    }
    
    extension [Self <: DirectiveHandlerData](x: Self) {
      
      inline def setBaseClass(value: Reference[ClassDeclaration[DeclarationNode]] | dynamic): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassNull: Self = StObject.set(x, "baseClass", null)
      
      inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
      
      inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
      
      inline def setDecorator(value: typingsJapgolly.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setInputs(value: ClassPropertyMapping): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
      
      inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: R3DirectiveMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: ClassPropertyMapping): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setProvidersRequiringFactory(value: Set[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "providersRequiringFactory", value.asInstanceOf[js.Any])
      
      inline def setProvidersRequiringFactoryNull: Self = StObject.set(x, "providersRequiringFactory", null)
      
      inline def setTypeCheckMeta(value: DirectiveTypeCheckMeta): Self = StObject.set(x, "typeCheckMeta", value.asInstanceOf[js.Any])
    }
  }
}
