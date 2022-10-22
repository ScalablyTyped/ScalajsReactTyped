package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.EffectCallback
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.reactTable.anon.Data
import typingsJapgolly.reactTable.anon.Header
import typingsJapgolly.reactTable.anon.Id
import typingsJapgolly.reactTable.anon.IdIdType
import typingsJapgolly.reactTable.anon.PartialTableBodyProps
import typingsJapgolly.reactTable.anon.PartialTableCellProps
import typingsJapgolly.reactTable.anon.PartialTableFooterGroupPr
import typingsJapgolly.reactTable.anon.PartialTableFooterProps
import typingsJapgolly.reactTable.anon.PartialTableHeaderGroupPr
import typingsJapgolly.reactTable.anon.PartialTableHeaderProps
import typingsJapgolly.reactTable.anon.PartialTableProps
import typingsJapgolly.reactTable.anon.PartialTableRowProps
import typingsJapgolly.reactTable.anon.Type
import typingsJapgolly.reactTable.anon.Value
import typingsJapgolly.reactTable.anon.`0`
import typingsJapgolly.reactTable.anon.`1`
import typingsJapgolly.reactTable.mod.^
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def actions: Record[String, String] = ^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[Record[String, String]]

inline def defaultColumn: Partial[Column[js.Object]] & (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultColumn").asInstanceOf[Partial[Column[js.Object]] & (Record[String, Any])]

inline def defaultGroupByFn[D /* <: js.Object */](rows: js.Array[Row[D]], columnId: IdType[D]): Record[String, js.Array[Row[D]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGroupByFn")(rows.asInstanceOf[js.Any], columnId.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Row[D]]]]

inline def defaultOrderByFn[D /* <: js.Object */](arr: js.Array[Row[D]], funcs: js.Array[OrderByFn[D]], dirs: js.Array[Boolean]): js.Array[Row[D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultOrderByFn")(arr.asInstanceOf[js.Any], funcs.asInstanceOf[js.Any], dirs.asInstanceOf[js.Any])).asInstanceOf[js.Array[Row[D]]]

inline def ensurePluginOrder[D /* <: js.Object */](plugins: js.Array[PluginHook[D]], befores: js.Array[String], pluginName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePluginOrder")(plugins.asInstanceOf[js.Any], befores.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def functionalUpdate[D /* <: js.Object */](updater: Any, old: Partial[TableState[D]]): Partial[TableState[D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("functionalUpdate")(updater.asInstanceOf[js.Any], old.asInstanceOf[js.Any])).asInstanceOf[Partial[TableState[D]]]

inline def loopHooks(hooks: Hooks[js.Object], args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loopHooks")(scala.List(hooks.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]

inline def makePropGetter(hooks: Hooks[js.Object], meta: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropGetter")(scala.List(hooks.asInstanceOf[js.Any]).`++`(meta.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]

inline def makeRenderer(instance: TableInstance[js.Object], column: ColumnInstance[js.Object]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRenderer")(instance.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def makeRenderer(instance: TableInstance[js.Object], column: ColumnInstance[js.Object], meta: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRenderer")(instance.asInstanceOf[js.Any], column.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[Element]

inline def reduceHooks[T /* <: js.Object */](hooks: Hooks[js.Object], initial: T, args: Any*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceHooks")((scala.List(hooks.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[T]

inline def safeUseLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("safeUseLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def safeUseLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeUseLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useAsyncDebounce[F /* <: js.Function1[/* repeated */ Any, Any] */](defaultFn: F): F = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncDebounce")(defaultFn.asInstanceOf[js.Any]).asInstanceOf[F]
inline def useAsyncDebounce[F /* <: js.Function1[/* repeated */ Any, Any] */](defaultFn: F, defaultWait: Double): F = (^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncDebounce")(defaultFn.asInstanceOf[js.Any], defaultWait.asInstanceOf[js.Any])).asInstanceOf[F]

inline def useGetLatest[T](obj: T): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGetLatest")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]

inline def useMountedLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMountedLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useMountedLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useMountedLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useTable[D /* <: js.Object */](options: TableOptions[D], plugins: PluginHook[D]*): TableInstance[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTable")(scala.List(options.asInstanceOf[js.Any]).`++`(plugins.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TableInstance[D]]

type Accessor[D /* <: js.Object */] = js.Function3[/* originalRow */ D, /* index */ Double, /* sub */ Data[D], CellValue[Any]]

type ActionType = Type & (Record[String, Any])

type AggregatedValue = Any

type Aggregator[D /* <: js.Object */] = AggregatorFn[D] | DefaultAggregators | String

type AggregatorFn[D /* <: js.Object */] = js.Function3[
/* columnValues */ js.Array[CellValue[Any]], 
/* rows */ js.Array[Row[D]], 
/* isAggregated */ Boolean, 
AggregatedValue]

type Cell[D /* <: js.Object */, V] = UseTableCellProps[D, V]

type CellPropGetter[D /* <: js.Object */] = PropGetter[D, TableCellProps, typingsJapgolly.reactTable.anon.Cell[D], PartialTableCellProps]

type CellValue[V] = V

type Column[D /* <: js.Object */] = ColumnGroup[D] | ColumnWithLooseAccessor[D] | ColumnWithStrictAccessor[D]

type ColumnGroup[D /* <: js.Object */] = (Header & ColumnInterface[D] & ColumnGroupInterface[D] & typingsJapgolly.reactTable.anon.Accessor[D]) | (Id[D] & ColumnInterface[D] & ColumnGroupInterface[D] & typingsJapgolly.reactTable.anon.Accessor[D])

type ColumnInterface[D /* <: js.Object */] = UseTableColumnOptions[D]

type ColumnWithLooseAccessor[D /* <: js.Object */] = (Header & ColumnInterface[D] & (ColumnInterfaceBasedOnValue[D, Any]) & `0`[D]) | (IdIdType[D] & ColumnInterface[D] & (ColumnInterfaceBasedOnValue[D, Any]) & `0`[D]) | (`1`[D] & ColumnInterface[D] & (ColumnInterfaceBasedOnValue[D, Any]) & `0`[D])

type ColumnWithStrictAccessor[D /* <: js.Object */] = ColumnInterface[D] & (ValueOf[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof D ]: {  accessor :K} & react-table.react-table.ColumnInterfaceBasedOnValue<D, D[K]>} */ js.Any])

type FilterProps[D /* <: js.Object */] = HeaderProps[D]

type FilterTypes[D /* <: js.Object */] = Record[String, FilterType[D]]

type FilterValue = Any

type Filters[D /* <: js.Object */] = js.Array[Value[D]]

type FooterGroupPropGetter[D /* <: js.Object */] = PropGetter[
D, 
TableFooterGroupProps, 
typingsJapgolly.reactTable.anon.Column[D], 
PartialTableFooterGroupPr]

type FooterPropGetter[D /* <: js.Object */] = PropGetter[
D, 
TableFooterProps, 
typingsJapgolly.reactTable.anon.Column[D], 
PartialTableFooterProps]

type HeaderGroupPropGetter[D /* <: js.Object */] = PropGetter[
D, 
TableHeaderGroupProps, 
typingsJapgolly.reactTable.anon.Column[D], 
PartialTableHeaderGroupPr]

type HeaderPropGetter[D /* <: js.Object */] = PropGetter[
D, 
TableHeaderProps, 
typingsJapgolly.reactTable.anon.Column[D], 
PartialTableHeaderProps]

type Hooks[D /* <: js.Object */] = UseTableHooks[D]

type IdType[D] = StringKey[D] | String

type OrderByFn[D /* <: js.Object */] = js.Function2[/* rowA */ Row[D], /* rowB */ Row[D], Double]

type PropGetter[D /* <: js.Object */, Props, T /* <: js.Object */, P] = (js.Function2[/* props */ P, /* meta */ Meta[D, T, MetaBase[D]], P | js.Array[P]]) | P | js.Array[P]

type Renderer[Props] = ComponentType[Props] | Element | String | Double | ReactFragment

type Row[D /* <: js.Object */] = UseTableRowProps[D]

type RowPropGetter[D /* <: js.Object */] = PropGetter[D, TableRowProps, typingsJapgolly.reactTable.anon.Row[D], PartialTableRowProps]

type SortByFn[D /* <: js.Object */] = js.Function4[
/* rowA */ Row[D], 
/* rowB */ Row[D], 
/* columnId */ IdType[D], 
/* desc */ js.UndefOr[Boolean], 
Double]

type StringKey[D] = Extract[/* keyof D */ String, String]

type TableBodyPropGetter[D /* <: js.Object */] = PropGetter[D, TableBodyProps, scala.Nothing, PartialTableBodyProps]

type TableBodyProps = TableCommonProps

type TableCellProps = TableKeyedProps

type TableDispatch[A] = js.Function1[/* action */ A, Unit]

type TableExpandedToggleProps = TableKeyedProps

type TableFooterGroupProps = TableKeyedProps

type TableFooterProps = TableKeyedProps

type TableHeaderGroupProps = TableKeyedProps

type TableHeaderProps = TableKeyedProps

type TableOptions[D /* <: js.Object */] = UseTableOptions[D]

type TablePropGetter[D /* <: js.Object */] = PropGetter[D, TableProps, scala.Nothing, PartialTableProps]

type TableProps = TableCommonProps

type TableRowProps = TableKeyedProps

type TableToggleAllRowsSelectedProps = TableToggleCommonProps

type TableToggleHideAllColumnProps = TableToggleCommonProps

type TableToggleRowsSelectedProps = TableToggleCommonProps

type UpdateHiddenColumns[D /* <: js.Object */] = js.Function1[/* oldHidden */ js.Array[IdType[D]], js.Array[IdType[D]]]

type UseRowStateLocalState[D /* <: js.Object */, T] = Record[IdType[D], T]

type UseRowUpdater[T] = T | (js.Function1[/* prev */ T, T])

type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
