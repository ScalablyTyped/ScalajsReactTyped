package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserverHandle extends StObject {
  
  /**
  	 * Removes the listener or observer.j
  	 */
  def cancel(): Unit
  
  /**
  	 * @returns true if the callback is not going to be called
  	 */
  def isSilenced(): Boolean
  
  /**
  	 * Resume calling the callback with changes or events.
  	 */
  def resume(): Unit
  
  /**
  	 * Stops further firings of the callback. Any related observers will still stay up-to-date, so the old value will be updated as the data changes.
  	 */
  def silence(): Unit
}
object ObserverHandle {
  
  inline def apply(cancel: Callback, isSilenced: CallbackTo[Boolean], resume: Callback, silence: Callback): ObserverHandle = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, isSilenced = isSilenced.toJsFn, resume = resume.toJsFn, silence = silence.toJsFn)
    __obj.asInstanceOf[ObserverHandle]
  }
  
  extension [Self <: ObserverHandle](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setIsSilenced(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSilenced", value.toJsFn)
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setSilence(value: Callback): Self = StObject.set(x, "silence", value.toJsFn)
  }
}
