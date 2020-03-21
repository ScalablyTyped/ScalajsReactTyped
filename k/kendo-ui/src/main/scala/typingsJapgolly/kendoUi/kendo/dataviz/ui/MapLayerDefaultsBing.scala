package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsBing extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var imagerySet: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object MapLayerDefaultsBing {
  @scala.inline
  def apply(
    attribution: String = null,
    culture: String = null,
    imagerySet: String = null,
    key: String = null,
    opacity: Int | Double = null
  ): MapLayerDefaultsBing = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (imagerySet != null) __obj.updateDynamic("imagerySet")(imagerySet.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsBing]
  }
}

