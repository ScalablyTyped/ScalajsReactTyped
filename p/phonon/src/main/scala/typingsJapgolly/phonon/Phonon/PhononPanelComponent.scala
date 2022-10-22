package typingsJapgolly.phonon.Phonon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononPanelComponent extends StObject {
  
  def close(): Unit
  
  def open(): Unit
}
object PhononPanelComponent {
  
  inline def apply(close: Callback, open: Callback): PhononPanelComponent = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, open = open.toJsFn)
    __obj.asInstanceOf[PhononPanelComponent]
  }
  
  extension [Self <: PhononPanelComponent](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
  }
}
