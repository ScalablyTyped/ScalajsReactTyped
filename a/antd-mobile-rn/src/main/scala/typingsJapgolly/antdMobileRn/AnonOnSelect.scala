package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnSelect extends js.Object {
  def onSelect(): Unit
}

object AnonOnSelect {
  @scala.inline
  def apply(onSelect: Callback): AnonOnSelect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSelect")(onSelect.toJsFn)
    __obj.asInstanceOf[AnonOnSelect]
  }
}

