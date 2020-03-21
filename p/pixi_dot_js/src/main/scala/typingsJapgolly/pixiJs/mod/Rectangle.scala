package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle object is an area defined by its position, as indicated by its top-left corner
  * point (x, y) and by its width and its height.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Rectangle")
@js.native
class Rectangle ()
  extends typingsJapgolly.pixiJs.PIXI.Rectangle {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}

/* static members */
@JSImport("pixi.js", "Rectangle")
@js.native
object Rectangle extends js.Object {
  /**
    * A constant empty rectangle.
    *
    * @static
    * @constant
    * @member {PIXI.Rectangle}
    * @return {PIXI.Rectangle} An empty rectangle
    */
  var EMPTY: typingsJapgolly.pixiJs.PIXI.Rectangle = js.native
}

