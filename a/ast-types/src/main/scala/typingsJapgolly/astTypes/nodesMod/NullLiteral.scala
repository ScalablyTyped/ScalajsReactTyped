package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.AnonFlags
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> */
trait NullLiteral extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var regex: js.UndefOr[AnonFlags] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.NullLiteral
  var value: Null
}

object NullLiteral {
  @scala.inline
  def apply(
    `type`: typingsJapgolly.astTypes.astTypesStrings.NullLiteral,
    value: Null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: AnonFlags = null
  ): NullLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
}

