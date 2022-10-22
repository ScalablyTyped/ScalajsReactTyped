package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeographicTransformation extends StObject {
  
  /**
    * Returns the inverse of the geographic transformation calling this method or `null` if the transformation is not invertible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#getInverse)
    */
  def getInverse(): GeographicTransformation
  
  /**
    * Geographic transformation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps)
    */
  var steps: js.Array[GeographicTransformationStep]
}
object GeographicTransformation {
  
  inline def apply(getInverse: CallbackTo[GeographicTransformation], steps: js.Array[GeographicTransformationStep]): GeographicTransformation = {
    val __obj = js.Dynamic.literal(getInverse = getInverse.toJsFn, steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicTransformation]
  }
  
  extension [Self <: GeographicTransformation](x: Self) {
    
    inline def setGetInverse(value: CallbackTo[GeographicTransformation]): Self = StObject.set(x, "getInverse", value.toJsFn)
    
    inline def setSteps(value: js.Array[GeographicTransformationStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: GeographicTransformationStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
