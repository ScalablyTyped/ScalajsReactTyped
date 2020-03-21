package typingsJapgolly.reduxInfiniteScroll.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reduxInfiniteScroll.mod.InfiniteScrollerProps
import typingsJapgolly.reduxInfiniteScroll.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxInfiniteScroll {
  def apply(
    loadMore: Callback,
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    containerHeight: Double | String = null,
    elementIsScrollable: js.UndefOr[Boolean] = js.undefined,
    hasMore: js.UndefOr[Boolean] = js.undefined,
    holderType: String = null,
    items: js.Array[Element] = null,
    loader: js.Any = null,
    loadingMore: js.UndefOr[Boolean] = js.undefined,
    showLoader: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Element] = null
  ): UnmountedWithRoot[
    InfiniteScrollerProps with HTMLProps[HTMLDivElement], 
    default, 
    Unit, 
    InfiniteScrollerProps with HTMLProps[HTMLDivElement]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("loadMore")(loadMore.toJsFn)
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (containerHeight != null) __obj.updateDynamic("containerHeight")(containerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(elementIsScrollable)) __obj.updateDynamic("elementIsScrollable")(elementIsScrollable.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore.asInstanceOf[js.Any])
    if (holderType != null) __obj.updateDynamic("holderType")(holderType.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingMore)) __obj.updateDynamic("loadingMore")(loadingMore.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoader)) __obj.updateDynamic("showLoader")(showLoader.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reduxInfiniteScroll.mod.InfiniteScrollerProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLDivElement], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reduxInfiniteScroll.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reduxInfiniteScroll.mod.InfiniteScrollerProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLDivElement]])
  }
  @JSImport("redux-infinite-scroll", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

