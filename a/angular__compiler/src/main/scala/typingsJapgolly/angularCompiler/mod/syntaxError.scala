package typingsJapgolly.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "syntaxError")
@js.native
object syntaxError extends js.Object {
  def apply(msg: String): js.Error = js.native
  def apply(msg: String, parseErrors: js.Array[typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError]): js.Error = js.native
}

