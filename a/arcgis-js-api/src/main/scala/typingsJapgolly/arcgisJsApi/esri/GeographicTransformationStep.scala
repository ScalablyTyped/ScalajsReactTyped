package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeographicTransformationStep extends StObject {
  
  /**
    * Gets the inverse of the geographic transformation step used to call this method or `null` if the transformation step is not invertible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#getInverse)
    */
  def getInverse(): GeographicTransformationStep
  
  /**
    * Indicates with the geographic transformation is inverted.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#isInverse)
    */
  var isInverse: Boolean
  
  /**
    * The well-known id (wkid) hat represents a known geographic transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkid)
    */
  var wkid: Double
  
  /**
    * The well-known text (wkt) that represents a known geographic transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkt)
    */
  var wkt: String
}
object GeographicTransformationStep {
  
  inline def apply(
    getInverse: CallbackTo[GeographicTransformationStep],
    isInverse: Boolean,
    wkid: Double,
    wkt: String
  ): GeographicTransformationStep = {
    val __obj = js.Dynamic.literal(getInverse = getInverse.toJsFn, isInverse = isInverse.asInstanceOf[js.Any], wkid = wkid.asInstanceOf[js.Any], wkt = wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicTransformationStep]
  }
  
  extension [Self <: GeographicTransformationStep](x: Self) {
    
    inline def setGetInverse(value: CallbackTo[GeographicTransformationStep]): Self = StObject.set(x, "getInverse", value.toJsFn)
    
    inline def setIsInverse(value: Boolean): Self = StObject.set(x, "isInverse", value.asInstanceOf[js.Any])
    
    inline def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    inline def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
  }
}
