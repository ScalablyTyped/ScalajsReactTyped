package typingsJapgolly.grammarkdown.nodesMod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.AtToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.ImportKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Import")
@js.native
class Import protected ()
  extends MetaElementBase[typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.Import] {
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword]) = this()
  def this(atToken: Token[AtToken], importKeyword: Token[ImportKeyword], path: StringLiteral) = this()
  val importKeyword: Token[ImportKeyword] = js.native
  val path: js.UndefOr[StringLiteral] = js.native
}

