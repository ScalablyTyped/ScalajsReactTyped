package typingsJapgolly.phonon.Phonon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononNotifComponent extends StObject {
  
  def hide(): PhononNotifComponent
  
  def setColor(color: PhononColor): PhononNotifComponent
  
  def show(): PhononNotifComponent
}
object PhononNotifComponent {
  
  inline def apply(
    hide: CallbackTo[PhononNotifComponent],
    setColor: PhononColor => PhononNotifComponent,
    show: CallbackTo[PhononNotifComponent]
  ): PhononNotifComponent = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, setColor = js.Any.fromFunction1(setColor), show = show.toJsFn)
    __obj.asInstanceOf[PhononNotifComponent]
  }
  
  extension [Self <: PhononNotifComponent](x: Self) {
    
    inline def setHide(value: CallbackTo[PhononNotifComponent]): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setSetColor(value: PhononColor => PhononNotifComponent): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
    
    inline def setShow(value: CallbackTo[PhononNotifComponent]): Self = StObject.set(x, "show", value.toJsFn)
  }
}
