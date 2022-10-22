package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedEventMod.FeedEventProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeedEvent {
  
  @JSImport("semantic-ui-react", "FeedEvent")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FeedEvent.type): SharedBuilder_FeedEventProps_333681336 = new SharedBuilder_FeedEventProps_333681336(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FeedEventProps): SharedBuilder_FeedEventProps_333681336 = new SharedBuilder_FeedEventProps_333681336(js.Array(this.component, p.asInstanceOf[js.Any]))
}
