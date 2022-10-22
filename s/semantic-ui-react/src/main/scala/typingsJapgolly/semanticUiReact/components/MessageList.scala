package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageListMod.MessageListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageList {
  
  @JSImport("semantic-ui-react", "MessageList")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MessageList.type): SharedBuilder_MessageListProps_2026924381 = new SharedBuilder_MessageListProps_2026924381(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MessageListProps): SharedBuilder_MessageListProps_2026924381 = new SharedBuilder_MessageListProps_2026924381(js.Array(this.component, p.asInstanceOf[js.Any]))
}
