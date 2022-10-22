package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventQueue extends StObject {
  
  var animState: AnimationState
  
  def clear(): Unit
  
  def complete(entry: TrackEntry): Unit
  
  def dispose(entry: TrackEntry): Unit
  
  def drain(): Unit
  
  var drainDisabled: Boolean
  
  def end(entry: TrackEntry): Unit
  
  def event(entry: TrackEntry, event: Event): Unit
  
  def interrupt(entry: TrackEntry): Unit
  
  var objects: js.Array[Any]
  
  def start(entry: TrackEntry): Unit
}
object EventQueue {
  
  inline def apply(
    animState: AnimationState,
    clear: Callback,
    complete: TrackEntry => Callback,
    dispose: TrackEntry => Callback,
    drain: Callback,
    drainDisabled: Boolean,
    end: TrackEntry => Callback,
    event: (TrackEntry, Event) => Callback,
    interrupt: TrackEntry => Callback,
    objects: js.Array[Any],
    start: TrackEntry => Callback
  ): EventQueue = {
    val __obj = js.Dynamic.literal(animState = animState.asInstanceOf[js.Any], clear = clear.toJsFn, complete = js.Any.fromFunction1((t0: TrackEntry) => complete(t0).runNow()), dispose = js.Any.fromFunction1((t0: TrackEntry) => dispose(t0).runNow()), drain = drain.toJsFn, drainDisabled = drainDisabled.asInstanceOf[js.Any], end = js.Any.fromFunction1((t0: TrackEntry) => end(t0).runNow()), event = js.Any.fromFunction2((t0: TrackEntry, t1: Event) => (event(t0, t1)).runNow()), interrupt = js.Any.fromFunction1((t0: TrackEntry) => interrupt(t0).runNow()), objects = objects.asInstanceOf[js.Any], start = js.Any.fromFunction1((t0: TrackEntry) => start(t0).runNow()))
    __obj.asInstanceOf[EventQueue]
  }
  
  extension [Self <: EventQueue](x: Self) {
    
    inline def setAnimState(value: AnimationState): Self = StObject.set(x, "animState", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setComplete(value: TrackEntry => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setDispose(value: TrackEntry => Callback): Self = StObject.set(x, "dispose", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setDrain(value: Callback): Self = StObject.set(x, "drain", value.toJsFn)
    
    inline def setDrainDisabled(value: Boolean): Self = StObject.set(x, "drainDisabled", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: TrackEntry => Callback): Self = StObject.set(x, "end", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setEvent(value: (TrackEntry, Event) => Callback): Self = StObject.set(x, "event", js.Any.fromFunction2((t0: TrackEntry, t1: Event) => (value(t0, t1)).runNow()))
    
    inline def setInterrupt(value: TrackEntry => Callback): Self = StObject.set(x, "interrupt", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setStart(value: TrackEntry => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
  }
}
