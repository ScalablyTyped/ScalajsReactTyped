package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsLabelMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[LabelProps, js.Object, Any] {
    def this(props: LabelProps) = this()
    def this(props: LabelProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label", JSImport.Default)
  @js.native
  val default: LabelComponent = js.native
  
  type _To = LabelComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsLabelMod.foo` */
  override def _to: LabelComponent = default
}
