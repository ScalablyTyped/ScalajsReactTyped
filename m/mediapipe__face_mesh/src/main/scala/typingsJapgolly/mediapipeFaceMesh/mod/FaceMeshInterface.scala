package typingsJapgolly.mediapipeFaceMesh.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declares the interface of FaceMesh.
  */
trait FaceMeshInterface extends StObject {
  
  def close(): js.Promise[Unit]
  
  def initialize(): js.Promise[Unit]
  
  def onResults(listener: ResultsListener): Unit
  
  def reset(): Unit
  
  def send(inputs: InputMap): js.Promise[Unit]
  
  def setOptions(options: Options): Unit
}
object FaceMeshInterface {
  
  inline def apply(
    close: CallbackTo[js.Promise[Unit]],
    initialize: CallbackTo[js.Promise[Unit]],
    onResults: ResultsListener => Callback,
    reset: Callback,
    send: InputMap => js.Promise[Unit],
    setOptions: Options => Callback
  ): FaceMeshInterface = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, initialize = initialize.toJsFn, onResults = js.Any.fromFunction1((t0: ResultsListener) => onResults(t0).runNow()), reset = reset.toJsFn, send = js.Any.fromFunction1(send), setOptions = js.Any.fromFunction1((t0: Options) => setOptions(t0).runNow()))
    __obj.asInstanceOf[FaceMeshInterface]
  }
  
  extension [Self <: FaceMeshInterface](x: Self) {
    
    inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setInitialize(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setOnResults(value: ResultsListener => Callback): Self = StObject.set(x, "onResults", js.Any.fromFunction1((t0: ResultsListener) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSend(value: InputMap => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setSetOptions(value: Options => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
  }
}
