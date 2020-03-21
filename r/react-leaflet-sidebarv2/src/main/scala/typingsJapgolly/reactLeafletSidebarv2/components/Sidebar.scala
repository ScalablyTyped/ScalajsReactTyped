package typingsJapgolly.reactLeafletSidebarv2.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactLeafletSidebarv2.mod.Icon
import typingsJapgolly.reactLeafletSidebarv2.mod.Position
import typingsJapgolly.reactLeafletSidebarv2.mod.SidebarProps
import typingsJapgolly.reactLeafletSidebarv2.mod.TabType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar {
  def apply(
    collapsed: Boolean,
    id: String,
    position: Position,
    selected: String,
    closeIcon: Icon = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: /* id */ String => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: TabType
  ): UnmountedWithRoot[SidebarProps, typingsJapgolly.reactLeafletSidebarv2.mod.Sidebar, Unit, SidebarProps] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
  
      if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => onOpen(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLeafletSidebarv2.mod.SidebarProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactLeafletSidebarv2.mod.Sidebar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLeafletSidebarv2.mod.SidebarProps])
  }
  @JSImport("react-leaflet-sidebarv2", "Sidebar")
  @js.native
  object componentImport extends js.Object
  
}

