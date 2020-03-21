package typingsJapgolly.eslintScope.mod

import typingsJapgolly.eslint.mod.Scope.Definition
import typingsJapgolly.estree.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "Variable")
@js.native
class Variable ()
  extends typingsJapgolly.eslint.mod.Scope.Variable {
  /* CompleteClass */
  override var defs: js.Array[Definition] = js.native
  /* CompleteClass */
  override var identifiers: js.Array[Identifier] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var references: js.Array[typingsJapgolly.eslint.mod.Scope.Reference] = js.native
}

