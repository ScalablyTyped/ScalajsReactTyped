package typingsJapgolly.detectHover.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectHover extends js.Object {
  var anyHover: Boolean
  var anyNone: Boolean
  var hover: Boolean
  var none: Boolean
  def update(): Unit
}

object detectHover {
  @scala.inline
  def apply(anyHover: Boolean, anyNone: Boolean, hover: Boolean, none: Boolean, update: Callback): detectHover = {
    val __obj = js.Dynamic.literal(anyHover = anyHover.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[detectHover]
  }
}

