package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ParameterList")
@js.native
open class ParameterList protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.ParameterList {
  def this(openParenToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.distNodesMod.Parameter]
  ) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.distNodesMod.Parameter],
    closeParenToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: Unit,
    closeParenToken: typingsJapgolly.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
