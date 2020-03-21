package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.libMenuMenuMod.MenuProps
import typingsJapgolly.reactToolbox.menuIconMenuMod.IconMenuProps
import typingsJapgolly.reactToolbox.menuMenuDividerMod.MenuDividerProps
import typingsJapgolly.reactToolbox.menuMenuItemMod.MenuItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/menu", JSImport.Namespace)
@js.native
object libMenuMod extends js.Object {
  @js.native
  class IconMenu ()
    extends Component[IconMenuProps, js.Object, js.Any]
  
  @js.native
  class Menu ()
    extends Component[MenuProps, js.Object, js.Any]
  
  @js.native
  class MenuDivider ()
    extends Component[MenuDividerProps, js.Object, js.Any]
  
  @js.native
  class MenuItem ()
    extends Component[MenuItemProps, js.Object, js.Any]
  
}

