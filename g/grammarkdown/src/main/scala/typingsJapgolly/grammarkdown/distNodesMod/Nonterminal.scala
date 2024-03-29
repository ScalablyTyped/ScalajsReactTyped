package typingsJapgolly.grammarkdown.distNodesMod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Nonterminal")
@js.native
open class Nonterminal protected ()
  extends OptionalSymbolBase[typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.Nonterminal]
     with OptionalSymbol
     with _ProseFragment {
  def this(name: Identifier) = this()
  def this(name: Identifier, argumentList: ArgumentList) = this()
  def this(name: Identifier, argumentList: Unit, questionToken: Token[QuestionToken]) = this()
  def this(name: Identifier, argumentList: ArgumentList, questionToken: Token[QuestionToken]) = this()
  
  val argumentList: js.UndefOr[ArgumentList] = js.native
  
  val name: Identifier = js.native
  
  def update(name: Identifier): Nonterminal = js.native
  def update(name: Identifier, argumentList: ArgumentList): Nonterminal = js.native
}
