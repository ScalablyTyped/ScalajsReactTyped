package typingsJapgolly.reactInteractive.mod

import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactInteractive.AnonFocus
  - typingsJapgolly.reactInteractive.AnonFocusFromMouse
*/
trait FocusProps extends js.Object

object FocusProps {
  @scala.inline
  def AnonFocus(focus: CSSProperties = null): FocusProps = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusProps]
  }
  @scala.inline
  def AnonFocusFromMouse(
    focusFromMouse: CSSProperties = null,
    focusFromTab: CSSProperties = null,
    focusFromTouch: CSSProperties = null
  ): FocusProps = {
    val __obj = js.Dynamic.literal()
    if (focusFromMouse != null) __obj.updateDynamic("focusFromMouse")(focusFromMouse.asInstanceOf[js.Any])
    if (focusFromTab != null) __obj.updateDynamic("focusFromTab")(focusFromTab.asInstanceOf[js.Any])
    if (focusFromTouch != null) __obj.updateDynamic("focusFromTouch")(focusFromTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusProps]
  }
}

