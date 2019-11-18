package typingsJapgolly.atAngularRouter.atAngularRouterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivate extends js.Object {
  def canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}

object CanActivate {
  @scala.inline
  def apply(
    canActivate: (ActivatedRouteSnapshot, RouterStateSnapshot) => CallbackTo[
      (Observable[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ]
  ): CanActivate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canActivate")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularRouter.atAngularRouterMod.ActivatedRouteSnapshot, t1: typingsJapgolly.atAngularRouter.atAngularRouterMod.RouterStateSnapshot) => canActivate(t0, t1).runNow()))
    __obj.asInstanceOf[CanActivate]
  }
}

