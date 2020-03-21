package typingsJapgolly.eslintScope.mod

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

@JSImport("eslint-scope", "Scope")
@js.native
class Scope ()
  extends typingsJapgolly.eslint.mod.Scope.Scope {
  /* CompleteClass */
  override var block: Node = js.native
  /* CompleteClass */
  override var childScopes: js.Array[typingsJapgolly.eslint.mod.Scope.Scope] = js.native
  /* CompleteClass */
  override var functionExpressionScope: Boolean = js.native
  /* CompleteClass */
  override var isStrict: Boolean = js.native
  /* CompleteClass */
  override var references: js.Array[typingsJapgolly.eslint.mod.Scope.Reference] = js.native
  /* CompleteClass */
  override var set: Map[String, typingsJapgolly.eslint.mod.Scope.Variable] = js.native
  /* CompleteClass */
  override var through: js.Array[typingsJapgolly.eslint.mod.Scope.Reference] = js.native
  /* CompleteClass */
  override var `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ = js.native
  /* CompleteClass */
  override var upper: typingsJapgolly.eslint.mod.Scope.Scope | Null = js.native
  /* CompleteClass */
  override var variableScope: typingsJapgolly.eslint.mod.Scope.Scope = js.native
  /* CompleteClass */
  override var variables: js.Array[typingsJapgolly.eslint.mod.Scope.Variable] = js.native
}

