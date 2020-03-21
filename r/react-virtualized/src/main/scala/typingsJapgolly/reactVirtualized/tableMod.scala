package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactVirtualized.esTableMod.MultiSortOptions
import typingsJapgolly.reactVirtualized.esTableMod.MultiSortReturn
import typingsJapgolly.reactVirtualized.esTableMod.SortDirectionStatic
import typingsJapgolly.reactVirtualized.esTableMod.TableCellDataGetter
import typingsJapgolly.reactVirtualized.esTableMod.TableCellRenderer
import typingsJapgolly.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typingsJapgolly.reactVirtualized.esTableMod.TableRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
  @js.native
  class Column ()
    extends typingsJapgolly.reactVirtualized.esTableMod.Column
  
  @js.native
  class Table ()
    extends typingsJapgolly.reactVirtualized.esTableMod.Table
  
  val SortDirection: SortDirectionStatic = js.native
  val SortIndicator: StatelessComponent[AnonSortDirection] = js.native
  val defaultCellDataGetter: TableCellDataGetter = js.native
  val defaultCellRenderer: TableCellRenderer = js.native
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  val defaultRowRenderer: TableRowRenderer = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ AnonSortBy, Unit]): MultiSortReturn = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ AnonSortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  def defaultHeaderRenderer(): js.Array[Element] = js.native
  /* static members */
  @js.native
  object Column extends js.Object {
    var defaultProps: AnonCellRenderer = js.native
    var propTypes: AnonCellDataGetter = js.native
  }
  
  /* static members */
  @js.native
  object Table extends js.Object {
    var defaultProps: AnonDisableHeader = js.native
    var propTypes: AnonClassName = js.native
  }
  
}

