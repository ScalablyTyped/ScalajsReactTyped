package typingsJapgolly.tslint

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/switchFinalBreakRule", JSImport.Namespace)
@js.native
object switchFinalBreakRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_ALWAYS: String = js.native
    var FAILURE_STRING_NEVER: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

