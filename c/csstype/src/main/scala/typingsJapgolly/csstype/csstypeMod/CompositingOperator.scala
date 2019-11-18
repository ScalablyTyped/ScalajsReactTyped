package typingsJapgolly.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.add
  - typings.csstype.csstypeStrings.exclude
  - typings.csstype.csstypeStrings.intersect
  - typings.csstype.csstypeStrings.subtract
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

