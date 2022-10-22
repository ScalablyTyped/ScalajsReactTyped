package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableColumnProperties extends StObject {
  
  /** The width of the column. Set when the column's `width_type` is FIXED_WIDTH. */
  var width: js.UndefOr[Dimension] = js.undefined
  
  /** The width type of the column. */
  var widthType: js.UndefOr[String] = js.undefined
}
object TableColumnProperties {
  
  inline def apply(): TableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnProperties]
  }
  
  extension [Self <: TableColumnProperties](x: Self) {
    
    inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthType(value: String): Self = StObject.set(x, "widthType", value.asInstanceOf[js.Any])
    
    inline def setWidthTypeUndefined: Self = StObject.set(x, "widthType", js.undefined)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
