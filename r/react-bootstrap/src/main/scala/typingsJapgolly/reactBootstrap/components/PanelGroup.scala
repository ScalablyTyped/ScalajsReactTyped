package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.mod.SelectCallback
import typingsJapgolly.reactBootstrap.panelGroupMod.PanelGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelGroup {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.panelGroupMod.PanelGroup] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.panelGroupMod.PanelGroup] = null,
    accordion: js.UndefOr[Boolean] = js.undefined,
    activeKey: js.Any = null,
    defaultActiveKey: js.Any = null,
    generateChildId: js.Function = null,
    onSelect: SelectCallback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PanelGroupProps, typingsJapgolly.reactBootstrap.mod.PanelGroup, Unit, PanelGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (generateChildId != null) __obj.updateDynamic("generateChildId")(generateChildId.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.panelGroupMod.PanelGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.PanelGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.panelGroupMod.PanelGroupProps])(children: _*)
  }
  @JSImport("react-bootstrap", "PanelGroup")
  @js.native
  object componentImport extends js.Object
  
}

