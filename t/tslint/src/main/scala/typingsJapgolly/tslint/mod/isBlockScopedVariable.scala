package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.VariableDeclaration
import typingsJapgolly.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isBlockScopedVariable")
@js.native
object isBlockScopedVariable extends js.Object {
  def apply(node: VariableDeclaration): Boolean = js.native
  def apply(node: VariableStatement): Boolean = js.native
}

