package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ObjectMethodKind
import typingsJapgolly.astTypes.kindsMod.ObjectPropertyKind
import typingsJapgolly.astTypes.kindsMod.PropertyKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.SpreadElementKind
import typingsJapgolly.astTypes.kindsMod.SpreadPropertyKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait ObjectExpression extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var properties: js.Array[
    PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
  ]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ],
    `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExpression]
  }
}

