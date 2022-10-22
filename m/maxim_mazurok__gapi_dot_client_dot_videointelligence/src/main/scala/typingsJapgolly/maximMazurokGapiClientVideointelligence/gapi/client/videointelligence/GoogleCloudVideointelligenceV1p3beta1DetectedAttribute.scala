package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1DetectedAttribute extends StObject {
  
  /** Detected attribute confidence. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** The name of the attribute, for example, glasses, dark_glasses, mouth_open. A full list of supported type names will be provided in the document. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Text value of the detection result. For example, the value for "HairColor" can be "black", "blonde", etc. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1DetectedAttribute {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1DetectedAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1DetectedAttribute]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p3beta1DetectedAttribute](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
