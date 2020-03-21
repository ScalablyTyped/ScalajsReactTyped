package typingsJapgolly.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaInfo extends js.Object {
  /** The capture date of the streetside scene. */
  var cd: js.UndefOr[String] = js.undefined
}

object IPanoramaInfo {
  @scala.inline
  def apply(cd: String = null): IPanoramaInfo = {
    val __obj = js.Dynamic.literal()
    if (cd != null) __obj.updateDynamic("cd")(cd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaInfo]
  }
}

