package typingsJapgolly.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.web3Utils.web3UtilsStrings.function
  - typingsJapgolly.web3Utils.web3UtilsStrings.constructor
  - typingsJapgolly.web3Utils.web3UtilsStrings.event
  - typingsJapgolly.web3Utils.web3UtilsStrings.fallback
*/
trait AbiType extends js.Object

object AbiType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def constructor: typingsJapgolly.web3Utils.web3UtilsStrings.constructor = this.cast("constructor")
  @scala.inline
  def event: typingsJapgolly.web3Utils.web3UtilsStrings.event = this.cast("event")
  @scala.inline
  def fallback: typingsJapgolly.web3Utils.web3UtilsStrings.fallback = this.cast("fallback")
  @scala.inline
  def function: typingsJapgolly.web3Utils.web3UtilsStrings.function = this.cast("function")
}

