package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromUri extends js.Object {
  var fromUri: js.UndefOr[String | URI] = js.undefined
  var toDisplayName: js.UndefOr[String] = js.undefined
  var toUri: js.UndefOr[String | URI] = js.undefined
}

object AnonFromUri {
  @scala.inline
  def apply(fromUri: String | URI = null, toDisplayName: String = null, toUri: String | URI = null): AnonFromUri = {
    val __obj = js.Dynamic.literal()
    if (fromUri != null) __obj.updateDynamic("fromUri")(fromUri.asInstanceOf[js.Any])
    if (toDisplayName != null) __obj.updateDynamic("toDisplayName")(toDisplayName.asInstanceOf[js.Any])
    if (toUri != null) __obj.updateDynamic("toUri")(toUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromUri]
  }
}

