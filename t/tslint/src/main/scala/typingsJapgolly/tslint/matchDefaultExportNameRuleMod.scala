package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/matchDefaultExportNameRule", JSImport.Namespace)
@js.native
object matchDefaultExportNameRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(importName: String, exportName: String): String = js.native
  }
  
}

