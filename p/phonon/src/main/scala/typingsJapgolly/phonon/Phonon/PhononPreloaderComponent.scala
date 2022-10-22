package typingsJapgolly.phonon.Phonon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononPreloaderComponent extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
}
object PhononPreloaderComponent {
  
  inline def apply(hide: Callback, show: Callback): PhononPreloaderComponent = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[PhononPreloaderComponent]
  }
  
  extension [Self <: PhononPreloaderComponent](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
