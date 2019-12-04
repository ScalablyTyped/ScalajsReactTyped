package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libCollapseCollapseMod.CollapseProps
import typingsJapgolly.antd.libCollapseCollapseMod.ExpandIconPosition
import typingsJapgolly.antd.libCollapseCollapseMod.PanelProps
import typingsJapgolly.antd.libCollapseMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    activeKey: (js.Array[String | Double]) | String | Double = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultActiveKey: (js.Array[String | Double]) | String | Double = null,
    destroyInactivePanel: js.UndefOr[Boolean] = js.undefined,
    expandIcon: /* panelProps */ PanelProps => CallbackTo[Node] = null,
    expandIconPosition: ExpandIconPosition = null,
    onChange: /* key */ String | js.Array[String] => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CollapseProps, default, Unit, CollapseProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactivePanel)) __obj.updateDynamic("destroyInactivePanel")(destroyInactivePanel.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1((t0: /* panelProps */ typingsJapgolly.antd.libCollapseCollapseMod.PanelProps) => expandIcon(t0).runNow()))
    if (expandIconPosition != null) __obj.updateDynamic("expandIconPosition")(expandIconPosition.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* key */ java.lang.String | js.Array[java.lang.String]) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libCollapseCollapseMod.CollapseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libCollapseMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libCollapseCollapseMod.CollapseProps])(children: _*)
  }
  @JSImport("antd/lib/collapse", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

