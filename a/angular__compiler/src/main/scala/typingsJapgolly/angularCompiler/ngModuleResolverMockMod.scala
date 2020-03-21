package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.coreMod.NgModule
import typingsJapgolly.angularCompiler.coreMod.Type
import typingsJapgolly.angularCompiler.mod.CompileReflector
import typingsJapgolly.angularCompiler.mod.NgModuleResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/testing/src/ng_module_resolver_mock", JSImport.Namespace)
@js.native
object ngModuleResolverMockMod extends js.Object {
  @js.native
  class MockNgModuleResolver protected () extends NgModuleResolver {
    def this(reflector: CompileReflector) = this()
    var _ngModules: js.Any = js.native
    /**
      * Overrides the {@link NgModule} for a module.
      */
    def setNgModule(`type`: Type, metadata: NgModule): Unit = js.native
  }
  
}

