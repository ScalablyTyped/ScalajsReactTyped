package typingsJapgolly.atAngularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "syntaxError")
@js.native
object syntaxError extends js.Object {
  def apply(msg: String): js.Error = js.native
  def apply(
    msg: String,
    parseErrors: js.Array[typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ): js.Error = js.native
}

