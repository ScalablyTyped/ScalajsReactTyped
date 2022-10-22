package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.DropdownMenuProps
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.UseDropdownMenuMetadata
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.UserDropdownMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  inline def apply(children: (UserDropdownMenuProps, UseDropdownMenuMetadata) => Node): SharedBuilder_DropdownMenuProps_1918268347 = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new SharedBuilder_DropdownMenuProps_1918268347(js.Array(this.component, __props.asInstanceOf[DropdownMenuProps]))
  }
  
  @JSImport("react-overlays/esm/DropdownMenu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps_1918268347 = new SharedBuilder_DropdownMenuProps_1918268347(js.Array(this.component, p.asInstanceOf[js.Any]))
}
