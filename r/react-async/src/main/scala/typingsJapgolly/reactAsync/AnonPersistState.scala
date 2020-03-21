package typingsJapgolly.reactAsync

import typingsJapgolly.reactAsync.mod.AsyncState
import typingsJapgolly.reactAsync.mod.FulfilledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPersistState[T] extends js.Object {
  var children: js.UndefOr[FulfilledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object AnonPersistState {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: FulfilledChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): AnonPersistState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPersistState[T]]
  }
}

