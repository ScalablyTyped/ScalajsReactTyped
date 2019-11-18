package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_InkBar
import typingsJapgolly.antd.antdStrings.add
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.remove
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.esTabsMod.TabsPosition
import typingsJapgolly.antd.esTabsMod.TabsProps
import typingsJapgolly.antd.esTabsMod.TabsType
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  def apply(
    activeKey: String = null,
    animated: Boolean | Anon_InkBar = null,
    className: String = null,
    defaultActiveKey: String = null,
    destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined,
    hideAdd: js.UndefOr[Boolean] = js.undefined,
    onChange: /* activeKey */ String => Callback = null,
    onEdit: (/* targetKey */ String | ReactMouseEventFrom[HTMLElement], /* action */ add | remove) => Callback = null,
    onNextClick: ReactMouseEventFrom[HTMLElement] => Callback = null,
    onPrevClick: ReactMouseEventFrom[HTMLElement] => Callback = null,
    onTabClick: js.Function = null,
    prefixCls: String = null,
    renderTabBar: (/* props */ TabsProps, /* DefaultTabBar */ ComponentClassP[js.Object]) => CallbackTo[Element] = null,
    size: large | default | small = null,
    style: CSSProperties = null,
    tabBarExtraContent: VdomNode = null,
    tabBarGutter: Int | Double = null,
    tabBarStyle: CSSProperties = null,
    tabPosition: TabsPosition = null,
    `type`: TabsType = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabsProps, typingsJapgolly.antd.esTabsMod.default, Unit, TabsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTabPane)) __obj.updateDynamic("destroyInactiveTabPane")(destroyInactiveTabPane.asInstanceOf[js.Any])
    if (!js.isUndefined(hideAdd)) __obj.updateDynamic("hideAdd")(hideAdd.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* activeKey */ java.lang.String) => onChange(t0).runNow()))
    if (onEdit != null) __obj.updateDynamic("onEdit")(js.Any.fromFunction2((t0: /* targetKey */ java.lang.String | japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* action */ typingsJapgolly.antd.antdStrings.add | typingsJapgolly.antd.antdStrings.remove) => onEdit(t0, t1).runNow()))
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onNextClick(t0).runNow()))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPrevClick(t0).runNow()))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(onTabClick.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.antd.esTabsMod.TabsProps, t1: /* DefaultTabBar */ japgolly.scalajs.react.raw.React.ComponentClassP[js.Object]) => renderTabBar(t0, t1).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.rawNode.asInstanceOf[js.Any])
    if (tabBarGutter != null) __obj.updateDynamic("tabBarGutter")(tabBarGutter.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabPosition != null) __obj.updateDynamic("tabPosition")(tabPosition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esTabsMod.TabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.esTabsMod.default](js.constructorOf[typingsJapgolly.antd.esTabsMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esTabsMod.TabsProps])(children: _*)
  }
}

