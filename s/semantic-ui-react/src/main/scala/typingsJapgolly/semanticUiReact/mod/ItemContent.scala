package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemContentMod.ItemContentProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "ItemContent")
@js.native
open class ItemContent protected ()
  extends Component[ItemContentProps, js.Object, Any] {
  def this(props: ItemContentProps) = this()
  def this(props: ItemContentProps, context: Any) = this()
}
object ItemContent {
  
  inline def apply: ComponentClassP[ItemContentProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("ItemContent").asInstanceOf[ComponentClassP[ItemContentProps & js.Object]]
}
