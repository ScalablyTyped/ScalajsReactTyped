package typingsJapgolly.activexOutlook

import typingsJapgolly.activexOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFolder extends js.Object {
  val Folder: typingsJapgolly.activexOutlook.Outlook.Folder
}

object AnonFolder {
  @scala.inline
  def apply(Folder: Folder): AnonFolder = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFolder]
  }
}

