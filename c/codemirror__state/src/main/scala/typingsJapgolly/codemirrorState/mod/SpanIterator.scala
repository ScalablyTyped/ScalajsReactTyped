package typingsJapgolly.codemirrorState.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Methods used when iterating over the spans created by a set of
ranges. The entire iterated range will be covered with either
`span` or `point` calls.
*/
trait SpanIterator[T /* <: RangeValue */] extends StObject {
  
  /**
    Called when going over a point decoration. The active range
    decorations that cover the point and have a higher precedence
    are provided in `active`. The open count in `openStart` counts
    the number of those ranges that started before the point and. If
    the point started before the iterated range, `openStart` will be
    `active.length + 1` to signal this.
    */
  def point(from: Double, to: Double, value: T, active: js.Array[T], openStart: Double, index: Double): Unit
  
  /**
    Called for any ranges not covered by point decorations. `active`
    holds the values that the range is marked with (and may be
    empty). `openStart` indicates how many of those ranges are open
    (continued) at the start of the span.
    */
  def span(from: Double, to: Double, active: js.Array[T], openStart: Double): Unit
}
object SpanIterator {
  
  inline def apply[T /* <: RangeValue */](
    point: (Double, Double, T, js.Array[T], Double, Double) => Callback,
    span: (Double, Double, js.Array[T], Double) => Callback
  ): SpanIterator[T] = {
    val __obj = js.Dynamic.literal(point = js.Any.fromFunction6((t0: Double, t1: Double, t2: T, t3: js.Array[T], t4: Double, t5: Double) => (point(t0, t1, t2, t3, t4, t5)).runNow()), span = js.Any.fromFunction4((t0: Double, t1: Double, t2: js.Array[T], t3: Double) => (span(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[SpanIterator[T]]
  }
  
  extension [Self <: SpanIterator[?], T /* <: RangeValue */](x: Self & SpanIterator[T]) {
    
    inline def setPoint(value: (Double, Double, T, js.Array[T], Double, Double) => Callback): Self = StObject.set(x, "point", js.Any.fromFunction6((t0: Double, t1: Double, t2: T, t3: js.Array[T], t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setSpan(value: (Double, Double, js.Array[T], Double) => Callback): Self = StObject.set(x, "span", js.Any.fromFunction4((t0: Double, t1: Double, t2: js.Array[T], t3: Double) => (value(t0, t1, t2, t3)).runNow()))
  }
}
