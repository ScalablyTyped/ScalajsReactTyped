package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait System[T /* <: js.Object */] extends StObject {
  
  var data: T
  
  var el: Entity[ObjectMap[Component[Any, System[Any]]]]
  
  def init(): Unit
  
  def pause(): Unit
  
  def play(): Unit
  
  var schema: Schema_[T]
  
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.undefined
}
object System {
  
  inline def apply[T /* <: js.Object */](
    data: T,
    el: Entity[ObjectMap[Component[Any, System[Any]]]],
    init: Callback,
    pause: Callback,
    play: Callback,
    schema: Schema_[T]
  ): System[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], init = init.toJsFn, pause = pause.toJsFn, play = play.toJsFn, schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[System[T]]
  }
  
  extension [Self <: System[?], T /* <: js.Object */](x: Self & System[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEl(value: Entity[ObjectMap[Component[Any, System[Any]]]]): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSchema(value: Schema_[T]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTick(value: (/* t */ Double, /* dt */ Double) => Callback): Self = StObject.set(x, "tick", js.Any.fromFunction2((t0: /* t */ Double, t1: /* dt */ Double) => (value(t0, t1)).runNow()))
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
  }
}
