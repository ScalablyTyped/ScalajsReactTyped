package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Slider, 'pause' | 'start' | 'next' | 'prev' | 'destroy'> */
trait PickSliderpausestartnextp extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
  
  def next(): Unit
  @JSName("next")
  var next_Original: js.Function0[Unit]
  
  def pause(): Unit
  @JSName("pause")
  var pause_Original: js.Function0[Unit]
  
  def prev(): Unit
  @JSName("prev")
  var prev_Original: js.Function0[Unit]
  
  def start(): Unit
  @JSName("start")
  var start_Original: js.Function0[Unit]
}
object PickSliderpausestartnextp {
  
  inline def apply(destroy: Callback, next: Callback, pause: Callback, prev: Callback, start: Callback): PickSliderpausestartnextp = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, next = next.toJsFn, pause = pause.toJsFn, prev = prev.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[PickSliderpausestartnextp]
  }
  
  extension [Self <: PickSliderpausestartnextp](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPrev(value: Callback): Self = StObject.set(x, "prev", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
  }
}
