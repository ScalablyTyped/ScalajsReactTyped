package typingsJapgolly.nightwatch.mod

import typingsJapgolly.nightwatch.AnonUi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestRunner extends js.Object {
  var options: js.UndefOr[AnonUi] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object NightwatchTestRunner {
  @scala.inline
  def apply(options: AnonUi = null, `type`: String = null): NightwatchTestRunner = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestRunner]
  }
}

