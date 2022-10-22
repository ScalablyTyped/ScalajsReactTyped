package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the controls within an {@link UnoControlContainer} . */
trait XControlContainer
  extends StObject
     with XInterface {
  
  /** returns all controls. */
  val Controls: SafeArray[XControl]
  
  /** adds the given control with the specified name to the container. */
  def addControl(Name: String, Control: XControl): Unit
  
  /** returns the control with the specified name. */
  def getControl(aName: String): XControl
  
  /** returns all controls. */
  def getControls(): SafeArray[XControl]
  
  /** removes the given control from the container. */
  def removeControl(Control: XControl): Unit
  
  /** sets the status text in the status bar of the container. */
  def setStatusText(StatusText: String): Unit
}
object XControlContainer {
  
  inline def apply(
    Controls: SafeArray[XControl],
    acquire: Callback,
    addControl: (String, XControl) => Callback,
    getControl: String => XControl,
    getControls: CallbackTo[SafeArray[XControl]],
    queryInterface: `type` => Any,
    release: Callback,
    removeControl: XControl => Callback,
    setStatusText: String => Callback
  ): XControlContainer = {
    val __obj = js.Dynamic.literal(Controls = Controls.asInstanceOf[js.Any], acquire = acquire.toJsFn, addControl = js.Any.fromFunction2((t0: String, t1: XControl) => (addControl(t0, t1)).runNow()), getControl = js.Any.fromFunction1(getControl), getControls = getControls.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeControl = js.Any.fromFunction1((t0: XControl) => removeControl(t0).runNow()), setStatusText = js.Any.fromFunction1((t0: String) => setStatusText(t0).runNow()))
    __obj.asInstanceOf[XControlContainer]
  }
  
  extension [Self <: XControlContainer](x: Self) {
    
    inline def setAddControl(value: (String, XControl) => Callback): Self = StObject.set(x, "addControl", js.Any.fromFunction2((t0: String, t1: XControl) => (value(t0, t1)).runNow()))
    
    inline def setControls(value: SafeArray[XControl]): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    inline def setGetControl(value: String => XControl): Self = StObject.set(x, "getControl", js.Any.fromFunction1(value))
    
    inline def setGetControls(value: CallbackTo[SafeArray[XControl]]): Self = StObject.set(x, "getControls", value.toJsFn)
    
    inline def setRemoveControl(value: XControl => Callback): Self = StObject.set(x, "removeControl", js.Any.fromFunction1((t0: XControl) => value(t0).runNow()))
    
    inline def setSetStatusText(value: String => Callback): Self = StObject.set(x, "setStatusText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
