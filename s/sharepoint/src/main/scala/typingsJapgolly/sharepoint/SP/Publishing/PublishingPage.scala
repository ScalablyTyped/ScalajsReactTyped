package typingsJapgolly.sharepoint.SP.Publishing

import typingsJapgolly.sharepoint.SP.ClientContext
import typingsJapgolly.sharepoint.SP.ListItem
import typingsJapgolly.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
import typingsJapgolly.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingPage")
@js.native
class PublishingPage () extends ScheduledItem {
  def addFriendlyUrl(friendlyUrlSegment: String, editableParent: NavigationTermSetItem, doAddToNavigation: Boolean): StringResult = js.native
}

/* static members */
@JSGlobal("SP.Publishing.PublishingPage")
@js.native
object PublishingPage extends js.Object {
  def getPublishingPage(context: ClientContext, sourceListItem: ListItem[_]): PublishingPage = js.native
}

