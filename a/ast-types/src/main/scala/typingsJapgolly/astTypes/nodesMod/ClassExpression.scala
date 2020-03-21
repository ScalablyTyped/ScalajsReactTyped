package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.ClassBodyKind
import typingsJapgolly.astTypes.kindsMod.ClassImplementsKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait ClassExpression extends ASTNode {
  var body: ClassBodyKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind | Null
  var implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var superClass: ExpressionKind | Null
  var superTypeParameters: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ClassExpression
  var typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null
}

object ClassExpression {
  @scala.inline
  def apply(
    body: ClassBodyKind,
    implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.ClassExpression,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    superTypeParameters: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (superClass != null) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression]
  }
}

