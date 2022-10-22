package typingsJapgolly.reactBootstrapTable.anon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-bootstrap-table.react-bootstrap-table.ButtonGroupProps & {  searchPanel :react.react.ReactElement,   btnGroup :react.react.ReactElement,   searchField :react.react.ReactElement,   clearBtn :react.react.ReactElement} */
trait ButtonGroupPropssearchPan extends StObject {
  
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
  
  inline def apply(
    btnGroup: VdomElement,
    clearBtn: VdomElement,
    deleteBtn: VdomElement,
    exportCSVBtn: VdomElement,
    insertBtn: VdomElement,
    searchField: VdomElement,
    searchPanel: VdomElement,
    showSelectedOnlyBtn: VdomElement
  ): ButtonGroupPropssearchPan = {
    val __obj = js.Dynamic.literal(btnGroup = btnGroup.rawElement.asInstanceOf[js.Any], clearBtn = clearBtn.rawElement.asInstanceOf[js.Any], deleteBtn = deleteBtn.rawElement.asInstanceOf[js.Any], exportCSVBtn = exportCSVBtn.rawElement.asInstanceOf[js.Any], insertBtn = insertBtn.rawElement.asInstanceOf[js.Any], searchField = searchField.rawElement.asInstanceOf[js.Any], searchPanel = searchPanel.rawElement.asInstanceOf[js.Any], showSelectedOnlyBtn = showSelectedOnlyBtn.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupPropssearchPan]
  }
  
  extension [Self <: ButtonGroupPropssearchPan](x: Self) {
    
    inline def setBtnGroup(value: VdomElement): Self = StObject.set(x, "btnGroup", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClearBtn(value: VdomElement): Self = StObject.set(x, "clearBtn", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDeleteBtn(value: VdomElement): Self = StObject.set(x, "deleteBtn", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExportCSVBtn(value: VdomElement): Self = StObject.set(x, "exportCSVBtn", value.rawElement.asInstanceOf[js.Any])
    
    inline def setInsertBtn(value: VdomElement): Self = StObject.set(x, "insertBtn", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSearchField(value: VdomElement): Self = StObject.set(x, "searchField", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSearchPanel(value: VdomElement): Self = StObject.set(x, "searchPanel", value.rawElement.asInstanceOf[js.Any])
    
    inline def setShowSelectedOnlyBtn(value: VdomElement): Self = StObject.set(x, "showSelectedOnlyBtn", value.rawElement.asInstanceOf[js.Any])
  }
}
