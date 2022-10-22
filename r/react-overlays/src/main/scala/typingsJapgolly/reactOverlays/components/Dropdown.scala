package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactOverlays.esmDropdownContextMod.DropDirection
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.DropdownMenuProps
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.UseDropdownMenuMetadata
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.UserDropdownMenuProps
import typingsJapgolly.reactOverlays.esmDropdownMod.DropdownProps
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.DropdownToggleProps
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.UseDropdownToggleMetadata
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.UseDropdownToggleProps
import typingsJapgolly.reactOverlays.reactOverlaysBooleans.`false`
import typingsJapgolly.reactOverlays.reactOverlaysBooleans.`true`
import typingsJapgolly.reactOverlays.reactOverlaysStrings.keyboard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  inline def apply(onToggle: (Boolean, js.UndefOr[Event | ReactEventFrom[Element]]) => Callback): Builder = {
    val __props = js.Dynamic.literal(onToggle = js.Any.fromFunction2((t0: Boolean, t1: js.UndefOr[Event | ReactEventFrom[Element]]) => (onToggle(t0, t1)).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  
  object Menu {
    
    inline def apply(children: (UserDropdownMenuProps, UseDropdownMenuMetadata) => Node): SharedBuilder_DropdownMenuProps_1918268347 = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      new SharedBuilder_DropdownMenuProps_1918268347(js.Array(this.component, __props.asInstanceOf[DropdownMenuProps]))
    }
    
    @JSImport("react-overlays/esm", "Dropdown.Menu")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps_1918268347 = new SharedBuilder_DropdownMenuProps_1918268347(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Toggle {
    
    inline def apply(children: (UseDropdownToggleProps, UseDropdownToggleMetadata) => Node): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DropdownToggleProps]))
    }
    
    @JSImport("react-overlays/esm", "Dropdown.Toggle")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: DropdownToggleProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-overlays/esm", "Dropdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alignEnd(value: Boolean): this.type = set("alignEnd", value.asInstanceOf[js.Any])
    
    inline def defaultShow(value: Boolean): this.type = set("defaultShow", value.asInstanceOf[js.Any])
    
    inline def drop(value: DropDirection): this.type = set("drop", value.asInstanceOf[js.Any])
    
    inline def focusFirstItemOnShow(value: `false` | `true` | keyboard): this.type = set("focusFirstItemOnShow", value.asInstanceOf[js.Any])
    
    inline def itemSelector(value: String): this.type = set("itemSelector", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
