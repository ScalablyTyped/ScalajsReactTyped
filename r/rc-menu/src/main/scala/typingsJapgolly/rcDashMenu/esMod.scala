package typingsJapgolly.rcDashMenu

import typingsJapgolly.rcDashMenu.esDividerMod.DividerProps
import typingsJapgolly.rcDashMenu.esMenuMod.MenuProps
import typingsJapgolly.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class ItemGroup ()
    extends typingsJapgolly.rcDashMenu.esMenuItemGroupMod.default
  
  @js.native
  class MenuItemGroup ()
    extends typingsJapgolly.rcDashMenu.esMenuItemGroupMod.default
  
  @js.native
  class default protected ()
    extends typingsJapgolly.rcDashMenu.esMenuMod.default {
    def this(props: MenuProps) = this()
  }
  
  val Divider: FC[DividerProps] = js.native
  val Item: js.Any = js.native
  val MenuItem: js.Any = js.native
  val SubMenu: js.Any = js.native
  /* static members */
  @js.native
  object ItemGroup extends js.Object {
    var defaultProps: Anon_Disabled = js.native
    var isMenuItemGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemGroup extends js.Object {
    var defaultProps: Anon_Disabled = js.native
    var isMenuItemGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_BuiltinPlacements = js.native
  }
  
}

