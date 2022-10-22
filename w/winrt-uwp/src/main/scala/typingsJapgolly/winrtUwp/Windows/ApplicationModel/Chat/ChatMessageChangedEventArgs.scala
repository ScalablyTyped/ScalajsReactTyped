package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents event parameters used by the event handler that processes message change events. */
trait ChatMessageChangedEventArgs extends StObject {
  
  /**
    * The message changed event handler that an application registers with the message store receives a deferral object in the event parameters. The GetDeferral method registers a change deferral and allows an application to take action related to the change before the message store completes the change.
    * @return Gets a deferral for the MessageChanged event.
    */
  def getDeferral(): ChatMessageChangedDeferral
}
object ChatMessageChangedEventArgs {
  
  inline def apply(getDeferral: CallbackTo[ChatMessageChangedDeferral]): ChatMessageChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[ChatMessageChangedEventArgs]
  }
  
  extension [Self <: ChatMessageChangedEventArgs](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[ChatMessageChangedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
