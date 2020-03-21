package typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <InfiniteScroll /> properties.
  */
trait InfiniteScrollProps
  extends AllHTMLAttributes[typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll]
     with ClassAttributes[typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll] {
  /**
    * Name of the element that the component should render as.
    * Defaults to 'div'.
    */
  var element: js.UndefOr[String] = js.undefined
  /**
    * Override method to return a different scroll listener if it's not the immediate parent of InfiniteScroll.
    */
  var getScrollParent: js.UndefOr[js.Function0[HTMLElement | Null]] = js.undefined
  /**
    * Whether there are more items to be loaded. Event listeners are removed if false.
    * Defaults to false.
    */
  var hasMore: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the component should load the first set of items.
    * Defaults to true.
    */
  var initialLoad: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether new items should be loaded when user scrolls to the top of the scrollable area.
    * Default to false.
    */
  var isReverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Loader component for indicating "loading more".
    */
  var loader: js.UndefOr[Element] = js.undefined
  /**
    * The number of the first page to load, with the default of 0, the first page is 1.
    * Defaults to 0.
    */
  var pageStart: js.UndefOr[Double] = js.undefined
  /**
    * The distance in pixels before the end of the items that will trigger a call to loadMore.
    * Defaults to 250.
    */
  var threshold: js.UndefOr[Double] = js.undefined
  /**
    * Proxy to the useCapture option of the added event listeners.
    * Defaults to false.
    */
  var useCapture: js.UndefOr[Boolean] = js.undefined
  /**
    * Add scroll listeners to the window, or else, the component's parentNode.
    * Defaults to true.
    */
  var useWindow: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback for when more items are requested by the user.
    * Page param is next page index.
    */
  def loadMore(page: Double): Unit
}

object InfiniteScrollProps {
  @scala.inline
  def apply(
    loadMore: Double => Callback,
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll] = null,
    element: String = null,
    getScrollParent: js.UndefOr[CallbackTo[HTMLElement | Null]] = js.undefined,
    hasMore: js.UndefOr[Boolean] = js.undefined,
    initialLoad: js.UndefOr[Boolean] = js.undefined,
    isReverse: js.UndefOr[Boolean] = js.undefined,
    loader: VdomElement = null,
    pageStart: Int | Double = null,
    threshold: Int | Double = null,
    useCapture: js.UndefOr[Boolean] = js.undefined,
    useWindow: js.UndefOr[Boolean] = js.undefined
  ): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadMore")(js.Any.fromFunction1((t0: scala.Double) => loadMore(t0).runNow()))
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    getScrollParent.foreach(p => __obj.updateDynamic("getScrollParent")(p.toJsFn))
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore.asInstanceOf[js.Any])
    if (!js.isUndefined(initialLoad)) __obj.updateDynamic("initialLoad")(initialLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(isReverse)) __obj.updateDynamic("isReverse")(isReverse.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.rawElement.asInstanceOf[js.Any])
    if (pageStart != null) __obj.updateDynamic("pageStart")(pageStart.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture.asInstanceOf[js.Any])
    if (!js.isUndefined(useWindow)) __obj.updateDynamic("useWindow")(useWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteScrollProps]
  }
}

