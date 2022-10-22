package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentCardClickEvent extends StObject {
  
  def getDownloadURL(): js.Promise[String]
}
object AttachmentCardClickEvent {
  
  inline def apply(getDownloadURL: CallbackTo[js.Promise[String]]): AttachmentCardClickEvent = {
    val __obj = js.Dynamic.literal(getDownloadURL = getDownloadURL.toJsFn)
    __obj.asInstanceOf[AttachmentCardClickEvent]
  }
  
  extension [Self <: AttachmentCardClickEvent](x: Self) {
    
    inline def setGetDownloadURL(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDownloadURL", value.toJsFn)
  }
}
