package typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemMod

import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemExtraMod.ItemExtraProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemImageMod.ItemImageProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemMetaMod.ItemMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps
  extends StrictItemProps
     with /* key */ StringDictionary[js.Any]

object ItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[ItemDescriptionProps] = null,
    extra: SemanticShorthandItem[ItemExtraProps] = null,
    header: SemanticShorthandItem[ItemHeaderProps] = null,
    image: SemanticShorthandItem[ItemImageProps] = null,
    meta: SemanticShorthandItem[ItemMetaProps] = null
  ): ItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
}

