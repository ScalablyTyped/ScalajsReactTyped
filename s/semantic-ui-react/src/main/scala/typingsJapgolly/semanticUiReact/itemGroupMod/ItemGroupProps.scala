package typingsJapgolly.semanticUiReact.itemGroupMod

import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.itemItemMod.ItemProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemGroupProps
  extends StrictItemGroupProps
     with /* key */ StringDictionary[js.Any]

object ItemGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    divided: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[ItemProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    relaxed: Boolean | very = null,
    unstackable: js.UndefOr[Boolean] = js.undefined
  ): ItemGroupProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(divided)) __obj.updateDynamic("divided")(divided.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemGroupProps]
  }
}

