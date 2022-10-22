package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedDateMod.FeedDateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeedDate {
  
  @JSImport("semantic-ui-react", "FeedDate")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FeedDate.type): SharedBuilder_FeedDateProps_527346396 = new SharedBuilder_FeedDateProps_527346396(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FeedDateProps): SharedBuilder_FeedDateProps_527346396 = new SharedBuilder_FeedDateProps_527346396(js.Array(this.component, p.asInstanceOf[js.Any]))
}
