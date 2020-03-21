package typingsJapgolly.leafletPm.mod.PM

import typingsJapgolly.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var hintlineStyle: js.UndefOr[PathOptions] = js.undefined
  var pathOptions: js.UndefOr[PathOptions] = js.undefined
  var templineStyle: js.UndefOr[PathOptions] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    hintlineStyle: PathOptions = null,
    pathOptions: PathOptions = null,
    templineStyle: PathOptions = null
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (hintlineStyle != null) __obj.updateDynamic("hintlineStyle")(hintlineStyle.asInstanceOf[js.Any])
    if (pathOptions != null) __obj.updateDynamic("pathOptions")(pathOptions.asInstanceOf[js.Any])
    if (templineStyle != null) __obj.updateDynamic("templineStyle")(templineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}

