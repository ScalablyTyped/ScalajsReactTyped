package typingsJapgolly.reactAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /**
    * Index of the highlighted item, `null` if none currently is.
    */
  var highlightedIndex: Double | Null
  /**
    * True when the menu is visible. Provided to `onMenuVisibilityChange`.
    */
  var isOpen: Boolean
  /**
    * These three `menu___` values are used in CSS to layout the menu.
    */
  var menuLeft: js.UndefOr[Double] = js.undefined
  var menuTop: js.UndefOr[Double] = js.undefined
  var menuWidth: js.UndefOr[Double] = js.undefined
}

object State {
  @scala.inline
  def apply(
    isOpen: Boolean,
    highlightedIndex: Int | Double = null,
    menuLeft: Int | Double = null,
    menuTop: Int | Double = null,
    menuWidth: Int | Double = null
  ): State = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (menuLeft != null) __obj.updateDynamic("menuLeft")(menuLeft.asInstanceOf[js.Any])
    if (menuTop != null) __obj.updateDynamic("menuTop")(menuTop.asInstanceOf[js.Any])
    if (menuWidth != null) __obj.updateDynamic("menuWidth")(menuWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

