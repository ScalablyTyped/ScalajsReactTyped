package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NoopKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeclare extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var params: js.Array[PatternKind]
  var returnType: js.UndefOr[TSTypeAnnotationKind | NoopKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object AnonDeclare {
  @scala.inline
  def apply(
    params: js.Array[PatternKind],
    async: js.UndefOr[Boolean] = js.undefined,
    comments: js.Array[CommentKind] = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    returnType: TSTypeAnnotationKind | NoopKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): AnonDeclare = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare.asInstanceOf[js.Any])
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeclare]
  }
}

