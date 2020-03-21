package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.iconMenuMod.IconMenuProps
import typingsJapgolly.reactToolbox.menuDividerMod.MenuDividerProps
import typingsJapgolly.reactToolbox.menuItemMod.MenuItemProps
import typingsJapgolly.reactToolbox.menuMenuMod.MenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/menu", JSImport.Namespace)
@js.native
object menuMod extends js.Object {
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

