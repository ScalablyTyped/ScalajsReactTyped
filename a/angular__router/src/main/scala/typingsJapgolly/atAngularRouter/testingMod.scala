package typingsJapgolly.atAngularRouter

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class RouterTestingModule ()
    extends typingsJapgolly.atAngularRouter.testingTestingMod.RouterTestingModule
  
  @js.native
  class SpyNgModuleFactoryLoader protected ()
    extends typingsJapgolly.atAngularRouter.testingTestingMod.SpyNgModuleFactoryLoader {
    def this(compiler: Compiler) = this()
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
    def withRoutes(routes: Routes): ModuleWithProviders[typingsJapgolly.atAngularRouter.testingTestingMod.RouterTestingModule] = js.native
    def withRoutes(routes: Routes, config: ExtraOptions): ModuleWithProviders[typingsJapgolly.atAngularRouter.testingTestingMod.RouterTestingModule] = js.native
  }
  
}

