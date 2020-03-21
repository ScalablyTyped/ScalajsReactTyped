package typingsJapgolly.astTypes

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

trait AnonDefaults extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.undefined
  var expression: js.UndefOr[Boolean] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var params: js.Array[PatternKind]
  var rest: js.UndefOr[IdentifierKind | Null] = js.undefined
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

object AnonDefaults {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    async: js.UndefOr[Boolean] = js.undefined,
    comments: js.Array[CommentKind] = null,
    defaults: js.Array[ExpressionKind | Null] = null,
    expression: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): AnonDefaults = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaults]
  }
}

