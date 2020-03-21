package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeViewItem extends CollectionWidgetItem {
  /** Specifies whether or not the tree view item is displayed expanded. */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the tree view item has children. */
  var hasItems: js.UndefOr[Boolean] = js.undefined
  /** Specifies the tree view item's icon. */
  var icon: js.UndefOr[String] = js.undefined
  /** Specifies nested tree view items. */
  var items: js.UndefOr[js.Array[dxTreeViewItem]] = js.undefined
  /** Holds the key of the parent item. */
  var parentId: js.UndefOr[Double | String] = js.undefined
  /** Specifies whether or not the tree view item is displayed selected. */
  var selected: js.UndefOr[Boolean] = js.undefined
}

object dxTreeViewItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    hasItems: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    icon: String = null,
    items: js.Array[dxTreeViewItem] = null,
    parentId: Double | String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxTreeViewItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(hasItems)) __obj.updateDynamic("hasItems")(hasItems.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeViewItem]
  }
}

