package typingsJapgolly.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoContent extends StObject {
  
  /** Output only. Video metadata. */
  var videoMetadata: js.UndefOr[VideoMetadata] = js.undefined
  
  /** The URL to fetch a video ad. */
  var videoUrl: js.UndefOr[String] = js.undefined
  
  /** The contents of a VAST document for a video ad. This document should conform to the VAST 2.0 or 3.0 standard. */
  var videoVastXml: js.UndefOr[String] = js.undefined
}
object VideoContent {
  
  inline def apply(): VideoContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContent]
  }
  
  extension [Self <: VideoContent](x: Self) {
    
    inline def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "videoMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoMetadataUndefined: Self = StObject.set(x, "videoMetadata", js.undefined)
    
    inline def setVideoUrl(value: String): Self = StObject.set(x, "videoUrl", value.asInstanceOf[js.Any])
    
    inline def setVideoUrlUndefined: Self = StObject.set(x, "videoUrl", js.undefined)
    
    inline def setVideoVastXml(value: String): Self = StObject.set(x, "videoVastXml", value.asInstanceOf[js.Any])
    
    inline def setVideoVastXmlUndefined: Self = StObject.set(x, "videoVastXml", js.undefined)
  }
}
