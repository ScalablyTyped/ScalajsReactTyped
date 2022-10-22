package typingsJapgolly.jqueryGridster

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridsterCollision extends StObject {
  
  def on_overlap(data: GridsterCollisionData): Unit
  
  def on_overlap_start(data: GridsterCollisionData): Unit
  
  def on_overlap_stop(data: GridsterCollisionData): Unit
}
object GridsterCollision {
  
  inline def apply(
    on_overlap: GridsterCollisionData => Callback,
    on_overlap_start: GridsterCollisionData => Callback,
    on_overlap_stop: GridsterCollisionData => Callback
  ): GridsterCollision = {
    val __obj = js.Dynamic.literal(on_overlap = js.Any.fromFunction1((t0: GridsterCollisionData) => on_overlap(t0).runNow()), on_overlap_start = js.Any.fromFunction1((t0: GridsterCollisionData) => on_overlap_start(t0).runNow()), on_overlap_stop = js.Any.fromFunction1((t0: GridsterCollisionData) => on_overlap_stop(t0).runNow()))
    __obj.asInstanceOf[GridsterCollision]
  }
  
  extension [Self <: GridsterCollision](x: Self) {
    
    inline def setOn_overlap(value: GridsterCollisionData => Callback): Self = StObject.set(x, "on_overlap", js.Any.fromFunction1((t0: GridsterCollisionData) => value(t0).runNow()))
    
    inline def setOn_overlap_start(value: GridsterCollisionData => Callback): Self = StObject.set(x, "on_overlap_start", js.Any.fromFunction1((t0: GridsterCollisionData) => value(t0).runNow()))
    
    inline def setOn_overlap_stop(value: GridsterCollisionData => Callback): Self = StObject.set(x, "on_overlap_stop", js.Any.fromFunction1((t0: GridsterCollisionData) => value(t0).runNow()))
  }
}
