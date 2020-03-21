package typingsJapgolly.rmcPullToRefresh.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcPullToRefresh.propsTypeMod.Indicator
import typingsJapgolly.rmcPullToRefresh.propsTypeMod.PropsType
import typingsJapgolly.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typingsJapgolly.rmcPullToRefresh.rmcPullToRefreshStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PropsType1211017330[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    damping: Double,
    direction: down | up,
    distanceToRefresh: Double,
    indicator: Indicator,
    getScrollContainer: CallbackTo[Node],
    onRefresh: Callback,
    className: String = null,
    prefixCls: String = null,
    refreshing: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropsType, ComponentRef, Unit, PropsType] = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getScrollContainer")(getScrollContainer.toJsFn)
    __obj.updateDynamic("onRefresh")(onRefresh.toJsFn)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcPullToRefresh.propsTypeMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcPullToRefresh.propsTypeMod.PropsType])(children: _*)
  }
}

