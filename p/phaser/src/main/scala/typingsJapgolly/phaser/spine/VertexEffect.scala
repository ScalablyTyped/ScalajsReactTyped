package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexEffect extends StObject {
  
  def begin(skeleton: Skeleton): Unit
  
  def end(): Unit
  
  def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit
}
object VertexEffect {
  
  inline def apply(
    begin: Skeleton => Callback,
    end: Callback,
    transform: (Vector2, Vector2, Color, Color) => Callback
  ): VertexEffect = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1((t0: Skeleton) => begin(t0).runNow()), end = end.toJsFn, transform = js.Any.fromFunction4((t0: Vector2, t1: Vector2, t2: Color, t3: Color) => (transform(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[VertexEffect]
  }
  
  extension [Self <: VertexEffect](x: Self) {
    
    inline def setBegin(value: Skeleton => Callback): Self = StObject.set(x, "begin", js.Any.fromFunction1((t0: Skeleton) => value(t0).runNow()))
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setTransform(value: (Vector2, Vector2, Color, Color) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction4((t0: Vector2, t1: Vector2, t2: Color, t3: Color) => (value(t0, t1, t2, t3)).runNow()))
  }
}
