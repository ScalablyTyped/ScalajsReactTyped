package typingsJapgolly.angularRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanLoad extends js.Object {
  def canLoad(route: Route, segments: js.Array[UrlSegment]): Observable_[Boolean] | js.Promise[Boolean] | Boolean
}

object CanLoad {
  @scala.inline
  def apply(
    canLoad: (Route, js.Array[UrlSegment]) => CallbackTo[Observable_[Boolean] | js.Promise[Boolean] | Boolean]
  ): CanLoad = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canLoad")(js.Any.fromFunction2((t0: typingsJapgolly.angularRouter.mod.Route, t1: js.Array[typingsJapgolly.angularRouter.mod.UrlSegment]) => canLoad(t0, t1).runNow()))
    __obj.asInstanceOf[CanLoad]
  }
}

