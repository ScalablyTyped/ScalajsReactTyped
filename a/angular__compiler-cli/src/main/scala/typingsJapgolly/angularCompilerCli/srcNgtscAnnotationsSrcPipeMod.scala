package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.R3ClassMetadata
import typingsJapgolly.angularCompiler.mod.R3PipeMetadata
import typingsJapgolly.angularCompilerCli.anon.ReadonlyPipeHandlerData
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
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
import typingsJapgolly.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsSrcPipeMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/src/pipe", "PipeDecoratorHandler")
  @js.native
  open class PipeDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator, PipeHandlerData, PipeSymbol, Any] {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      perf: PerfRecorder
    ) = this()
    
    def compileFull(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyPipeHandlerData): js.Array[CompileResult] = js.native
    
    @JSName("compilePartial")
    def compilePartial_MPipeDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyPipeHandlerData): js.Array[CompileResult] = js.native
    
    /* private */ var evaluator: Any = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var metaRegistry: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    @JSName("precedence")
    val precedence_PipeDecoratorHandler: String | Double = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MPipeDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyPipeHandlerData): Unit = js.native
    
    @JSName("resolve")
    def resolve_MPipeDecoratorHandler(node: ClassDeclaration[DeclarationNode]): ResolveResult[Any] = js.native
    
    /* private */ var scopeRegistry: Any = js.native
    
    def symbol(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyPipeHandlerData): PipeSymbol = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/src/pipe", "PipeSymbol")
  @js.native
  open class PipeSymbol protected () extends SemanticSymbol {
    def this(decl: ClassDeclaration[DeclarationNode], name: String) = this()
    
    def isPublicApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    def isTypeCheckApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    val name: String = js.native
  }
  
  trait PipeHandlerData extends StObject {
    
    var classMetadata: R3ClassMetadata | Null
    
    var decorator: typingsJapgolly.typescript.mod.Decorator | Null
    
    var meta: R3PipeMetadata
    
    var pipeNameExpr: Expression
  }
  object PipeHandlerData {
    
    inline def apply(meta: R3PipeMetadata, pipeNameExpr: Expression): PipeHandlerData = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], pipeNameExpr = pipeNameExpr.asInstanceOf[js.Any], classMetadata = null, decorator = null)
      __obj.asInstanceOf[PipeHandlerData]
    }
    
    extension [Self <: PipeHandlerData](x: Self) {
      
      inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
      
      inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
      
      inline def setDecorator(value: typingsJapgolly.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setMeta(value: R3PipeMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setPipeNameExpr(value: Expression): Self = StObject.set(x, "pipeNameExpr", value.asInstanceOf[js.Any])
    }
  }
}
