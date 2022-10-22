package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "TransitionablePortal")
@js.native
open class TransitionablePortal protected ()
  extends Component[TransitionablePortalProps, js.Object, Any] {
  def this(props: TransitionablePortalProps) = this()
  def this(props: TransitionablePortalProps, context: Any) = this()
}
object TransitionablePortal {
  
  inline def apply: ComponentClassP[TransitionablePortalProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("TransitionablePortal").asInstanceOf[ComponentClassP[TransitionablePortalProps & js.Object]]
}
