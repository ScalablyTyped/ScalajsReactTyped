package typingsJapgolly.bezierJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bezier curve constructor. The constructor argument can be one of three things:
  *
  * 1. array/4 of {x:..., y:..., z:...}, z optional
  * 2. numerical array/8 ordered x1,y1,x2,y2,x3,y3,x4,y4
  * 3. numerical array/12 ordered x1,y1,z1,x2,y2,z2,x3,y3,z3,x4,y4,z4
  *
  */
@JSImport("bezier-js", "Bezier")
@js.native
open class Bezier protected () extends StObject {
  def this(points: js.Array[Double | Point]) = this()
  def this(p1: Point, p2: Point, p3: Point) = this()
  def this(p1: Point, p2: Point, p3: Point, p4: Point) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Unit, y4: Double) = this()
  
  var _3d: Boolean = js.native
  
  /* private */ def __normal(t: Any): Any = js.native
  
  /* private */ def __normal2(t: Any): Any = js.native
  
  /* private */ def __normal3(t: Any): Any = js.native
  
  /* private */ def _error(pc: Any, np1: Any, s: Any, e: Any): Any = js.native
  
  /* private */ def _iterate(errorThreshold: Any, circles: Any): Any = js.native
  
  /* private */ var _linear: Any = js.native
  
  var _lut: js.Array[Point] = js.native
  
  var _t1: Double = js.native
  
  var _t2: Double = js.native
  
  def arcs(): js.Array[Arc] = js.native
  def arcs(errorThreshold: Double): js.Array[Arc] = js.native
  
  def bbox(): BBox = js.native
  
  var clockwise: Boolean = js.native
  
  def compute(t: Double): Point = js.native
  
  def computedirection(): Unit = js.native
  
  def curveintersects(c1: js.Array[Bezier], c2: js.Array[Bezier]): js.Array[String] = js.native
  def curveintersects(c1: js.Array[Bezier], c2: js.Array[Bezier], curveIntersectionThreshold: Double): js.Array[String] = js.native
  
  def derivative(t: Double): Point = js.native
  
  var dimlen: Double = js.native
  
  var dims: js.Array[String] = js.native
  
  var dpoints: js.Array[js.Array[Point]] = js.native
  
  def extrema(): Inflection = js.native
  
  def get(t: Double): Point = js.native
  
  def getLUT(): js.Array[Point] = js.native
  def getLUT(steps: Double): js.Array[Point] = js.native
  
  def getUtils(): utils = js.native
  
  def hull(t: Double): js.Array[Point] = js.native
  
  def inflections(): js.Array[Double] = js.native
  
  def intersects(curve: Bezier): js.Array[Double | String] = js.native
  def intersects(curve: Bezier, curveIntersectionThreshold: Double): js.Array[Double | String] = js.native
  def intersects(curve: Line): js.Array[Double | String] = js.native
  
  def length(): Double = js.native
  
  def lineIntersects(line: Line): js.Array[Double] = js.native
  
  def normal(t: Double): Point = js.native
  
  def offset(t: Double): Offset | js.Array[Bezier] = js.native
  def offset(t: Double, d: Double): Offset | js.Array[Bezier] = js.native
  
  def on(point: Point, error: Double): Double = js.native
  
  var order: Double = js.native
  
  def outline(d1: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Double, d3: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Double, d3: Double, d4: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Double, d3: Unit, d4: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Unit, d3: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Unit, d3: Double, d4: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Unit, d3: Unit, d4: Double): PolyBezier = js.native
  
  def outlineshapes(d1: Double, d2: Double): js.Array[Shape] = js.native
  def outlineshapes(d1: Double, d2: Double, curveIntersectionThreshold: Double): js.Array[Shape] = js.native
  
  def overlaps(curve: Bezier): Boolean = js.native
  
  def point(idx: Double): Point = js.native
  
  var points: js.Array[Point] = js.native
  
  def project(point: Point): Projection = js.native
  
  def raise(): Bezier = js.native
  
  def reduce(): js.Array[Bezier] = js.native
  
  def scale(d: js.Function): Bezier = js.native
  def scale(d: Double): Bezier = js.native
  
  def selfintersects(): js.Array[String] = js.native
  def selfintersects(curveIntersectionThreshold: Double): js.Array[String] = js.native
  
  def simple(): Boolean = js.native
  
  def split(t1: Double): Split = js.native
  def split(t1: Double, t2: Double): Bezier = js.native
  
  def toSVG(): String = js.native
  
  def update(): Unit = js.native
}
object Bezier {
  
  @JSImport("bezier-js", "Bezier")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def cubicFromPoints(S: Point, B: Point, E: Point): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  inline def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  inline def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any], d1.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  inline def cubicFromPoints(S: Point, B: Point, E: Point, t: Unit, d1: Double): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any], d1.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  
  /* static member */
  inline def fromSVG(svgString: String): Bezier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSVG")(svgString.asInstanceOf[js.Any]).asInstanceOf[Bezier]
  
  /* static member */
  inline def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = (^.asInstanceOf[js.Dynamic].applyDynamic("getABC")(n.asInstanceOf[js.Any], S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[ABC]
  
  /* static member */
  inline def getUtils(): utils = ^.asInstanceOf[js.Dynamic].applyDynamic("getUtils")().asInstanceOf[utils]
  
  /* static member */
  inline def quadraticFromPoints(p1: Point, p2: Point, p3: Point): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFromPoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  inline def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFromPoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Bezier]
}
