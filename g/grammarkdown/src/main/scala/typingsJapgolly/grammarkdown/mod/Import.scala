package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.AtToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.ImportKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Import")
@js.native
class Import protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.Import {
  def this(
    atToken: typingsJapgolly.grammarkdown.nodesMod.Token[AtToken],
    importKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[ImportKeyword]
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.nodesMod.Token[AtToken],
    importKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[ImportKeyword],
    path: typingsJapgolly.grammarkdown.nodesMod.StringLiteral
  ) = this()
}

