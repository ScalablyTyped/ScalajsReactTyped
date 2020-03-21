package typingsJapgolly.subscribeUiEvent

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove extends js.Object {
  def remove(): Unit
}

object AnonRemove {
  @scala.inline
  def apply(remove: Callback): AnonRemove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[AnonRemove]
  }
}

