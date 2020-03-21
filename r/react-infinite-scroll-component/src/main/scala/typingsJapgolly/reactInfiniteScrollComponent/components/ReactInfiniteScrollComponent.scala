package typingsJapgolly.reactInfiniteScrollComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInfiniteScrollComponent.mod.InfiniteScrollProps
import typingsJapgolly.reactInfiniteScrollComponent.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInfiniteScrollComponent {
  def apply(
    dataLength: Double,
    hasMore: Boolean,
    next: Callback,
    className: String = null,
    endMessage: VdomNode = null,
    hasChildren: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    initialScrollY: Int | Double = null,
    loader: VdomNode = null,
    onScroll: js.UndefOr[Callback] = js.undefined,
    pullDownToRefresh: js.UndefOr[Boolean] = js.undefined,
    pullDownToRefreshContent: VdomNode = null,
    pullDownToRefreshThreshold: Int | Double = null,
    refreshFunction: js.UndefOr[Callback] = js.undefined,
    releaseToRefreshContent: VdomNode = null,
    scrollThreshold: Double | String = null,
    scrollableTarget: Node | String = null,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[InfiniteScrollProps, ^, Unit, InfiniteScrollProps] = {
    val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any])
  
      __obj.updateDynamic("next")(next.toJsFn)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (endMessage != null) __obj.updateDynamic("endMessage")(endMessage.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialScrollY != null) __obj.updateDynamic("initialScrollY")(initialScrollY.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.rawNode.asInstanceOf[js.Any])
    onScroll.foreach(p => __obj.updateDynamic("onScroll")(p.toJsFn))
    if (!js.isUndefined(pullDownToRefresh)) __obj.updateDynamic("pullDownToRefresh")(pullDownToRefresh.asInstanceOf[js.Any])
    if (pullDownToRefreshContent != null) __obj.updateDynamic("pullDownToRefreshContent")(pullDownToRefreshContent.rawNode.asInstanceOf[js.Any])
    if (pullDownToRefreshThreshold != null) __obj.updateDynamic("pullDownToRefreshThreshold")(pullDownToRefreshThreshold.asInstanceOf[js.Any])
    refreshFunction.foreach(p => __obj.updateDynamic("refreshFunction")(p.toJsFn))
    if (releaseToRefreshContent != null) __obj.updateDynamic("releaseToRefreshContent")(releaseToRefreshContent.rawNode.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (scrollableTarget != null) __obj.updateDynamic("scrollableTarget")(scrollableTarget.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInfiniteScrollComponent.mod.InfiniteScrollProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInfiniteScrollComponent.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInfiniteScrollComponent.mod.InfiniteScrollProps])(children: _*)
  }
  @JSImport("react-infinite-scroll-component", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

