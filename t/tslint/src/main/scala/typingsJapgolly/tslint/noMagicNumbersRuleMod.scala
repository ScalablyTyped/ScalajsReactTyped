package typingsJapgolly.tslint

import typingsJapgolly.std.Set
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noMagicNumbersRule", JSImport.Namespace)
@js.native
object noMagicNumbersRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var ALLOWED_NODES: Set[SyntaxKind] = js.native
    var DEFAULT_ALLOWED: js.Array[Double] = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(num: String): String = js.native
  }
  
}

