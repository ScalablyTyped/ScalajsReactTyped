package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "TransitionGroup")
@js.native
open class TransitionGroup protected ()
  extends Component[TransitionGroupProps, js.Object, Any] {
  def this(props: TransitionGroupProps) = this()
  def this(props: TransitionGroupProps, context: Any) = this()
}
object TransitionGroup {
  
  inline def apply: ComponentClassP[TransitionGroupProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("TransitionGroup").asInstanceOf[ComponentClassP[TransitionGroupProps & js.Object]]
}
