package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.ReadonlyTextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.LiteralLikeNode because Already inherited
- typingsJapgolly.typescript.mod.TemplateLiteralLikeNode because var conflicts: hasExtendedUnicodeEscape, isUnterminated, text. Inlined rawText */ @js.native
trait NoSubstitutionTemplateLiteral
  extends StObject
     with LiteralExpression
     with Declaration
     with LiteralToken
     with StringLiteralLike
     with TemplateLiteral
     with TemplateLiteralToken {
  
  @JSName("kind")
  val kind_NoSubstitutionTemplateLiteral: typingsJapgolly.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral = js.native
  
  var rawText: js.UndefOr[java.lang.String] = js.native
}
