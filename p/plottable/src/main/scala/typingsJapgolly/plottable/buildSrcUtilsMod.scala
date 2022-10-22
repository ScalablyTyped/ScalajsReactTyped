package typingsJapgolly.plottable

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.d3Selection.mod.Selection_
import typingsJapgolly.lodash.mod.MemoizedFunction
import typingsJapgolly.plottable.anon.MaximumExtents
import typingsJapgolly.plottable.anon.PickSVGRectxywidthheight
import typingsJapgolly.plottable.buildSrcComponentsComponentMod.Component
import typingsJapgolly.plottable.buildSrcCoreDatasetMod.Dataset
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.Bounds
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.IAccessor
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.IEntityBounds
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.Point
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.Range
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typingsJapgolly.plottable.buildSrcUtilsEntityStoreMod.IPositionedEntity
import typingsJapgolly.plottable.buildSrcUtilsMathUtilsMod.ICssTransformMatrix
import typingsJapgolly.plottable.buildSrcUtilsMathUtilsMod.ITranslateVector
import typingsJapgolly.plottable.buildSrcUtilsRTreeMod.IDistanceFunction
import typingsJapgolly.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult
import typingsJapgolly.plottable.buildSrcUtilsRTreeSplitStrategiesMod.IRTreeSplitStrategy
import typingsJapgolly.plottable.buildSrcUtilsStackingUtilsMod.GenericStackingResult
import typingsJapgolly.plottable.buildSrcUtilsStackingUtilsMod.IStackingOrder
import typingsJapgolly.plottable.buildSrcUtilsStackingUtilsMod.StackingResult
import typingsJapgolly.plottable.plottableStrings.bottomup
import typingsJapgolly.plottable.plottableStrings.topdown
import typingsJapgolly.std.ClientRect
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsMod {
  
  @JSImport("plottable/build/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Array {
    
    @JSImport("plottable/build/src/utils", "Array")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(aList: js.Array[Double], bList: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(aList.asInstanceOf[js.Any], bList.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def createFilledArray[T](value: T, count: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilledArray")(value.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[Double], T], count: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilledArray")(value.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def uniq[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  }
  
  @JSImport("plottable/build/src/utils", "Bucket")
  @js.native
  open class Bucket protected ()
    extends typingsJapgolly.plottable.buildSrcUtilsBucketMod.Bucket {
    def this(index: Double, xValue: Double, yValue: Double) = this()
  }
  
  @JSImport("plottable/build/src/utils", "CallbackSet")
  @js.native
  open class CallbackSet[CB /* <: js.Function */] ()
    extends typingsJapgolly.plottable.buildSrcUtilsCallbackSetMod.CallbackSet[CB]
  
  object Color {
    
    @JSImport("plottable/build/src/utils", "Color")
    @js.native
    val ^ : js.Any = js.native
    
    inline def colorTest(colorTester: SimpleSelection[Any], className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colorTest")(colorTester.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def contrast(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def lightenColor(color: String, factor: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lightenColor")(color.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object DOM {
    
    @JSImport("plottable/build/src/utils", "DOM")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.SCREEN_REFRESH_RATE_MILLISECONDS")
    @js.native
    def SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
    inline def SCREEN_REFRESH_RATE_MILLISECONDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN_REFRESH_RATE_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    inline def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clientRectInside")(innerClientRect.asInstanceOf[js.Any], outerClientRect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clientRectsOverlap")(clientRectA.asInstanceOf[js.Any], clientRectB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def contains(parent: Element, child: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def elementBBox(element: SimpleSelection[Any]): PickSVGRectxywidthheight = ^.asInstanceOf[js.Dynamic].applyDynamic("elementBBox")(element.asInstanceOf[js.Any]).asInstanceOf[PickSVGRectxywidthheight]
    
    inline def elementHeight(elementOrSelection: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elementHeight")(elementOrSelection.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def elementHeight(elementOrSelection: Selection_[Element, Any, Any, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elementHeight")(elementOrSelection.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def elementWidth(elementOrSelection: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elementWidth")(elementOrSelection.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def elementWidth(elementOrSelection: Selection_[Element, Any, Any, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elementWidth")(elementOrSelection.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def entityBounds(element: Element): IEntityBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("entityBounds")(element.asInstanceOf[js.Any]).asInstanceOf[IEntityBounds]
    
    inline def expandRect(rect: ClientRect, amount: Double): ClientRect = (^.asInstanceOf[js.Dynamic].applyDynamic("expandRect")(rect.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[ClientRect]
    
    inline def getElementTransform(elem: Element): ICssTransformMatrix | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementTransform")(elem.asInstanceOf[js.Any]).asInstanceOf[ICssTransformMatrix | Null]
    
    inline def getHtmlElementAncestors(elem: Element): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlElementAncestors")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
    
    inline def getRotate(el: SimpleSelection[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRotate")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getScaleValues(el: SimpleSelection[Any]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleValues")(el.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def getTranslateValues(el: SimpleSelection[Any]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateValues")(el.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: PickSVGRectxywidthheight): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: PickSVGRectxywidthheight, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: PickSVGRectxywidthheight): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: PickSVGRectxywidthheight, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: PickSVGRectxywidthheight): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: PickSVGRectxywidthheight, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: PickSVGRectxywidthheight): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: PickSVGRectxywidthheight, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def requestAnimationFramePolyfill(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFramePolyfill")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("plottable/build/src/utils", "EntityStore")
  @js.native
  open class EntityStore[T /* <: IPositionedEntity */] ()
    extends typingsJapgolly.plottable.buildSrcUtilsEntityStoreMod.EntityStore[T]
  
  @JSImport("plottable/build/src/utils", "Map")
  @js.native
  open class Map[K, V] ()
    extends typingsJapgolly.plottable.buildSrcUtilsMapMod.Map[K, V]
  
  object Math {
    
    @JSImport("plottable/build/src/utils", "Math")
    @js.native
    val ^ : js.Any = js.native
    
    inline def applyTransform(a: ICssTransformMatrix, p: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def boundsIntersects(
      aX: Double,
      aY: Double,
      aWidth: Double,
      aHeight: Double,
      bX: Double,
      bY: Double,
      bWidth: Double,
      bHeight: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundsIntersects")(aX.asInstanceOf[js.Any], aY.asInstanceOf[js.Any], aWidth.asInstanceOf[js.Any], aHeight.asInstanceOf[js.Any], bX.asInstanceOf[js.Any], bY.asInstanceOf[js.Any], bWidth.asInstanceOf[js.Any], bHeight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def clamp(x: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def degreesToRadians(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToRadians")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def distanceSquared(p1: Point, p2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getCumulativeTransform(element: Element): ICssTransformMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("getCumulativeTransform")(element.asInstanceOf[js.Any]).asInstanceOf[ICssTransformMatrix]
    
    inline def inRange(x: Double, a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(x.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def invertMatrix(a: ICssTransformMatrix): ICssTransformMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("invertMatrix")(a.asInstanceOf[js.Any]).asInstanceOf[ICssTransformMatrix]
    
    inline def isNaN(n: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidNumber(n: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def max[C](array: js.Array[C], defaultValue: C): C = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[C]
    inline def max[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
      defaultValue: C
    ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[C]
    
    inline def min[C](array: js.Array[C], defaultValue: C): C = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[C]
    inline def min[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
      defaultValue: C
    ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[C]
    
    inline def multiplyMatrix(a: ICssTransformMatrix, b: ICssTransformMatrix): ICssTransformMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyMatrix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ICssTransformMatrix]
    
    inline def multiplyTranslate(a: ICssTransformMatrix, v: ITranslateVector): ICssTransformMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyTranslate")(a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[ICssTransformMatrix]
    
    inline def premultiplyTranslate(v: ITranslateVector, b: ICssTransformMatrix): ICssTransformMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTranslate")(v.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ICssTransformMatrix]
    
    inline def range(start: Double, stop: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def range(start: Double, stop: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def within(p: Point, bounds: Bounds): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(p.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object RTree {
    
    @JSImport("plottable/build/src/utils", "RTree")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/utils", "RTree.QueryPredicateResult")
    @js.native
    object QueryPredicateResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult & Double] = js.native
      
      /* 1 */ val FAIL: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.FAIL & Double = js.native
      
      /* 0 */ val PASS: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.PASS & Double = js.native
      
      /* 2 */ val PASS_AND_OVERWRITE: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE & Double = js.native
    }
    
    @JSImport("plottable/build/src/utils", "RTree.RTree")
    @js.native
    open class RTree[T] ()
      extends typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTree[T] {
      def this(maxNodeChildren: Double) = this()
      def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
      def this(maxNodeChildren: Unit, splitStrategy: IRTreeSplitStrategy) = this()
    }
    
    @JSImport("plottable/build/src/utils", "RTree.RTreeBounds")
    @js.native
    open class RTreeBounds protected ()
      extends typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds {
      def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
    }
    /* static members */
    object RTreeBounds {
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns the orthogonal absolute distance in the x-dimension from point
        * `p` to the farthest edge of `bounds`.
        *
        * If `p.x` is inside the bounds returns `0`.
        */
      inline def absoluteDistanceToFarEdgeX(bounds: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDistanceToFarEdgeX")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Returns the orthogonal absolute distance in the y-dimension from point
        * `p` to the farthest edge of `bounds`.
        *
        * If `p.y` is inside the bounds returns `0`.
        */
      inline def absoluteDistanceToFarEdgeY(bounds: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDistanceToFarEdgeY")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Returns the orthogonal absolute distance in the x-dimension from point
        * `p` to the nearest edge of `bounds`.
        *
        * If `p.x` is inside the bounds returns `0`.
        */
      inline def absoluteDistanceToNearEdgeX(bounds: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDistanceToNearEdgeX")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Returns the orthogonal absolute distance in the y-dimension from point
        * `p` to the nearest edge of `bounds`.
        *
        * If `p.y` is inside the bounds returns `0`.
        */
      inline def absoluteDistanceToNearEdgeY(bounds: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDistanceToNearEdgeY")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def bounds(bounds: Bounds): typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(bounds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds]
      
      inline def distanceSquaredToFarEdge(bounds: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquaredToFarEdge")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Returns the distance squared from `p` to the nearest edge of `bounds`. If
        * the point touches or is inside the bounds, returns `0`;
        *
        * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
        */
      inline def distanceSquaredToNearEdge(bounds: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquaredToNearEdge")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def entityBounds(bounds: IEntityBounds): typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("entityBounds")(bounds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds]
      
      /**
        * Returns true if `a` overlaps `b` in the x and y axes.
        *
        * Touching counts as overlap.
        */
      inline def isBoundsOverlapBounds(
        a: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds,
        b: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoundsOverlapBounds")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Returns true if `a` overlaps `b` in the x axis only.
        *
        * Touching counts as overlap.
        */
      inline def isBoundsOverlapX(
        a: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds,
        b: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoundsOverlapX")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Returns true if `a` overlaps `b` in the y axis only.
        *
        * Touching counts as overlap.
        */
      inline def isBoundsOverlapY(
        a: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds,
        b: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoundsOverlapY")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def pointPair(p0: Point, p1: Point): typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPair")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds]
      
      inline def points(points: js.Array[Point]): typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("points")(points.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds]
      
      inline def union(
        b0: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds,
        b1: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds
      ): typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(b0.asInstanceOf[js.Any], b1.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds]
      
      inline def unionAll(bounds: js.Array[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds]): typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("unionAll")(bounds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds]
      
      inline def xywh(x: Double, y: Double, w: Double, h: Double): typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("xywh")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds]
    }
    
    @JSImport("plottable/build/src/utils", "RTree.RTreeNode")
    @js.native
    open class RTreeNode[T] protected ()
      extends typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T] {
      def this(leaf: Boolean) = this()
    }
    /* static members */
    object RTreeNode {
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeNode")
      @js.native
      val ^ : js.Any = js.native
      
      inline def valueNode[T](bounds: typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeBounds, value: T): typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("valueNode")(bounds.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T]]
    }
    
    inline def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[
        /* node */ typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
        QueryPredicateResult
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMinimizingNodePredicate")(point.asInstanceOf[js.Any], nearFn.asInstanceOf[js.Any], farFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* node */ typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
        QueryPredicateResult
      ]]
    
    inline def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[
        /* a */ typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
        /* b */ typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
        Double
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNodeSort")(point.asInstanceOf[js.Any], distanceFn.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
        /* a */ typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
        /* b */ typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
        Double
      ]]
  }
  
  @JSImport("plottable/build/src/utils", "Set")
  @js.native
  open class Set[T] ()
    extends typingsJapgolly.plottable.buildSrcUtilsSetMod.Set[T]
  
  object Stacking {
    
    @JSImport("plottable/build/src/utils", "Stacking")
    @js.native
    val ^ : js.Any = js.native
    
    object IStackingOrder {
      
      @JSImport("plottable/build/src/utils", "Stacking.IStackingOrder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("plottable/build/src/utils", "Stacking.IStackingOrder.bottomup")
      @js.native
      def bottomup: typingsJapgolly.plottable.plottableStrings.bottomup = js.native
      inline def bottomup_=(x: bottomup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomup")(x.asInstanceOf[js.Any])
      
      @JSImport("plottable/build/src/utils", "Stacking.IStackingOrder.topdown")
      @js.native
      def topdown: typingsJapgolly.plottable.plottableStrings.topdown = js.native
      inline def topdown_=(x: topdown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topdown")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("plottable/build/src/utils", "Stacking.normalizeKey")
    @js.native
    val normalizeKey: (js.Function1[/* key */ Any, String]) & MemoizedFunction = js.native
    
    inline def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[Any], valueAccessor: IAccessor[Double]): StackingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(datasets.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], valueAccessor.asInstanceOf[js.Any])).asInstanceOf[StackingResult]
    inline def stack(
      datasets: js.Array[Dataset],
      keyAccessor: IAccessor[Any],
      valueAccessor: IAccessor[Double],
      stackingOrder: IStackingOrder
    ): StackingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(datasets.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], valueAccessor.asInstanceOf[js.Any], stackingOrder.asInstanceOf[js.Any])).asInstanceOf[StackingResult]
    
    inline def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[Any], filter: IAccessor[Boolean]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stackedExtent")(stackingResult.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def stackedExtents[D](stackingResult: GenericStackingResult[D]): MaximumExtents[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackedExtents")(stackingResult.asInstanceOf[js.Any]).asInstanceOf[MaximumExtents[D]]
  }
  
  @JSImport("plottable/build/src/utils", "Translator")
  @js.native
  open class Translator protected ()
    extends typingsJapgolly.plottable.buildSrcUtilsTransformAwareTranslatorMod.Translator {
    def this(_rootElement: HTMLElement) = this()
  }
  /* static members */
  object Translator {
    
    @JSImport("plottable/build/src/utils", "Translator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is the event's target part of the given component's DOM tree?
      */
    inline def isEventInside(component: Component, e: Event): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEventInside")(component.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object Window {
    
    @JSImport("plottable/build/src/utils", "Window")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debounce[T /* <: js.Function */](msec: Double, callback: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(msec.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def debounce[T /* <: js.Function */](msec: Double, callback: T, context: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(msec.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def deprecated(callingMethod: String, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(callingMethod.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def deprecated(callingMethod: String, version: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(callingMethod.asInstanceOf[js.Any], version.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setTimeout(f: js.Function, time: Double, args: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((scala.List(f.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
    
    inline def warn(warning: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(warning.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def assign[T /* <: Record[Any, Any] */](objs: Partial[T]*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T]
  
  inline def coerceExternalD3[S /* <: Selection_[Any, Any, Any, Any] */](externalD3Selection: S): S = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceExternalD3")(externalD3Selection.asInstanceOf[js.Any]).asInstanceOf[S]
  
  inline def getTranslator(component: Component): typingsJapgolly.plottable.buildSrcUtilsTransformAwareTranslatorMod.Translator = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslator")(component.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.plottable.buildSrcUtilsTransformAwareTranslatorMod.Translator]
}
