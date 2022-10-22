package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a point on a Bezier curve.
  *
  * The two control points specify how the Bezier curve goes through the given position.
  * @deprecated Deprecated
  */
trait BezierPoint extends StObject {
  
  /** This is the position of the first control point. */
  var ControlPoint1: Point
  
  /** This is the position of the second control point. */
  var ControlPoint2: Point
  
  /** This is the position of this point. */
  var Position: Point
}
object BezierPoint {
  
  inline def apply(ControlPoint1: Point, ControlPoint2: Point, Position: Point): BezierPoint = {
    val __obj = js.Dynamic.literal(ControlPoint1 = ControlPoint1.asInstanceOf[js.Any], ControlPoint2 = ControlPoint2.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierPoint]
  }
  
  extension [Self <: BezierPoint](x: Self) {
    
    inline def setControlPoint1(value: Point): Self = StObject.set(x, "ControlPoint1", value.asInstanceOf[js.Any])
    
    inline def setControlPoint2(value: Point): Self = StObject.set(x, "ControlPoint2", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
