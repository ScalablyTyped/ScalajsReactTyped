package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbar
  extends /**
	 * Option for igToolbar
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get/Set whether the toolbar can be collapsed.
  	 *
  	 */
  var allowCollapsing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The css class that will be applied to collapseButtonIcon.
  	 *
  	 */
  var collapseButtonIcon: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after item is collapsed
  	 */
  var collapsed: js.UndefOr[CollapsedEvent] = js.undefined
  /**
  	 * Event is fired before item is collapsed.
  	 */
  var collapsing: js.UndefOr[CollapsingEvent] = js.undefined
  /**
  	 * Display Name of the widget.
  	 *
  	 */
  var displayName: js.UndefOr[String] = js.undefined
  /**
  	 * The css class that will be applied to the expand/collapse button icon.
  	 *
  	 */
  var expandButtonIcon: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after item is expanded
  	 */
  var expanded: js.UndefOr[ExpandedEvent] = js.undefined
  /**
  	 * Event fired before item is expanded
  	 */
  var expanding: js.UndefOr[ExpandingEvent] = js.undefined
  /**
  	 * Set/Get the widget height.
  	 *
  	 */
  var height: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get/Set whether the widget is expanded initially.
  	 *
  	 */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after item is added
  	 */
  var itemAdded: js.UndefOr[ItemAddedEvent] = js.undefined
  /**
  	 * Fired after item is dissabled
  	 */
  var itemDisable: js.UndefOr[ItemDisableEvent] = js.undefined
  /**
  	 * Fired after item is enabled
  	 */
  var itemEnabled: js.UndefOr[ItemEnabledEvent] = js.undefined
  /**
  	 * Event fired after item is removed
  	 */
  var itemRemoved: js.UndefOr[ItemRemovedEvent] = js.undefined
  /**
  	 * Get/Set Toolbar's items.
  	 *
  	 */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[IgToolbarLocale] = js.undefined
  /**
  	 * Formal name of the widget.
  	 *
  	 */
  var name: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Event fired after a click on any toolbar button
  	 */
  var toolbarButtonClick: js.UndefOr[ToolbarButtonClickEvent] = js.undefined
  /**
  	 * Event is fired before the toolbar is opened.
  	 */
  var toolbarComboOpening: js.UndefOr[ToolbarComboOpeningEvent] = js.undefined
  /**
  	 * Event fired after toolbar combo is selected
  	 */
  var toolbarComboSelected: js.UndefOr[ToolbarComboSelectedEvent] = js.undefined
  /**
  	 * Event fired after a click on custom item
  	 */
  var toolbarCustomItemClick: js.UndefOr[ToolbarCustomItemClickEvent] = js.undefined
  /**
  	 * Set/Get the widget width.
  	 *
  	 */
  var width: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the window is resized
  	 */
  var windowResized: js.UndefOr[WindowResizedEvent] = js.undefined
}

object IgToolbar {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igToolbar
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowCollapsing: js.UndefOr[Boolean] = js.undefined,
    collapseButtonIcon: String = null,
    collapsed: (/* event */ Event_, /* ui */ CollapsedEventUIParam) => Callback = null,
    collapsing: (/* event */ Event_, /* ui */ CollapsingEventUIParam) => Callback = null,
    displayName: String = null,
    expandButtonIcon: String = null,
    expanded: (/* event */ Event_, /* ui */ ExpandedEventUIParam) => Callback = null,
    expanding: (/* event */ Event_, /* ui */ ExpandingEventUIParam) => Callback = null,
    height: js.Any = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    itemAdded: (/* event */ Event_, /* ui */ ItemAddedEventUIParam) => Callback = null,
    itemDisable: (/* event */ Event_, /* ui */ ItemDisableEventUIParam) => Callback = null,
    itemEnabled: (/* event */ Event_, /* ui */ ItemEnabledEventUIParam) => Callback = null,
    itemRemoved: (/* event */ Event_, /* ui */ ItemRemovedEventUIParam) => Callback = null,
    items: js.Array[_] = null,
    language: String = null,
    locale: IgToolbarLocale = null,
    name: String = null,
    regional: String | js.Object = null,
    toolbarButtonClick: (/* event */ Event_, /* ui */ ToolbarButtonClickEventUIParam) => Callback = null,
    toolbarComboOpening: (/* event */ Event_, /* ui */ ToolbarComboOpeningEventUIParam) => Callback = null,
    toolbarComboSelected: (/* event */ Event_, /* ui */ ToolbarComboSelectedEventUIParam) => Callback = null,
    toolbarCustomItemClick: (/* event */ Event_, /* ui */ ToolbarCustomItemClickEventUIParam) => Callback = null,
    width: js.Any = null,
    windowResized: (/* event */ Event_, /* ui */ WindowResizedEventUIParam) => Callback = null
  ): IgToolbar = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowCollapsing)) __obj.updateDynamic("allowCollapsing")(allowCollapsing.asInstanceOf[js.Any])
    if (collapseButtonIcon != null) __obj.updateDynamic("collapseButtonIcon")(collapseButtonIcon.asInstanceOf[js.Any])
    if (collapsed != null) __obj.updateDynamic("collapsed")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.CollapsedEventUIParam) => collapsed(t0, t1).runNow()))
    if (collapsing != null) __obj.updateDynamic("collapsing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.CollapsingEventUIParam) => collapsing(t0, t1).runNow()))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (expandButtonIcon != null) __obj.updateDynamic("expandButtonIcon")(expandButtonIcon.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ExpandedEventUIParam) => expanded(t0, t1).runNow()))
    if (expanding != null) __obj.updateDynamic("expanding")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ExpandingEventUIParam) => expanding(t0, t1).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (itemAdded != null) __obj.updateDynamic("itemAdded")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ItemAddedEventUIParam) => itemAdded(t0, t1).runNow()))
    if (itemDisable != null) __obj.updateDynamic("itemDisable")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ItemDisableEventUIParam) => itemDisable(t0, t1).runNow()))
    if (itemEnabled != null) __obj.updateDynamic("itemEnabled")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ItemEnabledEventUIParam) => itemEnabled(t0, t1).runNow()))
    if (itemRemoved != null) __obj.updateDynamic("itemRemoved")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ItemRemovedEventUIParam) => itemRemoved(t0, t1).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (toolbarButtonClick != null) __obj.updateDynamic("toolbarButtonClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ToolbarButtonClickEventUIParam) => toolbarButtonClick(t0, t1).runNow()))
    if (toolbarComboOpening != null) __obj.updateDynamic("toolbarComboOpening")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ToolbarComboOpeningEventUIParam) => toolbarComboOpening(t0, t1).runNow()))
    if (toolbarComboSelected != null) __obj.updateDynamic("toolbarComboSelected")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ToolbarComboSelectedEventUIParam) => toolbarComboSelected(t0, t1).runNow()))
    if (toolbarCustomItemClick != null) __obj.updateDynamic("toolbarCustomItemClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ToolbarCustomItemClickEventUIParam) => toolbarCustomItemClick(t0, t1).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowResized != null) __obj.updateDynamic("windowResized")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.WindowResizedEventUIParam) => windowResized(t0, t1).runNow()))
    __obj.asInstanceOf[IgToolbar]
  }
}

