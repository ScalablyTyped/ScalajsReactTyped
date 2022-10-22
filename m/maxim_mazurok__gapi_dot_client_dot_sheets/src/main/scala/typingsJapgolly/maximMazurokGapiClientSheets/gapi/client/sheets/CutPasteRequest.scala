package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CutPasteRequest extends StObject {
  
  /** The top-left coordinate where the data should be pasted. */
  var destination: js.UndefOr[GridCoordinate] = js.undefined
  
  /** What kind of data to paste. All the source data will be cut, regardless of what is pasted. */
  var pasteType: js.UndefOr[String] = js.undefined
  
  /** The source data to cut. */
  var source: js.UndefOr[GridRange] = js.undefined
}
object CutPasteRequest {
  
  inline def apply(): CutPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CutPasteRequest]
  }
  
  extension [Self <: CutPasteRequest](x: Self) {
    
    inline def setDestination(value: GridCoordinate): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setPasteType(value: String): Self = StObject.set(x, "pasteType", value.asInstanceOf[js.Any])
    
    inline def setPasteTypeUndefined: Self = StObject.set(x, "pasteType", js.undefined)
    
    inline def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
