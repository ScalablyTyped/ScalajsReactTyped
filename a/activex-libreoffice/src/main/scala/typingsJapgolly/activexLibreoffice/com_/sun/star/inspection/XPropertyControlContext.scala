package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the interface of the context of an {@link XPropertyControl} .
  * @see XPropertyControl.ControlContext
  * @since OOo 2.0.3
  */
trait XPropertyControlContext
  extends StObject
     with XPropertyControlObserver {
  
  /**
    * instructs the {@link XPropertyControlContext} to active the next control
    * @param CurrentControl denotes the control which initiated the request.
    */
  def activateNextControl(CurrentControl: XPropertyControl): Unit
}
object XPropertyControlContext {
  
  inline def apply(
    activateNextControl: XPropertyControl => Callback,
    focusGained: XPropertyControl => Callback,
    valueChanged: XPropertyControl => Callback
  ): XPropertyControlContext = {
    val __obj = js.Dynamic.literal(activateNextControl = js.Any.fromFunction1((t0: XPropertyControl) => activateNextControl(t0).runNow()), focusGained = js.Any.fromFunction1((t0: XPropertyControl) => focusGained(t0).runNow()), valueChanged = js.Any.fromFunction1((t0: XPropertyControl) => valueChanged(t0).runNow()))
    __obj.asInstanceOf[XPropertyControlContext]
  }
  
  extension [Self <: XPropertyControlContext](x: Self) {
    
    inline def setActivateNextControl(value: XPropertyControl => Callback): Self = StObject.set(x, "activateNextControl", js.Any.fromFunction1((t0: XPropertyControl) => value(t0).runNow()))
  }
}
