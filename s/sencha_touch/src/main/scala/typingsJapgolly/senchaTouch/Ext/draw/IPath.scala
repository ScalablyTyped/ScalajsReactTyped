package typingsJapgolly.senchaTouch.Ext.draw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPath
  extends StObject
     with IBase {
  
  /** [Method] Create an circular arc
    * @param x Number
    * @param y Number
    * @param radius Number
    * @param startAngle Number
    * @param endAngle Number
    * @param anticlockwise Number
    */
  var arc: js.UndefOr[
    js.Function6[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* radius */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] http  www w3 org TR SVG implnote html ArcImplementationNotes
    * @param rx Number
    * @param ry Number
    * @param rotation Number Differ from svg spec, this is radian.
    * @param fA Number
    * @param fS Number
    * @param x2 Number
    * @param y2 Number
    */
  var arcSvg: js.UndefOr[
    js.Function7[
      /* rx */ js.UndefOr[Double], 
      /* ry */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* fA */ js.UndefOr[Double], 
      /* fS */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Create a elliptic arc curve compatible with SVG s arc to instruction
    * @param x1 Number
    * @param y1 Number
    * @param x2 Number
    * @param y2 Number
    * @param rx Number
    * @param ry Number
    * @param rotation Number
    */
  var arcTo: js.UndefOr[
    js.Function7[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* rx */ js.UndefOr[Double], 
      /* ry */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] A cubic bezier curve to a position
    * @param cx1 Number
    * @param cy1 Number
    * @param cx2 Number
    * @param cy2 Number
    * @param x Number
    * @param y Number
    */
  var bezierCurveTo: js.UndefOr[
    js.Function6[
      /* cx1 */ js.UndefOr[Double], 
      /* cy1 */ js.UndefOr[Double], 
      /* cx2 */ js.UndefOr[Double], 
      /* cy2 */ js.UndefOr[Double], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Clear the path  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Clone this path
    * @returns Ext.draw.Path
    */
  @JSName("clone")
  var clone_FIPath: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Close this path with a straight line  */
  var closePath: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Create an elliptic arc
    * @param cx Number
    * @param cy Number
    * @param radiusX Number
    * @param radiusY Number
    * @param rotation Number
    * @param startAngle Number
    * @param endAngle Number
    * @param anticlockwise Number
    */
  var ellipse: js.UndefOr[
    js.Function8[
      /* cx */ js.UndefOr[Double], 
      /* cy */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Reconstruct path from cubic bezier curve stripes
    * @param stripes Array
    */
  var fromStripes: js.UndefOr[js.Function1[/* stripes */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Feed the path from svg path string
    * @param pathString String
    */
  var fromSvgString: js.UndefOr[js.Function1[/* pathString */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Get the bounding box of this matrix
    * @param target Object Optional object to receive the result.
    * @returns Object Object with x, y, width and height
    */
  var getDimension: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Get the bounding box as if the path is transformed by a matrix
    * @param matrix Ext.draw.Matrix
    * @param target Object Optional object to receive the result.
    * @returns Object An object with x, y, width and height.
    */
  var getDimensionWithTransform: js.UndefOr[
    js.Function2[/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[Any], Any]
  ] = js.undefined
  
  /** [Method] Test whether the given point is on or inside the path
    * @param x Number
    * @param y Number
    * @returns Boolean
    */
  var isPointInPath: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.undefined
  
  /** [Method] A straight line to a position
    * @param x Number
    * @param y Number
    */
  var lineTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Move to a position
    * @param x Number
    * @param y Number
    */
  var moveTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] A quadratic bezier curve to a position
    * @param cx Number
    * @param cy Number
    * @param x Number
    * @param y Number
    */
  var quadraticCurveTo: js.UndefOr[
    js.Function4[
      /* cx */ js.UndefOr[Double], 
      /* cy */ js.UndefOr[Double], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Draw a rectangle and close it
    * @param x Number
    * @param y Number
    * @param width Number
    * @param height Number
    */
  var rect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Return an svg path string for this path
    * @returns String
    */
  @JSName("toString")
  var toString_FIPath: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Convert path to bezier curve stripes
    * @param target Array The optional array to receive the result.
    * @returns Array
    */
  var toStripes: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Array]] = js.undefined
  
  /** [Method] Transform the current path by a matrix
    * @param matrix Ext.draw.Matrix
    */
  var transform: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[IMatrix], Unit]] = js.undefined
}
object IPath {
  
  inline def apply(): IPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPath]
  }
  
  extension [Self <: IPath](x: Self) {
    
    inline def setArc(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radius */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "arc", js.Any.fromFunction6((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double], t2: /* radius */ js.UndefOr[Double], t3: /* startAngle */ js.UndefOr[Double], t4: /* endAngle */ js.UndefOr[Double], t5: /* anticlockwise */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setArcSvg(
      value: (/* rx */ js.UndefOr[Double], /* ry */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* fA */ js.UndefOr[Double], /* fS */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "arcSvg", js.Any.fromFunction7((t0: /* rx */ js.UndefOr[Double], t1: /* ry */ js.UndefOr[Double], t2: /* rotation */ js.UndefOr[Double], t3: /* fA */ js.UndefOr[Double], t4: /* fS */ js.UndefOr[Double], t5: /* x2 */ js.UndefOr[Double], t6: /* y2 */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setArcSvgUndefined: Self = StObject.set(x, "arcSvg", js.undefined)
    
    inline def setArcTo(
      value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* rx */ js.UndefOr[Double], /* ry */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "arcTo", js.Any.fromFunction7((t0: /* x1 */ js.UndefOr[Double], t1: /* y1 */ js.UndefOr[Double], t2: /* x2 */ js.UndefOr[Double], t3: /* y2 */ js.UndefOr[Double], t4: /* rx */ js.UndefOr[Double], t5: /* ry */ js.UndefOr[Double], t6: /* rotation */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setArcToUndefined: Self = StObject.set(x, "arcTo", js.undefined)
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setBezierCurveTo(
      value: (/* cx1 */ js.UndefOr[Double], /* cy1 */ js.UndefOr[Double], /* cx2 */ js.UndefOr[Double], /* cy2 */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "bezierCurveTo", js.Any.fromFunction6((t0: /* cx1 */ js.UndefOr[Double], t1: /* cy1 */ js.UndefOr[Double], t2: /* cx2 */ js.UndefOr[Double], t3: /* cy2 */ js.UndefOr[Double], t4: /* x */ js.UndefOr[Double], t5: /* y */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setBezierCurveToUndefined: Self = StObject.set(x, "bezierCurveTo", js.undefined)
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setClone_(value: CallbackTo[IPath]): Self = StObject.set(x, "clone", value.toJsFn)
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setClosePath(value: Callback): Self = StObject.set(x, "closePath", value.toJsFn)
    
    inline def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    inline def setEllipse(
      value: (/* cx */ js.UndefOr[Double], /* cy */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "ellipse", js.Any.fromFunction8((t0: /* cx */ js.UndefOr[Double], t1: /* cy */ js.UndefOr[Double], t2: /* radiusX */ js.UndefOr[Double], t3: /* radiusY */ js.UndefOr[Double], t4: /* rotation */ js.UndefOr[Double], t5: /* startAngle */ js.UndefOr[Double], t6: /* endAngle */ js.UndefOr[Double], t7: /* anticlockwise */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
    
    inline def setFromStripes(value: /* stripes */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "fromStripes", js.Any.fromFunction1((t0: /* stripes */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setFromStripesUndefined: Self = StObject.set(x, "fromStripes", js.undefined)
    
    inline def setFromSvgString(value: /* pathString */ js.UndefOr[String] => Callback): Self = StObject.set(x, "fromSvgString", js.Any.fromFunction1((t0: /* pathString */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setFromSvgStringUndefined: Self = StObject.set(x, "fromSvgString", js.undefined)
    
    inline def setGetDimension(value: /* target */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getDimension", js.Any.fromFunction1(value))
    
    inline def setGetDimensionUndefined: Self = StObject.set(x, "getDimension", js.undefined)
    
    inline def setGetDimensionWithTransform(value: (/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "getDimensionWithTransform", js.Any.fromFunction2(value))
    
    inline def setGetDimensionWithTransformUndefined: Self = StObject.set(x, "getDimensionWithTransform", js.undefined)
    
    inline def setIsPointInPath(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean): Self = StObject.set(x, "isPointInPath", js.Any.fromFunction2(value))
    
    inline def setIsPointInPathUndefined: Self = StObject.set(x, "isPointInPath", js.undefined)
    
    inline def setLineTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "lineTo", js.Any.fromFunction2((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setLineToUndefined: Self = StObject.set(x, "lineTo", js.undefined)
    
    inline def setMoveTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "moveTo", js.Any.fromFunction2((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setMoveToUndefined: Self = StObject.set(x, "moveTo", js.undefined)
    
    inline def setQuadraticCurveTo(
      value: (/* cx */ js.UndefOr[Double], /* cy */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "quadraticCurveTo", js.Any.fromFunction4((t0: /* cx */ js.UndefOr[Double], t1: /* cy */ js.UndefOr[Double], t2: /* x */ js.UndefOr[Double], t3: /* y */ js.UndefOr[Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setQuadraticCurveToUndefined: Self = StObject.set(x, "quadraticCurveTo", js.undefined)
    
    inline def setRect(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "rect", js.Any.fromFunction4((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double], t2: /* width */ js.UndefOr[Double], t3: /* height */ js.UndefOr[Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setToStripes(value: /* target */ js.UndefOr[Array] => Array): Self = StObject.set(x, "toStripes", js.Any.fromFunction1(value))
    
    inline def setToStripesUndefined: Self = StObject.set(x, "toStripes", js.undefined)
    
    inline def setTransform(value: /* matrix */ js.UndefOr[IMatrix] => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction1((t0: /* matrix */ js.UndefOr[IMatrix]) => value(t0).runNow()))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
