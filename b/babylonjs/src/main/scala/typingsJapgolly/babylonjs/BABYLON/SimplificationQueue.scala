package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplificationQueue extends StObject {
  
  /* private */ var _getSimplifier: Any
  
  /* private */ var _simplificationArray: Any
  
  /**
    * Adds a new simplification task
    * @param task defines a task to add
    */
  def addTask(task: ISimplificationTask): Unit
  
  /**
    * Execute next task
    */
  def executeNext(): Unit
  
  /**
    * Execute a simplification task
    * @param task defines the task to run
    */
  def runSimplification(task: ISimplificationTask): Unit
  
  /**
    * Gets a boolean indicating that the process is still running
    */
  var running: Boolean
}
object SimplificationQueue {
  
  inline def apply(
    _getSimplifier: Any,
    _simplificationArray: Any,
    addTask: ISimplificationTask => Callback,
    executeNext: Callback,
    runSimplification: ISimplificationTask => Callback,
    running: Boolean
  ): SimplificationQueue = {
    val __obj = js.Dynamic.literal(_getSimplifier = _getSimplifier.asInstanceOf[js.Any], _simplificationArray = _simplificationArray.asInstanceOf[js.Any], addTask = js.Any.fromFunction1((t0: ISimplificationTask) => addTask(t0).runNow()), executeNext = executeNext.toJsFn, runSimplification = js.Any.fromFunction1((t0: ISimplificationTask) => runSimplification(t0).runNow()), running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplificationQueue]
  }
  
  extension [Self <: SimplificationQueue](x: Self) {
    
    inline def setAddTask(value: ISimplificationTask => Callback): Self = StObject.set(x, "addTask", js.Any.fromFunction1((t0: ISimplificationTask) => value(t0).runNow()))
    
    inline def setExecuteNext(value: Callback): Self = StObject.set(x, "executeNext", value.toJsFn)
    
    inline def setRunSimplification(value: ISimplificationTask => Callback): Self = StObject.set(x, "runSimplification", js.Any.fromFunction1((t0: ISimplificationTask) => value(t0).runNow()))
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def set_getSimplifier(value: Any): Self = StObject.set(x, "_getSimplifier", value.asInstanceOf[js.Any])
    
    inline def set_simplificationArray(value: Any): Self = StObject.set(x, "_simplificationArray", value.asInstanceOf[js.Any])
  }
}
