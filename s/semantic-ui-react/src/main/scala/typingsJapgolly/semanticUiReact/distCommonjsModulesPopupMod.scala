package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesPopupPopupMod.PopupComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesPopupPopupMod.PopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesPopupMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[PopupProps, js.Object, Any] {
    def this(props: PopupProps) = this()
    def this(props: PopupProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup", JSImport.Default)
  @js.native
  val default: PopupComponent = js.native
  
  type _To = PopupComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesPopupMod.foo` */
  override def _to: PopupComponent = default
}
