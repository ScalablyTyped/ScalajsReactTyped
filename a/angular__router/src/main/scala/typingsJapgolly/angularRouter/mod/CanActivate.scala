package typingsJapgolly.angularRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivate extends js.Object {
  def canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}

object CanActivate {
  @scala.inline
  def apply(
    canActivate: (ActivatedRouteSnapshot, RouterStateSnapshot) => CallbackTo[
      (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ]
  ): CanActivate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canActivate")(js.Any.fromFunction2((t0: typingsJapgolly.angularRouter.mod.ActivatedRouteSnapshot, t1: typingsJapgolly.angularRouter.mod.RouterStateSnapshot) => canActivate(t0, t1).runNow()))
    __obj.asInstanceOf[CanActivate]
  }
}

