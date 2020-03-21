package typingsJapgolly.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wpapi.wpapiStrings.string
  - typingsJapgolly.wpapi.wpapiStrings.integer
  - typingsJapgolly.wpapi.wpapiStrings.number
  - typingsJapgolly.wpapi.wpapiStrings.boolean
  - typingsJapgolly.wpapi.wpapiStrings.`object`
  - typingsJapgolly.wpapi.wpapiStrings.array
*/
trait HTTPArgumentType extends js.Object

object HTTPArgumentType {
  @scala.inline
  def array: typingsJapgolly.wpapi.wpapiStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsJapgolly.wpapi.wpapiStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsJapgolly.wpapi.wpapiStrings.integer = this.cast("integer")
  @scala.inline
  def number: typingsJapgolly.wpapi.wpapiStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsJapgolly.wpapi.wpapiStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsJapgolly.wpapi.wpapiStrings.string = this.cast("string")
}

