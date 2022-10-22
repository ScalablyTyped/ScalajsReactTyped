package typingsJapgolly.antvG2.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antvG2.libConstantMod.DIRECTION
import typingsJapgolly.antvG2.libInterfaceMod.Point
import typingsJapgolly.antvG2.libUtilBboxMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2.@antv/g2/lib/util/bbox.BBox> */
trait PartialBBox extends StObject {
  
  var add: js.UndefOr[js.Function1[/* repeated */ BBox, BBox]] = js.undefined
  
  var bl: js.UndefOr[js.Function0[Point]] = js.undefined
  
  var bottom: js.UndefOr[js.Function0[Point]] = js.undefined
  
  var br: js.UndefOr[js.Function0[Point]] = js.undefined
  
  @JSName("clone")
  var clone_FPartialBBox: js.UndefOr[js.Function0[BBox]] = js.undefined
  
  var collide: js.UndefOr[js.Function1[/* bbox */ BBox, Boolean]] = js.undefined
  
  var constructor: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Any
    ]
  ] = js.undefined
  
  var contains: js.UndefOr[js.Function1[/* child */ BBox, Boolean]] = js.undefined
  
  var cut: js.UndefOr[js.Function2[/* subBBox */ BBox, /* direction */ DIRECTION, BBox]] = js.undefined
  
  var exceed: js.UndefOr[js.Function1[/* bbox */ BBox, typingsJapgolly.antvG2.libInterfaceMod.Padding]] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* gap */ typingsJapgolly.antvG2.libInterfaceMod.Padding, BBox]] = js.undefined
  
  var fromObject: js.UndefOr[Any] = js.undefined
  
  var fromRange: js.UndefOr[Any] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var isEqual: js.UndefOr[js.Function1[/* bbox */ BBox, Boolean]] = js.undefined
  
  var isPointIn: js.UndefOr[js.Function1[/* p */ Point, Boolean]] = js.undefined
  
  var left: js.UndefOr[js.Function0[Point]] = js.undefined
  
  var maxX: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var maxY: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var merge: js.UndefOr[js.Function1[/* repeated */ BBox, BBox]] = js.undefined
  
  var minX: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var minY: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var right: js.UndefOr[js.Function0[Point]] = js.undefined
  
  var shrink: js.UndefOr[js.Function1[/* gap */ typingsJapgolly.antvG2.libInterfaceMod.Padding, BBox]] = js.undefined
  
  var size: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var tl: js.UndefOr[js.Function0[Point]] = js.undefined
  
  var top: js.UndefOr[js.Function0[Point]] = js.undefined
  
  var tr: js.UndefOr[js.Function0[Point]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PartialBBox {
  
  inline def apply(): PartialBBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBBox]
  }
  
  extension [Self <: PartialBBox](x: Self) {
    
    inline def setAdd(value: /* repeated */ BBox => BBox): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setBl(value: CallbackTo[Point]): Self = StObject.set(x, "bl", value.toJsFn)
    
    inline def setBlUndefined: Self = StObject.set(x, "bl", js.undefined)
    
    inline def setBottom(value: CallbackTo[Point]): Self = StObject.set(x, "bottom", value.toJsFn)
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setBr(value: CallbackTo[Point]): Self = StObject.set(x, "br", value.toJsFn)
    
    inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
    
    inline def setClone_(value: CallbackTo[BBox]): Self = StObject.set(x, "clone", value.toJsFn)
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setCollide(value: /* bbox */ BBox => Boolean): Self = StObject.set(x, "collide", js.Any.fromFunction1(value))
    
    inline def setCollideUndefined: Self = StObject.set(x, "collide", js.undefined)
    
    inline def setConstructor(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction4(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setContains(value: /* child */ BBox => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setCut(value: (/* subBBox */ BBox, /* direction */ DIRECTION) => BBox): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
    
    inline def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
    
    inline def setExceed(value: /* bbox */ BBox => typingsJapgolly.antvG2.libInterfaceMod.Padding): Self = StObject.set(x, "exceed", js.Any.fromFunction1(value))
    
    inline def setExceedUndefined: Self = StObject.set(x, "exceed", js.undefined)
    
    inline def setExpand(value: /* gap */ typingsJapgolly.antvG2.libInterfaceMod.Padding => BBox): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFromObject(value: Any): Self = StObject.set(x, "fromObject", value.asInstanceOf[js.Any])
    
    inline def setFromObjectUndefined: Self = StObject.set(x, "fromObject", js.undefined)
    
    inline def setFromRange(value: Any): Self = StObject.set(x, "fromRange", value.asInstanceOf[js.Any])
    
    inline def setFromRangeUndefined: Self = StObject.set(x, "fromRange", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsEqual(value: /* bbox */ BBox => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
    
    inline def setIsPointIn(value: /* p */ Point => Boolean): Self = StObject.set(x, "isPointIn", js.Any.fromFunction1(value))
    
    inline def setIsPointInUndefined: Self = StObject.set(x, "isPointIn", js.undefined)
    
    inline def setLeft(value: CallbackTo[Point]): Self = StObject.set(x, "left", value.toJsFn)
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMaxX(value: CallbackTo[Double]): Self = StObject.set(x, "maxX", value.toJsFn)
    
    inline def setMaxXUndefined: Self = StObject.set(x, "maxX", js.undefined)
    
    inline def setMaxY(value: CallbackTo[Double]): Self = StObject.set(x, "maxY", value.toJsFn)
    
    inline def setMaxYUndefined: Self = StObject.set(x, "maxY", js.undefined)
    
    inline def setMerge(value: /* repeated */ BBox => BBox): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setMinX(value: CallbackTo[Double]): Self = StObject.set(x, "minX", value.toJsFn)
    
    inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
    
    inline def setMinY(value: CallbackTo[Double]): Self = StObject.set(x, "minY", value.toJsFn)
    
    inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
    
    inline def setRight(value: CallbackTo[Point]): Self = StObject.set(x, "right", value.toJsFn)
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setShrink(value: /* gap */ typingsJapgolly.antvG2.libInterfaceMod.Padding => BBox): Self = StObject.set(x, "shrink", js.Any.fromFunction1(value))
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
    
    inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTl(value: CallbackTo[Point]): Self = StObject.set(x, "tl", value.toJsFn)
    
    inline def setTlUndefined: Self = StObject.set(x, "tl", js.undefined)
    
    inline def setTop(value: CallbackTo[Point]): Self = StObject.set(x, "top", value.toJsFn)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTr(value: CallbackTo[Point]): Self = StObject.set(x, "tr", value.toJsFn)
    
    inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
