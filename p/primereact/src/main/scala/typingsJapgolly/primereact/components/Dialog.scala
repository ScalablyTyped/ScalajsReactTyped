package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.primereact.dialogMod.DialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog {
  def apply(
    onHide: Callback,
    appendTo: HTMLElement = null,
    ariaCloseIconLabel: String = null,
    baseZIndex: Int | Double = null,
    blockScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    contentStyle: js.Object = null,
    dismissableMask: js.UndefOr[Boolean] = js.undefined,
    focusOnShow: js.UndefOr[Boolean] = js.undefined,
    footer: js.Any = null,
    header: js.Any = null,
    iconsTemplate: js.UndefOr[CallbackTo[js.UndefOr[Element]]] = js.undefined,
    id: String = null,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DialogProps, typingsJapgolly.primereact.primereactDialogMod.Dialog, Unit, DialogProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onHide")(onHide.toJsFn)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaCloseIconLabel != null) __obj.updateDynamic("ariaCloseIconLabel")(ariaCloseIconLabel.asInstanceOf[js.Any])
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(blockScroll)) __obj.updateDynamic("blockScroll")(blockScroll.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissableMask)) __obj.updateDynamic("dismissableMask")(dismissableMask.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    iconsTemplate.foreach(p => __obj.updateDynamic("iconsTemplate")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.dialogMod.DialogProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactDialogMod.Dialog](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.dialogMod.DialogProps])(children: _*)
  }
  @JSImport("primereact/dialog", "Dialog")
  @js.native
  object componentImport extends js.Object
  
}

