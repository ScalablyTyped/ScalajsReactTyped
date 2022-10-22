package typingsJapgolly.openjscad.global

import org.scalajs.dom.Blob
import typingsJapgolly.openjscad.CSG.ICircleOptions
import typingsJapgolly.openjscad.CSG.IRectangleOptions
import typingsJapgolly.openjscad.CSG.Polygon
import typingsJapgolly.openjscad.CSG.Vector2D
import typingsJapgolly.openjscad.CSG.fuzzyFactory
import typingsJapgolly.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CAG")
@js.native
open class CAG ()
  extends StObject
     with typingsJapgolly.openjscad.CAG {
  
  /* CompleteClass */
  override def center(cAxes: js.Array[String]): typingsJapgolly.openjscad.CxG = js.native
}
object CAG {
  
  @JSGlobal("CAG")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def PathsToDxf(paths: js.Array[Path2D]): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("PathsToDxf")(paths.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  @JSGlobal("CAG.Side")
  @js.native
  open class Side protected ()
    extends StObject
       with typingsJapgolly.openjscad.CAG.Side {
    def this(vertex0: typingsJapgolly.openjscad.CAG.Vertex, vertex1: typingsJapgolly.openjscad.CAG.Vertex) = this()
  }
  object Side {
    
    @JSGlobal("CAG.Side")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromFakePolygon(polygon: Polygon): typingsJapgolly.openjscad.CAG.Side = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromFakePolygon")(polygon.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG.Side]
  }
  
  @JSGlobal("CAG.Vertex")
  @js.native
  open class Vertex protected ()
    extends StObject
       with typingsJapgolly.openjscad.CAG.Vertex {
    def this(pos: Vector2D) = this()
    
    /* CompleteClass */
    override def getTag(): Double = js.native
    
    /* CompleteClass */
    var pos: Vector2D = js.native
    
    /* CompleteClass */
    var tag: Double = js.native
  }
  
  /* static member */
  inline def circle(options: ICircleOptions): typingsJapgolly.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("circle")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG]
  
  /* static member */
  inline def fromCompactBinary(bin: Any): typingsJapgolly.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompactBinary")(bin.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG]
  
  /* static member */
  inline def fromFakeCSG(csg: typingsJapgolly.openjscad.CSG): typingsJapgolly.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFakeCSG")(csg.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG]
  
  /* static member */
  inline def fromPoints(points: js.Array[Vector2D]): typingsJapgolly.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG]
  
  /* static member */
  inline def fromPointsNoCheck(points: js.Array[Vector2D]): typingsJapgolly.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointsNoCheck")(points.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG]
  
  /* static member */
  inline def fromSides(sides: js.Array[typingsJapgolly.openjscad.CAG.Side]): typingsJapgolly.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSides")(sides.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG]
  
  @JSGlobal("CAG.fuzzyCAGFactory")
  @js.native
  open class fuzzyCAGFactory ()
    extends StObject
       with typingsJapgolly.openjscad.CAG.fuzzyCAGFactory {
    
    /* CompleteClass */
    override def getCAG(sourcecag: typingsJapgolly.openjscad.CAG): typingsJapgolly.openjscad.CAG = js.native
    
    /* CompleteClass */
    override def getSide(sourceside: typingsJapgolly.openjscad.CAG.Side): typingsJapgolly.openjscad.CAG.Side = js.native
    
    /* CompleteClass */
    override def getVertex(sourcevertex: typingsJapgolly.openjscad.CAG.Vertex): typingsJapgolly.openjscad.CAG.Vertex = js.native
    
    /* CompleteClass */
    var vertexfactory: fuzzyFactory = js.native
  }
  
  /* static member */
  inline def linesIntersect(p0start: Vector2D, p0end: Vector2D, p1start: Vector2D, p1end: Vector2D): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linesIntersect")(p0start.asInstanceOf[js.Any], p0end.asInstanceOf[js.Any], p1start.asInstanceOf[js.Any], p1end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def rectangle(options: IRectangleOptions): typingsJapgolly.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG]
  
  /* static member */
  inline def roundedRectangle(options: Any): typingsJapgolly.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("roundedRectangle")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openjscad.CAG]
}
