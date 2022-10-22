package typingsJapgolly.primereact.datatableDatatableMod

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLTableElement
import typingsJapgolly.primereact.anon.SelectionOnly
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScroller
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact/datatable/datatable", "DataTable")
@js.native
open class DataTable protected () extends Component[DataTableProps, Any, Any] {
  def this(props: DataTableProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: DataTableProps, context: Any) = this()
  
  def clearState(): Unit = js.native
  
  def closeEditingCell(): Unit = js.native
  
  def exportCSV(): Unit = js.native
  def exportCSV(options: SelectionOnly): Unit = js.native
  
  def filter[T](value: T, field: String, mode: DataTableFilterMatchModeType): Unit = js.native
  def filter[T](value: T, field: String, mode: DataTableFilterMatchModeType, index: Double): Unit = js.native
  
  def getElement(): HTMLDivElement = js.native
  
  def getTable(): HTMLTableElement = js.native
  
  def getVirtualScroller(): VirtualScroller = js.native
  
  def reset(): Unit = js.native
  
  def resetColumnOrder(): Unit = js.native
  
  def resetScroll(): Unit = js.native
  
  def restoreTableState(state: Any): Unit = js.native
}
