package typingsJapgolly.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "forEachChild")
@js.native
object forEachChild extends js.Object {
  def apply[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[
      /* node */ typingsJapgolly.grammarkdown.nodesMod.Node[typingsJapgolly.grammarkdown.tokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def apply[T](
    node: typingsJapgolly.grammarkdown.nodesMod.Node[typingsJapgolly.grammarkdown.tokensMod.SyntaxKind],
    cbNode: js.Function1[
      /* node */ typingsJapgolly.grammarkdown.nodesMod.Node[typingsJapgolly.grammarkdown.tokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
}

