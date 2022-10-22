package typingsJapgolly.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemContentMod.ItemContentProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemMod.ItemComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item extends Shortcut {
  
  @JSImport("semantic-ui-react", "Item")
  @js.native
  val ^ : ItemComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Item.Content")
  @js.native
  open class Content protected ()
    extends Component[ItemContentProps, js.Object, Any] {
    def this(props: ItemContentProps) = this()
    def this(props: ItemContentProps, context: Any) = this()
  }
  
  type _To = ItemComponent
  
  /* This means you don't have to write `^`, but can instead just say `Item.foo` */
  override def _to: ItemComponent = ^
}
