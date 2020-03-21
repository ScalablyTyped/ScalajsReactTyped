package typingsJapgolly.reactLeafletSidebarv2.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactLeafletSidebarv2.mod.Anchor
import typingsJapgolly.reactLeafletSidebarv2.mod.Icon
import typingsJapgolly.reactLeafletSidebarv2.mod.Position
import typingsJapgolly.reactLeafletSidebarv2.mod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab {
  def apply(
    header: String,
    icon: Icon,
    id: String,
    active: js.UndefOr[Boolean] = js.undefined,
    anchor: Anchor = null,
    closeIcon: Icon = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    position: Position = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabProps, typingsJapgolly.reactLeafletSidebarv2.mod.Tab, Unit, TabProps] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLeafletSidebarv2.mod.TabProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLeafletSidebarv2.mod.Tab](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLeafletSidebarv2.mod.TabProps])(children: _*)
  }
  @JSImport("react-leaflet-sidebarv2", "Tab")
  @js.native
  object componentImport extends js.Object
  
}

