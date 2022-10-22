package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDateTimeRule extends StObject {
  
  /** The type of date-time grouping to apply. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ChartDateTimeRule {
  
  inline def apply(): ChartDateTimeRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDateTimeRule]
  }
  
  extension [Self <: ChartDateTimeRule](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
