package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesTransitionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[TransitionProps, js.Object, Any] {
    def this(props: TransitionProps) = this()
    def this(props: TransitionProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Transition", JSImport.Default)
    @js.native
    val ^ : TransitionComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Transition", "default.Group")
    @js.native
    open class Group protected ()
      extends Component[TransitionGroupProps, js.Object, Any] {
      def this(props: TransitionGroupProps) = this()
      def this(props: TransitionGroupProps, context: Any) = this()
    }
    
    type _To = TransitionComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: TransitionComponent = ^
  }
}
