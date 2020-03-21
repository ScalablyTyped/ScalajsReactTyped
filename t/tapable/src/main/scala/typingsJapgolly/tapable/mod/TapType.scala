package typingsJapgolly.tapable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tapable.tapableStrings.sync
  - typingsJapgolly.tapable.tapableStrings.async
  - typingsJapgolly.tapable.tapableStrings.promise
*/
trait TapType extends js.Object

object TapType {
  @scala.inline
  def async: typingsJapgolly.tapable.tapableStrings.async = this.cast("async")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def promise: typingsJapgolly.tapable.tapableStrings.promise = this.cast("promise")
  @scala.inline
  def sync: typingsJapgolly.tapable.tapableStrings.sync = this.cast("sync")
}

