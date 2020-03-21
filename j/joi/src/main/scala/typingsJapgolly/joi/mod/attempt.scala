package typingsJapgolly.joi.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("joi", "attempt")
@js.native
object attempt extends js.Object {
  def apply[T](value: T, schema: SchemaLike): T = js.native
  def apply[T](value: T, schema: SchemaLike, message: String): T = js.native
  def apply[T](value: T, schema: SchemaLike, message: Error): T = js.native
}

