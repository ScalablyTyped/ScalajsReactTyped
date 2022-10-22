package typingsJapgolly.chromeApps.WebView

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Messaging handle to a guest window. */
trait ContentWindow extends StObject {
  
  /**
    * Posts a message to the embedded web content as long as the embedded
    * content is displaying a page from the target origin. This method is
    * available once the page has completed loading. Listen for the
    * contentload event and then call the method.
    *
    * The guest will be able to send replies to the embedder by posting message
    * to event.source on the message event it receives.
    *
    * This API is identical to the HTML5 postMessage API for communication
    * between web pages. The embedder may listen for replies by adding
    * a message event listener to its own frame.
    *
    * @param message Message object to send to the guest.
    * @param targetOrigin Specifies what the origin of the guest window must be for the event to be dispatched.
    */
  def postMessage(message: Any, targetOrigin: String): Unit
}
object ContentWindow {
  
  inline def apply(postMessage: (Any, String) => Callback): ContentWindow = {
    val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction2((t0: Any, t1: String) => (postMessage(t0, t1)).runNow()))
    __obj.asInstanceOf[ContentWindow]
  }
  
  extension [Self <: ContentWindow](x: Self) {
    
    inline def setPostMessage(value: (Any, String) => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
  }
}
