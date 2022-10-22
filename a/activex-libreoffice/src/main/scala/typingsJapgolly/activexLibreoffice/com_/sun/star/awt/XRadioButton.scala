package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the state of a radio button and makes it possible to register item event listeners. */
trait XRadioButton
  extends StObject
     with XInterface {
  
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  var State: Boolean
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  def getState(): Boolean
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
  
  /** sets the label of the radio button. */
  def setLabel(Label: String): Unit
  
  /** sets the state of the radio button. */
  def setState(b: Boolean): Unit
}
object XRadioButton {
  
  inline def apply(
    State: Boolean,
    acquire: Callback,
    addItemListener: XItemListener => Callback,
    getState: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeItemListener: XItemListener => Callback,
    setLabel: String => Callback,
    setState: Boolean => Callback
  ): XRadioButton = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = acquire.toJsFn, addItemListener = js.Any.fromFunction1((t0: XItemListener) => addItemListener(t0).runNow()), getState = getState.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeItemListener = js.Any.fromFunction1((t0: XItemListener) => removeItemListener(t0).runNow()), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setState = js.Any.fromFunction1((t0: Boolean) => setState(t0).runNow()))
    __obj.asInstanceOf[XRadioButton]
  }
  
  extension [Self <: XRadioButton](x: Self) {
    
    inline def setAddItemListener(value: XItemListener => Callback): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setGetState(value: CallbackTo[Boolean]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setRemoveItemListener(value: XItemListener => Callback): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setSetLabel(value: String => Callback): Self = StObject.set(x, "setLabel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetState(value: Boolean => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setState(value: Boolean): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
