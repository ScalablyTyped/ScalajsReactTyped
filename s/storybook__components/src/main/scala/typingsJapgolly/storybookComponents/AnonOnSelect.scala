package typingsJapgolly.storybookComponents

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnSelect extends js.Object {
  def onSelect(id: String): Unit = js.native
}

object AnonOnSelect {
  @scala.inline
  def apply(onSelect: String => Callback): AnonOnSelect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: java.lang.String) => onSelect(t0).runNow()))
    __obj.asInstanceOf[AnonOnSelect]
  }
}

