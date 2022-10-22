package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProtectedRangeResponse extends StObject {
  
  /** The newly added protected range. */
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}
object AddProtectedRangeResponse {
  
  inline def apply(): AddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProtectedRangeResponse]
  }
  
  extension [Self <: AddProtectedRangeResponse](x: Self) {
    
    inline def setProtectedRange(value: ProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    inline def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}
