package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.FlowType, 'type'> */
trait NumericLiteralTypeAnnotation extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var raw: String
  var `type`: typingsJapgolly.astTypes.astTypesStrings.NumericLiteralTypeAnnotation
  var value: Double
}

object NumericLiteralTypeAnnotation {
  @scala.inline
  def apply(
    raw: String,
    `type`: typingsJapgolly.astTypes.astTypesStrings.NumericLiteralTypeAnnotation,
    value: Double,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): NumericLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteralTypeAnnotation]
  }
}

