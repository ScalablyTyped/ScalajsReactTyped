package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.AnonCooked
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait TemplateElement extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var tail: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TemplateElement
  var value: AnonCooked
}

object TemplateElement {
  @scala.inline
  def apply(
    tail: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.TemplateElement,
    value: AnonCooked,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateElement]
  }
}

