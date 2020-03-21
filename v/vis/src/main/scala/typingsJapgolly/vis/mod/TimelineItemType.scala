package typingsJapgolly.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vis.visStrings.box
  - typingsJapgolly.vis.visStrings.point
  - typingsJapgolly.vis.visStrings.range
  - typingsJapgolly.vis.visStrings.background
*/
trait TimelineItemType extends js.Object

object TimelineItemType {
  @scala.inline
  def background: typingsJapgolly.vis.visStrings.background = this.cast("background")
  @scala.inline
  def box: typingsJapgolly.vis.visStrings.box = this.cast("box")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def point: typingsJapgolly.vis.visStrings.point = this.cast("point")
  @scala.inline
  def range: typingsJapgolly.vis.visStrings.range = this.cast("range")
}

