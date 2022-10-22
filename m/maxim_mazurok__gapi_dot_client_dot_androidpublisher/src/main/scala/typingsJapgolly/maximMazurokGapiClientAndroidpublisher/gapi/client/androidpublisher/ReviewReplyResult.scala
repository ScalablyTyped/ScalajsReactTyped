package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewReplyResult extends StObject {
  
  /** The time at which the reply took effect. */
  var lastEdited: js.UndefOr[Timestamp] = js.undefined
  
  /** The reply text that was applied. */
  var replyText: js.UndefOr[String] = js.undefined
}
object ReviewReplyResult {
  
  inline def apply(): ReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewReplyResult]
  }
  
  extension [Self <: ReviewReplyResult](x: Self) {
    
    inline def setLastEdited(value: Timestamp): Self = StObject.set(x, "lastEdited", value.asInstanceOf[js.Any])
    
    inline def setLastEditedUndefined: Self = StObject.set(x, "lastEdited", js.undefined)
    
    inline def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    inline def setReplyTextUndefined: Self = StObject.set(x, "replyText", js.undefined)
  }
}
