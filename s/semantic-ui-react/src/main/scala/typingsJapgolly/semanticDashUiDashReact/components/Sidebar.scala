package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod.SidebarProps
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`scale down`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`slide along`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`slide out`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very thin`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very wide`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.overlay
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.push
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.thin
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.uncover
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`) = null,
    as: js.Any = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    direction: top | right | bottom | left = null,
    onHidden: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback = null,
    onHide: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback = null,
    onShow: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback = null,
    onVisible: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback = null,
    target: js.Object | RefHandle[HTMLElement] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: (`very thin`) | thin | wide | (`very wide`) = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SidebarProps, default, Unit, SidebarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod.SidebarProps) => onHidden(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod.SidebarProps) => onHide(t0, t1).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod.SidebarProps) => onShow(t0, t1).runNow()))
    if (onVisible != null) __obj.updateDynamic("onVisible")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod.SidebarProps) => onVisible(t0, t1).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod.SidebarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarMod.default](js.constructorOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod.SidebarProps])(children: _*)
  }
}

