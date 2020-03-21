package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar {
  def apply(
    onHide: Callback,
    ariaCloseLabel: String = null,
    baseZIndex: Int | Double = null,
    blockScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    iconsTemplate: js.UndefOr[CallbackTo[js.UndefOr[Element]]] = js.undefined,
    id: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    position: String = null,
    showCloseIcon: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SidebarProps, 
    typingsJapgolly.primereact.primereactSidebarMod.Sidebar, 
    Unit, 
    SidebarProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onHide")(onHide.toJsFn)
    if (ariaCloseLabel != null) __obj.updateDynamic("ariaCloseLabel")(ariaCloseLabel.asInstanceOf[js.Any])
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(blockScroll)) __obj.updateDynamic("blockScroll")(blockScroll.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    iconsTemplate.foreach(p => __obj.updateDynamic("iconsTemplate")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseIcon)) __obj.updateDynamic("showCloseIcon")(showCloseIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.sidebarMod.SidebarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactSidebarMod.Sidebar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.sidebarMod.SidebarProps])(children: _*)
  }
  @JSImport("primereact/sidebar", "Sidebar")
  @js.native
  object componentImport extends js.Object
  
}

