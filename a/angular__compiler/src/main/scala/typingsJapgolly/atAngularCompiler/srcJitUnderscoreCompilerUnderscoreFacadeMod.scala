package typingsJapgolly.atAngularCompiler

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CompilerFacade
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CoreEnvironment
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.ParseSourceSpan
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3BaseMetadataFacade
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ComponentMetadataFacade
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3DirectiveMetadataFacade
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3InjectableMetadataFacade
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3InjectorMetadataFacade
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3NgModuleMetadataFacade
import typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3PipeMetadataFacade
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreJitMod.JitEvaluator
import typingsJapgolly.atAngularCompiler.srcResourceUnderscoreLoaderMod.ResourceLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/jit_compiler_facade", JSImport.Namespace)
@js.native
object srcJitUnderscoreCompilerUnderscoreFacadeMod extends js.Object {
  @js.native
  class CompilerFacadeImpl () extends CompilerFacade {
    def this(jitEvaluator: JitEvaluator) = this()
    /* CompleteClass */
    override var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any = js.native
    /* CompleteClass */
    override var ResourceLoader: Anon_ResourceLoader = js.native
    @JSName("ResourceLoader")
    var ResourceLoader_CompilerFacadeImpl: Instantiable0[ResourceLoader] = js.native
    var elementSchemaRegistry: js.Any = js.native
    var jitEvaluator: js.Any = js.native
    /**
      * JIT compiles an expression and returns the result of executing that expression.
      *
      * @param def the definition which will be compiled and executed to get the value to patch
      * @param context an object map of @angular/core symbol names to symbols which will be available
      * in the context of the compiled expression
      * @param sourceUrl a URL to use for the source map of the compiled expression
      * @param preStatements a collection of statements that should be evaluated before the expression.
      */
    var jitExpression: js.Any = js.native
    /* CompleteClass */
    override def compileBase(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3BaseMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectableMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectorMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3NgModuleMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3PipeMetadataFacade): js.Any = js.native
    /* CompleteClass */
    override def createParseSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
  }
  
  def publishFacade(global: js.Any): Unit = js.native
}

