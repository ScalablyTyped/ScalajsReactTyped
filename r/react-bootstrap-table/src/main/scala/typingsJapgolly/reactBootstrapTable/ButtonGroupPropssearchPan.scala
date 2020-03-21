package typingsJapgolly.reactBootstrapTable

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-bootstrap-table.react-bootstrap-table.ButtonGroupProps & {  searchPanel  :react.react.ReactElement,   btnGroup  :react.react.ReactElement,   searchField  :react.react.ReactElement,   clearBtn  :react.react.ReactElement} */
trait ButtonGroupPropssearchPan extends js.Object {
  /**
  		 * Button group components.
  		 */
  var btnGroup: Element
   // search field JSX
  /**
  		 * The button to clear the search field.
  		 */
  var clearBtn: Element
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
   // button groups JSX
  /**
  		 * The individual search field.
  		 */
  var searchField: Element
  /**
  		 * Search panel component.
  		 */
  var searchPanel: Element
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: Element
}

object ButtonGroupPropssearchPan {
  @scala.inline
  def apply(
    btnGroup: VdomElement,
    clearBtn: VdomElement,
    deleteBtn: VdomElement,
    exportCSVBtn: VdomElement,
    insertBtn: VdomElement,
    searchField: VdomElement,
    searchPanel: VdomElement,
    showSelectedOnlyBtn: VdomElement
  ): ButtonGroupPropssearchPan = {
    val __obj = js.Dynamic.literal()
    if (btnGroup != null) __obj.updateDynamic("btnGroup")(btnGroup.rawElement.asInstanceOf[js.Any])
    if (clearBtn != null) __obj.updateDynamic("clearBtn")(clearBtn.rawElement.asInstanceOf[js.Any])
    if (deleteBtn != null) __obj.updateDynamic("deleteBtn")(deleteBtn.rawElement.asInstanceOf[js.Any])
    if (exportCSVBtn != null) __obj.updateDynamic("exportCSVBtn")(exportCSVBtn.rawElement.asInstanceOf[js.Any])
    if (insertBtn != null) __obj.updateDynamic("insertBtn")(insertBtn.rawElement.asInstanceOf[js.Any])
    if (searchField != null) __obj.updateDynamic("searchField")(searchField.rawElement.asInstanceOf[js.Any])
    if (searchPanel != null) __obj.updateDynamic("searchPanel")(searchPanel.rawElement.asInstanceOf[js.Any])
    if (showSelectedOnlyBtn != null) __obj.updateDynamic("showSelectedOnlyBtn")(showSelectedOnlyBtn.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupPropssearchPan]
  }
}

