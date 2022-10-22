package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ClassificationMetrics extends StObject {
  
  /** Confusion matrix of predicted labels vs. ground truth labels. */
  var confusionMatrix: js.UndefOr[GoogleCloudDatalabelingV1beta1ConfusionMatrix] = js.undefined
  
  /** Precision-recall curve based on ground truth labels, predicted labels, and scores for the predicted labels. */
  var prCurve: js.UndefOr[GoogleCloudDatalabelingV1beta1PrCurve] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ClassificationMetrics {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ClassificationMetrics]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ClassificationMetrics](x: Self) {
    
    inline def setConfusionMatrix(value: GoogleCloudDatalabelingV1beta1ConfusionMatrix): Self = StObject.set(x, "confusionMatrix", value.asInstanceOf[js.Any])
    
    inline def setConfusionMatrixUndefined: Self = StObject.set(x, "confusionMatrix", js.undefined)
    
    inline def setPrCurve(value: GoogleCloudDatalabelingV1beta1PrCurve): Self = StObject.set(x, "prCurve", value.asInstanceOf[js.Any])
    
    inline def setPrCurveUndefined: Self = StObject.set(x, "prCurve", js.undefined)
  }
}
