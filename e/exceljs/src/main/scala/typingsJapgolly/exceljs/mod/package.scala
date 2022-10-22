package typingsJapgolly.exceljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.exceljs.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AutoFilter = String | From

type Buffer = js.typedarray.ArrayBuffer

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Double
  - java.lang.String
  - scala.Boolean
  - js.Date
  - scala.Unit
  - typingsJapgolly.exceljs.mod.CellErrorValue
  - typingsJapgolly.exceljs.mod.CellRichTextValue
  - typingsJapgolly.exceljs.mod.CellHyperlinkValue
  - typingsJapgolly.exceljs.mod.CellFormulaValue
  - typingsJapgolly.exceljs.mod.CellSharedFormulaValue
*/
type CellValue = js.UndefOr[_CellValue | Null | Double | String | Boolean | js.Date]

type DefinedNamesModel = js.Array[DefinedNamesRanges]

// https://c2fo.io/fast-csv/docs/parsing/options
type HeaderArray = js.Array[js.UndefOr[String | Null]]

type HeaderTransformFunction = js.Function1[/* headers */ HeaderArray, HeaderArray]

type QuoteColumnMap = StringDictionary[Boolean]

type QuoteColumns = Boolean | js.Array[Boolean] | QuoteColumnMap

type RowArray = js.Array[String]

type RowHashArray = js.Array[js.Tuple2[String, Any]]

type RowMap = StringDictionary[Any]

type RowTransformCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* row */ js.UndefOr[Rows], Unit]

type RowValues = js.UndefOr[js.Array[CellValue] | StringDictionary[CellValue] | Null]

type Rows = RowArray | RowMap | RowHashArray

type WorksheetView = (WorksheetViewNormal & WorksheetViewCommon) | (WorksheetViewFrozen & WorksheetViewCommon) | (WorksheetViewSplit & WorksheetViewCommon)
