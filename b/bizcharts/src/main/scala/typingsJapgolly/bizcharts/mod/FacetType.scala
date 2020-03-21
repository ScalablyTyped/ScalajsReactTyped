package typingsJapgolly.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bizcharts.bizchartsStrings.rect
  - typingsJapgolly.bizcharts.bizchartsStrings.list
  - typingsJapgolly.bizcharts.bizchartsStrings.circle
  - typingsJapgolly.bizcharts.bizchartsStrings.tree
  - typingsJapgolly.bizcharts.bizchartsStrings.mirror
  - typingsJapgolly.bizcharts.bizchartsStrings.matrix
*/
trait FacetType extends js.Object

object FacetType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typingsJapgolly.bizcharts.bizchartsStrings.circle = this.cast("circle")
  @scala.inline
  def list: typingsJapgolly.bizcharts.bizchartsStrings.list = this.cast("list")
  @scala.inline
  def matrix: typingsJapgolly.bizcharts.bizchartsStrings.matrix = this.cast("matrix")
  @scala.inline
  def mirror: typingsJapgolly.bizcharts.bizchartsStrings.mirror = this.cast("mirror")
  @scala.inline
  def rect: typingsJapgolly.bizcharts.bizchartsStrings.rect = this.cast("rect")
  @scala.inline
  def tree: typingsJapgolly.bizcharts.bizchartsStrings.tree = this.cast("tree")
}

