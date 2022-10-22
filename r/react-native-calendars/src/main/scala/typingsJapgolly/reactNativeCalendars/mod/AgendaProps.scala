package typingsJapgolly.reactNativeCalendars.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgendaProps[TItem] extends StObject {
  
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
    *  Specify how empty date content with no items should be rendered.
    */
  def renderEmptyDate(): Node
  
  /**
    *  Specify how each item should be rendered in agenda.
    */
  def renderItem(item: TItem, firstDayInDay: Boolean): Node
  
  /**
    *  Specify how agenda knob should look like.
    */
  var renderKnob: js.UndefOr[js.Function0[Node]] = js.undefined
  
  /**
    * specify your item comparison function for increased performance
    */
  def rowHasChanged(r1: TItem, r2: TItem): Boolean
  
  /**
    *  Initially visible month. Default = Date()
    */
  var selected: js.UndefOr[TCalendarDate] = js.undefined
  
  /**
    *  When `true` and `hideKnob` prop is `false`, the knob will always be visible and the user will be able to drag the knob up and close the calendar. Default = false
    */
  var showClosingKnob: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Agenda container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    *  Specify theme properties to override specific styles for agenda parts. Default = {}
    */
  var theme: js.UndefOr[AgendaThemeStyle] = js.undefined
}
object AgendaProps {
  
  inline def apply[TItem](
    renderEmptyDate: CallbackTo[Node],
    renderItem: (TItem, Boolean) => Node,
    rowHasChanged: (TItem, TItem) => Boolean
  ): AgendaProps[TItem] = {
    val __obj = js.Dynamic.literal(renderEmptyDate = renderEmptyDate.toJsFn, renderItem = js.Any.fromFunction2(renderItem), rowHasChanged = js.Any.fromFunction2(rowHasChanged))
    __obj.asInstanceOf[AgendaProps[TItem]]
  }
  
  extension [Self <: AgendaProps[?], TItem](x: Self & AgendaProps[TItem]) {
    
    inline def setDisplayLoadingIndicator(value: Boolean): Self = StObject.set(x, "displayLoadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setDisplayLoadingIndicatorUndefined: Self = StObject.set(x, "displayLoadingIndicator", js.undefined)
    
    inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    inline def setFutureScrollRange(value: Double): Self = StObject.set(x, "futureScrollRange", value.asInstanceOf[js.Any])
    
    inline def setFutureScrollRangeUndefined: Self = StObject.set(x, "futureScrollRange", js.undefined)
    
    inline def setHideKnob(value: Boolean): Self = StObject.set(x, "hideKnob", value.asInstanceOf[js.Any])
    
    inline def setHideKnobUndefined: Self = StObject.set(x, "hideKnob", js.undefined)
    
    inline def setItems(value: AgendaItemsMap[TItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setLoadItemsForMonth(value: /* date */ DateObject => Callback): Self = StObject.set(x, "loadItemsForMonth", js.Any.fromFunction1((t0: /* date */ DateObject) => value(t0).runNow()))
    
    inline def setLoadItemsForMonthUndefined: Self = StObject.set(x, "loadItemsForMonth", js.undefined)
    
    inline def setMaxDate(value: TCalendarDate): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: TCalendarDate): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
    
    inline def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
    
    inline def setOnCalendarToggled(value: /* calendarOpened */ Boolean => Callback): Self = StObject.set(x, "onCalendarToggled", js.Any.fromFunction1((t0: /* calendarOpened */ Boolean) => value(t0).runNow()))
    
    inline def setOnCalendarToggledUndefined: Self = StObject.set(x, "onCalendarToggled", js.undefined)
    
    inline def setOnDayChange(value: /* date */ DateObject => Callback): Self = StObject.set(x, "onDayChange", js.Any.fromFunction1((t0: /* date */ DateObject) => value(t0).runNow()))
    
    inline def setOnDayChangeUndefined: Self = StObject.set(x, "onDayChange", js.undefined)
    
    inline def setOnDayPress(value: /* date */ DateObject => Callback): Self = StObject.set(x, "onDayPress", js.Any.fromFunction1((t0: /* date */ DateObject) => value(t0).runNow()))
    
    inline def setOnDayPressUndefined: Self = StObject.set(x, "onDayPress", js.undefined)
    
    inline def setOnRefresh(value: Callback): Self = StObject.set(x, "onRefresh", value.toJsFn)
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setPastScrollRange(value: Double): Self = StObject.set(x, "pastScrollRange", value.asInstanceOf[js.Any])
    
    inline def setPastScrollRangeUndefined: Self = StObject.set(x, "pastScrollRange", js.undefined)
    
    inline def setRefreshControl(value: VdomNode): Self = StObject.set(x, "refreshControl", value.rawNode.asInstanceOf[js.Any])
    
    inline def setRefreshControlNull: Self = StObject.set(x, "refreshControl", null)
    
    inline def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
    
    inline def setRefreshControlVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "refreshControl", js.Array(value*))
    
    inline def setRefreshControlVdomElement(value: VdomElement): Self = StObject.set(x, "refreshControl", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    inline def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    inline def setRenderDay(value: (/* date */ js.UndefOr[DateObject], /* item */ TItem) => Node): Self = StObject.set(x, "renderDay", js.Any.fromFunction2(value))
    
    inline def setRenderDayUndefined: Self = StObject.set(x, "renderDay", js.undefined)
    
    inline def setRenderEmptyData(value: CallbackTo[Node]): Self = StObject.set(x, "renderEmptyData", value.toJsFn)
    
    inline def setRenderEmptyDataUndefined: Self = StObject.set(x, "renderEmptyData", js.undefined)
    
    inline def setRenderEmptyDate(value: CallbackTo[Node]): Self = StObject.set(x, "renderEmptyDate", value.toJsFn)
    
    inline def setRenderItem(value: (TItem, Boolean) => Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
    
    inline def setRenderKnob(value: CallbackTo[Node]): Self = StObject.set(x, "renderKnob", value.toJsFn)
    
    inline def setRenderKnobUndefined: Self = StObject.set(x, "renderKnob", js.undefined)
    
    inline def setRowHasChanged(value: (TItem, TItem) => Boolean): Self = StObject.set(x, "rowHasChanged", js.Any.fromFunction2(value))
    
    inline def setSelected(value: TCalendarDate): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShowClosingKnob(value: Boolean): Self = StObject.set(x, "showClosingKnob", value.asInstanceOf[js.Any])
    
    inline def setShowClosingKnobUndefined: Self = StObject.set(x, "showClosingKnob", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: AgendaThemeStyle): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
