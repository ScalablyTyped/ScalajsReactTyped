package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noInferredEmptyObjectTypeRule", JSImport.Namespace)
@js.native
object noInferredEmptyObjectTypeRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var EMPTY_INTERFACE_FUNCTION: String = js.native
    var EMPTY_INTERFACE_INSTANCE: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

