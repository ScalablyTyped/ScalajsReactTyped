package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationContainer extends StObject {
  
  var classification: js.UndefOr[MlDataframeEvaluationClassification] = js.undefined
  
  var outlier_detection: js.UndefOr[MlDataframeEvaluationOutlierDetection] = js.undefined
  
  var regression: js.UndefOr[MlDataframeEvaluationRegression] = js.undefined
}
object MlDataframeEvaluationContainer {
  
  inline def apply(): MlDataframeEvaluationContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeEvaluationContainer]
  }
  
  extension [Self <: MlDataframeEvaluationContainer](x: Self) {
    
    inline def setClassification(value: MlDataframeEvaluationClassification): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setOutlier_detection(value: MlDataframeEvaluationOutlierDetection): Self = StObject.set(x, "outlier_detection", value.asInstanceOf[js.Any])
    
    inline def setOutlier_detectionUndefined: Self = StObject.set(x, "outlier_detection", js.undefined)
    
    inline def setRegression(value: MlDataframeEvaluationRegression): Self = StObject.set(x, "regression", value.asInstanceOf[js.Any])
    
    inline def setRegressionUndefined: Self = StObject.set(x, "regression", js.undefined)
  }
}
