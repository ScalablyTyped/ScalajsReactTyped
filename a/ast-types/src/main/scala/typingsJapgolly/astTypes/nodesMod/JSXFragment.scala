package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.JSXClosingFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXElementKind
import typingsJapgolly.astTypes.kindsMod.JSXExpressionContainerKind
import typingsJapgolly.astTypes.kindsMod.JSXFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXOpeningFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXTextKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait JSXFragment extends ASTNode {
  var children: js.Array[
    JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
  ]
  var closingElement: JSXClosingFragmentKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var openingElement: JSXOpeningFragmentKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXFragment
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ],
    closingElement: JSXClosingFragmentKind,
    openingElement: JSXOpeningFragmentKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.JSXFragment,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment]
  }
}

