package typingsJapgolly.jqueryFiltertable

import typingsJapgolly.jqueryFiltertable.FilterTable.FilterTableOptions
import typingsJapgolly.jqueryFiltertable.FilterTable.FilterTableStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * init with default options
    * @returns {JQuery}
    */
  /**
    * if this code appears after your tables; otherwise, include it in your document.ready() code.
    * $('table').filterTable()
    */
  def filterTable(): JQuery
  /**
    * init with custom options
    * @param options
    * @returns {JQuery}
    */
  /**
    * if this code appears after your tables; otherwise, include it in your document.ready() code.
    * $('table').filterTable()
    */
  def filterTable(options: FilterTableOptions): JQuery
  /**
    * if this code appears after your tables; otherwise, include it in your document.ready() code.
    * $('table').filterTable()
    */
  @JSName("filterTable")
  var filterTable_Original: FilterTableStatic
}
object JQuery {
  
  inline def apply(filterTable: FilterTableStatic): JQuery = {
    val __obj = js.Dynamic.literal(filterTable = filterTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setFilterTable(value: FilterTableStatic): Self = StObject.set(x, "filterTable", value.asInstanceOf[js.Any])
  }
}
