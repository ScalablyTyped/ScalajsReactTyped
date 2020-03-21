package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel
import typingsJapgolly.blueprintjsCore.panelViewMod.IPanelViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelView {
  def apply(
    panel: IPanel[js.Object],
    showHeader: Boolean,
    onClose: IPanel[js.Object] => Callback,
    onOpen: IPanel[js.Object] => Callback,
    previousPanel: IPanel[js.Object] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IPanelViewProps, 
    typingsJapgolly.blueprintjsCore.panelViewMod.PanelView, 
    Unit, 
    IPanelViewProps
  ] = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Object]) => onClose(t0).runNow()))
    __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Object]) => onOpen(t0).runNow()))
    if (previousPanel != null) __obj.updateDynamic("previousPanel")(previousPanel.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.panelViewMod.IPanelViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.panelViewMod.PanelView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.panelViewMod.IPanelViewProps])(children: _*)
  }
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack/panelView", "PanelView")
  @js.native
  object componentImport extends js.Object
  
}

