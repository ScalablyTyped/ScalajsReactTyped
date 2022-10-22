package typingsJapgolly.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Structure representing a rectangle._
  *
  * Constructs a new rectangle placed in a two-dimensional coordinate system.
  * @see https://docs.scriptable.app/rect/#-new-rect
  */
trait Rect extends StObject {
  
  /**
    * _Height of rectangle._
    *
    * The height of the rectangle.
    * @see https://docs.scriptable.app/rect/#height
    */
  var height: Double
  
  /**
    * _Maximum X value._
    *
    * The greatest x-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#maxx
    */
  var maxX: Double
  
  /**
    * _Maximum Y value._
    *
    * The greatest y-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#maxy
    */
  var maxY: Double
  
  /**
    * _Minimum X value._
    *
    * The smallest x-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#minx
    */
  var minX: Double
  
  /**
    * _Minimum Y value._
    *
    * The smallest y-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#miny
    */
  var minY: Double
  
  /**
    * _Point that specifies the rectangles origin._
    *
    * The x- and y-coordinate that specifies the rectangles origin as a Point structure.
    * @see https://docs.scriptable.app/rect/#origin
    */
  var origin: Point
  
  /**
    * _Size of the rectangle._
    *
    * The width and height of the rectangle as a Size structure.
    * @see https://docs.scriptable.app/rect/#size
    */
  var size: Size
  
  /**
    * _Width of rectangle._
    *
    * The width of the rectangle.
    * @see https://docs.scriptable.app/rect/#width
    */
  var width: Double
  
  /**
    * _X value._
    *
    * The x-coordinate of the rectangle.
    * @see https://docs.scriptable.app/rect/#x
    */
  var x: Double
  
  /**
    * _Y value._
    *
    * The y-coordinate of the rectangle.
    * @see https://docs.scriptable.app/rect/#y
    */
  var y: Double
}
object Rect {
  
  inline def apply(
    height: Double,
    maxX: Double,
    maxY: Double,
    minX: Double,
    minY: Double,
    origin: Point,
    size: Size,
    width: Double,
    x: Double,
    y: Double
  ): Rect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  extension [Self <: Rect](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
