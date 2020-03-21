package typingsJapgolly.activexOutlook

import typingsJapgolly.activexOutlook.Outlook.Folder
import typingsJapgolly.activexOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFolderPages extends js.Object {
  val Folder: typingsJapgolly.activexOutlook.Outlook.Folder
  val Pages: PropertyPages
}

object AnonFolderPages {
  @scala.inline
  def apply(Folder: Folder, Pages: PropertyPages): AnonFolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFolderPages]
  }
}

