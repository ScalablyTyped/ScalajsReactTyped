package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfList")
@js.native
class OneOfList protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.OneOfList {
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OfKeyword],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    indented: Boolean,
    terminals: js.Array[typingsJapgolly.grammarkdown.nodesMod.Terminal]
  ) = this()
  def this(
    oneKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[OfKeyword],
    indented: Boolean,
    terminals: js.Array[typingsJapgolly.grammarkdown.nodesMod.Terminal]
  ) = this()
}

