package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStateListener2 extends StObject {
  
  def complete(entry: TrackEntry): Unit
  
  def dispose(entry: TrackEntry): Unit
  
  def end(entry: TrackEntry): Unit
  
  def event(entry: TrackEntry, event: Event): Unit
  
  def interrupt(entry: TrackEntry): Unit
  
  def start(entry: TrackEntry): Unit
}
object AnimationStateListener2 {
  
  inline def apply(
    complete: TrackEntry => Callback,
    dispose: TrackEntry => Callback,
    end: TrackEntry => Callback,
    event: (TrackEntry, Event) => Callback,
    interrupt: TrackEntry => Callback,
    start: TrackEntry => Callback
  ): AnimationStateListener2 = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: TrackEntry) => complete(t0).runNow()), dispose = js.Any.fromFunction1((t0: TrackEntry) => dispose(t0).runNow()), end = js.Any.fromFunction1((t0: TrackEntry) => end(t0).runNow()), event = js.Any.fromFunction2((t0: TrackEntry, t1: Event) => (event(t0, t1)).runNow()), interrupt = js.Any.fromFunction1((t0: TrackEntry) => interrupt(t0).runNow()), start = js.Any.fromFunction1((t0: TrackEntry) => start(t0).runNow()))
    __obj.asInstanceOf[AnimationStateListener2]
  }
  
  extension [Self <: AnimationStateListener2](x: Self) {
    
    inline def setComplete(value: TrackEntry => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setDispose(value: TrackEntry => Callback): Self = StObject.set(x, "dispose", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setEnd(value: TrackEntry => Callback): Self = StObject.set(x, "end", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setEvent(value: (TrackEntry, Event) => Callback): Self = StObject.set(x, "event", js.Any.fromFunction2((t0: TrackEntry, t1: Event) => (value(t0, t1)).runNow()))
    
    inline def setInterrupt(value: TrackEntry => Callback): Self = StObject.set(x, "interrupt", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setStart(value: TrackEntry => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
  }
}
