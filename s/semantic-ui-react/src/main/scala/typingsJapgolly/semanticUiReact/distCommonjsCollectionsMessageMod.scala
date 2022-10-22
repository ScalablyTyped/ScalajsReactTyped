package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageMod.MessageComponent
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageMod.MessageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsMessageMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[MessageProps, js.Object, Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message", JSImport.Default)
  @js.native
  val default: MessageComponent = js.native
  
  type _To = MessageComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsMessageMod.foo` */
  override def _to: MessageComponent = default
}
