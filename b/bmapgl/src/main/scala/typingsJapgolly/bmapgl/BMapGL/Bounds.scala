package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  def containsBounds(bounds: Bounds): Boolean
  
  def containsPoint(point: Point): Boolean
  
  def equals(other: Bounds): Boolean
  
  def extend(point: Point): Unit
  
  def getCenter(): Point
  
  def getNorthEast(): Point
  
  def getSouthWest(): Point
  
  def intersects(other: Bounds): Boolean
  
  def isEmpty(): Boolean
  
  var maxX: Double
  
  var maxY: Double
  
  var minX: Double
  
  var minY: Double
  
  def toSpan(): Point
}
object Bounds {
  
  inline def apply(
    containsBounds: Bounds => Boolean,
    containsPoint: Point => Boolean,
    equals_ : Bounds => Boolean,
    extend: Point => japgolly.scalajs.react.Callback,
    getCenter: CallbackTo[Point],
    getNorthEast: CallbackTo[Point],
    getSouthWest: CallbackTo[Point],
    intersects: Bounds => Boolean,
    isEmpty: CallbackTo[Boolean],
    maxX: Double,
    maxY: Double,
    minX: Double,
    minY: Double,
    toSpan: CallbackTo[Point]
  ): Bounds = {
    val __obj = js.Dynamic.literal(containsBounds = js.Any.fromFunction1(containsBounds), containsPoint = js.Any.fromFunction1(containsPoint), extend = js.Any.fromFunction1((t0: Point) => extend(t0).runNow()), getCenter = getCenter.toJsFn, getNorthEast = getNorthEast.toJsFn, getSouthWest = getSouthWest.toJsFn, intersects = js.Any.fromFunction1(intersects), isEmpty = isEmpty.toJsFn, maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], toSpan = toSpan.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Bounds]
  }
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setContainsBounds(value: Bounds => Boolean): Self = StObject.set(x, "containsBounds", js.Any.fromFunction1(value))
    
    inline def setContainsPoint(value: Point => Boolean): Self = StObject.set(x, "containsPoint", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: Bounds => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExtend(value: Point => japgolly.scalajs.react.Callback): Self = StObject.set(x, "extend", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
    
    inline def setGetCenter(value: CallbackTo[Point]): Self = StObject.set(x, "getCenter", value.toJsFn)
    
    inline def setGetNorthEast(value: CallbackTo[Point]): Self = StObject.set(x, "getNorthEast", value.toJsFn)
    
    inline def setGetSouthWest(value: CallbackTo[Point]): Self = StObject.set(x, "getSouthWest", value.toJsFn)
    
    inline def setIntersects(value: Bounds => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    
    inline def setToSpan(value: CallbackTo[Point]): Self = StObject.set(x, "toSpan", value.toJsFn)
  }
}
