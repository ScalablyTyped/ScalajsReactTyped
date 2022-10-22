package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableBorderFill extends StObject {
  
  /** Solid fill. */
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}
object TableBorderFill {
  
  inline def apply(): TableBorderFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderFill]
  }
  
  extension [Self <: TableBorderFill](x: Self) {
    
    inline def setSolidFill(value: SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
