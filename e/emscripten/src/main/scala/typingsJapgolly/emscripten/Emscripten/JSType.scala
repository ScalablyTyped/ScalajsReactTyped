package typingsJapgolly.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.emscripten.emscriptenStrings.number
  - typingsJapgolly.emscripten.emscriptenStrings.string
  - typingsJapgolly.emscripten.emscriptenStrings.array
  - typingsJapgolly.emscripten.emscriptenStrings.boolean
*/
trait JSType extends js.Object

object JSType {
  @scala.inline
  def array: typingsJapgolly.emscripten.emscriptenStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsJapgolly.emscripten.emscriptenStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typingsJapgolly.emscripten.emscriptenStrings.number = this.cast("number")
  @scala.inline
  def string: typingsJapgolly.emscripten.emscriptenStrings.string = this.cast("string")
}

