package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRedialRequestedEventArgs extends StObject {
  
  def handled(): Unit
}
object IRedialRequestedEventArgs {
  
  inline def apply(handled: Callback): IRedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.toJsFn)
    __obj.asInstanceOf[IRedialRequestedEventArgs]
  }
  
  extension [Self <: IRedialRequestedEventArgs](x: Self) {
    
    inline def setHandled(value: Callback): Self = StObject.set(x, "handled", value.toJsFn)
  }
}
