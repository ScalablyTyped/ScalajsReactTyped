package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the layout of a section of a card in card view.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.officeJs.Excel.CardLayoutListSection
  - typingsJapgolly.officeJs.Excel.CardLayoutTableSection
*/
trait CardLayoutSection extends StObject
object CardLayoutSection {
  
  inline def CardLayoutListSection(properties: js.Array[String]): typingsJapgolly.officeJs.Excel.CardLayoutListSection = {
    val __obj = js.Dynamic.literal(layout = "List", properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.officeJs.Excel.CardLayoutListSection]
  }
  
  inline def CardLayoutTableSection(properties: js.Array[String]): typingsJapgolly.officeJs.Excel.CardLayoutTableSection = {
    val __obj = js.Dynamic.literal(layout = "Table", properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.officeJs.Excel.CardLayoutTableSection]
  }
}
