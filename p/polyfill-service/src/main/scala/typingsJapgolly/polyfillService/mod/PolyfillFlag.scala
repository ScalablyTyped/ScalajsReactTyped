package typingsJapgolly.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.polyfillService.polyfillServiceStrings.gated
  - typingsJapgolly.polyfillService.polyfillServiceStrings.always
*/
trait PolyfillFlag extends js.Object

object PolyfillFlag {
  @scala.inline
  def always: typingsJapgolly.polyfillService.polyfillServiceStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gated: typingsJapgolly.polyfillService.polyfillServiceStrings.gated = this.cast("gated")
}

