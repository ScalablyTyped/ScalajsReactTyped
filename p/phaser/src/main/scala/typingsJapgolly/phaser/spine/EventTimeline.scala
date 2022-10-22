package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTimeline
  extends StObject
     with Timeline {
  
  var events: js.Array[Event]
  
  var frames: ArrayLike[Double]
  
  def getFrameCount(): Double
  
  def setFrame(frameIndex: Double, event: Event): Unit
}
object EventTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    events: js.Array[Event],
    frames: ArrayLike[Double],
    getFrameCount: CallbackTo[Double],
    getPropertyId: CallbackTo[Double],
    setFrame: (Double, Event) => Callback
  ): EventTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (apply(t0, t1, t2, t3, t4, t5, t6)).runNow()), events = events.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = getFrameCount.toJsFn, getPropertyId = getPropertyId.toJsFn, setFrame = js.Any.fromFunction2((t0: Double, t1: Event) => (setFrame(t0, t1)).runNow()))
    __obj.asInstanceOf[EventTimeline]
  }
  
  extension [Self <: EventTimeline](x: Self) {
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setGetFrameCount(value: CallbackTo[Double]): Self = StObject.set(x, "getFrameCount", value.toJsFn)
    
    inline def setSetFrame(value: (Double, Event) => Callback): Self = StObject.set(x, "setFrame", js.Any.fromFunction2((t0: Double, t1: Event) => (value(t0, t1)).runNow()))
  }
}
