package typingsJapgolly.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the gender of the face. */
trait FaceGender extends StObject {
  
  /** Gender identified by the face. For example, `MALE` or `FEMALE`. */
  var gender: String
  
  /** The word for "male" or "female" in the language defined by the **Accept-Language** request header. */
  var gender_label: String
  
  /** Confidence score in the range of 0 to 1. A higher score indicates greater confidence in the estimated value for the property. */
  var score: Double
}
object FaceGender {
  
  inline def apply(gender: String, gender_label: String, score: Double): FaceGender = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], gender_label = gender_label.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceGender]
  }
  
  extension [Self <: FaceGender](x: Self) {
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGender_label(value: String): Self = StObject.set(x, "gender_label", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
