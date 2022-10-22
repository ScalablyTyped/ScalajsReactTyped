package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSpan extends StObject {
  
  /* private */ var _length: Any
  
  /* private */ var _start: Any
  
  def containsPosition(position: Double): Boolean
  
  def containsTextSpan(span: TextSpan): Boolean
  
  def end(): Double
  
  def intersection(span: TextSpan): TextSpan
  
  def intersectsWith(start: Double, length: Double): Boolean
  
  def intersectsWithPosition(position: Double): Boolean
  
  def intersectsWithTextSpan(span: TextSpan): Boolean
  
  def isEmpty(): Boolean
  
  def length(): Double
  
  def overlap(span: TextSpan): TextSpan
  
  def overlapsWith(span: TextSpan): Boolean
  
  def start(): Double
}
object TextSpan {
  
  inline def apply(
    _length: Any,
    _start: Any,
    containsPosition: Double => Boolean,
    containsTextSpan: TextSpan => Boolean,
    end: CallbackTo[Double],
    intersection: TextSpan => TextSpan,
    intersectsWith: (Double, Double) => Boolean,
    intersectsWithPosition: Double => Boolean,
    intersectsWithTextSpan: TextSpan => Boolean,
    isEmpty: CallbackTo[Boolean],
    length: CallbackTo[Double],
    overlap: TextSpan => TextSpan,
    overlapsWith: TextSpan => Boolean,
    start: CallbackTo[Double]
  ): TextSpan = {
    val __obj = js.Dynamic.literal(_length = _length.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], containsPosition = js.Any.fromFunction1(containsPosition), containsTextSpan = js.Any.fromFunction1(containsTextSpan), end = end.toJsFn, intersection = js.Any.fromFunction1(intersection), intersectsWith = js.Any.fromFunction2(intersectsWith), intersectsWithPosition = js.Any.fromFunction1(intersectsWithPosition), intersectsWithTextSpan = js.Any.fromFunction1(intersectsWithTextSpan), isEmpty = isEmpty.toJsFn, length = length.toJsFn, overlap = js.Any.fromFunction1(overlap), overlapsWith = js.Any.fromFunction1(overlapsWith), start = start.toJsFn)
    __obj.asInstanceOf[TextSpan]
  }
  
  extension [Self <: TextSpan](x: Self) {
    
    inline def setContainsPosition(value: Double => Boolean): Self = StObject.set(x, "containsPosition", js.Any.fromFunction1(value))
    
    inline def setContainsTextSpan(value: TextSpan => Boolean): Self = StObject.set(x, "containsTextSpan", js.Any.fromFunction1(value))
    
    inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setIntersection(value: TextSpan => TextSpan): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
    
    inline def setIntersectsWith(value: (Double, Double) => Boolean): Self = StObject.set(x, "intersectsWith", js.Any.fromFunction2(value))
    
    inline def setIntersectsWithPosition(value: Double => Boolean): Self = StObject.set(x, "intersectsWithPosition", js.Any.fromFunction1(value))
    
    inline def setIntersectsWithTextSpan(value: TextSpan => Boolean): Self = StObject.set(x, "intersectsWithTextSpan", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
    
    inline def setOverlap(value: TextSpan => TextSpan): Self = StObject.set(x, "overlap", js.Any.fromFunction1(value))
    
    inline def setOverlapsWith(value: TextSpan => Boolean): Self = StObject.set(x, "overlapsWith", js.Any.fromFunction1(value))
    
    inline def setStart(value: CallbackTo[Double]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def set_length(value: Any): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
    
    inline def set_start(value: Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
