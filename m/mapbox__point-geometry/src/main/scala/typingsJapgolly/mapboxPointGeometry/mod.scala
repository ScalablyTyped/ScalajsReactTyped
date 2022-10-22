package typingsJapgolly.mapboxPointGeometry

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/point-geometry", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Point {
    def this(x: Double, y: Double) = this()
    
    /* CompleteClass */
    override def _add(p: Point): Point = js.native
    
    /* CompleteClass */
    override def _div(k: Double): Point = js.native
    
    /* CompleteClass */
    override def _matMult(m: js.Array[Double]): Point = js.native
    
    /* CompleteClass */
    override def _mult(k: Double): Point = js.native
    
    /* CompleteClass */
    override def _perp(): Point = js.native
    
    /* CompleteClass */
    override def _rotate(k: Double): Point = js.native
    
    /* CompleteClass */
    override def _rotateAround(k: Double, p: Point): Point = js.native
    
    /* CompleteClass */
    override def _round(): Point = js.native
    
    /* CompleteClass */
    override def _sub(p: Point): Point = js.native
    
    /* CompleteClass */
    override def _unit(): Point = js.native
    
    /* CompleteClass */
    override def add(p: Point): Point = js.native
    
    /* CompleteClass */
    override def angle(): Double = js.native
    
    /* CompleteClass */
    override def angleTo(b: Point): Double = js.native
    
    /* CompleteClass */
    override def angleWith(b: Point): Double = js.native
    
    /* CompleteClass */
    override def angleWithSep(x: Double, y: Double): Double = js.native
    
    /* CompleteClass */
    override def dist(p: Point): Double = js.native
    
    /* CompleteClass */
    override def distSqr(p: Point): Double = js.native
    
    /* CompleteClass */
    override def div(k: Double): Point = js.native
    
    /* CompleteClass */
    override def divByPoint(p: Point): Point = js.native
    
    /* CompleteClass */
    override def equals(other: Point): Boolean = js.native
    
    /* CompleteClass */
    override def mag(): Double = js.native
    
    /* CompleteClass */
    override def matMult(m: js.Array[Double]): Point = js.native
    
    /* CompleteClass */
    override def mult(k: Double): Point = js.native
    
    /* CompleteClass */
    override def multiByPoint(p: Point): Point = js.native
    
    /* CompleteClass */
    override def perp(): Point = js.native
    
    /* CompleteClass */
    override def rotate(k: Double): Point = js.native
    
    /* CompleteClass */
    override def rotateAround(k: Double, p: Point): Point = js.native
    
    /* CompleteClass */
    override def round(): Point = js.native
    
    /* CompleteClass */
    override def sub(p: Point): Point = js.native
    
    /* CompleteClass */
    override def unit(): Point = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  @JSImport("@mapbox/point-geometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def convert[T /* <: Any */](a: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<number> ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T extends @mapbox/point-geometry.@mapbox/point-geometry.Point ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(a.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<number> ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T extends @mapbox/point-geometry.@mapbox/point-geometry.Point ? @mapbox/point-geometry.@mapbox/point-geometry.Point : T */ js.Any]
  
  trait Point extends StObject {
    
    def _add(p: Point): Point
    
    def _div(k: Double): Point
    
    def _matMult(m: js.Array[Double]): Point
    
    def _mult(k: Double): Point
    
    def _perp(): Point
    
    def _rotate(k: Double): Point
    
    def _rotateAround(k: Double, p: Point): Point
    
    def _round(): Point
    
    def _sub(p: Point): Point
    
    def _unit(): Point
    
    def add(p: Point): Point
    
    def angle(): Double
    
    def angleTo(b: Point): Double
    
    def angleWith(b: Point): Double
    
    def angleWithSep(x: Double, y: Double): Double
    
    def dist(p: Point): Double
    
    def distSqr(p: Point): Double
    
    def div(k: Double): Point
    
    def divByPoint(p: Point): Point
    
    def equals(other: Point): Boolean
    
    def mag(): Double
    
    def matMult(m: js.Array[Double]): Point
    
    def mult(k: Double): Point
    
    def multiByPoint(p: Point): Point
    
    def perp(): Point
    
    def rotate(k: Double): Point
    
    def rotateAround(k: Double, p: Point): Point
    
    def round(): Point
    
    def sub(p: Point): Point
    
    def unit(): Point
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(
      _add: Point => Point,
      _div: Double => Point,
      _matMult: js.Array[Double] => Point,
      _mult: Double => Point,
      _perp: CallbackTo[Point],
      _rotate: Double => Point,
      _rotateAround: (Double, Point) => Point,
      _round: CallbackTo[Point],
      _sub: Point => Point,
      _unit: CallbackTo[Point],
      add: Point => Point,
      angle: CallbackTo[Double],
      angleTo: Point => Double,
      angleWith: Point => Double,
      angleWithSep: (Double, Double) => Double,
      dist: Point => Double,
      distSqr: Point => Double,
      div: Double => Point,
      divByPoint: Point => Point,
      equals_ : Point => Boolean,
      mag: CallbackTo[Double],
      matMult: js.Array[Double] => Point,
      mult: Double => Point,
      multiByPoint: Point => Point,
      perp: CallbackTo[Point],
      rotate: Double => Point,
      rotateAround: (Double, Point) => Point,
      round: CallbackTo[Point],
      sub: Point => Point,
      unit: CallbackTo[Point],
      x: Double,
      y: Double
    ): Point = {
      val __obj = js.Dynamic.literal(_add = js.Any.fromFunction1(_add), _div = js.Any.fromFunction1(_div), _matMult = js.Any.fromFunction1(_matMult), _mult = js.Any.fromFunction1(_mult), _perp = _perp.toJsFn, _rotate = js.Any.fromFunction1(_rotate), _rotateAround = js.Any.fromFunction2(_rotateAround), _round = _round.toJsFn, _sub = js.Any.fromFunction1(_sub), _unit = _unit.toJsFn, add = js.Any.fromFunction1(add), angle = angle.toJsFn, angleTo = js.Any.fromFunction1(angleTo), angleWith = js.Any.fromFunction1(angleWith), angleWithSep = js.Any.fromFunction2(angleWithSep), dist = js.Any.fromFunction1(dist), distSqr = js.Any.fromFunction1(distSqr), div = js.Any.fromFunction1(div), divByPoint = js.Any.fromFunction1(divByPoint), mag = mag.toJsFn, matMult = js.Any.fromFunction1(matMult), mult = js.Any.fromFunction1(mult), multiByPoint = js.Any.fromFunction1(multiByPoint), perp = perp.toJsFn, rotate = js.Any.fromFunction1(rotate), rotateAround = js.Any.fromFunction2(rotateAround), round = round.toJsFn, sub = js.Any.fromFunction1(sub), unit = unit.toJsFn, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setAdd(value: Point => Point): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAngle(value: CallbackTo[Double]): Self = StObject.set(x, "angle", value.toJsFn)
      
      inline def setAngleTo(value: Point => Double): Self = StObject.set(x, "angleTo", js.Any.fromFunction1(value))
      
      inline def setAngleWith(value: Point => Double): Self = StObject.set(x, "angleWith", js.Any.fromFunction1(value))
      
      inline def setAngleWithSep(value: (Double, Double) => Double): Self = StObject.set(x, "angleWithSep", js.Any.fromFunction2(value))
      
      inline def setDist(value: Point => Double): Self = StObject.set(x, "dist", js.Any.fromFunction1(value))
      
      inline def setDistSqr(value: Point => Double): Self = StObject.set(x, "distSqr", js.Any.fromFunction1(value))
      
      inline def setDiv(value: Double => Point): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
      
      inline def setDivByPoint(value: Point => Point): Self = StObject.set(x, "divByPoint", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: Point => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setMag(value: CallbackTo[Double]): Self = StObject.set(x, "mag", value.toJsFn)
      
      inline def setMatMult(value: js.Array[Double] => Point): Self = StObject.set(x, "matMult", js.Any.fromFunction1(value))
      
      inline def setMult(value: Double => Point): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
      
      inline def setMultiByPoint(value: Point => Point): Self = StObject.set(x, "multiByPoint", js.Any.fromFunction1(value))
      
      inline def setPerp(value: CallbackTo[Point]): Self = StObject.set(x, "perp", value.toJsFn)
      
      inline def setRotate(value: Double => Point): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setRotateAround(value: (Double, Point) => Point): Self = StObject.set(x, "rotateAround", js.Any.fromFunction2(value))
      
      inline def setRound(value: CallbackTo[Point]): Self = StObject.set(x, "round", value.toJsFn)
      
      inline def setSub(value: Point => Point): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
      
      inline def setUnit(value: CallbackTo[Point]): Self = StObject.set(x, "unit", value.toJsFn)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def set_add(value: Point => Point): Self = StObject.set(x, "_add", js.Any.fromFunction1(value))
      
      inline def set_div(value: Double => Point): Self = StObject.set(x, "_div", js.Any.fromFunction1(value))
      
      inline def set_matMult(value: js.Array[Double] => Point): Self = StObject.set(x, "_matMult", js.Any.fromFunction1(value))
      
      inline def set_mult(value: Double => Point): Self = StObject.set(x, "_mult", js.Any.fromFunction1(value))
      
      inline def set_perp(value: CallbackTo[Point]): Self = StObject.set(x, "_perp", value.toJsFn)
      
      inline def set_rotate(value: Double => Point): Self = StObject.set(x, "_rotate", js.Any.fromFunction1(value))
      
      inline def set_rotateAround(value: (Double, Point) => Point): Self = StObject.set(x, "_rotateAround", js.Any.fromFunction2(value))
      
      inline def set_round(value: CallbackTo[Point]): Self = StObject.set(x, "_round", value.toJsFn)
      
      inline def set_sub(value: Point => Point): Self = StObject.set(x, "_sub", js.Any.fromFunction1(value))
      
      inline def set_unit(value: CallbackTo[Point]): Self = StObject.set(x, "_unit", value.toJsFn)
    }
  }
}
