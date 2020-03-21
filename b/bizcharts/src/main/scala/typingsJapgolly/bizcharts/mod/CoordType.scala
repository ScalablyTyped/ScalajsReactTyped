package typingsJapgolly.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bizcharts.bizchartsStrings.rect
  - typingsJapgolly.bizcharts.bizchartsStrings.polar
  - typingsJapgolly.bizcharts.bizchartsStrings.theta
  - typingsJapgolly.bizcharts.bizchartsStrings.helix
*/
trait CoordType extends js.Object

object CoordType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def helix: typingsJapgolly.bizcharts.bizchartsStrings.helix = this.cast("helix")
  @scala.inline
  def polar: typingsJapgolly.bizcharts.bizchartsStrings.polar = this.cast("polar")
  @scala.inline
  def rect: typingsJapgolly.bizcharts.bizchartsStrings.rect = this.cast("rect")
  @scala.inline
  def theta: typingsJapgolly.bizcharts.bizchartsStrings.theta = this.cast("theta")
}

