package typingsJapgolly.eslint.mod.Scope

import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  var globalScope: typingsJapgolly.eslint.mod.Scope.Scope | Null = js.native
  var scopes: js.Array[typingsJapgolly.eslint.mod.Scope.Scope] = js.native
  def acquire(node: Node): typingsJapgolly.eslint.mod.Scope.Scope | Null = js.native
  def acquire(node: Node, inner: Boolean): typingsJapgolly.eslint.mod.Scope.Scope | Null = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
}

