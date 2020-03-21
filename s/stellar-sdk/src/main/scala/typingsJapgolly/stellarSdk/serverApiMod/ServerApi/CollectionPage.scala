package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionPage[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T]
  def next(): js.Promise[CollectionPage[T]]
  def prev(): js.Promise[CollectionPage[T]]
}

object CollectionPage {
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](
    next: CallbackTo[js.Promise[CollectionPage[T]]],
    prev: CallbackTo[js.Promise[CollectionPage[T]]],
    records: js.Array[T]
  ): CollectionPage[T] = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.asInstanceOf[CollectionPage[T]]
  }
}

