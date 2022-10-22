package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationMetrics extends StObject {
  
  /**
    * The evaluation metrics for the find matches algorithm.
    */
  var FindMatchesMetrics: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.FindMatchesMetrics] = js.undefined
  
  /**
    * The type of machine learning transform.
    */
  var TransformType: typingsJapgolly.awsSdk.clientsGlueMod.TransformType
}
object EvaluationMetrics {
  
  inline def apply(TransformType: TransformType): EvaluationMetrics = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationMetrics]
  }
  
  extension [Self <: EvaluationMetrics](x: Self) {
    
    inline def setFindMatchesMetrics(value: FindMatchesMetrics): Self = StObject.set(x, "FindMatchesMetrics", value.asInstanceOf[js.Any])
    
    inline def setFindMatchesMetricsUndefined: Self = StObject.set(x, "FindMatchesMetrics", js.undefined)
    
    inline def setTransformType(value: TransformType): Self = StObject.set(x, "TransformType", value.asInstanceOf[js.Any])
  }
}
