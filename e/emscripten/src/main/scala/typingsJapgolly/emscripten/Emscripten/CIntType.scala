package typingsJapgolly.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.emscripten.emscriptenStrings.i8
  - typingsJapgolly.emscripten.emscriptenStrings.i16
  - typingsJapgolly.emscripten.emscriptenStrings.i32
  - typingsJapgolly.emscripten.emscriptenStrings.i64
*/
trait CIntType extends js.Object

object CIntType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def i16: typingsJapgolly.emscripten.emscriptenStrings.i16 = this.cast("i16")
  @scala.inline
  def i32: typingsJapgolly.emscripten.emscriptenStrings.i32 = this.cast("i32")
  @scala.inline
  def i64: typingsJapgolly.emscripten.emscriptenStrings.i64 = this.cast("i64")
  @scala.inline
  def i8: typingsJapgolly.emscripten.emscriptenStrings.i8 = this.cast("i8")
}

