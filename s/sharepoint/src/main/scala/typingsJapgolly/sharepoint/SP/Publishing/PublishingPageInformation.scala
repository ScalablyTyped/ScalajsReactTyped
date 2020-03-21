package typingsJapgolly.sharepoint.SP.Publishing

import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.Folder
import typingsJapgolly.sharepoint.SP.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingPageInformation")
@js.native
class PublishingPageInformation () extends ClientValueObject {
  def get_folder(): Folder = js.native
  def get_name(): String = js.native
  def get_pageLayoutListItem(): ListItem[_] = js.native
  def set_folder(value: Folder): Folder = js.native
  def set_name(value: String): String = js.native
  def set_pageLayoutListItem(value: ListItem[_]): ListItem[_] = js.native
}

