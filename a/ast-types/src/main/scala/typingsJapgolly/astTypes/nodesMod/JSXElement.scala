package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.JSXAttributeKind
import typingsJapgolly.astTypes.kindsMod.JSXClosingElementKind
import typingsJapgolly.astTypes.kindsMod.JSXElementKind
import typingsJapgolly.astTypes.kindsMod.JSXExpressionContainerKind
import typingsJapgolly.astTypes.kindsMod.JSXFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXMemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.JSXNamespacedNameKind
import typingsJapgolly.astTypes.kindsMod.JSXOpeningElementKind
import typingsJapgolly.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsJapgolly.astTypes.kindsMod.JSXTextKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait JSXElement extends ASTNode {
  var attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]
  var children: js.Array[
    JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
  ]
  var closingElement: JSXClosingElementKind | Null
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind
  var openingElement: JSXOpeningElementKind
  var selfClosing: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ],
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    openingElement: JSXOpeningElementKind,
    selfClosing: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.JSXElement,
    closingElement: JSXClosingElementKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement]
  }
}

