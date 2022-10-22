package typingsJapgolly.messenger

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messenger extends StObject {
  
  /**
    * Hides all messages.
    */
  def hideAll(): Unit
  
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message
}
object Messenger {
  
  inline def apply(hideAll: Callback, post: MessageOptions => Message): Messenger = {
    val __obj = js.Dynamic.literal(hideAll = hideAll.toJsFn, post = js.Any.fromFunction1(post))
    __obj.asInstanceOf[Messenger]
  }
  
  extension [Self <: Messenger](x: Self) {
    
    inline def setHideAll(value: Callback): Self = StObject.set(x, "hideAll", value.toJsFn)
    
    inline def setPost(value: MessageOptions => Message): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
  }
}
