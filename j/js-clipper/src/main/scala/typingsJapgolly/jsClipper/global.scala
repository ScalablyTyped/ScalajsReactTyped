package typingsJapgolly.jsClipper

import typingsJapgolly.jsClipper.ClipperLib.EdgeSide
import typingsJapgolly.jsClipper.ClipperLib.JoinType
import typingsJapgolly.jsClipper.ClipperLib.PolyType
import typingsJapgolly.jsClipper.anon.Value
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ClipperLib {
    
    @JSGlobal("ClipperLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CastInt32(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast_Int32")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def CastInt64(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast_Int64")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def Clean(
      polygon: ArrayLike[
          ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
        ],
      delta: Double
    ): ArrayLike[
        ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Clean")(polygon.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[ArrayLike[
        ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
      ]]
    
    inline def Clear(a: ArrayLike[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Clear")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("ClipperLib.ClipType")
    @js.native
    object ClipType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.jsClipper.ClipperLib.ClipType & Double] = js.native
      
      /* 2 */ val ctDifference: typingsJapgolly.jsClipper.ClipperLib.ClipType.ctDifference & Double = js.native
      
      /* 0 */ val ctIntersection: typingsJapgolly.jsClipper.ClipperLib.ClipType.ctIntersection & Double = js.native
      
      /* 1 */ val ctUnion: typingsJapgolly.jsClipper.ClipperLib.ClipType.ctUnion & Double = js.native
      
      /* 3 */ val ctXor: typingsJapgolly.jsClipper.ClipperLib.ClipType.ctXor & Double = js.native
    }
    
    @JSGlobal("ClipperLib.Clipper")
    @js.native
    open class Clipper ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.Clipper
    
    @JSGlobal("ClipperLib.ClipperBase")
    @js.native
    open class ClipperBase ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.ClipperBase
    
    inline def Clone(
      polygon: ArrayLike[
          ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
        ]
    ): ArrayLike[
        ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(polygon.asInstanceOf[js.Any]).asInstanceOf[ArrayLike[
        ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
      ]]
    
    @JSGlobal("ClipperLib.Direction")
    @js.native
    object Direction extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.jsClipper.ClipperLib.Direction & Double] = js.native
      
      /* 1 */ val dLeftToRight: typingsJapgolly.jsClipper.ClipperLib.Direction.dLeftToRight & Double = js.native
      
      /* 0 */ val dRightToLeft: typingsJapgolly.jsClipper.ClipperLib.Direction.dRightToLeft & Double = js.native
    }
    
    @JSGlobal("ClipperLib.DoublePoint")
    @js.native
    open class DoublePoint protected ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.DoublePoint {
      def this(x: Double, y: Double) = this()
      
      /* CompleteClass */
      var X: Double = js.native
      
      /* CompleteClass */
      var Y: Double = js.native
    }
    
    @JSGlobal("ClipperLib.EdgeSide")
    @js.native
    object EdgeSide extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.jsClipper.ClipperLib.EdgeSide & Double] = js.native
      
      /* 0 */ val esLeft: typingsJapgolly.jsClipper.ClipperLib.EdgeSide.esLeft & Double = js.native
      
      /* 1 */ val esRight: typingsJapgolly.jsClipper.ClipperLib.EdgeSide.esRight & Double = js.native
    }
    
    inline def Error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("ClipperLib.ExPolygon")
    @js.native
    open class ExPolygon ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.ExPolygon {
      
      /* CompleteClass */
      var holes: ArrayLike[ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint]] = js.native
      
      /* CompleteClass */
      var outer: ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] = js.native
    }
    
    @JSGlobal("ClipperLib.HorzJoinRec")
    @js.native
    open class HorzJoinRec ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.HorzJoinRec {
      
      /* CompleteClass */
      var edge: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var savedIdx: Double = js.native
    }
    
    @JSGlobal("ClipperLib.IntPoint")
    @js.native
    open class IntPoint ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.IntPoint {
      def this(PointXY: typingsJapgolly.jsClipper.ClipperLib.IntPoint) = this()
      def this(x: Double, y: Double) = this()
      
      /* CompleteClass */
      var X: Double = js.native
      
      /* CompleteClass */
      var Y: Double = js.native
    }
    
    @JSGlobal("ClipperLib.IntRect")
    @js.native
    open class IntRect ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.IntRect {
      def this(left: Double, top: Double, right: Double, bottom: Double) = this()
      
      /* CompleteClass */
      var bottom: Double = js.native
      
      /* CompleteClass */
      var left: Double = js.native
      
      /* CompleteClass */
      var right: Double = js.native
      
      /* CompleteClass */
      var top: Double = js.native
    }
    
    @JSGlobal("ClipperLib.IntersectNode")
    @js.native
    open class IntersectNode ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.IntersectNode {
      
      /* CompleteClass */
      var edge1: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var edge2: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var next: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var pt: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
    }
    
    @JSGlobal("ClipperLib.JoinRec")
    @js.native
    open class JoinRec ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.JoinRec {
      
      /* CompleteClass */
      var poly1Idx: Double = js.native
      
      /* CompleteClass */
      var poly2Idx: Double = js.native
      
      /* CompleteClass */
      var pt1a: typingsJapgolly.jsClipper.ClipperLib.IntPoint = js.native
      
      /* CompleteClass */
      var pt1b: typingsJapgolly.jsClipper.ClipperLib.IntPoint = js.native
      
      /* CompleteClass */
      var pt2a: typingsJapgolly.jsClipper.ClipperLib.IntPoint = js.native
      
      /* CompleteClass */
      var pt2b: typingsJapgolly.jsClipper.ClipperLib.IntPoint = js.native
    }
    
    @JSGlobal("ClipperLib.JoinType")
    @js.native
    object JoinType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.jsClipper.ClipperLib.JoinType & Double] = js.native
      
      /* 2 */ val jtMiter: typingsJapgolly.jsClipper.ClipperLib.JoinType.jtMiter & Double = js.native
      
      /* 1 */ val jtRound: typingsJapgolly.jsClipper.ClipperLib.JoinType.jtRound & Double = js.native
      
      /* 0 */ val jtSquare: typingsJapgolly.jsClipper.ClipperLib.JoinType.jtSquare & Double = js.native
    }
    
    inline def Lighten(
      polygon: ArrayLike[
          ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
        ],
      tolerance: Double
    ): ArrayLike[
        ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Lighten")(polygon.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[ArrayLike[
        ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] | typingsJapgolly.jsClipper.ClipperLib.IntPoint
      ]]
    
    @JSGlobal("ClipperLib.LocalMinima")
    @js.native
    open class LocalMinima ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.LocalMinima {
      
      /* CompleteClass */
      var Y: Double = js.native
      
      /* CompleteClass */
      var leftBound: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var next: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var rightBound: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
    }
    
    inline def MathAbsDouble(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Math_Abs_Double")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def MathAbsInt32(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Math_Abs_Int32")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def MathAbsInt64(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Math_Abs_Int64")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def MathMaxInt32Int32(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Math_Max_Int32_Int32")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSGlobal("ClipperLib.MaxSteps")
    @js.native
    def MaxSteps: Double = js.native
    inline def MaxSteps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxSteps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ClipperLib.OutPt")
    @js.native
    open class OutPt ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.OutPt {
      
      /* CompleteClass */
      var idx: Double = js.native
      
      /* CompleteClass */
      var next: typingsJapgolly.jsClipper.ClipperLib.OutPt = js.native
      
      /* CompleteClass */
      var prev: typingsJapgolly.jsClipper.ClipperLib.OutPt = js.native
      
      /* CompleteClass */
      var pt: typingsJapgolly.jsClipper.ClipperLib.OutPt = js.native
    }
    
    @JSGlobal("ClipperLib.OutRec")
    @js.native
    open class OutRec ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.OutRec {
      
      /* CompleteClass */
      var AppendLink: typingsJapgolly.jsClipper.ClipperLib.OutRec = js.native
      
      /* CompleteClass */
      var FirstLeft: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var bottomPt: typingsJapgolly.jsClipper.ClipperLib.OutPt = js.native
      
      /* CompleteClass */
      var idx: Double = js.native
      
      /* CompleteClass */
      var isHole: Boolean = js.native
      
      /* CompleteClass */
      var pts: typingsJapgolly.jsClipper.ClipperLib.OutPt = js.native
    }
    
    @JSGlobal("ClipperLib.PI")
    @js.native
    def PI: Double = js.native
    
    @JSGlobal("ClipperLib.PI2")
    @js.native
    def PI2: Double = js.native
    inline def PI2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI2")(x.asInstanceOf[js.Any])
    
    inline def PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ClipperLib.PolyFillType")
    @js.native
    object PolyFillType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.jsClipper.ClipperLib.PolyFillType & Double] = js.native
      
      /* 0 */ val pftEvenOdd: typingsJapgolly.jsClipper.ClipperLib.PolyFillType.pftEvenOdd & Double = js.native
      
      /* 3 */ val pftNegative: typingsJapgolly.jsClipper.ClipperLib.PolyFillType.pftNegative & Double = js.native
      
      /* 1 */ val pftNonZero: typingsJapgolly.jsClipper.ClipperLib.PolyFillType.pftNonZero & Double = js.native
      
      /* 2 */ val pftPositive: typingsJapgolly.jsClipper.ClipperLib.PolyFillType.pftPositive & Double = js.native
    }
    
    @JSGlobal("ClipperLib.PolyOffsetBuilder")
    @js.native
    open class PolyOffsetBuilder protected ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.PolyOffsetBuilder {
      def this(
        pts: typingsJapgolly.jsClipper.ClipperLib.Polygons,
        solution: Value,
        delta: Double,
        jointype: JoinType,
        MiterLimit: Double,
        AutoFix: Boolean
      ) = this()
      
      /* CompleteClass */
      override def AddPoint(pt: typingsJapgolly.jsClipper.ClipperLib.IntPoint): Unit = js.native
      
      /* CompleteClass */
      override def DoMiter(): Unit = js.native
      
      /* CompleteClass */
      override def DoRound(): Unit = js.native
      
      /* CompleteClass */
      override def DoSquare(mul: Double): Unit = js.native
      
      /* CompleteClass */
      override def UpdateBotPt(pt: typingsJapgolly.jsClipper.ClipperLib.IntPoint): Boolean = js.native
      
      /* CompleteClass */
      var botPt: typingsJapgolly.jsClipper.ClipperLib.PolyOffsetBuilder = js.native
      
      /* CompleteClass */
      var currentPoly: typingsJapgolly.jsClipper.ClipperLib.Polygon = js.native
      
      /* CompleteClass */
      var delta: Double = js.native
      
      /* CompleteClass */
      var m_R: Double = js.native
      
      /* CompleteClass */
      var m_i: Double = js.native
      
      /* CompleteClass */
      var m_j: Double = js.native
      
      /* CompleteClass */
      var m_k: Double = js.native
      
      /* CompleteClass */
      var normals: ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint] = js.native
      
      /* CompleteClass */
      var pts: typingsJapgolly.jsClipper.ClipperLib.Polygons = js.native
    }
    
    @JSGlobal("ClipperLib.PolyType")
    @js.native
    object PolyType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.jsClipper.ClipperLib.PolyType & Double] = js.native
      
      /* 1 */ val ptClip: typingsJapgolly.jsClipper.ClipperLib.PolyType.ptClip & Double = js.native
      
      /* 0 */ val ptSubject: typingsJapgolly.jsClipper.ClipperLib.PolyType.ptSubject & Double = js.native
    }
    
    @JSGlobal("ClipperLib.Polygon")
    @js.native
    open class Polygon ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.Polygon {
      def this(poly: ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint]) = this()
    }
    
    @JSGlobal("ClipperLib.Polygons")
    @js.native
    open class Polygons ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.Polygons {
      def this(polys: ArrayLike[ArrayLike[typingsJapgolly.jsClipper.ClipperLib.IntPoint]]) = this()
    }
    
    @JSGlobal("ClipperLib.Protects")
    @js.native
    object Protects extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.jsClipper.ClipperLib.Protects & Double] = js.native
      
      /* 3 */ val ipBoth: typingsJapgolly.jsClipper.ClipperLib.Protects.ipBoth & Double = js.native
      
      /* 1 */ val ipLeft: typingsJapgolly.jsClipper.ClipperLib.Protects.ipLeft & Double = js.native
      
      /* 0 */ val ipNone: typingsJapgolly.jsClipper.ClipperLib.Protects.ipNone & Double = js.native
      
      /* 2 */ val ipRight: typingsJapgolly.jsClipper.ClipperLib.Protects.ipRight & Double = js.native
    }
    
    @JSGlobal("ClipperLib.Scanbeam")
    @js.native
    open class Scanbeam ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.Scanbeam {
      
      /* CompleteClass */
      var Y: Double = js.native
      
      /* CompleteClass */
      var next: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
    }
    
    @JSGlobal("ClipperLib.TEdge")
    @js.native
    open class TEdge ()
      extends StObject
         with typingsJapgolly.jsClipper.ClipperLib.TEdge {
      
      /* CompleteClass */
      var deltaX: Double = js.native
      
      /* CompleteClass */
      var deltaY: Double = js.native
      
      /* CompleteClass */
      var dx: Double = js.native
      
      /* CompleteClass */
      var next: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var nextInAEL: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var nextInLML: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var nextInSEL: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var outIdx: Double = js.native
      
      /* CompleteClass */
      var polyType: PolyType = js.native
      
      /* CompleteClass */
      var prev: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var prevInAEL: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var prevInSEL: typingsJapgolly.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var side: EdgeSide = js.native
      
      /* CompleteClass */
      var tmpX: Double = js.native
      
      /* CompleteClass */
      var windCnt: Double = js.native
      
      /* CompleteClass */
      var windCnt2: Double = js.native
      
      /* CompleteClass */
      var windDelta: Double = js.native
      
      /* CompleteClass */
      var xbot: Double = js.native
      
      /* CompleteClass */
      var xcurr: Double = js.native
      
      /* CompleteClass */
      var xtop: Double = js.native
      
      /* CompleteClass */
      var ybot: Double = js.native
      
      /* CompleteClass */
      var ycurr: Double = js.native
      
      /* CompleteClass */
      var ytop: Double = js.native
    }
    
    @JSGlobal("ClipperLib.biginteger_used")
    @js.native
    def bigintegerUsed: Boolean = js.native
    
    inline def bigintegerUsed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("biginteger_used")(x.asInstanceOf[js.Any])
  }
}
