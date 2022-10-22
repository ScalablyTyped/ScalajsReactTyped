package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods to enable and retrieve message change revisions. */
trait ChatMessageChangeTracker extends StObject {
  
  /** Enables change tracking for the messages in the message store. */
  def enable(): Unit
  
  /**
    * Returns a ChatMessageChangeReader class object which provides a collection of message revisions from the message store.
    * @return The change reader associated with the change tracker.
    */
  def getChangeReader(): ChatMessageChangeReader
  
  /** Resets change tracking for the messages in the message store. The first revision begins with the next message change. */
  def reset(): Unit
}
object ChatMessageChangeTracker {
  
  inline def apply(enable: Callback, getChangeReader: CallbackTo[ChatMessageChangeReader], reset: Callback): ChatMessageChangeTracker = {
    val __obj = js.Dynamic.literal(enable = enable.toJsFn, getChangeReader = getChangeReader.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[ChatMessageChangeTracker]
  }
  
  extension [Self <: ChatMessageChangeTracker](x: Self) {
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setGetChangeReader(value: CallbackTo[ChatMessageChangeReader]): Self = StObject.set(x, "getChangeReader", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
