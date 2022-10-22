package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetailsUpload extends StObject {
  
  /** The ID that YouTube uses to uniquely identify the uploaded video. */
  var videoId: js.UndefOr[String] = js.undefined
}
object ActivityContentDetailsUpload {
  
  inline def apply(): ActivityContentDetailsUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsUpload]
  }
  
  extension [Self <: ActivityContentDetailsUpload](x: Self) {
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
