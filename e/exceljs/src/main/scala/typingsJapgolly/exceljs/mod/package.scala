package typingsJapgolly.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AutoFilter = java.lang.String | typingsJapgolly.exceljs.AnonFrom
  type Buffer = scala.scalajs.js.typedarray.ArrayBuffer
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - typingsJapgolly.std.Date
    - typingsJapgolly.exceljs.mod.CellErrorValue
    - typingsJapgolly.exceljs.mod.CellRichTextValue
    - typingsJapgolly.exceljs.mod.CellHyperlinkValue
    - typingsJapgolly.exceljs.mod.CellFormulaValue
    - typingsJapgolly.exceljs.mod.CellSharedFormulaValue
  */
  type CellValue = typingsJapgolly.exceljs.mod._CellValue | scala.Null | scala.Double | java.lang.String | scala.Boolean | js.Date
  type DefinedNamesModel = js.Array[typingsJapgolly.exceljs.mod.DefinedNamesRanges]
  type DocumentType = typingsJapgolly.exceljs.exceljsNumbers.`1`
  type WorksheetView = typingsJapgolly.exceljs.mod.WorksheetViewCommon with (typingsJapgolly.exceljs.mod.WorksheetViewNormal | typingsJapgolly.exceljs.mod.WorksheetViewFrozen | typingsJapgolly.exceljs.mod.WorksheetViewSplit)
}
