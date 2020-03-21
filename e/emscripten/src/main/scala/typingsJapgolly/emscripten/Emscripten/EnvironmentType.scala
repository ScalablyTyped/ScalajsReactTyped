package typingsJapgolly.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.emscripten.emscriptenStrings.WEB
  - typingsJapgolly.emscripten.emscriptenStrings.NODE
  - typingsJapgolly.emscripten.emscriptenStrings.SHELL
  - typingsJapgolly.emscripten.emscriptenStrings.WORKER
*/
trait EnvironmentType extends js.Object

object EnvironmentType {
  @scala.inline
  def NODE: typingsJapgolly.emscripten.emscriptenStrings.NODE = this.cast("NODE")
  @scala.inline
  def SHELL: typingsJapgolly.emscripten.emscriptenStrings.SHELL = this.cast("SHELL")
  @scala.inline
  def WEB: typingsJapgolly.emscripten.emscriptenStrings.WEB = this.cast("WEB")
  @scala.inline
  def WORKER: typingsJapgolly.emscripten.emscriptenStrings.WORKER = this.cast("WORKER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

