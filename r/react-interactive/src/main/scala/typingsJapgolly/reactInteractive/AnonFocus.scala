package typingsJapgolly.reactInteractive

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactInteractive.mod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocus extends FocusProps {
  var focus: js.UndefOr[CSSProperties] = js.undefined
}

object AnonFocus {
  @scala.inline
  def apply(focus: CSSProperties = null): AnonFocus = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocus]
  }
}

