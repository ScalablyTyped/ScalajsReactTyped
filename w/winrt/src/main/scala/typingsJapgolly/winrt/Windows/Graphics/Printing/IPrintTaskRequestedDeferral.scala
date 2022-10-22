package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskRequestedDeferral extends StObject {
  
  def complete(): Unit
}
object IPrintTaskRequestedDeferral {
  
  inline def apply(complete: Callback): IPrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[IPrintTaskRequestedDeferral]
  }
  
  extension [Self <: IPrintTaskRequestedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
