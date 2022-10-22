package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesEmbedEmbedMod.EmbedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesEmbedMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[EmbedProps, js.Object, Any] {
    def this(props: EmbedProps) = this()
    def this(props: EmbedProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
  @js.native
  val default: ComponentClassP[EmbedProps & js.Object] = js.native
  
  type _To = ComponentClassP[EmbedProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesEmbedMod.foo` */
  override def _to: ComponentClassP[EmbedProps & js.Object] = default
}
