package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalMod.ModalComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalMod.ModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesModalMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ModalProps, js.Object, Any] {
    def this(props: ModalProps) = this()
    def this(props: ModalProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Modal", JSImport.Default)
    @js.native
    val ^ : ModalComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Modal", "default.Actions")
    @js.native
    open class Actions protected ()
      extends Component[ModalActionsProps, js.Object, Any] {
      def this(props: ModalActionsProps) = this()
      def this(props: ModalActionsProps, context: Any) = this()
    }
    
    type _To = ModalComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ModalComponent = ^
  }
}
