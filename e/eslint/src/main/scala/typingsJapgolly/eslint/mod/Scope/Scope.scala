package typingsJapgolly.eslint.mod.Scope

import typingsJapgolly.eslint.eslintStrings.TDZ
import typingsJapgolly.eslint.eslintStrings.`catch`
import typingsJapgolly.eslint.eslintStrings.`class`
import typingsJapgolly.eslint.eslintStrings.`for`
import typingsJapgolly.eslint.eslintStrings.`function-expression-name`
import typingsJapgolly.eslint.eslintStrings.`with`
import typingsJapgolly.eslint.eslintStrings.block
import typingsJapgolly.eslint.eslintStrings.function
import typingsJapgolly.eslint.eslintStrings.global
import typingsJapgolly.eslint.eslintStrings.module
import typingsJapgolly.eslint.eslintStrings.switch
import typingsJapgolly.estree.mod.Node
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var block: Node
  var childScopes: js.Array[typingsJapgolly.eslint.mod.Scope.Scope]
  var functionExpressionScope: Boolean
  var isStrict: Boolean
  var references: js.Array[Reference]
  var set: Map[String, Variable]
  var through: js.Array[Reference]
  var `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ
  var upper: typingsJapgolly.eslint.mod.Scope.Scope | Null
  var variableScope: typingsJapgolly.eslint.mod.Scope.Scope
  var variables: js.Array[Variable]
}

object Scope {
  @scala.inline
  def apply(
    block: Node,
    childScopes: js.Array[typingsJapgolly.eslint.mod.Scope.Scope],
    functionExpressionScope: Boolean,
    isStrict: Boolean,
    references: js.Array[Reference],
    set: Map[String, Variable],
    through: js.Array[Reference],
    `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ,
    variableScope: typingsJapgolly.eslint.mod.Scope.Scope,
    variables: js.Array[Variable],
    upper: typingsJapgolly.eslint.mod.Scope.Scope = null
  ): Scope = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], childScopes = childScopes.asInstanceOf[js.Any], functionExpressionScope = functionExpressionScope.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], through = through.asInstanceOf[js.Any], variableScope = variableScope.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

