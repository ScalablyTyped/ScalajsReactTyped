package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.nodesMod.LexicalSymbol
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.OneOfSymbol {
  def this(oneKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OneKeyword]) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OfKeyword]
  ) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    symbols: js.Array[LexicalSymbol]
  ) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OfKeyword],
    symbols: js.Array[LexicalSymbol]
  ) = this()
}

