package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.messageMessageMod.MessageComponent
import typingsJapgolly.semanticUiReact.messageMessageMod.MessageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/collections/Message", JSImport.Namespace)
@js.native
object messageMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[MessageProps, ComponentState, js.Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[MessageComponent]
  
}

