package typingsJapgolly.rcMenu

import typingsJapgolly.rcMenu.dividerMod.DividerProps
import typingsJapgolly.rcMenu.menuMod.MenuProps
import typingsJapgolly.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ItemGroup ()
    extends typingsJapgolly.rcMenu.menuItemGroupMod.default
  
  @js.native
  class MenuItemGroup ()
    extends typingsJapgolly.rcMenu.menuItemGroupMod.default
  
  @js.native
  class default protected ()
    extends typingsJapgolly.rcMenu.menuMod.default {
    def this(props: MenuProps) = this()
  }
  
  val Divider: FC[DividerProps] = js.native
  val Item: js.Any = js.native
  val MenuItem: js.Any = js.native
  val SubMenu: js.Any = js.native
  /* static members */
  @js.native
  object ItemGroup extends js.Object {
    var defaultProps: AnonDisabled = js.native
    var isMenuItemGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemGroup extends js.Object {
    var defaultProps: AnonDisabled = js.native
    var isMenuItemGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonBuiltinPlacements = js.native
  }
  
}

