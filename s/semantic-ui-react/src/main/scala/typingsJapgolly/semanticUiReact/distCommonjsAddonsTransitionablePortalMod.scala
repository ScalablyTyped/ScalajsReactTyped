package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsTransitionablePortalMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[TransitionablePortalProps, js.Object, Any] {
    def this(props: TransitionablePortalProps) = this()
    def this(props: TransitionablePortalProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal", JSImport.Default)
  @js.native
  val default: ComponentClassP[TransitionablePortalProps & js.Object] = js.native
  
  type _To = ComponentClassP[TransitionablePortalProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsAddonsTransitionablePortalMod.foo` */
  override def _to: ComponentClassP[TransitionablePortalProps & js.Object] = default
}
