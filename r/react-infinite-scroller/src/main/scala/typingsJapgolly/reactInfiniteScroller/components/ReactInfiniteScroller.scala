package typingsJapgolly.reactInfiniteScroller.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll
import typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScrollProps
import typingsJapgolly.reactInfiniteScroller.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInfiniteScroller {
  def apply(
    loadMore: Double => Callback,
    AllHTMLAttributes: AllHTMLAttributes[InfiniteScroll] = null,
    ClassAttributes: ClassAttributes[InfiniteScroll] = null,
    element: String = null,
    getScrollParent: js.UndefOr[CallbackTo[HTMLElement | Null]] = js.undefined,
    hasMore: js.UndefOr[Boolean] = js.undefined,
    initialLoad: js.UndefOr[Boolean] = js.undefined,
    isReverse: js.UndefOr[Boolean] = js.undefined,
    loader: VdomElement = null,
    pageStart: Int | Double = null,
    threshold: Int | Double = null,
    useCapture: js.UndefOr[Boolean] = js.undefined,
    useWindow: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[InfiniteScrollProps, ^, Unit, InfiniteScrollProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScrollProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInfiniteScroller.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScrollProps])(children: _*)
  }
  @JSImport("react-infinite-scroller", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

