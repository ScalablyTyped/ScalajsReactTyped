package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
trait EmailMailboxChangeTracker extends StObject {
  
  /** Enables change tracking on a mailbox. */
  def enable(): Unit
  
  /**
    * Gets a reader that will read a batch of changes.
    * @return A reader that will read a batch of changes.
    */
  def getChangeReader(): EmailMailboxChangeReader
  
  /** Gets a Boolean value indicating whether change tracking is active. */
  var isTracking: Boolean
  
  /** Moves the change tracking cursor to now. */
  def reset(): Unit
}
object EmailMailboxChangeTracker {
  
  inline def apply(
    enable: Callback,
    getChangeReader: CallbackTo[EmailMailboxChangeReader],
    isTracking: Boolean,
    reset: Callback
  ): EmailMailboxChangeTracker = {
    val __obj = js.Dynamic.literal(enable = enable.toJsFn, getChangeReader = getChangeReader.toJsFn, isTracking = isTracking.asInstanceOf[js.Any], reset = reset.toJsFn)
    __obj.asInstanceOf[EmailMailboxChangeTracker]
  }
  
  extension [Self <: EmailMailboxChangeTracker](x: Self) {
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setGetChangeReader(value: CallbackTo[EmailMailboxChangeReader]): Self = StObject.set(x, "getChangeReader", value.toJsFn)
    
    inline def setIsTracking(value: Boolean): Self = StObject.set(x, "isTracking", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
