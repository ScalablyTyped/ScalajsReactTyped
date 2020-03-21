package typingsJapgolly.googleapisCommon.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleapisCommon.googleapisCommonStrings.`object`
  - typingsJapgolly.googleapisCommon.googleapisCommonStrings.integer
  - typingsJapgolly.googleapisCommon.googleapisCommonStrings.string
  - typingsJapgolly.googleapisCommon.googleapisCommonStrings.array
  - typingsJapgolly.googleapisCommon.googleapisCommonStrings.boolean
*/
trait SchemaType extends js.Object

object SchemaType {
  @scala.inline
  def array: typingsJapgolly.googleapisCommon.googleapisCommonStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsJapgolly.googleapisCommon.googleapisCommonStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsJapgolly.googleapisCommon.googleapisCommonStrings.integer = this.cast("integer")
  @scala.inline
  def `object`: typingsJapgolly.googleapisCommon.googleapisCommonStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsJapgolly.googleapisCommon.googleapisCommonStrings.string = this.cast("string")
}

