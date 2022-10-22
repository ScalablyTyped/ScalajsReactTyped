package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControl extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
}
object MapControl {
  
  inline def apply(hide: Callback, show: Callback): MapControl = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[MapControl]
  }
  
  extension [Self <: MapControl](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
