package typingsJapgolly.formatjsIntlUtils

import typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.`best fit`
import typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocaleMatcher extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}

object AnonLocaleMatcher {
  @scala.inline
  def apply(localeMatcher: (`best fit`) | lookup = null): AnonLocaleMatcher = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocaleMatcher]
  }
}

