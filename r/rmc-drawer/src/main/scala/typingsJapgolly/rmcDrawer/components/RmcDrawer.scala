package typingsJapgolly.rmcDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcDrawer.AnonOverlayClicked
import typingsJapgolly.rmcDrawer.PartialDrawerProps
import typingsJapgolly.rmcDrawer.mod.^
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.bottom
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.left
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.right
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RmcDrawer {
  def apply(
    className: String = null,
    contentStyle: CSSProperties = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    dragHandleStyle: CSSProperties = null,
    dragToggleDistance: Int | Double = null,
    enableDragHandle: js.UndefOr[Boolean] = js.undefined,
    onOpenChange: (/* open */ Boolean, /* overlay */ js.UndefOr[AnonOverlayClicked]) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    overlayStyle: CSSProperties = null,
    position: left | right | top | bottom = null,
    prefixCls: String = null,
    sidebar: VdomNode = null,
    sidebarStyle: CSSProperties = null,
    style: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    transitions: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Node | js.Array[Node] = null
  ): UnmountedWithRoot[PartialDrawerProps, ^, Unit, PartialDrawerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (dragHandleStyle != null) __obj.updateDynamic("dragHandleStyle")(dragHandleStyle.asInstanceOf[js.Any])
    if (dragToggleDistance != null) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDragHandle)) __obj.updateDynamic("enableDragHandle")(enableDragHandle.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction2((t0: /* open */ scala.Boolean, t1: /* overlay */ js.UndefOr[typingsJapgolly.rmcDrawer.AnonOverlayClicked]) => onOpenChange(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.rawNode.asInstanceOf[js.Any])
    if (sidebarStyle != null) __obj.updateDynamic("sidebarStyle")(sidebarStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcDrawer.PartialDrawerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.rmcDrawer.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcDrawer.PartialDrawerProps])
  }
  @JSImport("rmc-drawer", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

