package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/returnUndefinedRule", JSImport.Namespace)
@js.native
object returnUndefinedRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_VALUE_RETURN: String = js.native
    var FAILURE_STRING_VOID_RETURN: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

