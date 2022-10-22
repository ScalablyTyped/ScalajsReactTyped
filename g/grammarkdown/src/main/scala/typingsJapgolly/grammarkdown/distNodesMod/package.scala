package typingsJapgolly.grammarkdown.distNodesMod

import typingsJapgolly.grammarkdown.distNodesMod.^
import typingsJapgolly.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def forEachChild[T](node: Unit, cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def forEachChild[T](node: Node[SyntaxKind], cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grammarkdown.distNodesMod.PrimarySymbol
  - typingsJapgolly.grammarkdown.distNodesMod.Assertion
  - typingsJapgolly.grammarkdown.distNodesMod.PlaceholderSymbol
  - typingsJapgolly.grammarkdown.distNodesMod.UnicodeCharacterRange
  - typingsJapgolly.grammarkdown.distNodesMod.ButNotSymbol
  - typingsJapgolly.grammarkdown.distNodesMod.Prose
  - typingsJapgolly.grammarkdown.distNodesMod.OneOfSymbol
  - typingsJapgolly.grammarkdown.distNodesMod.InvalidSymbol
*/
type LexicalSymbol = _LexicalSymbol | PrimarySymbol

type PrimarySymbol = OptionalSymbol

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grammarkdown.distNodesMod.ProseFragmentLiteral[typingsJapgolly.grammarkdown.distTokensMod.ProseFragmentLiteralKind]
  - typingsJapgolly.grammarkdown.distNodesMod.Terminal
  - typingsJapgolly.grammarkdown.distNodesMod.Nonterminal
*/
type ProseFragment = _ProseFragment | ProseFragmentLiteral[ProseFragmentLiteralKind]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grammarkdown.distNodesMod.StringLiteral
  - typingsJapgolly.grammarkdown.distNodesMod.NumberLiteral
  - typingsJapgolly.grammarkdown.distNodesMod.Identifier
  - typingsJapgolly.grammarkdown.distNodesMod.UnicodeCharacterLiteral
  - typingsJapgolly.grammarkdown.distNodesMod.TerminalLiteral
  - typingsJapgolly.grammarkdown.distNodesMod.ProseFragmentLiteral[typingsJapgolly.grammarkdown.distTokensMod.ProseFragmentLiteralKind]
*/
type TextContentNode = _TextContentNode | ProseFragmentLiteral[ProseFragmentLiteralKind]
