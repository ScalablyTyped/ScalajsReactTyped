package typingsJapgolly.astTypes.nodesMod

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

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeParameters */
trait TSDeclareFunction extends ASTNode {
  var async: Boolean
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var declare: Boolean
  var generator: Boolean
  var id: IdentifierKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var params: js.Array[PatternKind]
  var returnType: TSTypeAnnotationKind | NoopKind | Null
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSDeclareFunction
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object TSDeclareFunction {
  @scala.inline
  def apply(
    async: Boolean,
    declare: Boolean,
    generator: Boolean,
    params: js.Array[PatternKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSDeclareFunction,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    returnType: TSTypeAnnotationKind | NoopKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): TSDeclareFunction = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareFunction]
  }
}

