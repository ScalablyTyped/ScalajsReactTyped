package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ConstantPool
import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcAdapterMod.SourceFileTypeIdentifier
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalApiMod.IncrementalBuild
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerMod.IndexingContext
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompilationMode
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcDeclarationMod.DtsTransformRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcTraitMod.PendingTrait
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcTraitMod.Trait
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiContextMod.ProgramTypeCheckAdapter
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiContextMod.TypeCheckContext
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckExtendedApiExtendedTemplateCheckerMod.ExtendedTemplateChecker
import typingsJapgolly.angularCompilerCli.srcNgtscXi18nSrcContextMod.Xi18nContext
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Decorator
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTransformSrcCompilationMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/compilation", "TraitCompiler")
  @js.native
  open class TraitCompiler protected ()
    extends StObject
       with ProgramTypeCheckAdapter {
    def this(
      handlers: js.Array[DecoratorHandler[Any, Any, SemanticSymbol | Null, Any]],
      reflector: ReflectionHost,
      perf: PerfRecorder,
      incrementalBuild: IncrementalBuild[ClassRecord, Any],
      compileNonExportedClasses: Boolean,
      compilationMode: CompilationMode,
      dtsTransforms: DtsTransformRegistry,
      semanticDepGraphUpdater: Null,
      sourceFileTypeIdentifier: SourceFileTypeIdentifier
    ) = this()
    def this(
      handlers: js.Array[DecoratorHandler[Any, Any, SemanticSymbol | Null, Any]],
      reflector: ReflectionHost,
      perf: PerfRecorder,
      incrementalBuild: IncrementalBuild[ClassRecord, Any],
      compileNonExportedClasses: Boolean,
      compilationMode: CompilationMode,
      dtsTransforms: DtsTransformRegistry,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      sourceFileTypeIdentifier: SourceFileTypeIdentifier
    ) = this()
    
    /**
      * Import a `ClassRecord` from a previous compilation.
      *
      * Traits from the `ClassRecord` have accurate metadata, but the `handler` is from the old program
      * and needs to be updated (matching is done by name). A new pending trait is created and then
      * transitioned to analyzed using the previous analysis. If the trait is in the errored state,
      * instead the errors are copied over.
      */
    /* private */ var adopt: Any = js.native
    
    /* private */ var analyze: Any = js.native
    
    def analyzeAsync(sf: SourceFile): js.UndefOr[js.Promise[Unit]] = js.native
    
    /* protected */ def analyzeClass(clazz: ClassDeclaration[DeclarationNode]): Unit = js.native
    /* protected */ def analyzeClass(clazz: ClassDeclaration[DeclarationNode], preanalyzeQueue: js.Array[js.Promise[Unit]]): Unit = js.native
    
    def analyzeSync(sf: SourceFile): Unit = js.native
    
    /* protected */ def analyzeTrait(clazz: ClassDeclaration[DeclarationNode], `trait`: Trait[Any, Any, SemanticSymbol | Null, Any]): Unit = js.native
    /* protected */ def analyzeTrait(
      clazz: ClassDeclaration[DeclarationNode],
      `trait`: Trait[Any, Any, SemanticSymbol | Null, Any],
      flags: HandlerFlags
    ): Unit = js.native
    
    /**
      * Maps class declarations to their `ClassRecord`, which tracks the Ivy traits being applied to
      * those classes.
      */
    /* private */ var classes: Any = js.native
    
    /* private */ var compilationMode: Any = js.native
    
    def compile(clazz: DeclarationNode, constantPool: ConstantPool): js.Array[CompileResult] | Null = js.native
    
    /* private */ var compileNonExportedClasses: Any = js.native
    
    def decoratorsFor(node: Declaration): js.Array[Decorator] = js.native
    
    /* protected */ def detectTraits(clazz: ClassDeclaration[DeclarationNode]): (js.Array[PendingTrait[Any, Any, SemanticSymbol | Null, Any]]) | Null = js.native
    /* protected */ def detectTraits(
      clazz: ClassDeclaration[DeclarationNode],
      decorators: js.Array[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator]
    ): (js.Array[PendingTrait[Any, Any, SemanticSymbol | Null, Any]]) | Null = js.native
    
    def diagnostics: js.Array[Diagnostic] = js.native
    
    /* private */ var dtsTransforms: Any = js.native
    
    def exportStatements: Map[String, Map[String, js.Tuple2[String, String]]] = js.native
    
    def extendedTemplateCheck(sf: SourceFile, extendedTemplateChecker: ExtendedTemplateChecker): js.Array[Diagnostic] = js.native
    
    /**
      * Maps source files to any class declaration(s) within them which have been discovered to contain
      * Ivy traits.
      */
    /* protected */ var fileToClasses: Map[SourceFile, Set[ClassDeclaration[DeclarationNode]]] = js.native
    
    /**
      * Tracks which source files have been analyzed but did not contain any traits. This set allows
      * the compiler to skip analyzing these files in an incremental rebuild.
      */
    /* protected */ var filesWithoutTraits: Set[SourceFile] = js.native
    
    def getAnalyzedRecords(): Map[SourceFile, js.Array[ClassRecord]] = js.native
    
    /* private */ var handlers: Any = js.native
    
    /* private */ var handlersByName: Any = js.native
    
    /* private */ var incrementalBuild: Any = js.native
    
    def index(ctx: IndexingContext): Unit = js.native
    
    /* private */ var makeSymbolForTrait: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    def recordFor(clazz: ClassDeclaration[DeclarationNode]): ClassRecord | Null = js.native
    
    def recordsFor(sf: SourceFile): js.Array[ClassRecord] | Null = js.native
    
    /* private */ var reexportMap: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    def resolve(): Unit = js.native
    
    /* private */ var scanClassForTraits: Any = js.native
    
    /* private */ var semanticDepGraphUpdater: Any = js.native
    
    /* private */ var sourceFileTypeIdentifier: Any = js.native
    
    /* CompleteClass */
    override def typeCheck(sf: SourceFile, ctx: TypeCheckContext): Unit = js.native
    
    def updateResources(clazz: DeclarationNode): Unit = js.native
    
    def xi18n(bundle: Xi18nContext): Unit = js.native
  }
  
  trait ClassRecord extends StObject {
    
    /**
      * Whether `traits` contains a trait from a `DecoratorHandler` matched as `PRIMARY`.
      */
    var hasPrimaryHandler: Boolean
    
    /**
      * Whether `traits` contains traits matched from `DecoratorHandler`s marked as `WEAK`.
      */
    var hasWeakHandlers: Boolean
    
    /**
      * Meta-diagnostics about the class, which are usually related to whether certain combinations of
      * Angular decorators are not permitted.
      */
    var metaDiagnostics: js.Array[Diagnostic] | Null
    
    /**
      * The `ClassDeclaration` of the class which has Angular traits applied.
      */
    var node: ClassDeclaration[DeclarationNode]
    
    /**
      * All traits which matched on the class.
      */
    var traits: js.Array[Trait[Any, Any, SemanticSymbol | Null, Any]]
  }
  object ClassRecord {
    
    inline def apply(
      hasPrimaryHandler: Boolean,
      hasWeakHandlers: Boolean,
      node: ClassDeclaration[DeclarationNode],
      traits: js.Array[Trait[Any, Any, SemanticSymbol | Null, Any]]
    ): ClassRecord = {
      val __obj = js.Dynamic.literal(hasPrimaryHandler = hasPrimaryHandler.asInstanceOf[js.Any], hasWeakHandlers = hasWeakHandlers.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], metaDiagnostics = null)
      __obj.asInstanceOf[ClassRecord]
    }
    
    extension [Self <: ClassRecord](x: Self) {
      
      inline def setHasPrimaryHandler(value: Boolean): Self = StObject.set(x, "hasPrimaryHandler", value.asInstanceOf[js.Any])
      
      inline def setHasWeakHandlers(value: Boolean): Self = StObject.set(x, "hasWeakHandlers", value.asInstanceOf[js.Any])
      
      inline def setMetaDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "metaDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setMetaDiagnosticsNull: Self = StObject.set(x, "metaDiagnostics", null)
      
      inline def setMetaDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "metaDiagnostics", js.Array(value*))
      
      inline def setNode(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTraits(value: js.Array[Trait[Any, Any, SemanticSymbol | Null, Any]]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsVarargs(value: (Trait[Any, Any, SemanticSymbol | Null, Any])*): Self = StObject.set(x, "traits", js.Array(value*))
    }
  }
}
