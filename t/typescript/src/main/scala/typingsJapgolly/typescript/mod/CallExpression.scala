package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.TextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait CallExpression
  extends LeftHandSideExpression
     with CallLikeExpression
     with HasTypeArguments {
  var _declarationBrand: js.Any = js.native
  var arguments: NodeArray[Expression] = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_CallExpression: typingsJapgolly.typescript.mod.SyntaxKind.CallExpression = js.native
  var questionDotToken: js.UndefOr[QuestionDotToken] = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

