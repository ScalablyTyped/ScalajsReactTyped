package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesStickyStickyMod.StickyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesStickyMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[StickyProps, js.Object, Any] {
    def this(props: StickyProps) = this()
    def this(props: StickyProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky", JSImport.Default)
  @js.native
  val default: ComponentClassP[StickyProps & js.Object] = js.native
  
  type _To = ComponentClassP[StickyProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesStickyMod.foo` */
  override def _to: ComponentClassP[StickyProps & js.Object] = default
}
