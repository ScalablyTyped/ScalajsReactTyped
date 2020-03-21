package typingsJapgolly.eslintScope.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "ScopeManager")
@js.native
class ScopeManager ()
  extends typingsJapgolly.eslint.mod.Scope.ScopeManager {
  def acquire(node: js.Object): Scope | Null = js.native
  def acquire(node: js.Object, inner: Boolean): Scope | Null = js.native
  def getDeclaredVariables(node: js.Object): js.Array[Variable] = js.native
}

