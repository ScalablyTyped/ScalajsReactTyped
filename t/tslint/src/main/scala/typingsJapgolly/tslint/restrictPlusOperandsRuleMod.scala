package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/restrictPlusOperandsRule", JSImport.Namespace)
@js.native
object restrictPlusOperandsRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var INVALID_TYPES_ERROR: String = js.native
    var SUGGEST_TEMPLATE_LITERALS: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

