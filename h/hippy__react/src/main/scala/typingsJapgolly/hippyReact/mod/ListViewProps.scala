package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hippyReact.anon.ContentOffset
import typingsJapgolly.hippyReact.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  /**
    * iOS only
    */
  var bounces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Data source
    */
  var dataSource: js.UndefOr[js.Array[DataItem]] = js.undefined
  
  var delText: js.UndefOr[String] = js.undefined
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * android expose ability flag
    */
  var exposureEventEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specfic the key of row, for better data diff
    * More info: https://reactjs.org/docs/lists-and-keys.html
    *
    * @param {number} index - Index Of data.
    * @returns {string}
    */
  var getRowKey: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  
  /**
    * Returns the style for specific index of row.
    *
    * @param {number} index - Index Of data.
    * @returns {Object}
    */
  var getRowStyle: js.UndefOr[js.Function1[/* index */ Double, Style]] = js.undefined
  
  /**
    * Each row have different type, it will be using at render recycle.
    *
    * @param {number} index - Index Of data.
    * @returns {string}
    */
  var getRowType: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
  
  /**
    * Scroll to offset after `ListView` with data rendered.
    */
  var initialContentOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specfic how many data will render at first screen.
    */
  var initialListSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Render specific number of rows of data.
    * Set equal to dataShource.length in most case.
    */
  var numberOfRows: Double
  
  /**
    * Called when a whole new list item appears
    */
  var onAppear: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var onDelete: js.UndefOr[js.Function1[/* nativeEvent */ Index, Unit]] = js.undefined
  
  /**
    * Called when a whole list item disappears
    */
  var onDisappear: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  /**
    *  Called when the `ListView` is scrolling to bottom.
    */
  var onEndReached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when user swipe up ListView to get more data on reaching the footer
    */
  var onFooterPulling: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when user release the getting-more-data ListView
    */
  var onFooterReleased: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when user pulls the ListView down
    */
  var onHeaderPulling: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when user release the pulling ListView
    */
  var onHeaderReleased: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * the same with onEndReached
    */
  var onLoadMore: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the momentum scroll starts (scroll which occurs as the ListView starts gliding).
    */
  var onMomentumScrollBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the momentum scroll ends (scroll which occurs as the ListView glides to a stop).
    */
  var onMomentumScrollEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    *  Called when the row first layouting or layout changed.
    *
    * @param {Object} evt - Layout event data
    * @param {number} evt.nativeEvent.x - The position X of component
    * @param {number} evt.nativeEvent.y - The position Y of component
    * @param {number} evt.nativeEvent.width - The width of component
    * @param {number} evt.nativeEvent.hegiht - The height of component
    * @param {number} index - Index of data.
    */
  var onRowLayout: js.UndefOr[js.Function2[/* evt */ LayoutEvent, /* index */ Double, Unit]] = js.undefined
  
  /**
    * Fires at most once per frame during scrolling.
    * The frequency of the events can be controlled using the `scrollEventThrottle` prop.
    *
    * @param {Object} evt - Scroll event data.
    * @param {number} evt.contentOffset.x - Offset X of scrolling.
    * @param {number} evt.contentOffset.y - Offset Y of scrolling.
    */
  var onScroll: js.UndefOr[js.Function1[/* evt */ ContentOffset, Unit]] = js.undefined
  
  // FIXME: TS compile error.
  /**
    * Called when the user begins to drag the scroll view.
    */
  var onScrollBeginDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the user stops dragging the scroll view and it either stops or begins to glide.
    */
  var onScrollEndDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when a new list item will appear(1 px)
    */
  var onWillAppear: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  /**
    * Called when a new list item will disappear(1 px)
    */
  var onWillDisappear: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var preloadItemNumber: js.UndefOr[Double] = js.undefined
  
  var renderPullFooter: js.UndefOr[js.Function0[japgolly.scalajs.react.facade.React.Element]] = js.undefined
  
  var renderPullHeader: js.UndefOr[js.Function0[japgolly.scalajs.react.facade.React.Element]] = js.undefined
  
  /**
    * Passing the data and returns the row component.
    *
    * @param {Object} data - Data for row rendering
    * @param {null} unknown - seems null.
    * @param {number} index - Index Of data.
    * @returns {React.Component}
    */
  var renderRow: js.UndefOr[
    js.Function3[
      /* data */ DataItem, 
      /* unknown */ js.UndefOr[Any], 
      /* index */ js.UndefOr[Double], 
      japgolly.scalajs.react.facade.React.Element
    ]
  ] = js.undefined
  
  /**
    * Is the row should sticky after scrolling up.
    * @param {number} index - Index Of data.
    * @returns {boolean}
    */
  var rowShouldSticky: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.undefined
  
  /**
    * This controls how often the scroll event will be fired while scrolling
    * (as a time interval in ms). A lower number yields better accuracy for code
    * that is tracking the scroll position, but can lead to scroll performance
    * problems due to the volume of information being send over the bridge.
    * You will not notice a difference between values set between 1-16 as the JS run loop
    * is synced to the screen refresh rate. If you do not need precise scroll position tracking,
    * set this value higher to limit the information being sent across the bridge.
    *
    * The default value is zero, which results in the scroll event being sent only once
    * each time the view is scrolled.
    */
  var scrollEventThrottle: js.UndefOr[Double] = js.undefined
  
  /**
    * When `true`, shows a horizon scroll indicator.
    * The default value is `true`.
    */
  var showScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
}
object ListViewProps {
  
