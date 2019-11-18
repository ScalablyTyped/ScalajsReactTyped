package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.default
  - typings.std.stdStrings.`low-power`
  - typings.std.stdStrings.`high-performance`
*/
trait WebGLPowerPreference extends js.Object

object WebGLPowerPreference {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.std.stdStrings.default = this.cast("default")
  @scala.inline
  def `high-performance`: typingsJapgolly.std.stdStrings.`high-performance` = this.cast("high-performance")
  @scala.inline
  def `low-power`: typingsJapgolly.std.stdStrings.`low-power` = this.cast("low-power")
}

