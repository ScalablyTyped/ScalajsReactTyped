package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesProgressProgressMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesProgressMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ProgressProps, js.Object, Any] {
    def this(props: ProgressProps) = this()
    def this(props: ProgressProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress", JSImport.Default)
  @js.native
  val default: ComponentClassP[ProgressProps & js.Object] = js.native
  
  type _To = ComponentClassP[ProgressProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesProgressMod.foo` */
  override def _to: ComponentClassP[ProgressProps & js.Object] = default
}
