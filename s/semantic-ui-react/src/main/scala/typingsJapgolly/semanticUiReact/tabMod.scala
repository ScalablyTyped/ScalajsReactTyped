package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.tabTabMod.TabComponent
import typingsJapgolly.semanticUiReact.tabTabMod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Tab", JSImport.Namespace)
@js.native
object tabMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[TabProps, ComponentState, js.Any] {
    def this(props: TabProps) = this()
    def this(props: TabProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[TabComponent]
  
}

