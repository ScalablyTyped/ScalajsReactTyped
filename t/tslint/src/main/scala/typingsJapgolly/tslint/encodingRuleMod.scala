package typingsJapgolly.tslint

import typingsJapgolly.tslint.libUtilsMod.Encoding
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/encodingRule", JSImport.Namespace)
@js.native
object encodingRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(actual: Encoding): String = js.native
  }
  
}

