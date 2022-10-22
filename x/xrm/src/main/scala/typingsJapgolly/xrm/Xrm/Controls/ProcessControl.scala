package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.DisplayState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessControl
  extends StObject
     with UiCanGetVisibleElement
     with UiCanSetVisibleElement {
  
  /**
    * Gets the display state of the process flow control.
    */
  def getDisplayState(): DisplayState
  
  /**
    * Reflow the UI of the process control
    * @param updateUI Specify true to update the UI of the process control; false otherwise.
    * @param parentStage ID of the parent stage.
    * @param nextStage ID of the next stage.
    */
  def reflow(updateUI: Boolean, parentStage: String, nextStage: String): Unit
  
  /**
    * Sets display state of the process flow control.
    * @param displayState Display state of the process flow control, as either "expanded" or "collapsed"
    */
  def setDisplayState(displayState: DisplayState): Unit
}
object ProcessControl {
  
  inline def apply(
    getDisplayState: CallbackTo[DisplayState],
    getVisible: CallbackTo[Boolean],
    reflow: (Boolean, String, String) => Callback,
    setDisplayState: DisplayState => Callback,
    setVisible: Boolean => Callback
  ): ProcessControl = {
    val __obj = js.Dynamic.literal(getDisplayState = getDisplayState.toJsFn, getVisible = getVisible.toJsFn, reflow = js.Any.fromFunction3((t0: Boolean, t1: String, t2: String) => (reflow(t0, t1, t2)).runNow()), setDisplayState = js.Any.fromFunction1((t0: DisplayState) => setDisplayState(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[ProcessControl]
  }
  
  extension [Self <: ProcessControl](x: Self) {
    
    inline def setGetDisplayState(value: CallbackTo[DisplayState]): Self = StObject.set(x, "getDisplayState", value.toJsFn)
    
    inline def setReflow(value: (Boolean, String, String) => Callback): Self = StObject.set(x, "reflow", js.Any.fromFunction3((t0: Boolean, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetDisplayState(value: DisplayState => Callback): Self = StObject.set(x, "setDisplayState", js.Any.fromFunction1((t0: DisplayState) => value(t0).runNow()))
  }
}
