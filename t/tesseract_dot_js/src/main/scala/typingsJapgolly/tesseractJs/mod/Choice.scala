package typingsJapgolly.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Choice extends StObject {
  
  var confidence: Double
  
  var text: String
}
object Choice {
  
  inline def apply(confidence: Double, text: String): Choice = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choice]
  }
  
  extension [Self <: Choice](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
