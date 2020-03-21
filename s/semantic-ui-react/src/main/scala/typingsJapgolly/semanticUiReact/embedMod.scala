package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.embedEmbedMod.EmbedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Namespace)
@js.native
object embedMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[EmbedProps, ComponentState, js.Any] {
    def this(props: EmbedProps) = this()
    def this(props: EmbedProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentClass[EmbedProps, ComponentState]]
  
}

