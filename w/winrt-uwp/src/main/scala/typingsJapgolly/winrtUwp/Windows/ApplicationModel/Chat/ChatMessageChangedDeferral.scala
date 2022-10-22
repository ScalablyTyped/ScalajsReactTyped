package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferred asynchronous change request. */
trait ChatMessageChangedDeferral extends StObject {
  
  /** Fires to indicate that the deferred change request has completed. */
  def complete(): Unit
}
object ChatMessageChangedDeferral {
  
  inline def apply(complete: Callback): ChatMessageChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[ChatMessageChangedDeferral]
  }
  
  extension [Self <: ChatMessageChangedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
