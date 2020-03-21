package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.dropdownDropdownMod.DropdownComponent
import typingsJapgolly.semanticUiReact.dropdownDropdownMod.DropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown", JSImport.Namespace)
@js.native
object dropdownMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[DropdownProps, ComponentState, js.Any] {
    def this(props: DropdownProps) = this()
    def this(props: DropdownProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[DropdownComponent]
  
}

