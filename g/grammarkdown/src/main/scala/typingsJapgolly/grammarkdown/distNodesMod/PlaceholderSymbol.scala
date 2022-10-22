package typingsJapgolly.grammarkdown.distNodesMod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.AtToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "PlaceholderSymbol")
@js.native
open class PlaceholderSymbol protected ()
  extends LexicalSymbolBase[typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.PlaceholderSymbol]
     with _LexicalSymbol {
  def this(placeholderToken: Token[AtToken]) = this()
  
  val placeholderToken: Token[AtToken] = js.native
}
