package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncLoop extends StObject {
  
  /* private */ var _done: Any
  
  /* private */ var _fn: Any
  
  /* private */ var _successCallback: Any
  
  /**
    * Break the loop and run the success callback.
    */
  def breakLoop(): Unit
  
  /**
    * Execute the next iteration. Must be called after the last iteration was finished.
    */
  def executeNext(): Unit
  
  /**
    * Defines the current index of the loop.
    */
  var index: Double
  
  /**
    * Defines the number of iterations for the loop
    */
  var iterations: Double
}
object AsyncLoop {
  
  inline def apply(
    _done: Any,
    _fn: Any,
    _successCallback: Any,
    breakLoop: Callback,
    executeNext: Callback,
    index: Double,
    iterations: Double
  ): AsyncLoop = {
    val __obj = js.Dynamic.literal(_done = _done.asInstanceOf[js.Any], _fn = _fn.asInstanceOf[js.Any], _successCallback = _successCallback.asInstanceOf[js.Any], breakLoop = breakLoop.toJsFn, executeNext = executeNext.toJsFn, index = index.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncLoop]
  }
  
  extension [Self <: AsyncLoop](x: Self) {
    
    inline def setBreakLoop(value: Callback): Self = StObject.set(x, "breakLoop", value.toJsFn)
    
    inline def setExecuteNext(value: Callback): Self = StObject.set(x, "executeNext", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def set_done(value: Any): Self = StObject.set(x, "_done", value.asInstanceOf[js.Any])
    
    inline def set_fn(value: Any): Self = StObject.set(x, "_fn", value.asInstanceOf[js.Any])
    
    inline def set_successCallback(value: Any): Self = StObject.set(x, "_successCallback", value.asInstanceOf[js.Any])
  }
}
