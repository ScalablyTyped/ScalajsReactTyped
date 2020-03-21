package typingsJapgolly.blueprintjsTable.columnMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsTable.cellMod.ICellRenderer
import typingsJapgolly.blueprintjsTable.columnHeaderCellMod.IColumnNameProps
import typingsJapgolly.blueprintjsTable.columnHeaderMod.IColumnHeaderRenderer
import typingsJapgolly.blueprintjsTable.esmRegionsMod.ColumnLoadingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnProps
  extends IColumnNameProps
     with IProps {
  /**
    * An instance of `ICellRenderer`, a function that takes a row and column
    * index, and returns a `Cell` React element.
    */
  var cellRenderer: js.UndefOr[ICellRenderer] = js.undefined
  /**
    * An instance of `IColumnHeaderRenderer`, a function that takes a column
    * index and returns a `ColumnHeaderCell` React element.
    */
  var columnHeaderCellRenderer: js.UndefOr[IColumnHeaderRenderer] = js.undefined
  /**
    * A unique ID, similar to React's `key`. This is used, for example, to
    * maintain the width of a column between re-ordering and rendering. If no
    * IDs are provided, widths will be persisted across renders using a
    * column's index only. Columns widths can also be persisted outside the
    * `Table` component, then passed in with the `columnWidths` prop.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * Set this prop to specify whether to render the loading state of the
    * column header and cells in this column. Column-level `loadingOptions`
    * override `Table`-level `loadingOptions`. For example, if you set
    * `loadingOptions=[ TableLoadingOption.CELLS ]` on `Table` and
    * `loadingOptions=[ ColumnLoadingOption.HEADER ]` on a `Column`, the cells
    * in that column will _not_ show their loading state.
    */
  var loadingOptions: js.UndefOr[js.Array[ColumnLoadingOption]] = js.undefined
}

object IColumnProps {
  @scala.inline
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => CallbackTo[Element] = null,
    className: String = null,
    columnHeaderCellRenderer: /* columnIndex */ Double => CallbackTo[Element] = null,
    id: String | Double = null,
    loadingOptions: js.Array[ColumnLoadingOption] = null,
    name: String = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => CallbackTo[Element] = null
  ): IColumnProps = {
    val __obj = js.Dynamic.literal()
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double) => cellRenderer(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1((t0: /* columnIndex */ scala.Double) => columnHeaderCellRenderer(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* index */ js.UndefOr[scala.Double]) => nameRenderer(t0, t1).runNow()))
    __obj.asInstanceOf[IColumnProps]
  }
}

