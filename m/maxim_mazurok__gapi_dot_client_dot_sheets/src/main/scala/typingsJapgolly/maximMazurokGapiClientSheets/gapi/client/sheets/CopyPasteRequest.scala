package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyPasteRequest extends StObject {
  
  /**
    * The location to paste to. If the range covers a span that's a multiple of the source's height or width, then the data will be repeated to fill in the destination range. If the range
    * is smaller than the source range, the entire source data will still be copied (beyond the end of the destination range).
    */
  var destination: js.UndefOr[GridRange] = js.undefined
  
  /** How that data should be oriented when pasting. */
  var pasteOrientation: js.UndefOr[String] = js.undefined
  
  /** What kind of data to paste. */
  var pasteType: js.UndefOr[String] = js.undefined
  
  /** The source range to copy. */
  var source: js.UndefOr[GridRange] = js.undefined
}
object CopyPasteRequest {
  
  inline def apply(): CopyPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyPasteRequest]
  }
  
  extension [Self <: CopyPasteRequest](x: Self) {
    
    inline def setDestination(value: GridRange): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setPasteOrientation(value: String): Self = StObject.set(x, "pasteOrientation", value.asInstanceOf[js.Any])
    
    inline def setPasteOrientationUndefined: Self = StObject.set(x, "pasteOrientation", js.undefined)
    
    inline def setPasteType(value: String): Self = StObject.set(x, "pasteType", value.asInstanceOf[js.Any])
    
    inline def setPasteTypeUndefined: Self = StObject.set(x, "pasteType", js.undefined)
    
    inline def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
