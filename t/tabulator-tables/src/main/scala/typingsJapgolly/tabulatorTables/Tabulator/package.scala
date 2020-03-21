package typingsJapgolly.tabulatorTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Tabulator {
  type CellEditEventCallback = js.Function1[/* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, scala.Unit]
  type CellEventCallback = js.Function2[
    /* e */ js.Any, 
    /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, 
    scala.Unit
  ]
  type Color = java.lang.String | js.Array[js.Any] | typingsJapgolly.tabulatorTables.Tabulator.ValueStringCallback
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.avg
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.max
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.min
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.sum
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.concat
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.count
    - js.Function3[
  / * values * / js.Array[js.Any], 
  / * data * / js.Array[js.Any], 
  / * calcParams * / js.Object, 
  scala.Double]
  */
  type ColumnCalc = typingsJapgolly.tabulatorTables.Tabulator._ColumnCalc | (js.Function3[
    /* values */ js.Array[js.Any], 
    /* data */ js.Array[js.Any], 
    /* calcParams */ js.Object, 
    scala.Double
  ])
  type ColumnCalcParams = js.Function2[/* values */ js.Any, /* data */ js.Any, js.Any]
  type ColumnEventCallback = js.Function2[
    /* e */ js.Any, 
    /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent
    - typingsJapgolly.tabulatorTables.Tabulator.ColumnDefinition
    - typingsJapgolly.std.HTMLElement
    - java.lang.String
  */
  type ColumnLookup = typingsJapgolly.tabulatorTables.Tabulator._ColumnLookup | org.scalajs.dom.raw.HTMLElement | java.lang.String
  type ColumnSorterParamLookupFunction = js.Function2[
    /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent, 
    /* dir */ typingsJapgolly.tabulatorTables.Tabulator.SortDirection, 
    js.Object
  ]
  type CustomAccessor = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.download | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.clipboard, 
    /* AccessorParams */ js.Any, 
    /* column */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent], 
    js.Any
  ]
  type CustomAccessorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.download | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.clipboard, 
    /* column */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent], 
    js.Any
  ])
  type CustomMutator = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.edit, 
    /* mutatorParams */ js.Any, 
    /* cell */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.CellComponent], 
    js.Any
  ]
  type CustomMutatorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.edit, 
    /* cell */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.CellComponent], 
    js.Any
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`true`
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.input
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.textarea
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.number
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.range
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.tickCross
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.star
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.select
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.autocomplete
    - js.Function5[
  / * cell * / typingsJapgolly.tabulatorTables.Tabulator.CellComponent, 
  / * onRendered * / typingsJapgolly.tabulatorTables.Tabulator.EmptyCallback, 
  / * success * / typingsJapgolly.tabulatorTables.Tabulator.ValueBooleanCallback, 
  / * cancel * / typingsJapgolly.tabulatorTables.Tabulator.ValueVoidCallback, 
  / * editorParams * / js.Object, 
  typingsJapgolly.std.HTMLElement | typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`]
  */
  type Editor = typingsJapgolly.tabulatorTables.Tabulator._Editor | (js.Function5[
    /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, 
    /* onRendered */ typingsJapgolly.tabulatorTables.Tabulator.EmptyCallback, 
    /* success */ typingsJapgolly.tabulatorTables.Tabulator.ValueBooleanCallback, 
    /* cancel */ typingsJapgolly.tabulatorTables.Tabulator.ValueVoidCallback, 
    /* editorParams */ js.Object, 
    org.scalajs.dom.raw.HTMLElement | typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tabulatorTables.Tabulator.NumberParams
    - typingsJapgolly.tabulatorTables.Tabulator.CheckboxParams
    - typingsJapgolly.tabulatorTables.Tabulator.SelectParams
    - typingsJapgolly.tabulatorTables.Tabulator.AutoCompleteParams
    - typingsJapgolly.tabulatorTables.Tabulator.InputParams
    - typingsJapgolly.tabulatorTables.Tabulator.TextAreaParams
    - js.Function1[/ * cell * / typingsJapgolly.tabulatorTables.Tabulator.CellComponent, js.Object]
  */
  type EditorParams = typingsJapgolly.tabulatorTables.Tabulator._EditorParams | (js.Function1[/* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, js.Object])
  type EmptyCallback = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  type FilterFunction = js.Function3[
    /* field */ java.lang.String, 
    /* type */ typingsJapgolly.tabulatorTables.Tabulator.FilterType, 
    /* value */ js.Any, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.plaintext
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.textarea
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.html
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.money
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.image
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.datetime
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.datetimediff
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.link
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.tickCross
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.color
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.star
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.traffic
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.progress
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.lookup
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.buttonTick
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.buttonCross
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.rownum
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.handle
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.rowSelection
    - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.responsiveCollapse
    - js.Function3[
  / * cell * / typingsJapgolly.tabulatorTables.Tabulator.CellComponent, 
  / * formatterParams * / js.Object, 
  / * onRendered * / typingsJapgolly.tabulatorTables.Tabulator.EmptyCallback, 
  java.lang.String | typingsJapgolly.std.HTMLElement]
  */
  type Formatter = typingsJapgolly.tabulatorTables.Tabulator._Formatter | (js.Function3[
    /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, 
    /* formatterParams */ js.Object, 
    /* onRendered */ typingsJapgolly.tabulatorTables.Tabulator.EmptyCallback, 
    java.lang.String | org.scalajs.dom.raw.HTMLElement
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tabulatorTables.Tabulator.MoneyParams
    - typingsJapgolly.tabulatorTables.Tabulator.ImageParams
    - typingsJapgolly.tabulatorTables.Tabulator.LinkParams
    - typingsJapgolly.tabulatorTables.Tabulator.DateTimeParams
    - typingsJapgolly.tabulatorTables.Tabulator.DateTimeDifferenceParams
    - typingsJapgolly.tabulatorTables.Tabulator.TickCrossParams
    - typingsJapgolly.tabulatorTables.Tabulator.TrafficParams
    - typingsJapgolly.tabulatorTables.Tabulator.StarRatingParams
    - typingsJapgolly.tabulatorTables.Tabulator.JSONRecord
    - js.Function1[/ * cell * / typingsJapgolly.tabulatorTables.Tabulator.CellComponent, js.Object]
  */
  type FormatterParams = typingsJapgolly.tabulatorTables.Tabulator._FormatterParams | (js.Function1[/* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, js.Object]) | typingsJapgolly.tabulatorTables.Tabulator.JSONRecord
  type GlobalTooltipOption = scala.Boolean | (js.Function1[
    /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, 
    java.lang.String
  ])
  type GroupEventCallback = js.Function2[
    /* e */ js.Any, 
    /* group */ typingsJapgolly.tabulatorTables.Tabulator.GroupComponent, 
    scala.Unit
  ]
  type JSONRecord = typingsJapgolly.std.Record[java.lang.String, java.lang.String | scala.Double | scala.Boolean]
  type RowChangedCallback = js.Function1[/* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, scala.Unit]
  type RowEventCallback = js.Function2[
    /* e */ js.Any, 
    /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, 
    scala.Unit
  ]
  type RowLookup = typingsJapgolly.tabulatorTables.Tabulator.RowComponent | org.scalajs.dom.raw.HTMLElement | java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String])
  type StandardStringParam = java.lang.String | org.scalajs.dom.raw.HTMLElement | (js.Function0[java.lang.String | org.scalajs.dom.raw.HTMLElement])
  type ValueBooleanCallback = js.Function1[/* value */ js.Any, scala.Boolean]
  type ValueStringCallback = js.Function1[/* value */ js.Any, java.lang.String]
  type ValueVoidCallback = js.Function1[/* value */ js.Any, scala.Unit]
}
