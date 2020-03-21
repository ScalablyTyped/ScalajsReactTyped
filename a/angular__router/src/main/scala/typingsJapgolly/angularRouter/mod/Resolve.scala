package typingsJapgolly.angularRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve[T] extends js.Object {
  def resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable_[T] | js.Promise[T] | T
}

object Resolve {
  @scala.inline
  def apply[T](
    resolve: (ActivatedRouteSnapshot, RouterStateSnapshot) => CallbackTo[Observable_[T] | js.Promise[T] | T]
  ): Resolve[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(js.Any.fromFunction2((t0: typingsJapgolly.angularRouter.mod.ActivatedRouteSnapshot, t1: typingsJapgolly.angularRouter.mod.RouterStateSnapshot) => resolve(t0, t1).runNow()))
    __obj.asInstanceOf[Resolve[T]]
  }
}

