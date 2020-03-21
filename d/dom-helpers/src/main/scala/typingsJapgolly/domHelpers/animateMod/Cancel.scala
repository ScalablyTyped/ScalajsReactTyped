package typingsJapgolly.domHelpers.animateMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  def cancel(): Unit
}

object Cancel {
  @scala.inline
  def apply(cancel: Callback): Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[Cancel]
  }
}

