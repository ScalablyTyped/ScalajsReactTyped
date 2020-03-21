package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.HtmlTriviaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: HtmlTriviaKind */] protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.HtmlTriviaBase[TKind] {
  def this(kind: TKind, tagName: String) = this()
}

