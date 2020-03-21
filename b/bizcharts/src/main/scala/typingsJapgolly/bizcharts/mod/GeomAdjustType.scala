package typingsJapgolly.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bizcharts.bizchartsStrings.stack
  - typingsJapgolly.bizcharts.bizchartsStrings.dodge
  - typingsJapgolly.bizcharts.bizchartsStrings.jitter
  - typingsJapgolly.bizcharts.bizchartsStrings.symmetric
*/
trait GeomAdjustType extends js.Object

object GeomAdjustType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dodge: typingsJapgolly.bizcharts.bizchartsStrings.dodge = this.cast("dodge")
  @scala.inline
  def jitter: typingsJapgolly.bizcharts.bizchartsStrings.jitter = this.cast("jitter")
  @scala.inline
  def stack: typingsJapgolly.bizcharts.bizchartsStrings.stack = this.cast("stack")
  @scala.inline
  def symmetric: typingsJapgolly.bizcharts.bizchartsStrings.symmetric = this.cast("symmetric")
}

