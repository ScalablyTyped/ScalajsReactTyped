package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.TextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.LiteralLikeNode because Already inherited
- typingsJapgolly.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand
- typingsJapgolly.typescript.mod.TemplateLiteralLikeNode because var conflicts: decorators, end, flags, hasExtendedUnicodeEscape, isUnterminated, kind, modifiers, parent, pos, text. Inlined rawText */ @js.native
trait NoSubstitutionTemplateLiteral
  extends LiteralExpression
     with StringLiteralLike
     with TemplateLiteral
     with TemplateLiteralToken {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_NoSubstitutionTemplateLiteral: typingsJapgolly.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral = js.native
  var rawText: js.UndefOr[java.lang.String] = js.native
}

