package typingsJapgolly.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.add
  - typingsJapgolly.csstype.csstypeStrings.exclude
  - typingsJapgolly.csstype.csstypeStrings.intersect
  - typingsJapgolly.csstype.csstypeStrings.subtract
*/
trait CompositingOperator
  extends _MaskLayer[js.Any]
     with _MaskCompositeProperty

object CompositingOperator {
  @scala.inline
  def add: typingsJapgolly.csstype.csstypeStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exclude: typingsJapgolly.csstype.csstypeStrings.exclude = this.cast("exclude")
  @scala.inline
  def intersect: typingsJapgolly.csstype.csstypeStrings.intersect = this.cast("intersect")
  @scala.inline
  def subtract: typingsJapgolly.csstype.csstypeStrings.subtract = this.cast("subtract")
}

