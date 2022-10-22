package typingsJapgolly.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataDiffUploadResponse extends StObject {
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var originalObject: js.UndefOr[GdataCompositeMedia] = js.undefined
}
object GdataDiffUploadResponse {
  
  inline def apply(): GdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffUploadResponse]
  }
  
  extension [Self <: GdataDiffUploadResponse](x: Self) {
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
    
    inline def setOriginalObject(value: GdataCompositeMedia): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    inline def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
