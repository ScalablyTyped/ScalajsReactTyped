package typingsJapgolly.extendedListbox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxSettings extends js.Object {
  /** function which returns a array of items */
  var getItems: js.UndefOr[js.Function0[js.Array[String | ListBoxItem]]] = js.undefined
  /** callback for searchBar text changes */
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  /** callback for doubleClick event on an item */
  var onItemDoubleClicked: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  /** callback for enter keyPress event on an item */
  var onItemEnterPressed: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  /** callback for item changes (item added, item removed, item order) */
  var onItemsChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  /** callback for selection changes */
  var onValueChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  /** determines if the searchBar is visible */
  var searchBar: js.UndefOr[Boolean] = js.undefined
  /** settings for the searchBar button */
  var searchBarButton: js.UndefOr[ListBoxSearchBarButtonOptions] = js.undefined
  /** watermark (placeholder) for the searchBar */
  var searchBarWatermark: js.UndefOr[String] = js.undefined
}

object ListBoxSettings {
  @scala.inline
  def apply(
    getItems: js.UndefOr[CallbackTo[js.Array[String | ListBoxItem]]] = js.undefined,
    onFilterChanged: /* event */ ListBoxEvent => Callback = null,
    onItemDoubleClicked: /* event */ ListBoxEvent => Callback = null,
    onItemEnterPressed: /* event */ ListBoxEvent => Callback = null,
    onItemsChanged: /* event */ ListBoxEvent => Callback = null,
    onValueChanged: /* event */ ListBoxEvent => Callback = null,
    searchBar: js.UndefOr[Boolean] = js.undefined,
    searchBarButton: ListBoxSearchBarButtonOptions = null,
    searchBarWatermark: String = null
  ): ListBoxSettings = {
    val __obj = js.Dynamic.literal()
    getItems.foreach(p => __obj.updateDynamic("getItems")(p.toJsFn))
    if (onFilterChanged != null) __obj.updateDynamic("onFilterChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.extendedListbox.ListBoxEvent) => onFilterChanged(t0).runNow()))
    if (onItemDoubleClicked != null) __obj.updateDynamic("onItemDoubleClicked")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.extendedListbox.ListBoxEvent) => onItemDoubleClicked(t0).runNow()))
    if (onItemEnterPressed != null) __obj.updateDynamic("onItemEnterPressed")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.extendedListbox.ListBoxEvent) => onItemEnterPressed(t0).runNow()))
    if (onItemsChanged != null) __obj.updateDynamic("onItemsChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.extendedListbox.ListBoxEvent) => onItemsChanged(t0).runNow()))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.extendedListbox.ListBoxEvent) => onValueChanged(t0).runNow()))
    if (!js.isUndefined(searchBar)) __obj.updateDynamic("searchBar")(searchBar.asInstanceOf[js.Any])
    if (searchBarButton != null) __obj.updateDynamic("searchBarButton")(searchBarButton.asInstanceOf[js.Any])
    if (searchBarWatermark != null) __obj.updateDynamic("searchBarWatermark")(searchBarWatermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxSettings]
  }
}

