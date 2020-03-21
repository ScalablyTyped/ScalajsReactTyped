package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardNavigation extends js.Object {
  /**
  	 * Set to false to disable click to navigate, usually user wants to click to select row instead of navigation.
  	 */
  var clickToNav: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Return a style object which will be applied on the navigating cell.
  	 */
  var customStyle: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, CSSProperties]] = js.undefined
  /**
  	 * Return a style object which will be applied on the both of navigating and editing cell.
  	 */
  var customStyleOnEditCell: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, CSSProperties]] = js.undefined
  /**
  	 * When set to true, pressing ENTER will begin to edit the cell if cellEdit is also enabled.
  	 */
  var enterToEdit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * When set to true, pressing ENTER will expand or collapse the current row.
  	 */
  var enterToExpand: js.UndefOr[Boolean] = js.undefined
  /**
  	 * When set to true, pressing ENTER will select or unselect the current row.
  	 */
  var enterToSelect: js.UndefOr[Boolean] = js.undefined
}

object KeyboardNavigation {
  @scala.inline
  def apply(
    clickToNav: js.UndefOr[Boolean] = js.undefined,
    customStyle: (/* cell */ js.Any, /* row */ js.Any) => CallbackTo[CSSProperties] = null,
    customStyleOnEditCell: (/* cell */ js.Any, /* row */ js.Any) => CallbackTo[CSSProperties] = null,
    enterToEdit: js.UndefOr[Boolean] = js.undefined,
    enterToExpand: js.UndefOr[Boolean] = js.undefined,
    enterToSelect: js.UndefOr[Boolean] = js.undefined
  ): KeyboardNavigation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickToNav)) __obj.updateDynamic("clickToNav")(clickToNav.asInstanceOf[js.Any])
    if (customStyle != null) __obj.updateDynamic("customStyle")(js.Any.fromFunction2((t0: /* cell */ js.Any, t1: /* row */ js.Any) => customStyle(t0, t1).runNow()))
    if (customStyleOnEditCell != null) __obj.updateDynamic("customStyleOnEditCell")(js.Any.fromFunction2((t0: /* cell */ js.Any, t1: /* row */ js.Any) => customStyleOnEditCell(t0, t1).runNow()))
    if (!js.isUndefined(enterToEdit)) __obj.updateDynamic("enterToEdit")(enterToEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(enterToExpand)) __obj.updateDynamic("enterToExpand")(enterToExpand.asInstanceOf[js.Any])
    if (!js.isUndefined(enterToSelect)) __obj.updateDynamic("enterToSelect")(enterToSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardNavigation]
  }
}

