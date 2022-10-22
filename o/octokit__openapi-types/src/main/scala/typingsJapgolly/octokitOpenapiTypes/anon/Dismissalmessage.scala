package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismissalmessage extends StObject {
  
  var dismissal_commit_id: js.UndefOr[String] = js.undefined
  
  var dismissal_message: String | Null
  
  var review_id: Double
  
  var state: String
}
object Dismissalmessage {
  
  inline def apply(review_id: Double, state: String): Dismissalmessage = {
    val __obj = js.Dynamic.literal(review_id = review_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], dismissal_message = null)
    __obj.asInstanceOf[Dismissalmessage]
  }
  
  extension [Self <: Dismissalmessage](x: Self) {
    
    inline def setDismissal_commit_id(value: String): Self = StObject.set(x, "dismissal_commit_id", value.asInstanceOf[js.Any])
    
    inline def setDismissal_commit_idUndefined: Self = StObject.set(x, "dismissal_commit_id", js.undefined)
    
    inline def setDismissal_message(value: String): Self = StObject.set(x, "dismissal_message", value.asInstanceOf[js.Any])
    
    inline def setDismissal_messageNull: Self = StObject.set(x, "dismissal_message", null)
    
    inline def setReview_id(value: Double): Self = StObject.set(x, "review_id", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
