package typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertFolderResponse extends js.Object {
  var folder: js.UndefOr[Folder] = js.undefined
}

object RevertFolderResponse {
  @scala.inline
  def apply(folder: Folder = null): RevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevertFolderResponse]
  }
}

