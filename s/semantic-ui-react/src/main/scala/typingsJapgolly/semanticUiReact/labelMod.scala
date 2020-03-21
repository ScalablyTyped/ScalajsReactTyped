package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.labelLabelMod.LabelComponent
import typingsJapgolly.semanticUiReact.labelLabelMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/elements/Label", JSImport.Namespace)
@js.native
object labelMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[LabelProps, ComponentState, js.Any] {
    def this(props: LabelProps) = this()
    def this(props: LabelProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[LabelComponent]
  
}

