package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sub-class specialization of EventHandler base class.
  *
  * TaskLoop allows to schedule a task function being called (optionnaly repeatedly) on the main loop,
  * scheduled asynchroneously, avoiding recursive calls in the same tick.
  *
  * The task itself is implemented in `doTick`. It can be requested and called for single execution
  * using the `tick` method.
  *
  * It will be assured that the task execution method (`tick`) only gets called once per main loop "tick",
  * no matter how often it gets requested for execution. Execution in further ticks will be scheduled accordingly.
  *
  * If further execution requests have already been scheduled on the next tick, it can be checked with `hasNextTick`,
  * and cancelled with `clearNextTick`.
  *
  * The task can be scheduled as an interval repeatedly with a period as parameter (see `setInterval`, `clearInterval`).
  *
  * Sub-classes need to implement the `doTick` method which will effectively have the task execution routine.
  *
  * Further explanations:
  *
  * The baseclass has a `tick` method that will schedule the doTick call. It may be called synchroneously
  * only for a stack-depth of one. On re-entrant calls, sub-sequent calls are scheduled for next main loop ticks.
  *
  * When the task execution (`tick` method) is called in re-entrant way this is detected and
  * we are limiting the task execution per call stack to exactly one, but scheduling/post-poning further
  * task processing on the next main loop iteration (also known as "next tick" in the Node/JS runtime lingo).
  */
trait TaskLoop extends StObject {
  
  /* private */ val _boundTick: Any
  
  /* private */ var _tickCallCount: Any
  
  /* private */ var _tickInterval: Any
  
  /* private */ var _tickTimer: Any
  
  /**
    * @returns {boolean} True when interval was cleared, false when none was set (no effect)
    */
  def clearInterval(): Boolean
  
  /**
    * @returns {boolean} True when timeout was cleared, false when none was set (no effect)
    */
  def clearNextTick(): Boolean
  
  def destroy(): Unit
  
  /**
    * For subclass to implement task logic
    * @abstract
    */
  /* protected */ def doTick(): Unit
  
  /**
    * @returns {boolean}
    */
  def hasInterval(): Boolean
  
  /**
    * @returns {boolean}
    */
  def hasNextTick(): Boolean
  
  /* protected */ def onHandlerDestroyed(): Unit
  
  /* protected */ def onHandlerDestroying(): Unit
  
  /**
    * @param {number} millis Interval time (ms)
    * @returns {boolean} True when interval has been scheduled, false when already scheduled (no effect)
    */
  def setInterval(millis: Double): Boolean
  
  /**
    * Will call the subclass doTick implementation in this main loop tick
    * or in the next one (via setTimeout(,0)) in case it has already been called
    * in this tick (in case this is a re-entrant call).
    */
  def tick(): Unit
  
  def tickImmediate(): Unit
}
object TaskLoop {
  
  inline def apply(
    _boundTick: Any,
    _tickCallCount: Any,
    _tickInterval: Any,
    _tickTimer: Any,
    clearInterval: CallbackTo[Boolean],
    clearNextTick: CallbackTo[Boolean],
    destroy: Callback,
    doTick: Callback,
    hasInterval: CallbackTo[Boolean],
    hasNextTick: CallbackTo[Boolean],
    onHandlerDestroyed: Callback,
    onHandlerDestroying: Callback,
    setInterval: Double => Boolean,
    tick: Callback,
    tickImmediate: Callback
  ): TaskLoop = {
    val __obj = js.Dynamic.literal(_boundTick = _boundTick.asInstanceOf[js.Any], _tickCallCount = _tickCallCount.asInstanceOf[js.Any], _tickInterval = _tickInterval.asInstanceOf[js.Any], _tickTimer = _tickTimer.asInstanceOf[js.Any], clearInterval = clearInterval.toJsFn, clearNextTick = clearNextTick.toJsFn, destroy = destroy.toJsFn, doTick = doTick.toJsFn, hasInterval = hasInterval.toJsFn, hasNextTick = hasNextTick.toJsFn, onHandlerDestroyed = onHandlerDestroyed.toJsFn, onHandlerDestroying = onHandlerDestroying.toJsFn, setInterval = js.Any.fromFunction1(setInterval), tick = tick.toJsFn, tickImmediate = tickImmediate.toJsFn)
    __obj.asInstanceOf[TaskLoop]
  }
  
  extension [Self <: TaskLoop](x: Self) {
    
    inline def setClearInterval(value: CallbackTo[Boolean]): Self = StObject.set(x, "clearInterval", value.toJsFn)
    
    inline def setClearNextTick(value: CallbackTo[Boolean]): Self = StObject.set(x, "clearNextTick", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDoTick(value: Callback): Self = StObject.set(x, "doTick", value.toJsFn)
    
    inline def setHasInterval(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasInterval", value.toJsFn)
    
    inline def setHasNextTick(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNextTick", value.toJsFn)
    
    inline def setOnHandlerDestroyed(value: Callback): Self = StObject.set(x, "onHandlerDestroyed", value.toJsFn)
    
    inline def setOnHandlerDestroying(value: Callback): Self = StObject.set(x, "onHandlerDestroying", value.toJsFn)
    
    inline def setSetInterval(value: Double => Boolean): Self = StObject.set(x, "setInterval", js.Any.fromFunction1(value))
    
    inline def setTick(value: Callback): Self = StObject.set(x, "tick", value.toJsFn)
    
    inline def setTickImmediate(value: Callback): Self = StObject.set(x, "tickImmediate", value.toJsFn)
    
    inline def set_boundTick(value: Any): Self = StObject.set(x, "_boundTick", value.asInstanceOf[js.Any])
    
    inline def set_tickCallCount(value: Any): Self = StObject.set(x, "_tickCallCount", value.asInstanceOf[js.Any])
    
    inline def set_tickInterval(value: Any): Self = StObject.set(x, "_tickInterval", value.asInstanceOf[js.Any])
    
    inline def set_tickTimer(value: Any): Self = StObject.set(x, "_tickTimer", value.asInstanceOf[js.Any])
  }
}
