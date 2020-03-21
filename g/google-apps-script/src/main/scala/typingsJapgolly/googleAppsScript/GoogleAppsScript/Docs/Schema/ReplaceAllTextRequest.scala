package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllTextRequest extends js.Object {
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  var replaceText: js.UndefOr[String] = js.undefined
}

object ReplaceAllTextRequest {
  @scala.inline
  def apply(containsText: SubstringMatchCriteria = null, replaceText: String = null): ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText.asInstanceOf[js.Any])
    if (replaceText != null) __obj.updateDynamic("replaceText")(replaceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllTextRequest]
  }
}

