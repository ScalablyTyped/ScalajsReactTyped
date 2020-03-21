package typingsJapgolly.tslint

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noDefaultImportRule", JSImport.Namespace)
@js.native
object noDefaultImportRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var getRuleOptions: js.Any = js.native
    var isFromModulesConfigOption: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
    def getNamedDefaultImport(namedBindings: NamedImports): Identifier | Null = js.native
  }
  
}

