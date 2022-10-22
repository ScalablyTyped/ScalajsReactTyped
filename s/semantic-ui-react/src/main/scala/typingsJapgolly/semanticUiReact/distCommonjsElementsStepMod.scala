package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepMod.StepComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepMod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsStepMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[StepProps, js.Object, Any] {
    def this(props: StepProps) = this()
    def this(props: StepProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step", JSImport.Default)
  @js.native
  val default: StepComponent = js.native
  
  type _To = StepComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsStepMod.foo` */
  override def _to: StepComponent = default
}
