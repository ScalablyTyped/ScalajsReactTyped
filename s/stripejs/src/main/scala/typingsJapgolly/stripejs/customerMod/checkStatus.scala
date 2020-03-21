package typingsJapgolly.stripejs.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripejs.stripejsStrings.pass
  - typingsJapgolly.stripejs.stripejsStrings.fail
  - typingsJapgolly.stripejs.stripejsStrings.unavailable
  - typingsJapgolly.stripejs.stripejsStrings.unchecked
*/
trait checkStatus extends js.Object

object checkStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typingsJapgolly.stripejs.stripejsStrings.fail = this.cast("fail")
  @scala.inline
  def pass: typingsJapgolly.stripejs.stripejsStrings.pass = this.cast("pass")
  @scala.inline
  def unavailable: typingsJapgolly.stripejs.stripejsStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unchecked: typingsJapgolly.stripejs.stripejsStrings.unchecked = this.cast("unchecked")
}