  inline def apply(numberOfRows: Double): ListViewProps = {
    val __obj = js.Dynamic.literal(numberOfRows = numberOfRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewProps]
  }
  
  extension [Self <: ListViewProps](x: Self) {
    
    inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    inline def setDataSource(value: js.Array[DataItem]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: DataItem*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDelText(value: String): Self = StObject.set(x, "delText", value.asInstanceOf[js.Any])
    
    inline def setDelTextUndefined: Self = StObject.set(x, "delText", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setExposureEventEnabled(value: Boolean): Self = StObject.set(x, "exposureEventEnabled", value.asInstanceOf[js.Any])
    
    inline def setExposureEventEnabledUndefined: Self = StObject.set(x, "exposureEventEnabled", js.undefined)
    
    inline def setGetRowKey(value: /* index */ Double => String): Self = StObject.set(x, "getRowKey", js.Any.fromFunction1(value))
    
    inline def setGetRowKeyUndefined: Self = StObject.set(x, "getRowKey", js.undefined)
    
    inline def setGetRowStyle(value: /* index */ Double => Style): Self = StObject.set(x, "getRowStyle", js.Any.fromFunction1(value))
    
    inline def setGetRowStyleUndefined: Self = StObject.set(x, "getRowStyle", js.undefined)
    
    inline def setGetRowType(value: /* index */ Double => Double): Self = StObject.set(x, "getRowType", js.Any.fromFunction1(value))
    
    inline def setGetRowTypeUndefined: Self = StObject.set(x, "getRowType", js.undefined)
    
    inline def setInitialContentOffset(value: Double): Self = StObject.set(x, "initialContentOffset", value.asInstanceOf[js.Any])
    
    inline def setInitialContentOffsetUndefined: Self = StObject.set(x, "initialContentOffset", js.undefined)
    
    inline def setInitialListSize(value: Double): Self = StObject.set(x, "initialListSize", value.asInstanceOf[js.Any])
    
    inline def setInitialListSizeUndefined: Self = StObject.set(x, "initialListSize", js.undefined)
    
    inline def setNumberOfRows(value: Double): Self = StObject.set(x, "numberOfRows", value.asInstanceOf[js.Any])
    
    inline def setOnAppear(value: /* index */ Double => Callback): Self = StObject.set(x, "onAppear", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def setOnAppearUndefined: Self = StObject.set(x, "onAppear", js.undefined)
    
    inline def setOnDelete(value: /* nativeEvent */ Index => Callback): Self = StObject.set(x, "onDelete", js.Any.fromFunction1((t0: /* nativeEvent */ Index) => value(t0).runNow()))
    
    inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    inline def setOnDisappear(value: /* index */ Double => Callback): Self = StObject.set(x, "onDisappear", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def setOnDisappearUndefined: Self = StObject.set(x, "onDisappear", js.undefined)
    
    inline def setOnEndReached(value: Callback): Self = StObject.set(x, "onEndReached", value.toJsFn)
    
    inline def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
    
    inline def setOnFooterPulling(value: Callback): Self = StObject.set(x, "onFooterPulling", value.toJsFn)
    
    inline def setOnFooterPullingUndefined: Self = StObject.set(x, "onFooterPulling", js.undefined)
    
    inline def setOnFooterReleased(value: Callback): Self = StObject.set(x, "onFooterReleased", value.toJsFn)
    
    inline def setOnFooterReleasedUndefined: Self = StObject.set(x, "onFooterReleased", js.undefined)
    
    inline def setOnHeaderPulling(value: Callback): Self = StObject.set(x, "onHeaderPulling", value.toJsFn)
    
    inline def setOnHeaderPullingUndefined: Self = StObject.set(x, "onHeaderPulling", js.undefined)
    
    inline def setOnHeaderReleased(value: Callback): Self = StObject.set(x, "onHeaderReleased", value.toJsFn)
    
    inline def setOnHeaderReleasedUndefined: Self = StObject.set(x, "onHeaderReleased", js.undefined)
    
    inline def setOnLoadMore(value: Callback): Self = StObject.set(x, "onLoadMore", value.toJsFn)
    
    inline def setOnLoadMoreUndefined: Self = StObject.set(x, "onLoadMore", js.undefined)
    
    inline def setOnMomentumScrollBegin(value: Callback): Self = StObject.set(x, "onMomentumScrollBegin", value.toJsFn)
    
    inline def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
    
    inline def setOnMomentumScrollEnd(value: Callback): Self = StObject.set(x, "onMomentumScrollEnd", value.toJsFn)
    
    inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    inline def setOnRowLayout(value: (/* evt */ LayoutEvent, /* index */ Double) => Callback): Self = StObject.set(x, "onRowLayout", js.Any.fromFunction2((t0: /* evt */ LayoutEvent, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnRowLayoutUndefined: Self = StObject.set(x, "onRowLayout", js.undefined)
    
    inline def setOnScroll(value: /* evt */ ContentOffset => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* evt */ ContentOffset) => value(t0).runNow()))
    
    inline def setOnScrollBeginDrag(value: Callback): Self = StObject.set(x, "onScrollBeginDrag", value.toJsFn)
    
    inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    inline def setOnScrollEndDrag(value: Callback): Self = StObject.set(x, "onScrollEndDrag", value.toJsFn)
    
    inline def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnWillAppear(value: /* index */ Double => Callback): Self = StObject.set(x, "onWillAppear", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def setOnWillAppearUndefined: Self = StObject.set(x, "onWillAppear", js.undefined)
    
    inline def setOnWillDisappear(value: /* index */ Double => Callback): Self = StObject.set(x, "onWillDisappear", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def setOnWillDisappearUndefined: Self = StObject.set(x, "onWillDisappear", js.undefined)
    
    inline def setPreloadItemNumber(value: Double): Self = StObject.set(x, "preloadItemNumber", value.asInstanceOf[js.Any])
    
    inline def setPreloadItemNumberUndefined: Self = StObject.set(x, "preloadItemNumber", js.undefined)
    
    inline def setRenderPullFooter(value: CallbackTo[japgolly.scalajs.react.facade.React.Element]): Self = StObject.set(x, "renderPullFooter", value.toJsFn)
    
    inline def setRenderPullFooterUndefined: Self = StObject.set(x, "renderPullFooter", js.undefined)
    
    inline def setRenderPullHeader(value: CallbackTo[japgolly.scalajs.react.facade.React.Element]): Self = StObject.set(x, "renderPullHeader", value.toJsFn)
    
    inline def setRenderPullHeaderUndefined: Self = StObject.set(x, "renderPullHeader", js.undefined)
    
    inline def setRenderRow(
      value: (/* data */ DataItem, /* unknown */ js.UndefOr[Any], /* index */ js.UndefOr[Double]) => japgolly.scalajs.react.facade.React.Element
    ): Self = StObject.set(x, "renderRow", js.Any.fromFunction3(value))
    
    inline def setRenderRowUndefined: Self = StObject.set(x, "renderRow", js.undefined)
    
    inline def setRowShouldSticky(value: /* index */ Double => Boolean): Self = StObject.set(x, "rowShouldSticky", js.Any.fromFunction1(value))
    
    inline def setRowShouldStickyUndefined: Self = StObject.set(x, "rowShouldSticky", js.undefined)
    
    inline def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
    
    inline def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
    
    inline def setShowScrollIndicator(value: Boolean): Self = StObject.set(x, "showScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowScrollIndicatorUndefined: Self = StObject.set(x, "showScrollIndicator", js.undefined)
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
