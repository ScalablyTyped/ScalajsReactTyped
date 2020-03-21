package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.nodesMod.LexicalSymbol
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.ButKeyword
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.NotKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ButNotSymbol")
@js.native
class ButNotSymbol protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.ButNotSymbol {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[ButKeyword]) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[ButKeyword],
    notKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[ButKeyword],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[ButKeyword],
    notKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
}

