package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Checkbox")
@js.native
open class Checkbox protected ()
  extends Component[CheckboxProps, js.Object, Any] {
  def this(props: CheckboxProps) = this()
  def this(props: CheckboxProps, context: Any) = this()
}
object Checkbox {
  
  inline def apply: ComponentClassP[CheckboxProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Checkbox").asInstanceOf[ComponentClassP[CheckboxProps & js.Object]]
}
