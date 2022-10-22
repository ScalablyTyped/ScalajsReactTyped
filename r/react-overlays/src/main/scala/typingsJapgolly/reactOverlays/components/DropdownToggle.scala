package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.DropdownToggleProps
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.UseDropdownToggleMetadata
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.UseDropdownToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownToggle {
  
  inline def apply(children: (UseDropdownToggleProps, UseDropdownToggleMetadata) => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DropdownToggleProps]))
  }
  
  @JSImport("react-overlays/esm/DropdownToggle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DropdownToggleProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
