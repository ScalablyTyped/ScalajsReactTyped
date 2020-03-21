package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /**
  	 * Delete button.
  	 */
  var deleteBtn: Element
  /**
  	 * Export to CSV button.
  	 */
  var exportCSVBtn: Element
  /**
  	 * Insert button (to add a row).
  	 */
  var insertBtn: Element
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: Element
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    deleteBtn: VdomElement,
    exportCSVBtn: VdomElement,
    insertBtn: VdomElement,
    showSelectedOnlyBtn: VdomElement
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (deleteBtn != null) __obj.updateDynamic("deleteBtn")(deleteBtn.rawElement.asInstanceOf[js.Any])
    if (exportCSVBtn != null) __obj.updateDynamic("exportCSVBtn")(exportCSVBtn.rawElement.asInstanceOf[js.Any])
    if (insertBtn != null) __obj.updateDynamic("insertBtn")(insertBtn.rawElement.asInstanceOf[js.Any])
    if (showSelectedOnlyBtn != null) __obj.updateDynamic("showSelectedOnlyBtn")(showSelectedOnlyBtn.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

