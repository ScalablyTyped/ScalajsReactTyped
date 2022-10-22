package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress extends StObject {
  
  /** Progress metadata for all videos specified in `AnnotateVideoRequest`. */
  var annotationProgress: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress {
  
  inline def apply(): GoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress](x: Self) {
    
    inline def setAnnotationProgress(value: js.Array[GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]): Self = StObject.set(x, "annotationProgress", value.asInstanceOf[js.Any])
    
    inline def setAnnotationProgressUndefined: Self = StObject.set(x, "annotationProgress", js.undefined)
    
    inline def setAnnotationProgressVarargs(value: GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress*): Self = StObject.set(x, "annotationProgress", js.Array(value*))
  }
}
