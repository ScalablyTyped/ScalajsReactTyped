package typingsJapgolly.reactNativeCalendars.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgendaProps[TItem] extends js.Object {
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  /**
    *  If firstDay = 1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[Double] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[Double] = js.undefined
  /**
    *  Hide knob button. Default = false
    */
  var hideKnob: js.UndefOr[Boolean] = js.undefined
  /**
    *  The list of items that have to be displayed in agenda. If you want to render item as empty date
    *  the value of date key kas to be an empty array []. If there exists no value for date key it is
    *  considered that the date in question is not yet loaded
    */
  var items: js.UndefOr[AgendaItemsMap[TItem]] = js.undefined
  /**
    * callback that gets called when items for a certain month should be loaded (month became visible)
    */
  var loadItemsForMonth: js.UndefOr[js.Function1[/* date */ DateObject, Unit]] = js.undefined
  /**
    * Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
    */
  var maxDate: js.UndefOr[TCalendarDate] = js.undefined
  /**
    * Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
    */
  var minDate: js.UndefOr[TCalendarDate] = js.undefined
  /**
    *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
    */
  var monthFormat: js.UndefOr[String] = js.undefined
  /**
    *  Handler which gets executed when the calendar is opened or closed. Default = undefined
    */
  var onCalendarToggled: js.UndefOr[js.Function1[/* calendarOpened */ Boolean, Unit]] = js.undefined
  /**
    *  Handler that gets called when day changes while scrolling agenda list. Default = undefined
    */
  var onDayChange: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
    *  Handler which gets executed on day press. Default = undefined
    */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
    *  If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality.
    *  Make sure to also set the refreshing prop correctly. Default = undefined
    */
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[Double] = js.undefined
  /**
    *  A RefreshControl component, used to provide pull-to-refresh funtionality for the ScrollView.
    */
  var refreshControl: js.UndefOr[Node] = js.undefined
  /**
    *  Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[Boolean] = js.undefined
  /**
    *  Specify how each day should be rendered.
    *  Date can be undefined if the item has not property date.
    */
  var renderDay: js.UndefOr[js.Function2[/* date */ js.UndefOr[DateObject], /* item */ TItem, Node]] = js.undefined
  /**
    *  Specify what should be rendered instead of ActivityIndicator
    */
  var renderEmptyData: js.UndefOr[js.Function0[Node]] = js.undefined
  /**
    *  Specify how agenda knob should look like.
    */
  var renderKnob: js.UndefOr[js.Function0[Node]] = js.undefined
  /**
    *  Initially visible month. Default = Date()
    */
  var selected: js.UndefOr[TCalendarDate] = js.undefined
  /**
    *  Agenda container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    *  Specify theme properties to override specific styles for agenda parts. Default = {}
    */
  var theme: js.UndefOr[AgendaThemeStyle] = js.undefined
  /**
    *  Specify how empty date content with no items should be rendered.
    */
  def renderEmptyDate(): Node
  /**
    *  Specify how each item should be rendered in agenda.
    */
  def renderItem(item: TItem, firstDayInDay: Boolean): Node
  /**
    * specify your item comparison function for increased performance
    */
  def rowHasChanged(r1: TItem, r2: TItem): Boolean
}

object AgendaProps {
  @scala.inline
  def apply[TItem](
    renderEmptyDate: CallbackTo[Node],
    renderItem: (TItem, Boolean) => CallbackTo[Node],
    rowHasChanged: (TItem, TItem) => CallbackTo[Boolean],
    displayLoadingIndicator: js.UndefOr[Boolean] = js.undefined,
    firstDay: Int | Double = null,
    futureScrollRange: Int | Double = null,
    hideKnob: js.UndefOr[Boolean] = js.undefined,
    items: AgendaItemsMap[TItem] = null,
    loadItemsForMonth: /* date */ DateObject => Callback = null,
    maxDate: TCalendarDate = null,
    minDate: TCalendarDate = null,
    monthFormat: String = null,
    onCalendarToggled: /* calendarOpened */ Boolean => Callback = null,
    onDayChange: /* date */ DateObject => Callback = null,
    onDayPress: /* date */ DateObject => Callback = null,
    onRefresh: js.UndefOr[Callback] = js.undefined,
    pastScrollRange: Int | Double = null,
    refreshControl: VdomNode = null,
    refreshing: js.UndefOr[Boolean] = js.undefined,
    renderDay: (/* date */ js.UndefOr[DateObject], /* item */ TItem) => CallbackTo[Node] = null,
    renderEmptyData: js.UndefOr[CallbackTo[Node]] = js.undefined,
    renderKnob: js.UndefOr[CallbackTo[Node]] = js.undefined,
    selected: TCalendarDate = null,
    style: StyleProp[ViewStyle] = null,
    theme: AgendaThemeStyle = null
  ): AgendaProps[TItem] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderEmptyDate")(renderEmptyDate.toJsFn)
    __obj.updateDynamic("renderItem")(js.Any.fromFunction2((t0: TItem, t1: scala.Boolean) => renderItem(t0, t1).runNow()))
    __obj.updateDynamic("rowHasChanged")(js.Any.fromFunction2((t0: TItem, t1: TItem) => rowHasChanged(t0, t1).runNow()))
    if (!js.isUndefined(displayLoadingIndicator)) __obj.updateDynamic("displayLoadingIndicator")(displayLoadingIndicator.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (futureScrollRange != null) __obj.updateDynamic("futureScrollRange")(futureScrollRange.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKnob)) __obj.updateDynamic("hideKnob")(hideKnob.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (loadItemsForMonth != null) __obj.updateDynamic("loadItemsForMonth")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.reactNativeCalendars.mod.DateObject) => loadItemsForMonth(t0).runNow()))
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (onCalendarToggled != null) __obj.updateDynamic("onCalendarToggled")(js.Any.fromFunction1((t0: /* calendarOpened */ scala.Boolean) => onCalendarToggled(t0).runNow()))
    if (onDayChange != null) __obj.updateDynamic("onDayChange")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.reactNativeCalendars.mod.DateObject) => onDayChange(t0).runNow()))
    if (onDayPress != null) __obj.updateDynamic("onDayPress")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.reactNativeCalendars.mod.DateObject) => onDayPress(t0).runNow()))
    onRefresh.foreach(p => __obj.updateDynamic("onRefresh")(p.toJsFn))
    if (pastScrollRange != null) __obj.updateDynamic("pastScrollRange")(pastScrollRange.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.asInstanceOf[js.Any])
    if (renderDay != null) __obj.updateDynamic("renderDay")(js.Any.fromFunction2((t0: /* date */ js.UndefOr[typingsJapgolly.reactNativeCalendars.mod.DateObject], t1: /* item */ TItem) => renderDay(t0, t1).runNow()))
    renderEmptyData.foreach(p => __obj.updateDynamic("renderEmptyData")(p.toJsFn))
    renderKnob.foreach(p => __obj.updateDynamic("renderKnob")(p.toJsFn))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgendaProps[TItem]]
  }
}

