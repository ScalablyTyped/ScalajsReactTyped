package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Constraints")
@js.native
open class Constraints protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.Constraints {
  def this(openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.distNodesMod.Argument]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.distNodesMod.Argument],
    closeBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: Unit,
    closeBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
