package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellProperties extends StObject {
  
  /** The alignment of the content in the table cell. The default alignment matches the alignment for newly created table cells in the Slides editor. */
  var contentAlignment: js.UndefOr[String] = js.undefined
  
  /** The background fill of the table cell. The default fill matches the fill for newly created table cells in the Slides editor. */
  var tableCellBackgroundFill: js.UndefOr[TableCellBackgroundFill] = js.undefined
}
object TableCellProperties {
  
  inline def apply(): TableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellProperties]
  }
  
  extension [Self <: TableCellProperties](x: Self) {
    
    inline def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
    
    inline def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
    
    inline def setTableCellBackgroundFill(value: TableCellBackgroundFill): Self = StObject.set(x, "tableCellBackgroundFill", value.asInstanceOf[js.Any])
    
    inline def setTableCellBackgroundFillUndefined: Self = StObject.set(x, "tableCellBackgroundFill", js.undefined)
  }
}
