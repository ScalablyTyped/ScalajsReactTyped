package typingsJapgolly.sat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sat", "Box")
  @js.native
  open class Box ()
    extends StObject
       with typingsJapgolly.sat.SAT.Box {
    def this(pos: typingsJapgolly.sat.SAT.Vector) = this()
    def this(pos: Unit, width: Double) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, width: Double) = this()
    def this(pos: Unit, width: Double, height: Double) = this()
    def this(pos: Unit, width: Unit, height: Double) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, width: Double, height: Double) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, width: Unit, height: Double) = this()
    
    /* CompleteClass */
    var h: Double = js.native
    
    /* CompleteClass */
    var pos: typingsJapgolly.sat.SAT.Vector = js.native
    
    /* CompleteClass */
    override def toPolygon(): typingsJapgolly.sat.SAT.Polygon = js.native
    
    /* CompleteClass */
    var w: Double = js.native
  }
  
  @JSImport("sat", "Circle")
  @js.native
  open class Circle ()
    extends StObject
       with typingsJapgolly.sat.SAT.Circle {
    def this(pos: typingsJapgolly.sat.SAT.Vector) = this()
    def this(pos: Unit, r: Double) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, r: Double) = this()
    
    /* CompleteClass */
    var pos: typingsJapgolly.sat.SAT.Vector = js.native
    
    /* CompleteClass */
    var r: Double = js.native
  }
  
  @JSImport("sat", "Polygon")
  @js.native
  open class Polygon ()
    extends StObject
       with typingsJapgolly.sat.SAT.Polygon {
    def this(pos: typingsJapgolly.sat.SAT.Vector) = this()
    def this(pos: Unit, points: js.Array[typingsJapgolly.sat.SAT.Vector]) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, points: js.Array[typingsJapgolly.sat.SAT.Vector]) = this()
    
    /* CompleteClass */
    var angle: Double = js.native
    
    /* CompleteClass */
    var calcPoints: js.Array[typingsJapgolly.sat.SAT.Vector] = js.native
    
    /* CompleteClass */
    var edges: js.Array[typingsJapgolly.sat.SAT.Vector] = js.native
    
    /* CompleteClass */
    override def getAABB(): typingsJapgolly.sat.SAT.Polygon = js.native
    
    /* CompleteClass */
    override def getCentroid(): typingsJapgolly.sat.SAT.Vector = js.native
    
    /* CompleteClass */
    var normals: js.Array[typingsJapgolly.sat.SAT.Vector] = js.native
    
    /* CompleteClass */
    var offset: typingsJapgolly.sat.SAT.Vector = js.native
    
    /* CompleteClass */
    var points: js.Array[typingsJapgolly.sat.SAT.Vector] = js.native
    
    /* CompleteClass */
    var pos: typingsJapgolly.sat.SAT.Vector = js.native
    
    /* CompleteClass */
    override def rotate(angle: Double): typingsJapgolly.sat.SAT.Polygon = js.native
    
    /* CompleteClass */
    override def setAngle(angle: Double): typingsJapgolly.sat.SAT.Polygon = js.native
    
    /* CompleteClass */
    override def setOffset(offset: typingsJapgolly.sat.SAT.Vector): typingsJapgolly.sat.SAT.Polygon = js.native
    
    /* CompleteClass */
    override def setPoints(points: js.Array[typingsJapgolly.sat.SAT.Vector]): typingsJapgolly.sat.SAT.Polygon = js.native
    
    /* CompleteClass */
    override def translate(x: Double, y: Double): typingsJapgolly.sat.SAT.Polygon = js.native
  }
  
  @JSImport("sat", "Response")
  @js.native
  open class Response ()
    extends StObject
       with typingsJapgolly.sat.SAT.Response {
    
    /* CompleteClass */
    var a: Any = js.native
    
    /* CompleteClass */
    var aInB: Boolean = js.native
    
    /* CompleteClass */
    var b: Any = js.native
    
    /* CompleteClass */
    var bInA: Boolean = js.native
    
    /* CompleteClass */
    override def clear(): typingsJapgolly.sat.SAT.Response = js.native
    
    /* CompleteClass */
    var overlap: Double = js.native
    
    /* CompleteClass */
    var overlapN: typingsJapgolly.sat.SAT.Vector = js.native
    
    /* CompleteClass */
    var overlapV: typingsJapgolly.sat.SAT.Vector = js.native
  }
  
  @JSImport("sat", "Vector")
  @js.native
  /**
    * @class Vector has two properties
    * @param {number} x The x-coordinate of the Vector.
    * @param {number} y The y-coordinate of the Vector.
    */
  open class Vector ()
    extends StObject
       with typingsJapgolly.sat.SAT.Vector {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  
  inline def pointInCircle(p: typingsJapgolly.sat.SAT.Vector, c: typingsJapgolly.sat.SAT.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInCircle")(p.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pointInPolygon(p: typingsJapgolly.sat.SAT.Vector, poly: typingsJapgolly.sat.SAT.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInPolygon")(p.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def testCircleCircle(a: typingsJapgolly.sat.SAT.Circle, b: typingsJapgolly.sat.SAT.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testCircleCircle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def testCircleCircle(
    a: typingsJapgolly.sat.SAT.Circle,
    b: typingsJapgolly.sat.SAT.Circle,
    response: typingsJapgolly.sat.SAT.Response
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testCircleCircle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def testCirclePolygon(circle: typingsJapgolly.sat.SAT.Circle, polygon: typingsJapgolly.sat.SAT.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testCirclePolygon")(circle.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def testCirclePolygon(
    circle: typingsJapgolly.sat.SAT.Circle,
    polygon: typingsJapgolly.sat.SAT.Polygon,
    response: typingsJapgolly.sat.SAT.Response
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testCirclePolygon")(circle.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def testPolygonCircle(polygon: typingsJapgolly.sat.SAT.Polygon, circle: typingsJapgolly.sat.SAT.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testPolygonCircle")(polygon.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def testPolygonCircle(
    polygon: typingsJapgolly.sat.SAT.Polygon,
    circle: typingsJapgolly.sat.SAT.Circle,
    response: typingsJapgolly.sat.SAT.Response
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testPolygonCircle")(polygon.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def testPolygonPolygon(a: typingsJapgolly.sat.SAT.Polygon, b: typingsJapgolly.sat.SAT.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testPolygonPolygon")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def testPolygonPolygon(
    a: typingsJapgolly.sat.SAT.Polygon,
    b: typingsJapgolly.sat.SAT.Polygon,
    response: typingsJapgolly.sat.SAT.Response
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testPolygonPolygon")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
