package typingsJapgolly.jsonSchemaTyped.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.array
  - typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.boolean
  - typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.integer
  - typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.`null`
  - typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.number
  - typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.`object`
  - typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.string
*/
trait JSONSchemaTypeName extends _JSONSchemaTypeValue

object JSONSchemaTypeName {
  @scala.inline
  def array: typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsJapgolly.jsonSchemaTyped.jsonSchemaTypedStrings.string = this.cast("string")
}

