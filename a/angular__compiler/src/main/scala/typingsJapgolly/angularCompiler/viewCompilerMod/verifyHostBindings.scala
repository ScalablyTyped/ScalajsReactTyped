package typingsJapgolly.angularCompiler.viewCompilerMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseError
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  def apply(bindings: ParsedHostBindings, sourceSpan: ParseSourceSpan): js.Array[ParseError] = js.native
}

