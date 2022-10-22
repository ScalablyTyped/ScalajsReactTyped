package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A Rectangle specifies an area that is enclosed by it's top-left
  * point (x, y), its width, and its height. It should not be confused with a
  * rectangular path, it is not an item.
  */
@JSGlobal("paper.Rectangle")
@js.native
open class Rectangle protected ()
  extends StObject
     with typingsJapgolly.paper.paper.Rectangle {
  /** 
    * Creates a Rectangle object.
    * 
    * @param object - an object containing properties to be set on the
    * rectangle
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a new rectangle object from the passed rectangle object.
    */
  def this(rectangle: typingsJapgolly.paper.paper.Rectangle) = this()
  /** 
    * Creates a rectangle object from the passed points. These do not
    * necessarily need to be the top left and bottom right corners, the
    * constructor figures out how to fit a rectangle between them.
    * 
    * @param from - the first point defining the rectangle
    * @param to - the second point defining the rectangle
    */
  def this(from: typingsJapgolly.paper.paper.Point, to: typingsJapgolly.paper.paper.Point) = this()
  /** 
    * Creates a Rectangle object.
    * 
    * @param point - the top-left point of the rectangle
    * @param size - the size of the rectangle
    */
  def this(point: typingsJapgolly.paper.paper.Point, size: typingsJapgolly.paper.paper.Size) = this()
  /** 
    * Creates a rectangle object.
    * 
    * @param x - the left coordinate
    * @param y - the top coordinate
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}
