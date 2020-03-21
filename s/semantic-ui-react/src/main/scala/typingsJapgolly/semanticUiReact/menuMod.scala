package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.menuMenuMod.MenuComponent
import typingsJapgolly.semanticUiReact.menuMenuMod.MenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/collections/Menu", JSImport.Namespace)
@js.native
object menuMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[MenuProps, ComponentState, js.Any] {
    def this(props: MenuProps) = this()
    def this(props: MenuProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[MenuComponent]
  
}

