package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStateAdapter2
  extends StObject
     with AnimationStateListener2
object AnimationStateAdapter2 {
  
  inline def apply(
    complete: TrackEntry => Callback,
    dispose: TrackEntry => Callback,
    end: TrackEntry => Callback,
    event: (TrackEntry, Event) => Callback,
    interrupt: TrackEntry => Callback,
    start: TrackEntry => Callback
  ): AnimationStateAdapter2 = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: TrackEntry) => complete(t0).runNow()), dispose = js.Any.fromFunction1((t0: TrackEntry) => dispose(t0).runNow()), end = js.Any.fromFunction1((t0: TrackEntry) => end(t0).runNow()), event = js.Any.fromFunction2((t0: TrackEntry, t1: Event) => (event(t0, t1)).runNow()), interrupt = js.Any.fromFunction1((t0: TrackEntry) => interrupt(t0).runNow()), start = js.Any.fromFunction1((t0: TrackEntry) => start(t0).runNow()))
    __obj.asInstanceOf[AnimationStateAdapter2]
  }
}
