package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOM extends js.Object {
  /**
    * Manually update the dom with the current record set...
    * This can be useful after multiple calls to `domcolumns.add()` with `skipUpdate` set to true.
    * This way we improve performance by generating the DOM only once.
    */
  def update(): Unit
}

object DOM {
  @scala.inline
  def apply(update: Callback): DOM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[DOM]
  }
}

