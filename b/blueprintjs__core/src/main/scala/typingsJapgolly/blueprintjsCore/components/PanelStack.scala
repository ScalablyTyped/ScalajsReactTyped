package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel
import typingsJapgolly.blueprintjsCore.panelStackMod.IPanelStackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelStack {
  def apply(
    className: String = null,
    initialPanel: IPanel[_] = null,
    onClose: /* removedPanel */ IPanel[js.Object] => Callback = null,
    onOpen: /* addedPanel */ IPanel[js.Object] => Callback = null,
    showPanelHeader: js.UndefOr[Boolean] = js.undefined,
    stack: js.Array[IPanel[_]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IPanelStackProps, 
    typingsJapgolly.blueprintjsCore.mod.PanelStack, 
    Unit, 
    IPanelStackProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (initialPanel != null) __obj.updateDynamic("initialPanel")(initialPanel.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* removedPanel */ typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Object]) => onClose(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* addedPanel */ typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Object]) => onOpen(t0).runNow()))
    if (!js.isUndefined(showPanelHeader)) __obj.updateDynamic("showPanelHeader")(showPanelHeader.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.panelStackMod.IPanelStackProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.PanelStack](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.panelStackMod.IPanelStackProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "PanelStack")
  @js.native
  object componentImport extends js.Object
  
}

