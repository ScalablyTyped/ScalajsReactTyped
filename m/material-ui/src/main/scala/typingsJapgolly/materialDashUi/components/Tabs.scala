package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDashUi.__MaterialUI.Tabs.TabsProps
import typingsJapgolly.materialDashUi.tabsMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  def apply(
    className: String = null,
    contentContainerClassName: String = null,
    contentContainerStyle: CSSProperties = null,
    initialSelectedIndex: Int | Double = null,
    inkBarStyle: CSSProperties = null,
    onChange: (/* value */ js.Any, /* e */ ReactEventFrom[js.Object with Element], /* tab */ typingsJapgolly.materialDashUi.__MaterialUI.Tabs.Tab) => Callback = null,
    style: CSSProperties = null,
    tabItemContainerStyle: CSSProperties = null,
    tabTemplate: ComponentClassP[js.Object] = null,
    tabTemplateStyle: CSSProperties = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabsProps, default, Unit, TabsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentContainerClassName != null) __obj.updateDynamic("contentContainerClassName")(contentContainerClassName.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (initialSelectedIndex != null) __obj.updateDynamic("initialSelectedIndex")(initialSelectedIndex.asInstanceOf[js.Any])
    if (inkBarStyle != null) __obj.updateDynamic("inkBarStyle")(inkBarStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* value */ js.Any, t1: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t2: /* tab */ typingsJapgolly.materialDashUi.__MaterialUI.Tabs.Tab) => onChange(t0, t1, t2).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabItemContainerStyle != null) __obj.updateDynamic("tabItemContainerStyle")(tabItemContainerStyle.asInstanceOf[js.Any])
    if (tabTemplate != null) __obj.updateDynamic("tabTemplate")(tabTemplate.asInstanceOf[js.Any])
    if (tabTemplateStyle != null) __obj.updateDynamic("tabTemplateStyle")(tabTemplateStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Tabs.TabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.tabsMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Tabs.TabsProps])(children: _*)
  }
  @JSImport("material-ui/Tabs", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

