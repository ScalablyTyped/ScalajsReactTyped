package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _A path describes a shape._
  *
  * Use the methods on the path to create complex shapes.
  * @see https://docs.scriptable.app/path/#-new-path
  */
trait Path extends StObject {
  
  /**
    * _Adds a cubic curve to a point._
    *
    * Adds a cubic Bézier curve to the path with the specified end point and control points.
    * @param point - End point of the curve.
    * @param control1 - First control point of the curve.
    * @param control2 - Second control point of the curve.
    * @see https://docs.scriptable.app/path/#-addcurve
    */
  def addCurve(point: Point, control1: Point, control2: Point): Unit
  
  /**
    * _Adds an ellipse._
    *
    * Adds an ellipse incapsulated by the provided rectangle to the path.
    * @param rect - Rectangle incapsulating the ellipse.
    * @see https://docs.scriptable.app/path/#-addellipse
    */
  def addEllipse(rect: Rect): Unit
  
  /**
    * _Adds a line to a point._
    *
    * Add a line from the current point, e.g. set using the move method, and to the new point.
    * @param point - Point to add line to.
    * @see https://docs.scriptable.app/path/#-addline
    */
  def addLine(point: Point): Unit
  
  /**
    * _Adds a set of lines._
    *
    * Adds straight lines between an array of points. Calling this method is equivalent to calling the move function with the first point in the array of points and then calling addLine
    * on the subsequent points in the array.
    * @param points - Points to add lines between.
    * @see https://docs.scriptable.app/path/#-addlines
    */
  def addLines(points: js.Array[Point]): Unit
  
  /**
    * _Adds a quadratic curve to a point._
    *
    * Adds a quadratic Bézier curve to the specified end point with the specified control point.
    * @param point - End point of the curve.
    * @param control - Control point of the curve.
    * @see https://docs.scriptable.app/path/#-addquadcurve
    */
  def addQuadCurve(point: Point, control: Point): Unit
  
  /**
    * _Adds a rectangle._
    *
    * This is a convenience function for adding a rectangle to the path starting from the lower left corner and drawing the lines counter-clockwise until the rectangle is closed.
    * @param rect - Rectangle to add.
    * @see https://docs.scriptable.app/path/#-addrect
    */
  def addRect(rect: Rect): Unit
  
  /**
    * _Adds a set of rectangles._
    *
    * Calling this is equivalent to repeatedly calling addRect.
    * @param rects - Rectangles to add.
    * @see https://docs.scriptable.app/path/#-addrects
    */
  def addRects(rects: js.Array[Rect]): Unit
  
  /**
    * _Adds a rounded rectangle._
    *
    * Adds a rounded rectangle to the path. The corner width specifies the horizontal size of the corner and the corner height specifies the the vertical size of the corner.
    * @param rect - Rectangle to add.
    * @param cornerWidth - Horizontal size of the rounded corner.
    * @param cornerHeight - Vertical size of the rounded corner.
    * @see https://docs.scriptable.app/path/#-addroundedrect
    */
  def addRoundedRect(rect: Rect, cornerWidth: Double, cornerHeight: Double): Unit
  
  /**
    * _Closes a sub path._
    *
    * Adds a straight line from the current point to the start of the current subpath.
    * @see https://docs.scriptable.app/path/#-closesubpath
    */
  def closeSubpath(): Unit
  
  /**
    * _Moves to a point._
    *
    * Moves to a point without drawing a line between the current point and the new point.
    * @param point - Point to move to.
    * @see https://docs.scriptable.app/path/#-move
    */
  def move(point: Point): Unit
}
object Path {
  
  inline def apply(
    addCurve: (Point, Point, Point) => Callback,
    addEllipse: Rect => Callback,
    addLine: Point => Callback,
    addLines: js.Array[Point] => Callback,
    addQuadCurve: (Point, Point) => Callback,
    addRect: Rect => Callback,
    addRects: js.Array[Rect] => Callback,
    addRoundedRect: (Rect, Double, Double) => Callback,
    closeSubpath: Callback,
    move: Point => Callback
  ): Path = {
    val __obj = js.Dynamic.literal(addCurve = js.Any.fromFunction3((t0: Point, t1: Point, t2: Point) => (addCurve(t0, t1, t2)).runNow()), addEllipse = js.Any.fromFunction1((t0: Rect) => addEllipse(t0).runNow()), addLine = js.Any.fromFunction1((t0: Point) => addLine(t0).runNow()), addLines = js.Any.fromFunction1((t0: js.Array[Point]) => addLines(t0).runNow()), addQuadCurve = js.Any.fromFunction2((t0: Point, t1: Point) => (addQuadCurve(t0, t1)).runNow()), addRect = js.Any.fromFunction1((t0: Rect) => addRect(t0).runNow()), addRects = js.Any.fromFunction1((t0: js.Array[Rect]) => addRects(t0).runNow()), addRoundedRect = js.Any.fromFunction3((t0: Rect, t1: Double, t2: Double) => (addRoundedRect(t0, t1, t2)).runNow()), closeSubpath = closeSubpath.toJsFn, move = js.Any.fromFunction1((t0: Point) => move(t0).runNow()))
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setAddCurve(value: (Point, Point, Point) => Callback): Self = StObject.set(x, "addCurve", js.Any.fromFunction3((t0: Point, t1: Point, t2: Point) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddEllipse(value: Rect => Callback): Self = StObject.set(x, "addEllipse", js.Any.fromFunction1((t0: Rect) => value(t0).runNow()))
    
    inline def setAddLine(value: Point => Callback): Self = StObject.set(x, "addLine", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
    
    inline def setAddLines(value: js.Array[Point] => Callback): Self = StObject.set(x, "addLines", js.Any.fromFunction1((t0: js.Array[Point]) => value(t0).runNow()))
    
    inline def setAddQuadCurve(value: (Point, Point) => Callback): Self = StObject.set(x, "addQuadCurve", js.Any.fromFunction2((t0: Point, t1: Point) => (value(t0, t1)).runNow()))
    
    inline def setAddRect(value: Rect => Callback): Self = StObject.set(x, "addRect", js.Any.fromFunction1((t0: Rect) => value(t0).runNow()))
    
    inline def setAddRects(value: js.Array[Rect] => Callback): Self = StObject.set(x, "addRects", js.Any.fromFunction1((t0: js.Array[Rect]) => value(t0).runNow()))
    
    inline def setAddRoundedRect(value: (Rect, Double, Double) => Callback): Self = StObject.set(x, "addRoundedRect", js.Any.fromFunction3((t0: Rect, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setCloseSubpath(value: Callback): Self = StObject.set(x, "closeSubpath", value.toJsFn)
    
    inline def setMove(value: Point => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
  }
}
