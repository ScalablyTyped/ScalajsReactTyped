package typingsJapgolly.grammarkdown.distNodesMod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "InvalidAssertion")
@js.native
open class InvalidAssertion protected ()
  extends AssertionBase[
      typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.InvalidAssertion, 
      OpenBracketToken
    ]
     with Assertion {
  def this(openBracketToken: Token[OpenBracketToken]) = this()
  def this(openBracketToken: Token[OpenBracketToken], closeBracketToken: Token[CloseBracketToken]) = this()
}
