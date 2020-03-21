package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.SelectorContext[T] {
  def this(
    selector: typingsJapgolly.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typingsJapgolly.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}

