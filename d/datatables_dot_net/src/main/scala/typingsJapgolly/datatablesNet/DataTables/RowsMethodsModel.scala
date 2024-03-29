package typingsJapgolly.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowsMethodsModel extends StObject {
  
  /**
    * Select all rows
    *
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  def apply(): RowsMethods = js.native
  def apply(modifier: ObjectSelectorModifier): RowsMethods = js.native
  def apply(rowSelector: Any): RowsMethods = js.native
  def apply(rowSelector: Any, modifier: ObjectSelectorModifier): RowsMethods = js.native
  def apply(rowSelector: Unit, modifier: ObjectSelectorModifier): RowsMethods = js.native
  
  /**
    * Add new rows to the table using the data given
    *
    * @param data Array of data elements, with each one describing a new row to be added to the table
    */
  def add(data: js.Array[Any]): Api = js.native
}
