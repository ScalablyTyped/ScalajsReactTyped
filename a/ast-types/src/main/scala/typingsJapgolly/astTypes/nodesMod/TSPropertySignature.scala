package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeAnnotation */
trait TSPropertySignature extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var initializer: ExpressionKind | Null
  var key: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: Boolean
  var readonly: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSPropertySignature
  var typeAnnotation: TSTypeAnnotationKind | Null
}

object TSPropertySignature {
  @scala.inline
  def apply(
    computed: Boolean,
    key: ExpressionKind,
    optional: Boolean,
    readonly: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSPropertySignature,
    comments: js.Array[CommentKind] = null,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSPropertySignature]
  }
}

