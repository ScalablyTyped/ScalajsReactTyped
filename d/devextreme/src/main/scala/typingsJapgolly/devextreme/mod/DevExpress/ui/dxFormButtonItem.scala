package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.button
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.empty
import typingsJapgolly.devextreme.devextremeStrings.group
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.simple
import typingsJapgolly.devextreme.devextremeStrings.tabbed
import typingsJapgolly.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormButtonItem extends js.Object {
  /** @deprecated Use horizontalAlignment instead. */
  /** Specifies the button's horizontal alignment. */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** Configures the button. */
  var buttonOptions: js.UndefOr[dxButtonOptions] = js.undefined
  /** Specifies how many columns the item spans. */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** Specifies a CSS class to be applied to the item. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the button's horizontal alignment. */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  /** Specifies the item's type. Set it to "button" to create a button item. */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** Specifies the item's identifier. */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies the button's vertical alignment. */
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
  /** Specifies whether the item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the item's position regarding other items in a group, tab, or the whole widget. */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormButtonItem {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    buttonOptions: dxButtonOptions = null,
    colSpan: Int | Double = null,
    cssClass: String = null,
    horizontalAlignment: center | left | right = null,
    itemType: empty | group | simple | tabbed | button = null,
    name: String = null,
    verticalAlignment: bottom | center | top = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: Int | Double = null
  ): dxFormButtonItem = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (buttonOptions != null) __obj.updateDynamic("buttonOptions")(buttonOptions.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visibleIndex != null) __obj.updateDynamic("visibleIndex")(visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormButtonItem]
  }
}

