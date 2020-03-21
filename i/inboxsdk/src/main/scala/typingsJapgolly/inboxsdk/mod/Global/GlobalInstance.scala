package typingsJapgolly.inboxsdk.mod.Global

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.mod.Conversations.ContentPanelDescriptor
import typingsJapgolly.inboxsdk.mod.Conversations.ContentPanelView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalInstance extends js.Object {
  def addSidebarContentPanel(contentPanelDescriptor: ContentPanelDescriptor): js.Promise[ContentPanelView]
}

object GlobalInstance {
  @scala.inline
  def apply(addSidebarContentPanel: ContentPanelDescriptor => CallbackTo[js.Promise[ContentPanelView]]): GlobalInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSidebarContentPanel")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Conversations.ContentPanelDescriptor) => addSidebarContentPanel(t0).runNow()))
    __obj.asInstanceOf[GlobalInstance]
  }
}

