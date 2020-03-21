package typingsJapgolly.reactSidebar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSidebar.mod.SidebarProps
import typingsJapgolly.reactSidebar.mod.SidebarStyles
import typingsJapgolly.reactSidebar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSidebar {
  def apply(
    contentClassName: String = null,
    contentId: String = null,
    defaultSidebarWidth: Int | Double = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    dragToggleDistance: Int | Double = null,
    onSetOpen: /* open */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    overlayClassName: String = null,
    overlayId: String = null,
    pullRight: js.UndefOr[Boolean] = js.undefined,
    rootClassName: String = null,
    rootId: String = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    sidebar: VdomNode = null,
    sidebarClassName: String = null,
    sidebarId: String = null,
    styles: SidebarStyles = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    touchHandleWidth: Int | Double = null,
    transitions: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SidebarProps, default, Unit, SidebarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (defaultSidebarWidth != null) __obj.updateDynamic("defaultSidebarWidth")(defaultSidebarWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (dragToggleDistance != null) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.asInstanceOf[js.Any])
    if (onSetOpen != null) __obj.updateDynamic("onSetOpen")(js.Any.fromFunction1((t0: /* open */ scala.Boolean) => onSetOpen(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayId != null) __obj.updateDynamic("overlayId")(overlayId.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.asInstanceOf[js.Any])
    if (rootClassName != null) __obj.updateDynamic("rootClassName")(rootClassName.asInstanceOf[js.Any])
    if (rootId != null) __obj.updateDynamic("rootId")(rootId.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.rawNode.asInstanceOf[js.Any])
    if (sidebarClassName != null) __obj.updateDynamic("sidebarClassName")(sidebarClassName.asInstanceOf[js.Any])
    if (sidebarId != null) __obj.updateDynamic("sidebarId")(sidebarId.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (touchHandleWidth != null) __obj.updateDynamic("touchHandleWidth")(touchHandleWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSidebar.mod.SidebarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSidebar.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSidebar.mod.SidebarProps])(children: _*)
  }
  @JSImport("react-sidebar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

