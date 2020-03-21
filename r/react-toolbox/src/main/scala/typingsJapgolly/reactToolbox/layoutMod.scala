package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.layoutLayoutMod.LayoutProps
import typingsJapgolly.reactToolbox.navDrawerMod.NavDrawerProps
import typingsJapgolly.reactToolbox.panelMod.PanelProps
import typingsJapgolly.reactToolbox.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/layout", JSImport.Namespace)
@js.native
object layoutMod extends js.Object {
  @js.native
  class Layout ()
    extends Component[LayoutProps, js.Object, js.Any]
  
  @js.native
  class NavDrawer ()
    extends Component[NavDrawerProps, js.Object, js.Any]
  
  @js.native
  class Panel ()
    extends Component[PanelProps, js.Object, js.Any]
  
  @js.native
  class Sidebar ()
    extends Component[SidebarProps, js.Object, js.Any]
  
}

