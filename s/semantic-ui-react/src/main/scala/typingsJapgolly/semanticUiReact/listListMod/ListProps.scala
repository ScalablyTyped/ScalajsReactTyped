package typingsJapgolly.semanticUiReact.listListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticUiReact.genericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.genericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.listItemMod.ListItemProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps
  extends StrictListProps
     with /* key */ StringDictionary[js.Any]

object ListProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    bulleted: js.UndefOr[Boolean] = js.undefined,
    celled: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    divided: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[ListItemProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    onItemClick: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ListItemProps) => Callback = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    relaxed: Boolean | very = null,
    selection: js.UndefOr[Boolean] = js.undefined,
    size: SemanticSIZES = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(bulleted)) __obj.updateDynamic("bulleted")(bulleted.asInstanceOf[js.Any])
    if (!js.isUndefined(celled)) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(divided)) __obj.updateDynamic("divided")(divided.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.listItemMod.ListItemProps) => onItemClick(t0, t1).runNow()))
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (!js.isUndefined(selection)) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

