package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.balanced
  - typingsJapgolly.std.stdStrings.`max-bundle`
  - typingsJapgolly.std.stdStrings.`max-compat`
*/
trait RTCBundlePolicy extends js.Object

object RTCBundlePolicy {
  @scala.inline
  def balanced: typingsJapgolly.std.stdStrings.balanced = this.cast("balanced")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `max-bundle`: typingsJapgolly.std.stdStrings.`max-bundle` = this.cast("max-bundle")
  @scala.inline
  def `max-compat`: typingsJapgolly.std.stdStrings.`max-compat` = this.cast("max-compat")
}

