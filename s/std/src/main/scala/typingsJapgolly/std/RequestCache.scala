package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.default
  - typingsJapgolly.std.stdStrings.`force-cache`
  - typingsJapgolly.std.stdStrings.`no-cache`
  - typingsJapgolly.std.stdStrings.`no-store`
  - typingsJapgolly.std.stdStrings.`only-if-cached`
  - typingsJapgolly.std.stdStrings.reload
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.std.stdStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typingsJapgolly.std.stdStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typingsJapgolly.std.stdStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typingsJapgolly.std.stdStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typingsJapgolly.std.stdStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typingsJapgolly.std.stdStrings.reload = this.cast("reload")
}

