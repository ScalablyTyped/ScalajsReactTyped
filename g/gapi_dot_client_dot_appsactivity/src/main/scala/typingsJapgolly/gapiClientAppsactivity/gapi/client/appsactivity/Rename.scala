package typingsJapgolly.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rename extends js.Object {
  /** The new title. */
  var newTitle: js.UndefOr[String] = js.undefined
  /** The old title. */
  var oldTitle: js.UndefOr[String] = js.undefined
}

object Rename {
  @scala.inline
  def apply(newTitle: String = null, oldTitle: String = null): Rename = {
    val __obj = js.Dynamic.literal()
    if (newTitle != null) __obj.updateDynamic("newTitle")(newTitle.asInstanceOf[js.Any])
    if (oldTitle != null) __obj.updateDynamic("oldTitle")(oldTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rename]
  }
}

