package typingsJapgolly.atAngularRouter.atAngularRouterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve[T] extends js.Object {
  def resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable[T] | js.Promise[T] | T
}

object Resolve {
  @scala.inline
  def apply[T](
    resolve: (ActivatedRouteSnapshot, RouterStateSnapshot) => CallbackTo[Observable[T] | js.Promise[T] | T]
  ): Resolve[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularRouter.atAngularRouterMod.ActivatedRouteSnapshot, t1: typingsJapgolly.atAngularRouter.atAngularRouterMod.RouterStateSnapshot) => resolve(t0, t1).runNow()))
    __obj.asInstanceOf[Resolve[T]]
  }
}

