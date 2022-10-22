package typingsJapgolly.gapiTranslate

import typingsJapgolly.gapiTranslate.anon.Detections
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiTranslateDetectionListResponse extends StObject {
  
  var data: Detections
}
object GoogleApiTranslateDetectionListResponse {
  
  inline def apply(data: Detections): GoogleApiTranslateDetectionListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateDetectionListResponse]
  }
  
  extension [Self <: GoogleApiTranslateDetectionListResponse](x: Self) {
    
    inline def setData(value: Detections): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
