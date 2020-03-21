package typingsJapgolly.tslint

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noRedundantJsdocRule", JSImport.Namespace)
@js.native
object noRedundantJsdocRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_REDUNDANT_TYPE: String = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_NO_COMMENT(tagName: String): String = js.native
    def FAILURE_STRING_REDUNDANT_TAG(tagName: String): String = js.native
  }
  
}

