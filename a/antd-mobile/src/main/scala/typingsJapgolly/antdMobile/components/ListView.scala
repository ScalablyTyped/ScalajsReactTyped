package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.AnonLabel
import typingsJapgolly.antdMobile.listViewMod.ListViewProps
import typingsJapgolly.antdMobile.listViewMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListView {
  def apply(
    dataSource: js.Any,
    renderRow: (js.Any, Double | String, Double | String, js.UndefOr[Boolean]) => CallbackTo[Element],
    className: String = null,
    contentContainerStyle: CSSProperties = null,
    delayActivityIndicator: js.Any = null,
    delayTime: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    initialListSize: Int | Double = null,
    listPrefixCls: String = null,
    listViewPrefixCls: String = null,
    onContentSizeChange: (/* w */ Double, /* h */ Double) => Callback = null,
    onEndReached: /* e */ js.UndefOr[js.Any] => Callback = null,
    onEndReachedThreshold: Int | Double = null,
    onLayout: /* event */ js.Any => Callback = null,
    onQuickSearch: (/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any]) => Callback = null,
    onScroll: /* e */ js.UndefOr[js.Any] => Callback = null,
    pageSize: Int | Double = null,
    prefixCls: String = null,
    pullToRefresh: VdomNode = null,
    quickSearchBarStyle: CSSProperties = null,
    quickSearchBarTop: AnonLabel = null,
    renderBodyComponent: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderFooter: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderHeader: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderScrollComponent: /* p */ js.Any => CallbackTo[Element] = null,
    renderSectionBodyWrapper: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderSectionHeader: (/* sectionData */ js.Any, /* sectionId */ String | Double) => CallbackTo[Element] = null,
    renderSectionWrapper: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderSeparator: (/* sectionID */ String | Double, /* rowID */ String | Double, /* adjacentRowHighlighted */ js.UndefOr[Boolean]) => CallbackTo[Element] = null,
    scrollEventThrottle: Int | Double = null,
    scrollRenderAheadDistance: Int | Double = null,
    sectionBodyClassName: String = null,
    style: CSSProperties = null,
    useBodyScroll: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ListViewProps, default, Unit, ListViewProps] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderRow")(js.Any.fromFunction4((t0: js.Any, t1: scala.Double | java.lang.String, t2: scala.Double | java.lang.String, t3: js.UndefOr[scala.Boolean]) => renderRow(t0, t1, t2, t3).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (delayActivityIndicator != null) __obj.updateDynamic("delayActivityIndicator")(delayActivityIndicator.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (initialListSize != null) __obj.updateDynamic("initialListSize")(initialListSize.asInstanceOf[js.Any])
    if (listPrefixCls != null) __obj.updateDynamic("listPrefixCls")(listPrefixCls.asInstanceOf[js.Any])
    if (listViewPrefixCls != null) __obj.updateDynamic("listViewPrefixCls")(listViewPrefixCls.asInstanceOf[js.Any])
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction2((t0: /* w */ scala.Double, t1: /* h */ scala.Double) => onContentSizeChange(t0, t1).runNow()))
    if (onEndReached != null) __obj.updateDynamic("onEndReached")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => onEndReached(t0).runNow()))
    if (onEndReachedThreshold != null) __obj.updateDynamic("onEndReachedThreshold")(onEndReachedThreshold.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ js.Any) => onLayout(t0).runNow()))
    if (onQuickSearch != null) __obj.updateDynamic("onQuickSearch")(js.Any.fromFunction2((t0: /* sectionID */ js.Any, t1: /* topId */ js.UndefOr[js.Any]) => onQuickSearch(t0, t1).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => onScroll(t0).runNow()))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (pullToRefresh != null) __obj.updateDynamic("pullToRefresh")(pullToRefresh.rawNode.asInstanceOf[js.Any])
    if (quickSearchBarStyle != null) __obj.updateDynamic("quickSearchBarStyle")(quickSearchBarStyle.asInstanceOf[js.Any])
    if (quickSearchBarTop != null) __obj.updateDynamic("quickSearchBarTop")(quickSearchBarTop.asInstanceOf[js.Any])
    renderBodyComponent.foreach(p => __obj.updateDynamic("renderBodyComponent")(p.toJsFn))
    renderFooter.foreach(p => __obj.updateDynamic("renderFooter")(p.toJsFn))
    renderHeader.foreach(p => __obj.updateDynamic("renderHeader")(p.toJsFn))
    if (renderScrollComponent != null) __obj.updateDynamic("renderScrollComponent")(js.Any.fromFunction1((t0: /* p */ js.Any) => renderScrollComponent(t0).runNow()))
    renderSectionBodyWrapper.foreach(p => __obj.updateDynamic("renderSectionBodyWrapper")(p.toJsFn))
    if (renderSectionHeader != null) __obj.updateDynamic("renderSectionHeader")(js.Any.fromFunction2((t0: /* sectionData */ js.Any, t1: /* sectionId */ java.lang.String | scala.Double) => renderSectionHeader(t0, t1).runNow()))
    renderSectionWrapper.foreach(p => __obj.updateDynamic("renderSectionWrapper")(p.toJsFn))
    if (renderSeparator != null) __obj.updateDynamic("renderSeparator")(js.Any.fromFunction3((t0: /* sectionID */ java.lang.String | scala.Double, t1: /* rowID */ java.lang.String | scala.Double, t2: /* adjacentRowHighlighted */ js.UndefOr[scala.Boolean]) => renderSeparator(t0, t1, t2).runNow()))
    if (scrollEventThrottle != null) __obj.updateDynamic("scrollEventThrottle")(scrollEventThrottle.asInstanceOf[js.Any])
    if (scrollRenderAheadDistance != null) __obj.updateDynamic("scrollRenderAheadDistance")(scrollRenderAheadDistance.asInstanceOf[js.Any])
    if (sectionBodyClassName != null) __obj.updateDynamic("sectionBodyClassName")(sectionBodyClassName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useBodyScroll)) __obj.updateDynamic("useBodyScroll")(useBodyScroll.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.listViewMod.ListViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.listViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.listViewMod.ListViewProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/list-view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

