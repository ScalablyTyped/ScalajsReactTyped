package typingsJapgolly.grammarkdown.distNodesMod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Constraints")
@js.native
open class Constraints protected ()
  extends Node[typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Constraints] {
  def this(openBracketToken: Token[OpenBracketToken]) = this()
  def this(openBracketToken: Token[OpenBracketToken], elements: js.Array[Argument]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    elements: js.Array[Argument],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    elements: Unit,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  
  val closeBracketToken: js.UndefOr[Token[CloseBracketToken]] = js.native
  
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  
  val openBracketToken: Token[OpenBracketToken] = js.native
  
  def update(): Constraints = js.native
  def update(elements: js.Array[Argument]): Constraints = js.native
}
