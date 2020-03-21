package typingsJapgolly.ionic

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionic.definitionsMod.APIResponseSuccess
import typingsJapgolly.ionic.definitionsMod.App
import typingsJapgolly.ionic.definitionsMod.PaginatorGuard
import typingsJapgolly.ionic.definitionsMod.PaginatorRequestGenerator
import typingsJapgolly.ionic.definitionsMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.PaginateArgs<ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.App>>>> */
trait PartialPaginateArgsRespon extends js.Object {
  var guard: js.UndefOr[PaginatorGuard[Response[js.Array[App]]]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var reqgen: js.UndefOr[PaginatorRequestGenerator] = js.undefined
  var state: js.UndefOr[PartialPaginatorState] = js.undefined
}

object PartialPaginateArgsRespon {
  @scala.inline
  def apply(
    guard: /* res */ APIResponseSuccess => CallbackTo[/* is T */ Boolean] = null,
    max: Int | Double = null,
    reqgen: js.UndefOr[CallbackTo[js.Promise[AnonReq]]] = js.undefined,
    state: PartialPaginatorState = null
  ): PartialPaginateArgsRespon = {
    val __obj = js.Dynamic.literal()
    if (guard != null) __obj.updateDynamic("guard")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.ionic.definitionsMod.APIResponseSuccess) => guard(t0).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    reqgen.foreach(p => __obj.updateDynamic("reqgen")(p.toJsFn))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPaginateArgsRespon]
  }
}

