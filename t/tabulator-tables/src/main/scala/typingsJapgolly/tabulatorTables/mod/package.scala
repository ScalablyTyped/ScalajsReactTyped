package typingsJapgolly.tabulatorTables.mod

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.UIEvent
import typingsJapgolly.std.Record
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.clipboard
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.download
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CellEditEventCallback = js.Function1[/* cell */ CellComponent, Unit]

type CellEventCallback = js.Function2[/* e */ UIEvent, /* cell */ CellComponent, Unit]

type Color = String | js.Array[Any] | ValueStringCallback

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.avg
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.max
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.min
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.sum
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.concat
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.count
  - js.Function3[
/ * values * / js.Array[scala.Any], 
/ * data * / js.Array[scala.Any], 
/ * calcParams * / js.Object, 
scala.Any]
*/
type ColumnCalc = _ColumnCalc | (js.Function3[/* values */ js.Array[Any], /* data */ js.Array[Any], /* calcParams */ js.Object, Any])

type ColumnCalcParams = js.Function2[/* values */ Any, /* data */ Any, Any]

type ColumnEventCallback = js.Function2[/* e */ UIEvent, /* column */ ColumnComponent, Unit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tabulatorTables.mod.ColumnComponent
  - typingsJapgolly.tabulatorTables.mod.ColumnDefinition
  - org.scalajs.dom.HTMLElement
  - java.lang.String
*/
type ColumnLookup = _ColumnLookup | HTMLElement | String

type ColumnSorterParamLookupFunction = js.Function2[/* column */ ColumnComponent, /* dir */ SortDirection, js.Object]

type CustomAccessor = js.Function6[
/* value */ Any, 
/* data */ Any, 
/* type */ data | download | clipboard, 
/* AccessorParams */ Any, 
/* column */ js.UndefOr[ColumnComponent], 
/* row */ js.UndefOr[RowComponent], 
Any]

type CustomAccessorParams = js.Object | (js.Function5[
/* value */ Any, 
/* data */ Any, 
/* type */ data | download | clipboard, 
/* column */ js.UndefOr[ColumnComponent], 
/* row */ js.UndefOr[RowComponent], 
Any])

type CustomMutator = js.Function5[
/* value */ Any, 
/* data */ Any, 
/* type */ data | edit, 
/* mutatorParams */ Any, 
/* cell */ js.UndefOr[CellComponent], 
Any]

type CustomMutatorParams = js.Object | (js.Function4[
/* value */ Any, 
/* data */ Any, 
/* type */ data | edit, 
/* cell */ js.UndefOr[CellComponent], 
Any])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`true`
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.input
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.textarea
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.number
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.range
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.tickCross
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.star
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.list
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.date
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.time
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.datetime
  - js.Function5[
/ * cell * / typingsJapgolly.tabulatorTables.mod.CellComponent, 
/ * onRendered * / typingsJapgolly.tabulatorTables.mod.EmptyCallback, 
/ * success * / typingsJapgolly.tabulatorTables.mod.ValueBooleanCallback, 
/ * cancel * / typingsJapgolly.tabulatorTables.mod.ValueVoidCallback, 
/ * editorParams * / js.Object, 
org.scalajs.dom.HTMLElement | typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`]
*/
type Editor = _Editor | (js.Function5[
/* cell */ CellComponent, 
/* onRendered */ EmptyCallback, 
/* success */ ValueBooleanCallback, 
/* cancel */ ValueVoidCallback, 
/* editorParams */ js.Object, 
HTMLElement | `false`])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tabulatorTables.mod.NumberParams
  - typingsJapgolly.tabulatorTables.mod.CheckboxParams
  - typingsJapgolly.tabulatorTables.mod.ListEditorParams
  - typingsJapgolly.tabulatorTables.mod.InputParams
  - typingsJapgolly.tabulatorTables.mod.TextAreaParams
  - typingsJapgolly.tabulatorTables.mod.DateParams
  - typingsJapgolly.tabulatorTables.mod.TimeParams
  - typingsJapgolly.tabulatorTables.mod.DateTimeEditorParams
  - js.Function1[/ * cell * / typingsJapgolly.tabulatorTables.mod.CellComponent, js.Object]
*/
type EditorParams = _EditorParams | (js.Function1[/* cell */ CellComponent, js.Object])

type EmptyCallback = js.Function1[/* callback */ js.Function0[Unit], Unit]

type FilterFunction = js.Function4[
/* field */ String, 
/* type */ FilterType, 
/* value */ Any, 
/* filterParams */ js.UndefOr[FilterParams], 
Unit]

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
/ * cell * / typingsJapgolly.tabulatorTables.mod.CellComponent, 
/ * formatterParams * / js.Object, 
/ * onRendered * / typingsJapgolly.tabulatorTables.mod.EmptyCallback, 
java.lang.String | org.scalajs.dom.HTMLElement]
*/
type Formatter = _Formatter | (js.Function3[
/* cell */ CellComponent, 
/* formatterParams */ js.Object, 
/* onRendered */ EmptyCallback, 
String | HTMLElement])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tabulatorTables.mod.MoneyParams
  - typingsJapgolly.tabulatorTables.mod.ImageParams
  - typingsJapgolly.tabulatorTables.mod.LinkParams
  - typingsJapgolly.tabulatorTables.mod.DateTimeParams
  - typingsJapgolly.tabulatorTables.mod.DateTimeDifferenceParams
  - typingsJapgolly.tabulatorTables.mod.TickCrossParams
  - typingsJapgolly.tabulatorTables.mod.TrafficParams
  - typingsJapgolly.tabulatorTables.mod.ProgressBarParams
  - typingsJapgolly.tabulatorTables.mod.StarRatingParams
  - typingsJapgolly.tabulatorTables.mod.RowSelectionParams
  - typingsJapgolly.tabulatorTables.mod.JSONRecord
  - js.Function1[/ * cell * / typingsJapgolly.tabulatorTables.mod.CellComponent, js.Object]
*/
type FormatterParams = _FormatterParams | (js.Function1[/* cell */ CellComponent, js.Object]) | JSONRecord

type GlobalTooltipOption = Boolean | (js.Function3[
/* event */ MouseEvent, 
/* cell */ CellComponent, 
/* onRender */ js.Function0[Unit], 
String])

type GroupArg = String | js.Array[String] | (js.Function1[/* data */ Any, Any])

type GroupContextMenuSignature = (js.Array[MenuObject[GroupComponent] | MenuSeparator]) | (js.Function2[
/* component */ GroupComponent, 
/* e */ MouseEvent, 
MenuObject[GroupComponent] | `false` | js.Array[Any]])

type GroupEventCallback = js.Function2[/* e */ UIEvent, /* group */ GroupComponent, Unit]

type GroupValuesArg = js.Array[js.Array[Any]]

type JSONRecord = Record[String, String | Double | Boolean]

type RowChangedCallback = js.Function1[/* row */ RowComponent, Unit]

type RowContextMenuSignature = (js.Array[MenuObject[RowComponent] | MenuSeparator]) | (js.Function2[
/* e */ MouseEvent, 
/* component */ RowComponent, 
MenuObject[RowComponent] | `false` | js.Array[Any]])

type RowEventCallback = js.Function2[/* e */ UIEvent, /* row */ RowComponent, Unit]

type RowLookup = RowComponent | HTMLElement | String | Double | (js.Array[Double | String])

type StandardStringParam = String | HTMLElement | (js.Function0[String | HTMLElement])

type ValueBooleanCallback = js.Function1[/* value */ Any, Boolean]

type ValueStringCallback = js.Function1[/* value */ Any, String]

type ValueVoidCallback = js.Function1[/* value */ Any, Unit]
