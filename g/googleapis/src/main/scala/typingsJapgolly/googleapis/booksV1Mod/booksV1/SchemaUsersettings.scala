package typingsJapgolly.googleapis.booksV1Mod.booksV1

import typingsJapgolly.googleapis.AnonFolderName
import typingsJapgolly.googleapis.AnonMatchMyInterests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUsersettings extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User settings in sub-objects, each for different purposes.
    */
  var notesExport: js.UndefOr[AnonFolderName] = js.native
  var notification: js.UndefOr[AnonMatchMyInterests] = js.native
}

object SchemaUsersettings {
  @scala.inline
  def apply(kind: String = null, notesExport: AnonFolderName = null, notification: AnonMatchMyInterests = null): SchemaUsersettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notesExport != null) __obj.updateDynamic("notesExport")(notesExport.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUsersettings]
  }
}

