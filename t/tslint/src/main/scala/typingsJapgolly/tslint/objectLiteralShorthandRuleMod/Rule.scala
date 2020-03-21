package typingsJapgolly.tslint.objectLiteralShorthandRuleMod

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.tslint.tslintStrings.`Shorthand method assignments have been disallowedDot`
import typingsJapgolly.tslint.tslintStrings.`Shorthand property and method assignments have been disallowedDot`
import typingsJapgolly.tslint.tslintStrings.`Shorthand property assignments have been disallowedDot`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/objectLiteralShorthandRule", "Rule")
@js.native
class Rule () extends AbstractRule {
  var parseOptions: js.Any = js.native
}

/* static members */
@JSImport("tslint/lib/rules/objectLiteralShorthandRule", "Rule")
@js.native
object Rule extends js.Object {
  var LONGHAND_METHOD: String = js.native
  var LONGHAND_PROPERTY: String = js.native
  var SHORTHAND_ASSIGNMENT: String = js.native
  var metadata: IRuleMetadata = js.native
  def getDisallowedShorthandErrorMessage(options: Options): (`Shorthand property assignments have been disallowedDot`) | (`Shorthand method assignments have been disallowedDot`) | (`Shorthand property and method assignments have been disallowedDot`) = js.native
  def getLonghandMethodErrorMessage(nodeText: String): String = js.native
  def getLonghandPropertyErrorMessage(nodeText: String): String = js.native
}

