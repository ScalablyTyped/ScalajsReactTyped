package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.stepStepMod.StepComponent
import typingsJapgolly.semanticUiReact.stepStepMod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/elements/Step", JSImport.Namespace)
@js.native
object stepMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[StepProps, ComponentState, js.Any] {
    def this(props: StepProps) = this()
    def this(props: StepProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[StepComponent]
  
}

