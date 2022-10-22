package typingsJapgolly.sat

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SAT {
  
  trait Box extends StObject {
    
    var h: Double
    
    var pos: Vector
    
    def toPolygon(): Polygon
    
    var w: Double
  }
  object Box {
    
    inline def apply(h: Double, pos: Vector, toPolygon: CallbackTo[Polygon], w: Double): Box = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], toPolygon = toPolygon.toJsFn, w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    extension [Self <: Box](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Vector): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setToPolygon(value: CallbackTo[Polygon]): Self = StObject.set(x, "toPolygon", value.toJsFn)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait Circle extends StObject {
    
    var pos: Vector
    
    var r: Double
  }
  object Circle {
    
    inline def apply(pos: Vector, r: Double): Circle = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
    
    extension [Self <: Circle](x: Self) {
      
      inline def setPos(value: Vector): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon extends StObject {
    
    var angle: Double
    
    var calcPoints: js.Array[Vector]
    
    var edges: js.Array[Vector]
    
    def getAABB(): Polygon
    
    def getCentroid(): Vector
    
    var normals: js.Array[Vector]
    
    var offset: Vector
    
    var points: js.Array[Vector]
    
    var pos: Vector
    
    def rotate(angle: Double): Polygon
    
    def setAngle(angle: Double): Polygon
    
    def setOffset(offset: Vector): Polygon
    
    def setPoints(points: js.Array[Vector]): Polygon
    
    def translate(x: Double, y: Double): Polygon
  }
  object Polygon {
    
    inline def apply(
      angle: Double,
      calcPoints: js.Array[Vector],
      edges: js.Array[Vector],
      getAABB: CallbackTo[Polygon],
      getCentroid: CallbackTo[Vector],
      normals: js.Array[Vector],
      offset: Vector,
      points: js.Array[Vector],
      pos: Vector,
      rotate: Double => Polygon,
      setAngle: Double => Polygon,
      setOffset: Vector => Polygon,
      setPoints: js.Array[Vector] => Polygon,
      translate: (Double, Double) => Polygon
    ): Polygon = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], calcPoints = calcPoints.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getAABB = getAABB.toJsFn, getCentroid = getCentroid.toJsFn, normals = normals.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], rotate = js.Any.fromFunction1(rotate), setAngle = js.Any.fromFunction1(setAngle), setOffset = js.Any.fromFunction1(setOffset), setPoints = js.Any.fromFunction1(setPoints), translate = js.Any.fromFunction2(translate))
      __obj.asInstanceOf[Polygon]
    }
    
    extension [Self <: Polygon](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setCalcPoints(value: js.Array[Vector]): Self = StObject.set(x, "calcPoints", value.asInstanceOf[js.Any])
      
      inline def setCalcPointsVarargs(value: Vector*): Self = StObject.set(x, "calcPoints", js.Array(value*))
      
      inline def setEdges(value: js.Array[Vector]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: Vector*): Self = StObject.set(x, "edges", js.Array(value*))
      
      inline def setGetAABB(value: CallbackTo[Polygon]): Self = StObject.set(x, "getAABB", value.toJsFn)
      
      inline def setGetCentroid(value: CallbackTo[Vector]): Self = StObject.set(x, "getCentroid", value.toJsFn)
      
      inline def setNormals(value: js.Array[Vector]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
      
      inline def setNormalsVarargs(value: Vector*): Self = StObject.set(x, "normals", js.Array(value*))
      
      inline def setOffset(value: Vector): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[Vector]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Vector*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setPos(value: Vector): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRotate(value: Double => Polygon): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setSetAngle(value: Double => Polygon): Self = StObject.set(x, "setAngle", js.Any.fromFunction1(value))
      
      inline def setSetOffset(value: Vector => Polygon): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      inline def setSetPoints(value: js.Array[Vector] => Polygon): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
      
      inline def setTranslate(value: (Double, Double) => Polygon): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
    }
  }
  
  trait Response extends StObject {
    
    var a: Any
    
    var aInB: Boolean
    
    var b: Any
    
    var bInA: Boolean
    
    def clear(): Response
    
    var overlap: Double
    
    var overlapN: Vector
    
    var overlapV: Vector
  }
  object Response {
    
    inline def apply(
      a: Any,
      aInB: Boolean,
      b: Any,
      bInA: Boolean,
      clear: CallbackTo[Response],
      overlap: Double,
      overlapN: Vector,
      overlapV: Vector
    ): Response = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], aInB = aInB.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], bInA = bInA.asInstanceOf[js.Any], clear = clear.toJsFn, overlap = overlap.asInstanceOf[js.Any], overlapN = overlapN.asInstanceOf[js.Any], overlapV = overlapV.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setA(value: Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAInB(value: Boolean): Self = StObject.set(x, "aInB", value.asInstanceOf[js.Any])
      
      inline def setB(value: Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBInA(value: Boolean): Self = StObject.set(x, "bInA", value.asInstanceOf[js.Any])
      
      inline def setClear(value: CallbackTo[Response]): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setOverlap(value: Double): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
      
      inline def setOverlapN(value: Vector): Self = StObject.set(x, "overlapN", value.asInstanceOf[js.Any])
      
      inline def setOverlapV(value: Vector): Self = StObject.set(x, "overlapV", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Vector extends StObject {
    
    def add(other: Vector): Vector = js.native
    
    def copy(other: Vector): Vector = js.native
    
    def dot(other: Vector): Double = js.native
    
    def len(): Double = js.native
    
    def len2(): Double = js.native
    
    def normalize(): Vector = js.native
    
    def perp(): Vector = js.native
    
    def project(other: Vector): Vector = js.native
    
    def projectN(other: Vector): Vector = js.native
    
    def reflect(axis: Vector): Vector = js.native
    
    def reflectN(axis: Vector): Vector = js.native
    
    def reverse(): Vector = js.native
    
    def rotate(angle: Double): Vector = js.native
    
    def scale(x: Double): Vector = js.native
    def scale(x: Double, y: Double): Vector = js.native
    
    def sub(other: Vector): Vector = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
