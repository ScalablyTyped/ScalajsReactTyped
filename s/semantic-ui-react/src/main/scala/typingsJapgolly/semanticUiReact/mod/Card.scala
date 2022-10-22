package typingsJapgolly.semanticUiReact.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardMod.CardComponent
import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardMod.CardProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Card")
@js.native
open class Card protected ()
  extends Component[CardProps, js.Object, Any] {
  def this(props: CardProps) = this()
  def this(props: CardProps, context: Any) = this()
}
object Card {
  
  inline def apply: CardComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Card").asInstanceOf[CardComponent]
}
