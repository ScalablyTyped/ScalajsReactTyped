package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Pattern, 'type'> */
trait Identifier extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: String
  var optional: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.Identifier
  var typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind | Null
}

object Identifier {
  @scala.inline
  def apply(
    name: String,
    optional: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.Identifier,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

