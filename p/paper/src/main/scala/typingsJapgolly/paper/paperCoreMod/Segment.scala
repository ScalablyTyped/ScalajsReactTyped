package typingsJapgolly.paper.paperCoreMod

import typingsJapgolly.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", "Segment")
@js.native
/** 
  * Creates a new Segment object.
  * 
  * @param point - the anchor point of the segment
  * @param handleIn - the handle point relative to the
  *     anchor point of the segment that describes the in tangent of the
  *     segment
  * @param handleOut - the handle point relative to the
  *     anchor point of the segment that describes the out tangent of the
  *     segment
  */
class Segment ()
  extends typingsJapgolly.paper.paper.Segment {
  def this(point: Point) = this()
  def this(point: Point, handleIn: Point) = this()
  def this(point: Point, handleIn: Point, handleOut: Point) = this()
}

