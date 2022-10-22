package typingsJapgolly.winrtUwp.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the RedialRequested event. */
trait RedialRequestedEventArgs extends StObject {
  
  /** Indicates that the RedialRequested event has been handled. */
  def handled(): Unit
}
object RedialRequestedEventArgs {
  
  inline def apply(handled: Callback): RedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.toJsFn)
    __obj.asInstanceOf[RedialRequestedEventArgs]
  }
  
  extension [Self <: RedialRequestedEventArgs](x: Self) {
    
    inline def setHandled(value: Callback): Self = StObject.set(x, "handled", value.toJsFn)
  }
}
