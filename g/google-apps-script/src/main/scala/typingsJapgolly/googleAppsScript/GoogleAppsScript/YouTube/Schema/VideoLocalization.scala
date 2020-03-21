package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoLocalization extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object VideoLocalization {
  @scala.inline
  def apply(description: String = null, title: String = null): VideoLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoLocalization]
  }
}

