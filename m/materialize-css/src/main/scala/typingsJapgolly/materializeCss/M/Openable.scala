package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Openable extends js.Object {
  var isOpen: Boolean
  def close(): Unit
  def open(): Unit
}

object Openable {
  @scala.inline
  def apply(close: Callback, isOpen: Boolean, open: Callback): Openable = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.asInstanceOf[Openable]
  }
}

