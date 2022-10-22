package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events from a scripting engine.
  * @deprecated Deprecated
  */
trait XEngineListener
  extends StObject
     with XEventListener {
  
  /** gets fired when the script execution has finished. */
  def finished(Evt: FinishEngineEvent): Unit
  
  /**
    * gets fired when an interrupt occurs during the script execution.
    *
    * If you call the method, the execution stops. So in this situation, the stack and variable values are still available by using the appropriate {@link
    * XDebugging} methods.
    */
  def interrupt(Evt: InterruptEngineEvent): Unit
  
  /** gets fired when the script gets into execution state. */
  def running(Evt: EventObject): Unit
}
object XEngineListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    finished: FinishEngineEvent => Callback,
    interrupt: InterruptEngineEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    running: EventObject => Callback
  ): XEngineListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), finished = js.Any.fromFunction1((t0: FinishEngineEvent) => finished(t0).runNow()), interrupt = js.Any.fromFunction1((t0: InterruptEngineEvent) => interrupt(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, running = js.Any.fromFunction1((t0: EventObject) => running(t0).runNow()))
    __obj.asInstanceOf[XEngineListener]
  }
  
  extension [Self <: XEngineListener](x: Self) {
    
    inline def setFinished(value: FinishEngineEvent => Callback): Self = StObject.set(x, "finished", js.Any.fromFunction1((t0: FinishEngineEvent) => value(t0).runNow()))
    
    inline def setInterrupt(value: InterruptEngineEvent => Callback): Self = StObject.set(x, "interrupt", js.Any.fromFunction1((t0: InterruptEngineEvent) => value(t0).runNow()))
    
    inline def setRunning(value: EventObject => Callback): Self = StObject.set(x, "running", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
