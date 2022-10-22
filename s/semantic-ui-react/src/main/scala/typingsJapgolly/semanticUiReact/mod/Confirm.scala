package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsAddonsConfirmConfirmMod.ConfirmProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Confirm")
@js.native
open class Confirm protected ()
  extends Component[ConfirmProps, js.Object, Any] {
  def this(props: ConfirmProps) = this()
  def this(props: ConfirmProps, context: Any) = this()
}
object Confirm {
  
  inline def apply: ComponentClassP[ConfirmProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Confirm").asInstanceOf[ComponentClassP[ConfirmProps & js.Object]]
}
