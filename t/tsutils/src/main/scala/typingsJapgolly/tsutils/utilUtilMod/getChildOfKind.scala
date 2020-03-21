package typingsJapgolly.tsutils.utilUtilMod

import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.SyntaxKind
import typingsJapgolly.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "getChildOfKind")
@js.native
object getChildOfKind extends js.Object {
  def apply[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  def apply[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
}

