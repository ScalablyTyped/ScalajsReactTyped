package typingsJapgolly.eslintScope.mod

import typingsJapgolly.estree.mod.Identifier
import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "Reference")
@js.native
class Reference ()
  extends typingsJapgolly.eslint.mod.Scope.Reference {
  /* CompleteClass */
  override var from: typingsJapgolly.eslint.mod.Scope.Scope = js.native
  /* CompleteClass */
  override var identifier: Identifier = js.native
  /* CompleteClass */
  override var init: Boolean = js.native
  /* CompleteClass */
  override var resolved: typingsJapgolly.eslint.mod.Scope.Variable | Null = js.native
  /* CompleteClass */
  override var writeExpr: Node | Null = js.native
  /* CompleteClass */
  override def isRead(): Boolean = js.native
  /* CompleteClass */
  override def isReadOnly(): Boolean = js.native
  /* CompleteClass */
  override def isReadWrite(): Boolean = js.native
  /* CompleteClass */
  override def isWrite(): Boolean = js.native
  /* CompleteClass */
  override def isWriteOnly(): Boolean = js.native
}

