package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.ThisKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.TextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand
- typingsJapgolly.typescript.mod.KeywordTypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined  */ @js.native
trait ThisExpression
  extends PrimaryExpression
     with JsxTagNameExpression {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_ThisExpression: ThisKeyword = js.native
}

