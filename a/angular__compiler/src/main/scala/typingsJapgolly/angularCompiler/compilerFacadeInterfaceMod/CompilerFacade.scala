package typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompiler.AnonInstantiableResourceLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerFacade extends js.Object {
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
  var ResourceLoader: AnonInstantiableResourceLoader
  def compileBase(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3BaseMetadataFacade): js.Any
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectableMetadataFacade): js.Any
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectorMetadataFacade): js.Any
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3NgModuleMetadataFacade): js.Any
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3PipeMetadataFacade): js.Any
  def createParseSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan
}

object CompilerFacade {
  @scala.inline
  def apply(
    R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any,
    ResourceLoader: AnonInstantiableResourceLoader,
    compileBase: (CoreEnvironment, String, R3BaseMetadataFacade) => CallbackTo[js.Any],
    compileComponent: (CoreEnvironment, String, R3ComponentMetadataFacade) => CallbackTo[js.Any],
    compileDirective: (CoreEnvironment, String, R3DirectiveMetadataFacade) => CallbackTo[js.Any],
    compileInjectable: (CoreEnvironment, String, R3InjectableMetadataFacade) => CallbackTo[js.Any],
    compileInjector: (CoreEnvironment, String, R3InjectorMetadataFacade) => CallbackTo[js.Any],
    compileNgModule: (CoreEnvironment, String, R3NgModuleMetadataFacade) => CallbackTo[js.Any],
    compilePipe: (CoreEnvironment, String, R3PipeMetadataFacade) => CallbackTo[js.Any],
    createParseSourceSpan: (String, String, String) => CallbackTo[ParseSourceSpan]
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal(R3ResolvedDependencyType = R3ResolvedDependencyType.asInstanceOf[js.Any], ResourceLoader = ResourceLoader.asInstanceOf[js.Any])
    __obj.updateDynamic("compileBase")(js.Any.fromFunction3((t0: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment, t1: java.lang.String, t2: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.R3BaseMetadataFacade) => compileBase(t0, t1, t2).runNow()))
    __obj.updateDynamic("compileComponent")(js.Any.fromFunction3((t0: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment, t1: java.lang.String, t2: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.R3ComponentMetadataFacade) => compileComponent(t0, t1, t2).runNow()))
    __obj.updateDynamic("compileDirective")(js.Any.fromFunction3((t0: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment, t1: java.lang.String, t2: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.R3DirectiveMetadataFacade) => compileDirective(t0, t1, t2).runNow()))
    __obj.updateDynamic("compileInjectable")(js.Any.fromFunction3((t0: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment, t1: java.lang.String, t2: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.R3InjectableMetadataFacade) => compileInjectable(t0, t1, t2).runNow()))
    __obj.updateDynamic("compileInjector")(js.Any.fromFunction3((t0: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment, t1: java.lang.String, t2: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.R3InjectorMetadataFacade) => compileInjector(t0, t1, t2).runNow()))
    __obj.updateDynamic("compileNgModule")(js.Any.fromFunction3((t0: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment, t1: java.lang.String, t2: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.R3NgModuleMetadataFacade) => compileNgModule(t0, t1, t2).runNow()))
    __obj.updateDynamic("compilePipe")(js.Any.fromFunction3((t0: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.CoreEnvironment, t1: java.lang.String, t2: typingsJapgolly.angularCompiler.compilerFacadeInterfaceMod.R3PipeMetadataFacade) => compilePipe(t0, t1, t2).runNow()))
    __obj.updateDynamic("createParseSourceSpan")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => createParseSourceSpan(t0, t1, t2).runNow()))
    __obj.asInstanceOf[CompilerFacade]
  }
}

