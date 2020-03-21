package typingsJapgolly.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vis.visStrings.line
  - typingsJapgolly.vis.visStrings.bar
  - typingsJapgolly.vis.visStrings.points
*/
trait Graph2dStyleType extends js.Object

object Graph2dStyleType {
  @scala.inline
  def bar: typingsJapgolly.vis.visStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def line: typingsJapgolly.vis.visStrings.line = this.cast("line")
  @scala.inline
  def points: typingsJapgolly.vis.visStrings.points = this.cast("points")
}

