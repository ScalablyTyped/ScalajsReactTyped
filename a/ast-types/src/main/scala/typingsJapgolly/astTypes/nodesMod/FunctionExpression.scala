package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Function, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait FunctionExpression extends ASTNode {
  var async: Boolean
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var defaults: js.Array[ExpressionKind | Null]
  var expression: Boolean
  var generator: Boolean
  var id: js.UndefOr[IdentifierKind] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var params: js.Array[PatternKind]
  var rest: js.UndefOr[IdentifierKind] = js.undefined
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.FunctionExpression
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind] = js.undefined
}

object FunctionExpression {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatementKind,
    defaults: js.Array[ExpressionKind | Null],
    expression: Boolean,
    generator: Boolean,
    params: js.Array[PatternKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.FunctionExpression,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionExpression]
  }
}

