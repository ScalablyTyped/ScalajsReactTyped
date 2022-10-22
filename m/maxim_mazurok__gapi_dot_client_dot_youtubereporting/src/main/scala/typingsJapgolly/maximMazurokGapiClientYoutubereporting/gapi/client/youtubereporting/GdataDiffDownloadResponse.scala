package typingsJapgolly.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataDiffDownloadResponse extends StObject {
  
  /** gdata */
  var objectLocation: js.UndefOr[GdataCompositeMedia] = js.undefined
}
object GdataDiffDownloadResponse {
  
  inline def apply(): GdataDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffDownloadResponse]
  }
  
  extension [Self <: GdataDiffDownloadResponse](x: Self) {
    
    inline def setObjectLocation(value: GdataCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    inline def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
  }
}
