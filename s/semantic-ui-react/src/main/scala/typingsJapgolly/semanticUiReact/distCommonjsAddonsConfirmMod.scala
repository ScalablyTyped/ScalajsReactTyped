package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsAddonsConfirmConfirmMod.ConfirmProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsConfirmMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ConfirmProps, js.Object, Any] {
    def this(props: ConfirmProps) = this()
    def this(props: ConfirmProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm", JSImport.Default)
  @js.native
  val default: ComponentClassP[ConfirmProps & js.Object] = js.native
  
  type _To = ComponentClassP[ConfirmProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsAddonsConfirmMod.foo` */
  override def _to: ComponentClassP[ConfirmProps & js.Object] = default
}
