package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.EmptyKeyword
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "EmptyAssertion")
@js.native
open class EmptyAssertion protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.EmptyAssertion {
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken],
    emptyKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[EmptyKeyword]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken],
    emptyKeyword: typingsJapgolly.grammarkdown.distNodesMod.Token[EmptyKeyword],
    closeBracketToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
