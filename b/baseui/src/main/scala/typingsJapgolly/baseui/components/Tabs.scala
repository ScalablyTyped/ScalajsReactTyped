package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonActiveKey
import typingsJapgolly.baseui.SharedPropsactiveboolean
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.baseui.tabsMod.TabsOverrides
import typingsJapgolly.baseui.tabsMod.TabsProps
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  def apply(
    activeKey: Key = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ AnonActiveKey => CallbackTo[js.Any] = null,
    orientation: horizontal | vertical = null,
    overrides: TabsOverrides[SharedPropsactiveboolean] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TabsProps, 
    MountedWithRawType[TabsProps, js.Object, RawMounted[TabsProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonActiveKey) => onChange(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.tabsMod.TabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tabsMod.TabsProps])(children: _*)
  }
  @JSImport("baseui/tabs", "Tabs")
  @js.native
  object componentImport extends js.Object
  
}

