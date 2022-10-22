package typingsJapgolly.reactBootstrapTable.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseInsertModal extends StObject {
  
  /**
    * Callback to close the insert row modal window.
    */
  def closeInsertModal(): Unit
  
  /**
    * Callback to delete selected row(s) from the table.
    */
  def dropRow(): Unit
  
  /**
    * Callback to export the table to a CSV file.
    */
  def exportCSV(): Unit
  
  /**
    * Callback to activate the insert row modal window.
    */
  def openInsertModal(): Unit
  
  /**
    * Callback to apply a search.
    */
  def search(): Unit
  
  /**
    * Callback to toggle between showing all rows and showing only selected rows.
    */
  def showOnlyToogle(): Unit
}
object CloseInsertModal {
  
  inline def apply(
    closeInsertModal: Callback,
    dropRow: Callback,
    exportCSV: Callback,
    openInsertModal: Callback,
    search: Callback,
    showOnlyToogle: Callback
  ): CloseInsertModal = {
    val __obj = js.Dynamic.literal(closeInsertModal = closeInsertModal.toJsFn, dropRow = dropRow.toJsFn, exportCSV = exportCSV.toJsFn, openInsertModal = openInsertModal.toJsFn, search = search.toJsFn, showOnlyToogle = showOnlyToogle.toJsFn)
    __obj.asInstanceOf[CloseInsertModal]
  }
  
  extension [Self <: CloseInsertModal](x: Self) {
    
    inline def setCloseInsertModal(value: Callback): Self = StObject.set(x, "closeInsertModal", value.toJsFn)
    
    inline def setDropRow(value: Callback): Self = StObject.set(x, "dropRow", value.toJsFn)
    
    inline def setExportCSV(value: Callback): Self = StObject.set(x, "exportCSV", value.toJsFn)
    
    inline def setOpenInsertModal(value: Callback): Self = StObject.set(x, "openInsertModal", value.toJsFn)
    
    inline def setSearch(value: Callback): Self = StObject.set(x, "search", value.toJsFn)
    
    inline def setShowOnlyToogle(value: Callback): Self = StObject.set(x, "showOnlyToogle", value.toJsFn)
  }
}
