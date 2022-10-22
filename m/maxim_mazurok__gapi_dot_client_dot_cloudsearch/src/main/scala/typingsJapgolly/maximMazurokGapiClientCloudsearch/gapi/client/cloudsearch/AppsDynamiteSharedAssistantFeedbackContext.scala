package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAssistantFeedbackContext extends StObject {
  
  /** Specifies a list of feedback chips to show */
  var feedbackChips: js.UndefOr[js.Array[AppsDynamiteSharedAssistantFeedbackContextFeedbackChip]] = js.undefined
  
  /** Whether the thumbs feedback is provided */
  var thumbsFeedback: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedAssistantFeedbackContext {
  
  inline def apply(): AppsDynamiteSharedAssistantFeedbackContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAssistantFeedbackContext]
  }
  
  extension [Self <: AppsDynamiteSharedAssistantFeedbackContext](x: Self) {
    
    inline def setFeedbackChips(value: js.Array[AppsDynamiteSharedAssistantFeedbackContextFeedbackChip]): Self = StObject.set(x, "feedbackChips", value.asInstanceOf[js.Any])
    
    inline def setFeedbackChipsUndefined: Self = StObject.set(x, "feedbackChips", js.undefined)
    
    inline def setFeedbackChipsVarargs(value: AppsDynamiteSharedAssistantFeedbackContextFeedbackChip*): Self = StObject.set(x, "feedbackChips", js.Array(value*))
    
    inline def setThumbsFeedback(value: String): Self = StObject.set(x, "thumbsFeedback", value.asInstanceOf[js.Any])
    
    inline def setThumbsFeedbackUndefined: Self = StObject.set(x, "thumbsFeedback", js.undefined)
  }
}
