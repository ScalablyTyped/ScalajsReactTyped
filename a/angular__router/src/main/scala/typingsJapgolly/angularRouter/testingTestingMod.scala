package typingsJapgolly.angularRouter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCore.mod.Compiler
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ModuleWithProviders
import typingsJapgolly.angularCore.mod.NgModuleFactoryLoader
import typingsJapgolly.angularRouter.mod.ChildrenOutletContexts
import typingsJapgolly.angularRouter.mod.ExtraOptions
import typingsJapgolly.angularRouter.mod.Route
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.Routes
import typingsJapgolly.angularRouter.mod.UrlHandlingStrategy
import typingsJapgolly.angularRouter.mod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class RouterTestingModule () extends js.Object
  
  @js.native
  class SpyNgModuleFactoryLoader protected () extends NgModuleFactoryLoader {
    def this(compiler: Compiler) = this()
    /**
      * @docsNotRequired
      */
    var _stubbedModules: js.Any = js.native
    var compiler: js.Any = js.native
    /**
      * @docsNotRequired
      */
    /**
      * @docsNotRequired
      */
    var stubbedModules: StringDictionary[js.Any] = js.native
  }
  
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]]
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  /* static members */
  @js.native
  object RouterTestingModule extends js.Object {
    def withRoutes(routes: Routes): ModuleWithProviders[RouterTestingModule] = js.native
    def withRoutes(routes: Routes, config: ExtraOptions): ModuleWithProviders[RouterTestingModule] = js.native
  }
  
}

