package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.Empty
  - typings.std.stdStrings.`no-referrer`
  - typings.std.stdStrings.`no-referrer-when-downgrade`
  - typings.std.stdStrings.`same-origin`
  - typings.std.stdStrings.origin
  - typings.std.stdStrings.`strict-origin`
  - typings.std.stdStrings.`origin-when-cross-origin`
  - typings.std.stdStrings.`strict-origin-when-cross-origin`
  - typings.std.stdStrings.`unsafe-url`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  def Empty: typingsJapgolly.std.stdStrings.Empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typingsJapgolly.std.stdStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typingsJapgolly.std.stdStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typingsJapgolly.std.stdStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typingsJapgolly.std.stdStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typingsJapgolly.std.stdStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typingsJapgolly.std.stdStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typingsJapgolly.std.stdStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typingsJapgolly.std.stdStrings.`unsafe-url` = this.cast("unsafe-url")
}

