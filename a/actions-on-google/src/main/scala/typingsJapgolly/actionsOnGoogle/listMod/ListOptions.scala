package typingsJapgolly.actionsOnGoogle.listMod

import typingsJapgolly.actionsOnGoogle.optionOptionMod.OptionItem
import typingsJapgolly.actionsOnGoogle.optionOptionMod.OptionItems
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsListSelectListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  /** @public */
  var items: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem]
  /** @public */
  var title: js.UndefOr[String] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(
    items: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem],
    title: String = null
  ): ListOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

