package typingsJapgolly.angularRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanActivateChild extends js.Object {
  def canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
}

object CanActivateChild {
  @scala.inline
  def apply(
    canActivateChild: (ActivatedRouteSnapshot, RouterStateSnapshot) => CallbackTo[
      (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ]
  ): CanActivateChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canActivateChild")(js.Any.fromFunction2((t0: typingsJapgolly.angularRouter.mod.ActivatedRouteSnapshot, t1: typingsJapgolly.angularRouter.mod.RouterStateSnapshot) => canActivateChild(t0, t1).runNow()))
    __obj.asInstanceOf[CanActivateChild]
  }
}

