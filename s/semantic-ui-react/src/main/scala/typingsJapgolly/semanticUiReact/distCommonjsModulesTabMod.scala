package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabMod.TabComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesTabMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[TabProps, js.Object, Any] {
    def this(props: TabProps) = this()
    def this(props: TabProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab", JSImport.Default)
  @js.native
  val default: TabComponent = js.native
  
  type _To = TabComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesTabMod.foo` */
  override def _to: TabComponent = default
}
