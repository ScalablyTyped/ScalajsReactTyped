package typingsJapgolly.tsutils.utilUtilMod

import typingsJapgolly.tsutils.AnonName
import typingsJapgolly.typescript.mod.BindingElement
import typingsJapgolly.typescript.mod.VariableDeclaration
import typingsJapgolly.typescript.mod.VariableDeclarationList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "forEachDeclaredVariable")
@js.native
object forEachDeclaredVariable extends js.Object {
  def apply[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ (VariableDeclaration | BindingElement) with AnonName, T]
  ): js.UndefOr[T] = js.native
}

