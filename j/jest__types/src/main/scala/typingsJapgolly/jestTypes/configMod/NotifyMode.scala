package typingsJapgolly.jestTypes.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jestTypes.jestTypesStrings.always
  - typingsJapgolly.jestTypes.jestTypesStrings.failure
  - typingsJapgolly.jestTypes.jestTypesStrings.success
  - typingsJapgolly.jestTypes.jestTypesStrings.change
  - typingsJapgolly.jestTypes.jestTypesStrings.`success-change`
  - typingsJapgolly.jestTypes.jestTypesStrings.`failure-change`
*/
trait NotifyMode extends js.Object

object NotifyMode {
  @scala.inline
  def always: typingsJapgolly.jestTypes.jestTypesStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsJapgolly.jestTypes.jestTypesStrings.change = this.cast("change")
  @scala.inline
  def failure: typingsJapgolly.jestTypes.jestTypesStrings.failure = this.cast("failure")
  @scala.inline
  def `failure-change`: typingsJapgolly.jestTypes.jestTypesStrings.`failure-change` = this.cast("failure-change")
  @scala.inline
  def success: typingsJapgolly.jestTypes.jestTypesStrings.success = this.cast("success")
  @scala.inline
  def `success-change`: typingsJapgolly.jestTypes.jestTypesStrings.`success-change` = this.cast("success-change")
}

