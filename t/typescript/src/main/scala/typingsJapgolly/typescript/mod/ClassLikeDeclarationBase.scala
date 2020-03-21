package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassLikeDeclarationBase
  extends NamedDeclaration
     with JSDocContainer {
  var heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  @JSName("kind")
  var kind_ClassLikeDeclarationBase: typingsJapgolly.typescript.mod.SyntaxKind.ClassDeclaration | typingsJapgolly.typescript.mod.SyntaxKind.ClassExpression = js.native
  var members: NodeArray[ClassElement] = js.native
  @JSName("name")
  var name_ClassLikeDeclarationBase: js.UndefOr[Identifier] = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

