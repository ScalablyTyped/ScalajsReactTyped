package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for monitoring changes to Contact objects in the ContactStore . */
trait ContactChangeTracker extends StObject {
  
  /** Call this method to enable change tracking. */
  def enable(): Unit
  
  /**
    * Gets a ContactChangeReader that can be used to process changes.
    * @return A ContactChangeReader that can be used to process changes.
    */
  def getChangeReader(): ContactChangeReader
  
  /** Call this method to reset the change tracker if your app receives ContactChangeType.ChangeTrackingLost . */
  def reset(): Unit
}
object ContactChangeTracker {
  
  inline def apply(enable: Callback, getChangeReader: CallbackTo[ContactChangeReader], reset: Callback): ContactChangeTracker = {
    val __obj = js.Dynamic.literal(enable = enable.toJsFn, getChangeReader = getChangeReader.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[ContactChangeTracker]
  }
  
  extension [Self <: ContactChangeTracker](x: Self) {
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setGetChangeReader(value: CallbackTo[ContactChangeReader]): Self = StObject.set(x, "getChangeReader", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
