package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.AssertionKind
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "AssertionBase")
@js.native
open class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.AssertionBase[TKind, TBracket] {
  def this(kind: TKind, openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[TBracket]) = this()
  def this(
    kind: TKind,
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[TBracket],
    closeBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
