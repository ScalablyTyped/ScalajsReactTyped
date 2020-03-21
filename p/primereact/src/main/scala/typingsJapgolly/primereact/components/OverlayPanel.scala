package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.overlayPanelMod.OverlayPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OverlayPanel {
  def apply(
    appendTo: js.Any = null,
    ariaCloseLabel: String = null,
    className: String = null,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    showCloseIcon: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    OverlayPanelProps, 
    typingsJapgolly.primereact.primereactOverlaypanelMod.OverlayPanel, 
    Unit, 
    OverlayPanelProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaCloseLabel != null) __obj.updateDynamic("ariaCloseLabel")(ariaCloseLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (!js.isUndefined(showCloseIcon)) __obj.updateDynamic("showCloseIcon")(showCloseIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.overlayPanelMod.OverlayPanelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactOverlaypanelMod.OverlayPanel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.overlayPanelMod.OverlayPanelProps])(children: _*)
  }
  @JSImport("primereact/overlaypanel", "OverlayPanel")
  @js.native
  object componentImport extends js.Object
  
}

