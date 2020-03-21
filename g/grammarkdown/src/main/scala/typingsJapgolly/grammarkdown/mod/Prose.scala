package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.nodesMod.ProseFragment
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Prose")
@js.native
class Prose protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.Prose {
  def this(greaterThanToken: typingsJapgolly.grammarkdown.nodesMod.Token[GreaterThanToken]) = this()
  def this(
    greaterThanToken: typingsJapgolly.grammarkdown.nodesMod.Token[GreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
}

