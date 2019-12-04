package typingsJapgolly.atAngularRouter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAngularCommon.atAngularCommonMod.Location
import typingsJapgolly.atAngularCore.atAngularCoreMod.Compiler
import typingsJapgolly.atAngularCore.atAngularCoreMod.Injector
import typingsJapgolly.atAngularCore.atAngularCoreMod.ModuleWithProviders
import typingsJapgolly.atAngularCore.atAngularCoreMod.NgModuleFactoryLoader
import typingsJapgolly.atAngularRouter.atAngularRouterMod.ChildrenOutletContexts
import typingsJapgolly.atAngularRouter.atAngularRouterMod.ExtraOptions
import typingsJapgolly.atAngularRouter.atAngularRouterMod.Route
import typingsJapgolly.atAngularRouter.atAngularRouterMod.Router
import typingsJapgolly.atAngularRouter.atAngularRouterMod.Routes
import typingsJapgolly.atAngularRouter.atAngularRouterMod.UrlHandlingStrategy
import typingsJapgolly.atAngularRouter.atAngularRouterMod.UrlSerializer
import typingsJapgolly.atAngularRouter.testingTestingMod.RouterTestingModule
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

