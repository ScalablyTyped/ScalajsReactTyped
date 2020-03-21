package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.sidebarSidebarMod.SidebarComponent
import typingsJapgolly.semanticUiReact.sidebarSidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar", JSImport.Namespace)
@js.native
object sidebarMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[SidebarProps, ComponentState, js.Any] {
    def this(props: SidebarProps) = this()
    def this(props: SidebarProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[SidebarComponent]
  
}

