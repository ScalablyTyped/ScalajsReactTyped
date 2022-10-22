package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsBehaviorsVisibilityMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/behaviors/Visibility", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[VisibilityProps, js.Object, Any] {
    def this(props: VisibilityProps) = this()
    def this(props: VisibilityProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/behaviors/Visibility", JSImport.Default)
  @js.native
  val default: ComponentClassP[VisibilityProps & js.Object] = js.native
  
  type _To = ComponentClassP[VisibilityProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsBehaviorsVisibilityMod.foo` */
  override def _to: ComponentClassP[VisibilityProps & js.Object] = default
}
