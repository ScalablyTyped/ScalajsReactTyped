package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBraceToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBraceToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.SymbolSet {
  def this(openBraceToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBraceToken]) = this()
  def this(
    openBraceToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: js.Array[typingsJapgolly.grammarkdown.nodesMod.SymbolSpan]
  ) = this()
  def this(
    openBraceToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: js.UndefOr[scala.Nothing],
    closeBraceToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBraceToken]
  ) = this()
  def this(
    openBraceToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: js.Array[typingsJapgolly.grammarkdown.nodesMod.SymbolSpan],
    closeBraceToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBraceToken]
  ) = this()
}

