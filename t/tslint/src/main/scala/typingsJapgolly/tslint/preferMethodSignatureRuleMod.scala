package typingsJapgolly.tslint

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.typescript.mod.PropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/preferMethodSignatureRule", JSImport.Namespace)
@js.native
object preferMethodSignatureRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
    def METH_SIGN_STRING(ps: PropertySignature): String = js.native
  }
  
}

