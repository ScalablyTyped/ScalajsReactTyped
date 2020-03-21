package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.minus
import typingsJapgolly.astTypes.astTypesStrings.plus
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait ObjectTypeProperty extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var key: LiteralKind | IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectTypeProperty
  var value: FlowTypeKind
  var variance: VarianceKind | plus | minus | Null
}

object ObjectTypeProperty {
  @scala.inline
  def apply(
    key: LiteralKind | IdentifierKind,
    optional: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectTypeProperty,
    value: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    variance: VarianceKind | plus | minus = null
  ): ObjectTypeProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeProperty]
  }
}

