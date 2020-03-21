package typingsJapgolly.astTypes

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

trait AnonAttributes extends js.Object {
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.undefined
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.undefined
  var closingElement: js.UndefOr[JSXClosingElementKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: js.UndefOr[JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind] = js.undefined
  var openingElement: JSXOpeningElementKind
  var selfClosing: js.UndefOr[Boolean] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(
    openingElement: JSXOpeningElementKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind] = null,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ] = null,
    closingElement: JSXClosingElementKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind = null,
    selfClosing: js.UndefOr[Boolean] = js.undefined
  ): AnonAttributes = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selfClosing)) __obj.updateDynamic("selfClosing")(selfClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

