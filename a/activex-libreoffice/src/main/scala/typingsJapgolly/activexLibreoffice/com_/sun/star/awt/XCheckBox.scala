package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the state of a check box and makes it possible to register for events. */
trait XCheckBox
  extends StObject
     with XInterface {
  
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  var State: Double
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  
  /** enables or disables the tri state mode. */
  def enableTriState(b: Boolean): Unit
  
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def getState(): Double
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
  
  /** sets the label of the check box. */
  def setLabel(Label: String): Unit
  
  /**
    * sets the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def setState(n: Double): Unit
}
object XCheckBox {
  
  inline def apply(
    State: Double,
    acquire: Callback,
    addItemListener: XItemListener => Callback,
    enableTriState: Boolean => Callback,
    getState: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    removeItemListener: XItemListener => Callback,
    setLabel: String => Callback,
    setState: Double => Callback
  ): XCheckBox = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = acquire.toJsFn, addItemListener = js.Any.fromFunction1((t0: XItemListener) => addItemListener(t0).runNow()), enableTriState = js.Any.fromFunction1((t0: Boolean) => enableTriState(t0).runNow()), getState = getState.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeItemListener = js.Any.fromFunction1((t0: XItemListener) => removeItemListener(t0).runNow()), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setState = js.Any.fromFunction1((t0: Double) => setState(t0).runNow()))
    __obj.asInstanceOf[XCheckBox]
  }
  
  extension [Self <: XCheckBox](x: Self) {
    
    inline def setAddItemListener(value: XItemListener => Callback): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setEnableTriState(value: Boolean => Callback): Self = StObject.set(x, "enableTriState", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGetState(value: CallbackTo[Double]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setRemoveItemListener(value: XItemListener => Callback): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setSetLabel(value: String => Callback): Self = StObject.set(x, "setLabel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetState(value: Double => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
