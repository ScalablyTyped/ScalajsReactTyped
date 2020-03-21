package typingsJapgolly.reactTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionType = typingsJapgolly.reactTable.AnonType with (typingsJapgolly.std.Record[java.lang.String, _])
  type AggregatedValue = js.Any
  type Aggregator[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.AggregatorFn[D] | typingsJapgolly.reactTable.mod.DefaultAggregators | java.lang.String
  type AggregatorFn[D /* <: js.Object */] = js.Function3[
    /* columnValues */ js.Array[typingsJapgolly.reactTable.mod.CellValue], 
    /* rows */ js.Array[typingsJapgolly.reactTable.mod.Row[D]], 
    /* isAggregated */ scala.Boolean, 
    typingsJapgolly.reactTable.mod.AggregatedValue
  ]
  type Cell[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.UseTableCellProps[D]
  type CellPropGetter[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.PropGetter[
    D, 
    typingsJapgolly.reactTable.mod.TableCellProps, 
    typingsJapgolly.reactTable.AnonCell[D], 
    typingsJapgolly.reactTable.PartialTableCellProps
  ]
  type CellValue = js.Any
  type FilterTypes[D /* <: js.Object */] = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.reactTable.mod.FilterValue]
  type FilterValue = js.Any
  type Filters[D /* <: js.Object */] = js.Array[typingsJapgolly.reactTable.AnonId[D]]
  type FooterGroupPropGetter[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.PropGetter[
    D, 
    typingsJapgolly.reactTable.mod.TableFooterGroupProps, 
    typingsJapgolly.reactTable.AnonColumn[D], 
    typingsJapgolly.reactTable.PartialTableFooterGroupPr
  ]
  type FooterPropGetter[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.PropGetter[
    D, 
    typingsJapgolly.reactTable.mod.TableFooterProps, 
    typingsJapgolly.reactTable.AnonColumn[D], 
    typingsJapgolly.reactTable.PartialTableFooterProps
  ]
  type HeaderGroupPropGetter[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.PropGetter[
    D, 
    typingsJapgolly.reactTable.mod.TableHeaderGroupProps, 
    typingsJapgolly.reactTable.AnonColumn[D], 
    typingsJapgolly.reactTable.PartialTableHeaderGroupPr
  ]
  type HeaderPropGetter[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.PropGetter[
    D, 
    typingsJapgolly.reactTable.mod.TableHeaderProps, 
    typingsJapgolly.reactTable.AnonColumn[D], 
    typingsJapgolly.reactTable.PartialTableHeaderProps
  ]
  type Hooks[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.UseTableHooks[D]
  type IdType[D] = typingsJapgolly.reactTable.mod.StringKey[D] | java.lang.String
  type Meta[D /* <: js.Object */, Extension, M] = (M with Extension) | M
  type PropGetter[D /* <: js.Object */, Props, T /* <: js.Object */, P] = (js.Function2[
    /* props */ P, 
    /* meta */ typingsJapgolly.reactTable.mod.Meta[D, T, typingsJapgolly.reactTable.mod.MetaBase[D]], 
    P | js.Array[P]
  ]) | P | js.Array[P]
  type Renderer[Props] = typingsJapgolly.react.mod.ComponentType[Props] | japgolly.scalajs.react.raw.React.Element | typingsJapgolly.react.mod.ReactText | typingsJapgolly.react.mod.ReactFragment
  type Row[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.UseTableRowProps[D]
  type RowPropGetter[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.PropGetter[
    D, 
    typingsJapgolly.reactTable.mod.TableRowProps, 
    typingsJapgolly.reactTable.AnonRow[D], 
    typingsJapgolly.reactTable.PartialTableRowProps
  ]
  type SortByFn[D /* <: js.Object */] = js.Function4[
    /* rowA */ typingsJapgolly.reactTable.mod.Row[D], 
    /* rowB */ typingsJapgolly.reactTable.mod.Row[D], 
    /* columnId */ typingsJapgolly.reactTable.mod.IdType[D], 
    /* desc */ js.UndefOr[scala.Boolean], 
    scala.Double
  ]
  type StringKey[D] = typingsJapgolly.std.Extract[java.lang.String, java.lang.String]
  type TableBodyPropGetter[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.PropGetter[
    D, 
    typingsJapgolly.reactTable.mod.TableBodyProps, 
    scala.Nothing, 
    typingsJapgolly.reactTable.PartialTableBodyProps
  ]
  type TableBodyProps = typingsJapgolly.reactTable.mod.TableCommonProps
  type TableCellProps = typingsJapgolly.reactTable.mod.TableKeyedProps
  type TableDispatch[A] = js.Function1[/* action */ A, scala.Unit]
  type TableExpandedToggleProps = typingsJapgolly.reactTable.mod.TableKeyedProps
  type TableFooterGroupProps = typingsJapgolly.reactTable.mod.TableKeyedProps
  type TableFooterProps = typingsJapgolly.reactTable.mod.TableKeyedProps
  type TableHeaderGroupProps = typingsJapgolly.reactTable.mod.TableKeyedProps
  type TableHeaderProps = typingsJapgolly.reactTable.mod.TableKeyedProps
  type TableOptions[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.UseTableOptions[D]
  type TablePropGetter[D /* <: js.Object */] = typingsJapgolly.reactTable.mod.PropGetter[
    D, 
    typingsJapgolly.reactTable.mod.TableProps, 
    scala.Nothing, 
    typingsJapgolly.reactTable.PartialTableProps
  ]
  type TableProps = typingsJapgolly.reactTable.mod.TableCommonProps
  type TableRowProps = typingsJapgolly.reactTable.mod.TableKeyedProps
  type TableToggleAllRowsSelectedProps = typingsJapgolly.reactTable.mod.TableToggleCommonProps
  type TableToggleHideAllColumnProps = typingsJapgolly.reactTable.mod.TableToggleCommonProps
  type TableToggleRowsSelectedProps = typingsJapgolly.reactTable.mod.TableToggleCommonProps
  type UpdateHiddenColumns[D /* <: js.Object */] = js.Function1[
    /* oldHidden */ js.Array[typingsJapgolly.reactTable.mod.IdType[D]], 
    js.Array[typingsJapgolly.reactTable.mod.IdType[D]]
  ]
  type UseRowStateLocalState[D /* <: js.Object */, T] = typingsJapgolly.std.Record[typingsJapgolly.reactTable.mod.IdType[D], T]
  type UseRowUpdater[T] = T | (js.Function1[/* prev */ T, T])
}
