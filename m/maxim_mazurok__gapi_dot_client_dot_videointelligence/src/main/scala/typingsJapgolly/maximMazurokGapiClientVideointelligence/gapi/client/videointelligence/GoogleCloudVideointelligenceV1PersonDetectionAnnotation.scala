package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1PersonDetectionAnnotation extends StObject {
  
  /** The detected tracks of a person. */
  var tracks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1Track]] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1PersonDetectionAnnotation {
  
  inline def apply(): GoogleCloudVideointelligenceV1PersonDetectionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1PersonDetectionAnnotation]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1PersonDetectionAnnotation](x: Self) {
    
    inline def setTracks(value: js.Array[GoogleCloudVideointelligenceV1Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: GoogleCloudVideointelligenceV1Track*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
