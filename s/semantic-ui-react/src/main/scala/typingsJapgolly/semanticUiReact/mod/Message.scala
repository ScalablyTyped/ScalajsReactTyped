package typingsJapgolly.semanticUiReact.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageMod.MessageComponent
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageMod.MessageProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Message")
@js.native
open class Message protected ()
  extends Component[MessageProps, js.Object, Any] {
  def this(props: MessageProps) = this()
  def this(props: MessageProps, context: Any) = this()
}
object Message {
  
  inline def apply: MessageComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Message").asInstanceOf[MessageComponent]
}
