package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.materialUiCore.drawerDrawerMod.DrawerProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/Drawer", JSImport.Namespace)
@js.native
object drawerMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[DrawerProps, ComponentState, js.Any] {
    def this(props: DrawerProps) = this()
    def this(props: DrawerProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[DrawerProps]]
  
}

