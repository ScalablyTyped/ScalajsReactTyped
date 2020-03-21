package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.GetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.TextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.Declaration because Already inherited
- typingsJapgolly.typescript.mod.NamedDeclaration because Already inherited
- typingsJapgolly.typescript.mod.ObjectLiteralElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _objectLiteralBrand
- typingsJapgolly.typescript.mod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
trait GetAccessorDeclaration
  extends FunctionLikeDeclarationBase
     with AccessorDeclaration
     with FunctionLikeDeclaration {
  var _classElementBrand: js.Any = js.native
  var _objectLiteralBrand: js.Any = js.native
  @JSName("body")
  var body_GetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  @JSName("kind")
  var kind_GetAccessorDeclaration: GetAccessor = js.native
  @JSName("name")
  var name_GetAccessorDeclaration: PropertyName = js.native
  @JSName("parent")
  var parent_GetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}

