package typingsJapgolly.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpecName extends js.Object {
  var specName: js.UndefOr[String] = js.undefined
  var stackTrace: js.UndefOr[String] = js.undefined
}

object AnonSpecName {
  @scala.inline
  def apply(specName: String = null, stackTrace: String = null): AnonSpecName = {
    val __obj = js.Dynamic.literal()
    if (specName != null) __obj.updateDynamic("specName")(specName.asInstanceOf[js.Any])
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpecName]
  }
}

