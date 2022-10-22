package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * controls a status indicator which displays progress of longer actions to the user
  *
  * Such objects are provided by a {@link XStatusIndicatorFactory} .
  * @see XStatusIndicatorFactory
  */
trait XStatusIndicator
  extends StObject
     with XInterface {
  
  /**
    * stop the progress
    *
    * Further calls of {@link XStatusIndicator.setText()} , {@link XStatusIndicator.setValue()} or {@link XStatusIndicator.reset()} must be ignored. Only
    * {@link XStatusIndicator.start()} can reactivate this indicator. It's not allowed to destruct the indicator inside this method. The instance must be
    * gone by using ref count or disposing.
    */
  def end(): Unit
  
  /**
    * clear progress value and description
    *
    * Calling of setValue(0) and setText("") should do the same. Stopped indicators must ignore this call.
    */
  def reset(): Unit
  
  /**
    * update progress description
    *
    * Initial value can be set during starting of the progress by calling {@link XStatusIndicator.start()} . Stopped indicators must ignore this call.
    * @param Text new value for progress description which should be shown now
    */
  def setText(Text: String): Unit
  
  /**
    * update progress value
    *
    * Wrong values must be ignored and stopped indicators must ignore this call generally.
    * @param Value new value for progress which should be shown now Must fit the range [0..Range] which was set during {@link XStatusIndicator.start()} .
    */
  def setValue(Value: Double): Unit
  
  /**
    * initialize and start the progress
    *
    * It activates a new created or reactivate an already used indicator (must be finished by calling {@link XStatusIndicator.end()} before!). By the way
    * it's possible to set first progress description and the possible range of progress value. That means that a progress can runs from 0 to **Range** .
    * @param Text initial value for progress description for showing Value can be updated by calling {@link XStatusIndicator.setText()} .
    * @param Range means the maximum value of the progress which can be set by calling {@link XStatusIndicator.setValue()} .
    */
  def start(Text: String, Range: Double): Unit
}
object XStatusIndicator {
  
  inline def apply(
    acquire: Callback,
    end: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    reset: Callback,
    setText: String => Callback,
    setValue: Double => Callback,
    start: (String, Double) => Callback
  ): XStatusIndicator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, end = end.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reset = reset.toJsFn, setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()), start = js.Any.fromFunction2((t0: String, t1: Double) => (start(t0, t1)).runNow()))
    __obj.asInstanceOf[XStatusIndicator]
  }
  
  extension [Self <: XStatusIndicator](x: Self) {
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStart(value: (String, Double) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
  }
}
