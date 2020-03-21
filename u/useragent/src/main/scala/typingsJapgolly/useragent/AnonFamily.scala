package typingsJapgolly.useragent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamily extends js.Object {
  var family: String
  var major: js.UndefOr[String] = js.undefined
  var minor: js.UndefOr[String] = js.undefined
  var patch: js.UndefOr[String] = js.undefined
}

object AnonFamily {
  @scala.inline
  def apply(family: String, major: String = null, minor: String = null, patch: String = null): AnonFamily = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamily]
  }
}

