package typingsJapgolly.jsonSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsonSchema.jsonSchemaStrings.string
  - typingsJapgolly.jsonSchema.jsonSchemaStrings.number
  - typingsJapgolly.jsonSchema.jsonSchemaStrings.integer
  - typingsJapgolly.jsonSchema.jsonSchemaStrings.boolean
  - typingsJapgolly.jsonSchema.jsonSchemaStrings.`object`
  - typingsJapgolly.jsonSchema.jsonSchemaStrings.array
  - typingsJapgolly.jsonSchema.jsonSchemaStrings.`null`
*/
trait JSONSchema7TypeName extends js.Object

object JSONSchema7TypeName {
  @scala.inline
  def array: typingsJapgolly.jsonSchema.jsonSchemaStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsJapgolly.jsonSchema.jsonSchemaStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsJapgolly.jsonSchema.jsonSchemaStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typingsJapgolly.jsonSchema.jsonSchemaStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsJapgolly.jsonSchema.jsonSchemaStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsJapgolly.jsonSchema.jsonSchemaStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsJapgolly.jsonSchema.jsonSchemaStrings.string = this.cast("string")
}

