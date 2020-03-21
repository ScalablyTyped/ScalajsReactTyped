package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/awaitPromiseRule", JSImport.Namespace)
@js.native
object awaitPromiseRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_FOR_AWAIT_OF: String = js.native
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

