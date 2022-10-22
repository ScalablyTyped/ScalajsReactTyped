package typingsJapgolly.baseui

import typingsJapgolly.baseui.dataTableColumnAnchorMod.Options
import typingsJapgolly.baseui.dataTableTypesMod.BatchAction
import typingsJapgolly.baseui.dataTableTypesMod.ColumnOptions
import typingsJapgolly.baseui.dataTableTypesMod.DataTableProps
import typingsJapgolly.baseui.dataTableTypesMod.Row
import typingsJapgolly.baseui.dataTableTypesMod.RowAction
import typingsJapgolly.baseui.dataTableTypesMod.SortDirections
import typingsJapgolly.baseui.dataTableTypesMod.StatefulContainerProps
import typingsJapgolly.baseui.dataTableTypesMod.StatefulDataTableProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("baseui/data-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AnchorColumn(options: Options): typingsJapgolly.baseui.dataTableColumnAnchorMod.AnchorColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("AnchorColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baseui.dataTableColumnAnchorMod.AnchorColumn]
  
  inline def BooleanColumn(options: typingsJapgolly.baseui.dataTableColumnBooleanMod.Options): typingsJapgolly.baseui.dataTableColumnBooleanMod.BooleanColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("BooleanColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baseui.dataTableColumnBooleanMod.BooleanColumn]
  
  /* Inlined std.Readonly<{ readonly ANCHOR :'ANCHOR',  readonly BOOLEAN :'BOOLEAN',  readonly CATEGORICAL :'CATEGORICAL',  readonly CUSTOM :'CUSTOM',  readonly DATETIME :'DATETIME',  readonly NUMERICAL :'NUMERICAL',  readonly ROW_INDEX :'ROW_INDEX',  readonly STRING :'STRING'}> */
  object COLUMNS {
    
    @JSImport("baseui/data-table", "COLUMNS.ANCHOR")
    @js.native
    val ANCHOR: typingsJapgolly.baseui.baseuiStrings.ANCHOR = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.BOOLEAN")
    @js.native
    val BOOLEAN: typingsJapgolly.baseui.baseuiStrings.BOOLEAN = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.CATEGORICAL")
    @js.native
    val CATEGORICAL: typingsJapgolly.baseui.baseuiStrings.CATEGORICAL = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.CUSTOM")
    @js.native
    val CUSTOM: typingsJapgolly.baseui.baseuiStrings.CUSTOM = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.DATETIME")
    @js.native
    val DATETIME: typingsJapgolly.baseui.baseuiStrings.DATETIME = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.NUMERICAL")
    @js.native
    val NUMERICAL: typingsJapgolly.baseui.baseuiStrings.NUMERICAL = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.ROW_INDEX")
    @js.native
    val ROW_INDEX: typingsJapgolly.baseui.baseuiStrings.ROW_INDEX = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.STRING")
    @js.native
    val STRING: typingsJapgolly.baseui.baseuiStrings.STRING = js.native
  }
  
  inline def CategoricalColumn(options: typingsJapgolly.baseui.dataTableColumnCategoricalMod.Options): typingsJapgolly.baseui.dataTableColumnCategoricalMod.CategoricalColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("CategoricalColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baseui.dataTableColumnCategoricalMod.CategoricalColumn]
  
  inline def CustomColumn[Value, FilterParams](options: typingsJapgolly.baseui.dataTableColumnCustomMod.Options[Value, FilterParams]): ColumnOptions[Value, FilterParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomColumn")(options.asInstanceOf[js.Any]).asInstanceOf[ColumnOptions[Value, FilterParams]]
  
  /* Inlined std.Readonly<{ readonly RANGE_DATETIME :'RANGE_DATETIME',  readonly RANGE_DATE :'RANGE_DATE',  readonly RANGE_TIME :'RANGE_TIME',  readonly WEEKDAY :'WEEKDAY',  readonly MONTH :'MONTH',  readonly QUARTER :'QUARTER',  readonly HALF :'HALF',  readonly YEAR :'YEAR'}> */
  object DATETIME_OPERATIONS {
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.HALF")
    @js.native
    val HALF: typingsJapgolly.baseui.baseuiStrings.HALF = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.MONTH")
    @js.native
    val MONTH: typingsJapgolly.baseui.baseuiStrings.MONTH = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.QUARTER")
    @js.native
    val QUARTER: typingsJapgolly.baseui.baseuiStrings.QUARTER = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.RANGE_DATE")
    @js.native
    val RANGE_DATE: typingsJapgolly.baseui.baseuiStrings.RANGE_DATE = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.RANGE_DATETIME")
    @js.native
    val RANGE_DATETIME: typingsJapgolly.baseui.baseuiStrings.RANGE_DATETIME = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.RANGE_TIME")
    @js.native
    val RANGE_TIME: typingsJapgolly.baseui.baseuiStrings.RANGE_TIME = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.WEEKDAY")
    @js.native
    val WEEKDAY: typingsJapgolly.baseui.baseuiStrings.WEEKDAY = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.YEAR")
    @js.native
    val YEAR: typingsJapgolly.baseui.baseuiStrings.YEAR = js.native
  }
  
  inline def DataTable(
    hasBatchActionsColumnsFiltersEmptyMessageLoadingLoadingMessageOnIncludedRowsChangeOnRowHighlightChangeOnSelectManyOnSelectNoneOnSelectOneOnSortResizableColumnWidthsAllRowsRowActionsRowHeightRowHighlightIndexControlledSelectedRowIdsSortIndexSortDirectionTextQueryControlRef: DataTableProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DataTable")(hasBatchActionsColumnsFiltersEmptyMessageLoadingLoadingMessageOnIncludedRowsChangeOnRowHighlightChangeOnSelectManyOnSelectNoneOnSelectOneOnSortResizableColumnWidthsAllRowsRowActionsRowHeightRowHighlightIndexControlledSelectedRowIdsSortIndexSortDirectionTextQueryControlRef.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DatetimeColumn(options: typingsJapgolly.baseui.dataTableColumnDatetimeMod.Options): typingsJapgolly.baseui.dataTableColumnDatetimeMod.DatetimeColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("DatetimeColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baseui.dataTableColumnDatetimeMod.DatetimeColumn]
  
  /* Inlined std.Readonly<{ readonly DEFAULT :'DEFAULT',  readonly ACCOUNTING :'ACCOUNTING',  readonly PERCENTAGE :'PERCENTAGE'}> */
  object NUMERICAL_FORMATS {
    
    @JSImport("baseui/data-table", "NUMERICAL_FORMATS.ACCOUNTING")
    @js.native
    val ACCOUNTING: typingsJapgolly.baseui.baseuiStrings.ACCOUNTING = js.native
    
    @JSImport("baseui/data-table", "NUMERICAL_FORMATS.DEFAULT")
    @js.native
    val DEFAULT: typingsJapgolly.baseui.baseuiStrings.DEFAULT = js.native
    
    @JSImport("baseui/data-table", "NUMERICAL_FORMATS.PERCENTAGE")
    @js.native
    val PERCENTAGE: typingsJapgolly.baseui.baseuiStrings.PERCENTAGE = js.native
  }
  
  inline def NumericalColumn(options: typingsJapgolly.baseui.dataTableColumnNumericalMod.Options): typingsJapgolly.baseui.dataTableColumnNumericalMod.NumericalColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("NumericalColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baseui.dataTableColumnNumericalMod.NumericalColumn]
  
  inline def RowIndexColumn(): typingsJapgolly.baseui.dataTableColumnRowIndexMod.RowIndexColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("RowIndexColumn")().asInstanceOf[typingsJapgolly.baseui.dataTableColumnRowIndexMod.RowIndexColumn]
  
  /* Inlined std.Readonly<{ readonly ASC :'ASC',  readonly DESC :'DESC'}> */
  object SORT_DIRECTIONS {
    
    @JSImport("baseui/data-table", "SORT_DIRECTIONS.ASC")
    @js.native
    val ASC: typingsJapgolly.baseui.baseuiStrings.ASC = js.native
    
    @JSImport("baseui/data-table", "SORT_DIRECTIONS.DESC")
    @js.native
    val DESC: typingsJapgolly.baseui.baseuiStrings.DESC = js.native
  }
  
  @JSImport("baseui/data-table", "StatefulContainer")
  @js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  
  inline def StatefulDataTable(props: StatefulDataTableProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulDataTable")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def StringColumn(options: typingsJapgolly.baseui.dataTableColumnStringMod.Options): typingsJapgolly.baseui.dataTableColumnStringMod.StringColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("StringColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baseui.dataTableColumnStringMod.StringColumn]
  
  inline def UnstableDataTable(
    hasBatchActionsColumnsFiltersEmptyMessageLoadingLoadingMessageOnIncludedRowsChangeOnRowHighlightChangeOnSelectManyOnSelectNoneOnSelectOneOnSortResizableColumnWidthsAllRowsRowActionsRowHeightRowHighlightIndexControlledSelectedRowIdsSortIndexSortDirectionTextQueryControlRef: DataTableProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Unstable_DataTable")(hasBatchActionsColumnsFiltersEmptyMessageLoadingLoadingMessageOnIncludedRowsChangeOnRowHighlightChangeOnSelectManyOnSelectNoneOnSelectOneOnSortResizableColumnWidthsAllRowsRowActionsRowHeightRowHighlightIndexControlledSelectedRowIdsSortIndexSortDirectionTextQueryControlRef.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/data-table", "Unstable_StatefulContainer")
  @js.native
  val UnstableStatefulContainer: FC[StatefulContainerProps] = js.native
  
  inline def UnstableStatefulDataTable(props: StatefulDataTableProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Unstable_StatefulDataTable")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type BatchActionT = BatchAction
  
  type ColumnT = ColumnOptions[Any, Any]
  
  type RowActionT = RowAction
  
  type RowT = Row
  
  type SortDirectionsT = SortDirections
}
