package typingsJapgolly.atAngularRouter.atAngularRouterMod

import typingsJapgolly.atAngularCommon.atAngularCommonMod.Location
import typingsJapgolly.atAngularCore.atAngularCoreMod.ApplicationRef
import typingsJapgolly.atAngularCore.atAngularCoreMod.Compiler
import typingsJapgolly.atAngularCore.atAngularCoreMod.Injector
import typingsJapgolly.atAngularCore.atAngularCoreMod.NgModuleFactoryLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "ɵangular_packages_router_router_f")
@js.native
object ɵangular_packages_router_router_f extends js.Object {
  def apply(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]]
  ): Router = js.native
  def apply(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = js.native
  def apply(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  def apply(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = js.native
}

