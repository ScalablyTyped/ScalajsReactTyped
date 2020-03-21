package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.cardCardMod.CardComponent
import typingsJapgolly.semanticUiReact.cardCardMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/views/Card", JSImport.Namespace)
@js.native
object cardMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[CardProps, ComponentState, js.Any] {
    def this(props: CardProps) = this()
    def this(props: CardProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[CardComponent]
  
}

