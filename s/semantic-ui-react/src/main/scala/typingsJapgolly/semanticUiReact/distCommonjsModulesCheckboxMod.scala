package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesCheckboxMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[CheckboxProps, js.Object, Any] {
    def this(props: CheckboxProps) = this()
    def this(props: CheckboxProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox", JSImport.Default)
  @js.native
  val default: ComponentClassP[CheckboxProps & js.Object] = js.native
  
  type _To = ComponentClassP[CheckboxProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesCheckboxMod.foo` */
  override def _to: ComponentClassP[CheckboxProps & js.Object] = default
}
