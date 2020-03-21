package typingsJapgolly.tslint

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/linebreakStyleRule", JSImport.Namespace)
@js.native
object linebreakStyleRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_CRLF: String = js.native
    var FAILURE_LF: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

