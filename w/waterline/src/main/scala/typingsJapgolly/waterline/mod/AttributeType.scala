package typingsJapgolly.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.waterline.waterlineStrings.string
  - typingsJapgolly.waterline.waterlineStrings.text
  - typingsJapgolly.waterline.waterlineStrings.integer
  - typingsJapgolly.waterline.waterlineStrings.float
  - typingsJapgolly.waterline.waterlineStrings.date
  - typingsJapgolly.waterline.waterlineStrings.time
  - typingsJapgolly.waterline.waterlineStrings.datetime
  - typingsJapgolly.waterline.waterlineStrings.boolean
  - typingsJapgolly.waterline.waterlineStrings.binary
  - typingsJapgolly.waterline.waterlineStrings.array
  - typingsJapgolly.waterline.waterlineStrings.json
*/
trait AttributeType extends js.Object

object AttributeType {
  @scala.inline
  def array: typingsJapgolly.waterline.waterlineStrings.array = this.cast("array")
  @scala.inline
  def binary: typingsJapgolly.waterline.waterlineStrings.binary = this.cast("binary")
  @scala.inline
  def boolean: typingsJapgolly.waterline.waterlineStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.waterline.waterlineStrings.date = this.cast("date")
  @scala.inline
  def datetime: typingsJapgolly.waterline.waterlineStrings.datetime = this.cast("datetime")
  @scala.inline
  def float: typingsJapgolly.waterline.waterlineStrings.float = this.cast("float")
  @scala.inline
  def integer: typingsJapgolly.waterline.waterlineStrings.integer = this.cast("integer")
  @scala.inline
  def json: typingsJapgolly.waterline.waterlineStrings.json = this.cast("json")
  @scala.inline
  def string: typingsJapgolly.waterline.waterlineStrings.string = this.cast("string")
  @scala.inline
  def text: typingsJapgolly.waterline.waterlineStrings.text = this.cast("text")
  @scala.inline
  def time: typingsJapgolly.waterline.waterlineStrings.time = this.cast("time")
}

