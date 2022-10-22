package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.CellValueType.array
import typingsJapgolly.officeJsPreview.Excel.CellValueType.entity
import typingsJapgolly.officeJsPreview.Excel.ReferenceValueType.root
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Array
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Entity
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value in a cell.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.officeJsPreview.Excel.ArrayCellValue
  - typingsJapgolly.officeJsPreview.Excel.EntityCellValue
  - typingsJapgolly.officeJsPreview.Excel.RootReferenceCellValue
*/
trait ReferencedValue extends StObject
object ReferencedValue {
  
  inline def ArrayCellValue(
    elements: js.Array[js.Array[CellValue]],
    `type`: array | typingsJapgolly.officeJsPreview.Excel.ReferenceValueType.array | Array
  ): typingsJapgolly.officeJsPreview.Excel.ArrayCellValue = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.officeJsPreview.Excel.ArrayCellValue]
  }
  
  inline def EntityCellValue(`type`: entity | typingsJapgolly.officeJsPreview.Excel.ReferenceValueType.entity | Entity): typingsJapgolly.officeJsPreview.Excel.EntityCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.officeJsPreview.Excel.EntityCellValue]
  }
  
  inline def RootReferenceCellValue(`type`: root | Root): typingsJapgolly.officeJsPreview.Excel.RootReferenceCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.officeJsPreview.Excel.RootReferenceCellValue]
  }
}
