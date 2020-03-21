package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogAction extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var text: String
}

object DialogAction {
  @scala.inline
  def apply(
    text: String,
    id: String = null,
    onClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    ref: String = null
  ): DialogAction = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAction]
  }
}

