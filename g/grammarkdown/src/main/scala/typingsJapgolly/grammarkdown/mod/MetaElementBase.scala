package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.nodesMod.MetaElementKind
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.MetaElementBase[TKind] {
  def this(kind: TKind, atToken: typingsJapgolly.grammarkdown.nodesMod.Token[AtToken]) = this()
}

