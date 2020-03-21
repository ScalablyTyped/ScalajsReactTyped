package typingsJapgolly.tslint

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noUnnecessaryClassRule", JSImport.Namespace)
@js.native
object noUnnecessaryClassRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_CONSTRUCTOR_ONLY: String = js.native
    var FAILURE_EMPTY_CLASS: String = js.native
    var FAILURE_STATIC_ONLY: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

