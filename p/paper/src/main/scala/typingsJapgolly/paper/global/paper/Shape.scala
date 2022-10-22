package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("paper.Shape")
@js.native
open class Shape ()
  extends StObject
     with typingsJapgolly.paper.paper.Shape
object Shape {
  
  @JSGlobal("paper.Shape.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with typingsJapgolly.paper.paper.Shape {
    /** 
      * Creates a circular shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a circular shape item.
      * 
      * @param center - the center point of the circle
      * @param radius - the radius of the circle
      */
    def this(center: typingsJapgolly.paper.paper.Point, radius: Double) = this()
  }
  
  @JSGlobal("paper.Shape.Ellipse")
  @js.native
  open class Ellipse protected ()
    extends StObject
       with typingsJapgolly.paper.paper.Shape {
    /** 
      * Creates an elliptical shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates an elliptical shape item.
      * 
      * @param rectangle - the rectangle circumscribing the ellipse
      */
    def this(rectangle: typingsJapgolly.paper.paper.Rectangle) = this()
  }
  
  @JSGlobal("paper.Shape.Rectangle")
  @js.native
  open class Rectangle protected ()
    extends StObject
       with typingsJapgolly.paper.paper.Shape {
    /** 
      * Creates a rectangular shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a rectangular shape item, with optionally rounded corners.
      * 
      * @param rectangle - the rectangle object describing the
      * geometry of the rectangular shape to be created
      * @param radius - the size of the rounded corners
      */
    def this(rectangle: typingsJapgolly.paper.paper.Rectangle) = this()
    /** 
      * Creates a rectangular shape item from the passed points. These do not
      * necessarily need to be the top left and bottom right corners, the
      * constructor figures out how to fit a rectangle between them.
      * 
      * @param from - the first point defining the rectangle
      * @param to - the second point defining the rectangle
      */
    def this(from: typingsJapgolly.paper.paper.Point, to: typingsJapgolly.paper.paper.Point) = this()
    /** 
      * Creates a rectangular shape item from a point and a size object.
      * 
      * @param point - the rectangle's top-left corner.
      * @param size - the rectangle's size.
      */
    def this(point: typingsJapgolly.paper.paper.Point, size: typingsJapgolly.paper.paper.Size) = this()
    def this(rectangle: typingsJapgolly.paper.paper.Rectangle, radius: typingsJapgolly.paper.paper.Size) = this()
  }
}
