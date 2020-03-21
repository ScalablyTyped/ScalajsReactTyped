package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.BooleanKind
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.AtToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.DefineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Define")
@js.native
class Define protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.Define {
  def this(
    atToken: typingsJapgolly.grammarkdown.nodesMod.Token[AtToken],
    defineKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[DefineKeyword],
    key: typingsJapgolly.grammarkdown.nodesMod.Identifier
  ) = this()
  def this(
    atToken: typingsJapgolly.grammarkdown.nodesMod.Token[AtToken],
    defineKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[DefineKeyword],
    key: typingsJapgolly.grammarkdown.nodesMod.Identifier,
    valueToken: typingsJapgolly.grammarkdown.nodesMod.Token[BooleanKind]
  ) = this()
}

