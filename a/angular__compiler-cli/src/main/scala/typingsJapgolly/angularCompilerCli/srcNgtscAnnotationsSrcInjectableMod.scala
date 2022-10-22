package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.R3ClassMetadata
import typingsJapgolly.angularCompiler.mod.R3DependencyMetadata
import typingsJapgolly.angularCompiler.mod.R3InjectableMetadata
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.invalid
import typingsJapgolly.angularCompilerCli.anon.ReadonlyInjectableHandler
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsSrcInjectableMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/src/injectable", "InjectableDecoratorHandler")
  @js.native
  open class InjectableDecoratorHandler protected ()
    extends StObject
       with DecoratorHandler[Decorator, InjectableHandlerData, Null, Any] {
    def this(
      reflector: ReflectionHost,
      isCore: Boolean,
      strictCtorDeps: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      isCore: Boolean,
      strictCtorDeps: Boolean,
      injectableRegistry: InjectableClassRegistry,
      perf: PerfRecorder,
      /**
      * What to do if the injectable already contains a ɵprov property.
      *
      * If true then an error diagnostic is reported.
      * If false then there is no error and a new ɵprov property is not added.
      */
    errorOnDuplicateProv: Boolean
    ) = this()
    
    /* private */ var compile: Any = js.native
    
    def compileFull(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyInjectableHandler): js.Array[CompileResult] = js.native
    
    @JSName("compilePartial")
    def compilePartial_MInjectableDecoratorHandler(node: ClassDeclaration[DeclarationNode], analysis: ReadonlyInjectableHandler): js.Array[CompileResult] = js.native
    
    /**
      * What to do if the injectable already contains a ɵprov property.
      *
      * If true then an error diagnostic is reported.
      * If false then there is no error and a new ɵprov property is not added.
      */
    /* private */ var errorOnDuplicateProv: Any = js.native
    
    /* private */ var injectableRegistry: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    @JSName("precedence")
    val precedence_InjectableDecoratorHandler: String | Double = js.native
    
    /* private */ var reflector: Any = js.native
    
    @JSName("register")
    def register_MInjectableDecoratorHandler(node: ClassDeclaration[DeclarationNode]): Unit = js.native
    
    /* private */ var strictCtorDeps: Any = js.native
    
    def symbol(): Null = js.native
  }
  
  trait InjectableHandlerData extends StObject {
    
    var classMetadata: R3ClassMetadata | Null
    
    var ctorDeps: js.Array[R3DependencyMetadata] | invalid | Null
    
    var meta: R3InjectableMetadata
    
    var needsFactory: Boolean
  }
  object InjectableHandlerData {
    
    inline def apply(meta: R3InjectableMetadata, needsFactory: Boolean): InjectableHandlerData = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], needsFactory = needsFactory.asInstanceOf[js.Any], classMetadata = null, ctorDeps = null)
      __obj.asInstanceOf[InjectableHandlerData]
    }
    
    extension [Self <: InjectableHandlerData](x: Self) {
      
      inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
      
      inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
      
      inline def setCtorDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "ctorDeps", value.asInstanceOf[js.Any])
      
      inline def setCtorDepsNull: Self = StObject.set(x, "ctorDeps", null)
      
      inline def setCtorDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "ctorDeps", js.Array(value*))
      
      inline def setMeta(value: R3InjectableMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setNeedsFactory(value: Boolean): Self = StObject.set(x, "needsFactory", value.asInstanceOf[js.Any])
    }
  }
}
