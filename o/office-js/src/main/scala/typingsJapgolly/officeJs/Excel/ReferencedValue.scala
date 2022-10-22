package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.CellValueType.array
import typingsJapgolly.officeJs.Excel.CellValueType.entity
import typingsJapgolly.officeJs.Excel.ReferenceValueType.root
import typingsJapgolly.officeJs.officeJsStrings.Array
import typingsJapgolly.officeJs.officeJsStrings.Entity
import typingsJapgolly.officeJs.officeJsStrings.Root
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
  - typingsJapgolly.officeJs.Excel.ArrayCellValue
  - typingsJapgolly.officeJs.Excel.EntityCellValue
  - typingsJapgolly.officeJs.Excel.RootReferenceCellValue
*/
trait ReferencedValue extends StObject
object ReferencedValue {
  
  inline def ArrayCellValue(
    elements: js.Array[js.Array[CellValue]],
    `type`: array | typingsJapgolly.officeJs.Excel.ReferenceValueType.array | Array
  ): typingsJapgolly.officeJs.Excel.ArrayCellValue = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.officeJs.Excel.ArrayCellValue]
  }
  
  inline def EntityCellValue(`type`: entity | typingsJapgolly.officeJs.Excel.ReferenceValueType.entity | Entity): typingsJapgolly.officeJs.Excel.EntityCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.officeJs.Excel.EntityCellValue]
  }
  
  inline def RootReferenceCellValue(`type`: root | Root): typingsJapgolly.officeJs.Excel.RootReferenceCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.officeJs.Excel.RootReferenceCellValue]
  }
}
