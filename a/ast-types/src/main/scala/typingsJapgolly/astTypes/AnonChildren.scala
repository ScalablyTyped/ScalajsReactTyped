package typingsJapgolly.astTypes

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

trait AnonChildren extends js.Object {
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.undefined
  var closingElement: JSXClosingFragmentKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var openingElement: JSXOpeningFragmentKind
}

object AnonChildren {
  @scala.inline
  def apply(
    closingElement: JSXClosingFragmentKind,
    openingElement: JSXOpeningFragmentKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ] = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(closingElement = closingElement.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

