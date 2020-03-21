package typingsJapgolly.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vis.visStrings.centripetal
  - typingsJapgolly.vis.visStrings.chordal
  - typingsJapgolly.vis.visStrings.uniform
  - typingsJapgolly.vis.visStrings.disabled
*/
trait ParametrizationInterpolationType extends js.Object

object ParametrizationInterpolationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def centripetal: typingsJapgolly.vis.visStrings.centripetal = this.cast("centripetal")
  @scala.inline
  def chordal: typingsJapgolly.vis.visStrings.chordal = this.cast("chordal")
  @scala.inline
  def disabled: typingsJapgolly.vis.visStrings.disabled = this.cast("disabled")
  @scala.inline
  def uniform: typingsJapgolly.vis.visStrings.uniform = this.cast("uniform")
}

