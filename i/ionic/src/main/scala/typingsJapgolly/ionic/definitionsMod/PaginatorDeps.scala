package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionic.AnonReq
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorDeps[T /* <: Response[js.Array[js.Object]] */, S] extends js.Object {
  val client: IClient
  val max: js.UndefOr[Double] = js.undefined
  val state: js.UndefOr[Partial[S]] = js.undefined
  def guard(res: APIResponseSuccess): /* is T */ Boolean
  def reqgen(): js.Promise[AnonReq]
}

object PaginatorDeps {
  @scala.inline
  def apply[T /* <: Response[js.Array[js.Object]] */, S](
    client: IClient,
    guard: APIResponseSuccess => CallbackTo[/* is T */ Boolean],
    reqgen: CallbackTo[js.Promise[AnonReq]],
    max: Int | Double = null,
    state: Partial[S] = null
  ): PaginatorDeps[T, S] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.updateDynamic("guard")(js.Any.fromFunction1((t0: typingsJapgolly.ionic.definitionsMod.APIResponseSuccess) => guard(t0).runNow()))
    __obj.updateDynamic("reqgen")(reqgen.toJsFn)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorDeps[T, S]]
  }
}

