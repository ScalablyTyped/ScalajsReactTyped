package typingsJapgolly.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.emscripten.emscriptenStrings.i8
  - typingsJapgolly.emscripten.emscriptenStrings.i16
  - typingsJapgolly.emscripten.emscriptenStrings.i32
  - typingsJapgolly.emscripten.emscriptenStrings.i64
  - typingsJapgolly.emscripten.emscriptenStrings.float
  - typingsJapgolly.emscripten.emscriptenStrings.double
  - typingsJapgolly.emscripten.emscriptenStrings.i8Asterisk
  - typingsJapgolly.emscripten.emscriptenStrings.i16Asterisk
  - typingsJapgolly.emscripten.emscriptenStrings.i32Asterisk
  - typingsJapgolly.emscripten.emscriptenStrings.i64Asterisk
  - typingsJapgolly.emscripten.emscriptenStrings.floatAsterisk
  - typingsJapgolly.emscripten.emscriptenStrings.doubleAsterisk
  - typingsJapgolly.emscripten.emscriptenStrings.Asterisk
*/
trait CType extends js.Object

object CType {
  @scala.inline
  def Asterisk: typingsJapgolly.emscripten.emscriptenStrings.Asterisk = this.cast("*")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def double: typingsJapgolly.emscripten.emscriptenStrings.double = this.cast("double")
  @scala.inline
  def doubleAsterisk: typingsJapgolly.emscripten.emscriptenStrings.doubleAsterisk = this.cast("double*")
  @scala.inline
  def float: typingsJapgolly.emscripten.emscriptenStrings.float = this.cast("float")
  @scala.inline
  def floatAsterisk: typingsJapgolly.emscripten.emscriptenStrings.floatAsterisk = this.cast("float*")
  @scala.inline
  def i16: typingsJapgolly.emscripten.emscriptenStrings.i16 = this.cast("i16")
  @scala.inline
  def i16Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i16Asterisk = this.cast("i16*")
  @scala.inline
  def i32: typingsJapgolly.emscripten.emscriptenStrings.i32 = this.cast("i32")
  @scala.inline
  def i32Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i32Asterisk = this.cast("i32*")
  @scala.inline
  def i64: typingsJapgolly.emscripten.emscriptenStrings.i64 = this.cast("i64")
  @scala.inline
  def i64Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i64Asterisk = this.cast("i64*")
  @scala.inline
  def i8: typingsJapgolly.emscripten.emscriptenStrings.i8 = this.cast("i8")
  @scala.inline
  def i8Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i8Asterisk = this.cast("i8*")
}

