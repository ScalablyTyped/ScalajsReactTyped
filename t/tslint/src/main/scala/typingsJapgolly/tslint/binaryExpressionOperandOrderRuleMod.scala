package typingsJapgolly.tslint

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/binaryExpressionOperandOrderRule", JSImport.Namespace)
@js.native
object binaryExpressionOperandOrderRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

