package typingsJapgolly.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.f32
  - typingsJapgolly.std.stdStrings.f64
  - typingsJapgolly.std.stdStrings.i32
  - typingsJapgolly.std.stdStrings.i64
*/
trait ValueType extends js.Object

object ValueType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def f32: typingsJapgolly.std.stdStrings.f32 = this.cast("f32")
  @scala.inline
  def f64: typingsJapgolly.std.stdStrings.f64 = this.cast("f64")
  @scala.inline
  def i32: typingsJapgolly.std.stdStrings.i32 = this.cast("i32")
  @scala.inline
  def i64: typingsJapgolly.std.stdStrings.i64 = this.cast("i64")
}

