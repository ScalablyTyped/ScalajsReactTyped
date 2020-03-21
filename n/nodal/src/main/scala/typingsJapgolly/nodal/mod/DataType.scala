package typingsJapgolly.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodal.nodalStrings.serial
  - typingsJapgolly.nodal.nodalStrings.int
  - typingsJapgolly.nodal.nodalStrings.currency
  - typingsJapgolly.nodal.nodalStrings.float
  - typingsJapgolly.nodal.nodalStrings.string
  - typingsJapgolly.nodal.nodalStrings.text
  - typingsJapgolly.nodal.nodalStrings.datetime
  - typingsJapgolly.nodal.nodalStrings.boolean
  - typingsJapgolly.nodal.nodalStrings.json
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def boolean: typingsJapgolly.nodal.nodalStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currency: typingsJapgolly.nodal.nodalStrings.currency = this.cast("currency")
  @scala.inline
  def datetime: typingsJapgolly.nodal.nodalStrings.datetime = this.cast("datetime")
  @scala.inline
  def float: typingsJapgolly.nodal.nodalStrings.float = this.cast("float")
  @scala.inline
  def int: typingsJapgolly.nodal.nodalStrings.int = this.cast("int")
  @scala.inline
  def json: typingsJapgolly.nodal.nodalStrings.json = this.cast("json")
  @scala.inline
  def serial: typingsJapgolly.nodal.nodalStrings.serial = this.cast("serial")
  @scala.inline
  def string: typingsJapgolly.nodal.nodalStrings.string = this.cast("string")
  @scala.inline
  def text: typingsJapgolly.nodal.nodalStrings.text = this.cast("text")
}

