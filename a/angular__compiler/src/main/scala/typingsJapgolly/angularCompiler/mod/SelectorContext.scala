package typingsJapgolly.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "SelectorContext")
@js.native
class SelectorContext[T] protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.SelectorContext[T] {
  def this(
    selector: typingsJapgolly.angularCompiler.selectorMod.CssSelector,
    cbContext: T,
    listContext: typingsJapgolly.angularCompiler.selectorMod.SelectorListContext
  ) = this()
}

