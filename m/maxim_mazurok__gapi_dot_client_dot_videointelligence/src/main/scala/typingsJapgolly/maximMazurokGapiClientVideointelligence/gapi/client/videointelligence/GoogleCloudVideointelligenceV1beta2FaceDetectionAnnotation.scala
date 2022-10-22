package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2FaceDetectionAnnotation extends StObject {
  
  /** The thumbnail of a person's face. */
  var thumbnail: js.UndefOr[String] = js.undefined
  
  /** The face tracks with attributes. */
  var tracks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2Track]] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2FaceDetectionAnnotation {
  
  inline def apply(): GoogleCloudVideointelligenceV1beta2FaceDetectionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2FaceDetectionAnnotation]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1beta2FaceDetectionAnnotation](x: Self) {
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTracks(value: js.Array[GoogleCloudVideointelligenceV1beta2Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: GoogleCloudVideointelligenceV1beta2Track*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
