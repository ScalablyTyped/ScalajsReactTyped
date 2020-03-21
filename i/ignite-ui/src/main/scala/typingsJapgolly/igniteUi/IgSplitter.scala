package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSplitter
  extends /**
	 * Option for igSplitter
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Fired after collapsing is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 *                 Use ui.index to get an index of collapsed panel.
  	 */
  var collapsed: js.UndefOr[CollapsedEvent] = js.undefined
  /**
  	 * Specifies drag delta of the split bar. In order to start dragging "move", the mouse has to be moved specific distance from its original position.
  	 *
  	 */
  var dragDelta: js.UndefOr[Double] = js.undefined
  /**
  	 * Fired after expanding is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 *                 Use ui.index to get an index of expanded panel.
  	 */
  var expanded: js.UndefOr[ExpandedEvent] = js.undefined
  /**
  	 * Gets/Sets the height of the container.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the tree inside its parent container, if no other widths are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Fired after the panels are refreshed because of browser"s resizing.
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var layoutRefreshed: js.UndefOr[LayoutRefreshedEvent] = js.undefined
  /**
  	 * Fired before the panels are refreshed because of browser"s resizing.
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var layoutRefreshing: js.UndefOr[LayoutRefreshingEvent] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies the orientation of the splitter.
  	 *
  	 *
  	 * Valid values:
  	 * "vertical"
  	 * "horizontal"
  	 */
  var orientation: js.UndefOr[String] = js.undefined
  /**
  	 * Array of objects options that specify the panels settings. The panels are no more than two. Settings are specified via enumeration.
  	 *
  	 */
  var panels: js.UndefOr[js.Array[IgSplitterPanel]] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Fired after split bar move is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var resizeEnded: js.UndefOr[ResizeEndedEvent] = js.undefined
  /**
  	 * Specifies whether the other splitters on the page will be resized as this splitter resizes.
  	 *
  	 */
  var resizeOtherSplitters: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired before split bar move is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var resizeStarted: js.UndefOr[ResizeStartedEvent] = js.undefined
  /**
  	 * Fired while split bar move is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var resizing: js.UndefOr[ResizingEvent] = js.undefined
  /**
  	 * Gets/Sets the width of the container.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgSplitter {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igSplitter
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapsed: (/* event */ Event_, /* ui */ CollapsedEventUIParam) => Callback = null,
    dragDelta: Int | Double = null,
    expanded: (/* event */ Event_, /* ui */ ExpandedEventUIParam) => Callback = null,
    height: String | Double = null,
    language: String = null,
    layoutRefreshed: (/* event */ Event_, /* ui */ LayoutRefreshedEventUIParam) => Callback = null,
    layoutRefreshing: (/* event */ Event_, /* ui */ LayoutRefreshingEventUIParam) => Callback = null,
    locale: js.Any = null,
    orientation: String = null,
    panels: js.Array[IgSplitterPanel] = null,
    regional: String | js.Object = null,
    resizeEnded: (/* event */ Event_, /* ui */ ResizeEndedEventUIParam) => Callback = null,
    resizeOtherSplitters: js.UndefOr[Boolean] = js.undefined,
    resizeStarted: (/* event */ Event_, /* ui */ ResizeStartedEventUIParam) => Callback = null,
    resizing: (/* event */ Event_, /* ui */ ResizingEventUIParam) => Callback = null,
    width: String | Double = null
  ): IgSplitter = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapsed != null) __obj.updateDynamic("collapsed")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.CollapsedEventUIParam) => collapsed(t0, t1).runNow()))
    if (dragDelta != null) __obj.updateDynamic("dragDelta")(dragDelta.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ExpandedEventUIParam) => expanded(t0, t1).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (layoutRefreshed != null) __obj.updateDynamic("layoutRefreshed")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.LayoutRefreshedEventUIParam) => layoutRefreshed(t0, t1).runNow()))
    if (layoutRefreshing != null) __obj.updateDynamic("layoutRefreshing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.LayoutRefreshingEventUIParam) => layoutRefreshing(t0, t1).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (resizeEnded != null) __obj.updateDynamic("resizeEnded")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ResizeEndedEventUIParam) => resizeEnded(t0, t1).runNow()))
    if (!js.isUndefined(resizeOtherSplitters)) __obj.updateDynamic("resizeOtherSplitters")(resizeOtherSplitters.asInstanceOf[js.Any])
    if (resizeStarted != null) __obj.updateDynamic("resizeStarted")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ResizeStartedEventUIParam) => resizeStarted(t0, t1).runNow()))
    if (resizing != null) __obj.updateDynamic("resizing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ResizingEventUIParam) => resizing(t0, t1).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSplitter]
  }
}

