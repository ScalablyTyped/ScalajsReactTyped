package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distNodesMod.ProseFragment
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ProseAssertion")
@js.native
open class ProseAssertion protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.ProseAssertion {
  def this(openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken]) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: Unit,
    closeBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
