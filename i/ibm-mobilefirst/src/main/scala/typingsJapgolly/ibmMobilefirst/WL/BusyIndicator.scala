package typingsJapgolly.ibmMobilefirst.WL

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusyIndicator extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
}
object BusyIndicator {
  
  inline def apply(hide: Callback, show: Callback): BusyIndicator = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[BusyIndicator]
  }
  
  extension [Self <: BusyIndicator](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
