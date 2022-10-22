package typingsJapgolly.openjscad

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import typingsJapgolly.openjscad.CAG.Side
import typingsJapgolly.openjscad.CSG.Matrix4x4
import typingsJapgolly.openjscad.CSG.OrthoNormalBasis
import typingsJapgolly.openjscad.CSG.Polygon
import typingsJapgolly.openjscad.CSG.Vector2D
import typingsJapgolly.openjscad.CSG.Vector3D
import typingsJapgolly.openjscad.CSG.fuzzyFactory
import typingsJapgolly.openjscad.anon.SideVertexIndices
import typingsJapgolly.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAG
  extends StObject
     with CxG
     with ICenter {
  
  def _toCSGWall(z0: Any, z1: Any): CSG = js.native
  
  def _toPlanePolygons(options: Any): js.Array[Polygon] = js.native
  
  def _toVector3DPairs(m: Matrix4x4): js.Array[js.Array[Vector3D]] = js.native
  
  def _toWallPolygons(options: Any): js.Array[Any] = js.native
  
  def area(): Double = js.native
  
  def canonicalized(): CAG = js.native
  
  def check(): Unit = js.native
  
  def contract(radius: Double, resolution: Double): CAG = js.native
  
  def expand(radius: Double, resolution: Double): CAG = js.native
  
  def expandedShell(radius: Double, resolution: Double): CAG = js.native
  
  def extrude(options: CAGExtrudeOptions): CSG = js.native
  
  def extrudeInOrthonormalBasis(orthonormalbasis: OrthoNormalBasis, depth: Double): CSG = js.native
  def extrudeInOrthonormalBasis(orthonormalbasis: OrthoNormalBasis, depth: Double, options: Any): CSG = js.native
  
  def extrudeInPlane(axis1: Any, axis2: Any, depth: Any, options: Any): CSG = js.native
  
  def flipped(): CAG = js.native
  
  def getOutlinePaths(): js.Array[Path2D] = js.native
  
  def intersect(cag: js.Array[CAG]): CAG = js.native
  def intersect(cag: CAG): CAG = js.native
  
  var isCanonicalized: Boolean = js.native
  
  def isSelfIntersecting(): Boolean = js.native
  
  def overCutInsideCorners(cutterradius: Any): CAG = js.native
  
  def rotateExtrude(options: Any): CSG = js.native
  
  var sides: js.Array[Side] = js.native
  
  def subtract(cag: js.Array[CAG]): CAG = js.native
  def subtract(cag: CAG): CAG = js.native
  
  def toCompactBinary(): SideVertexIndices = js.native
  
  def toDxf(): Blob = js.native
  
  def union(cag: js.Array[CAG]): CAG = js.native
  def union(cag: CAG): CAG = js.native
}
object CAG {
  
  @js.native
  trait Side
    extends StObject
       with CxG {
    
    def direction(): Vector2D = js.native
    
    def flipped(): Side = js.native
    
    def getTag(): Double = js.native
    
    def length(): Double = js.native
    
    def lengthSquared(): Double = js.native
    
    var tag: Double = js.native
    
    def toPolygon3D(z0: Any, z1: Any): Polygon = js.native
    
    var vertex0: Vertex = js.native
    
    var vertex1: Vertex = js.native
  }
  
  trait Vertex extends StObject {
    
    def getTag(): Double
    
    var pos: Vector2D
    
    var tag: Double
  }
  object Vertex {
    
    inline def apply(getTag: CallbackTo[Double], pos: Vector2D, tag: Double): Vertex = {
      val __obj = js.Dynamic.literal(getTag = getTag.toJsFn, pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vertex]
    }
    
    extension [Self <: Vertex](x: Self) {
      
      inline def setGetTag(value: CallbackTo[Double]): Self = StObject.set(x, "getTag", value.toJsFn)
      
      inline def setPos(value: Vector2D): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait fuzzyCAGFactory extends StObject {
    
    def getCAG(sourcecag: CAG): CAG
    
    def getSide(sourceside: Side): Side
    
    def getVertex(sourcevertex: Vertex): Vertex
    
    var vertexfactory: fuzzyFactory
  }
  object fuzzyCAGFactory {
    
    inline def apply(
      getCAG: CAG => CAG,
      getSide: Side => Side,
      getVertex: Vertex => Vertex,
      vertexfactory: fuzzyFactory
    ): fuzzyCAGFactory = {
      val __obj = js.Dynamic.literal(getCAG = js.Any.fromFunction1(getCAG), getSide = js.Any.fromFunction1(getSide), getVertex = js.Any.fromFunction1(getVertex), vertexfactory = vertexfactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[fuzzyCAGFactory]
    }
    
    extension [Self <: fuzzyCAGFactory](x: Self) {
      
      inline def setGetCAG(value: CAG => CAG): Self = StObject.set(x, "getCAG", js.Any.fromFunction1(value))
      
      inline def setGetSide(value: Side => Side): Self = StObject.set(x, "getSide", js.Any.fromFunction1(value))
      
      inline def setGetVertex(value: Vertex => Vertex): Self = StObject.set(x, "getVertex", js.Any.fromFunction1(value))
      
      inline def setVertexfactory(value: fuzzyFactory): Self = StObject.set(x, "vertexfactory", value.asInstanceOf[js.Any])
    }
  }
}
