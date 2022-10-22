package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonGroupProps extends StObject {
  
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
  
  inline def apply(
    deleteBtn: VdomElement,
    exportCSVBtn: VdomElement,
    insertBtn: VdomElement,
    showSelectedOnlyBtn: VdomElement
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(deleteBtn = deleteBtn.rawElement.asInstanceOf[js.Any], exportCSVBtn = exportCSVBtn.rawElement.asInstanceOf[js.Any], insertBtn = insertBtn.rawElement.asInstanceOf[js.Any], showSelectedOnlyBtn = showSelectedOnlyBtn.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
  
  extension [Self <: ButtonGroupProps](x: Self) {
    
    inline def setDeleteBtn(value: VdomElement): Self = StObject.set(x, "deleteBtn", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExportCSVBtn(value: VdomElement): Self = StObject.set(x, "exportCSVBtn", value.rawElement.asInstanceOf[js.Any])
    
    inline def setInsertBtn(value: VdomElement): Self = StObject.set(x, "insertBtn", value.rawElement.asInstanceOf[js.Any])
    
    inline def setShowSelectedOnlyBtn(value: VdomElement): Self = StObject.set(x, "showSelectedOnlyBtn", value.rawElement.asInstanceOf[js.Any])
  }
}
