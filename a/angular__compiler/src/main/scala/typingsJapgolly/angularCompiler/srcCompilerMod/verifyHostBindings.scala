package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.viewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  def apply(
    bindings: ParsedHostBindings,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): js.Array[typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError] = js.native
}

