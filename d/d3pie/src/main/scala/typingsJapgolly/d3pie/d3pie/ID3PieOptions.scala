package typingsJapgolly.d3pie.d3pie

import typingsJapgolly.d3pie.AnonCanvasHeight
import typingsJapgolly.d3pie.AnonCanvasPadding
import typingsJapgolly.d3pie.AnonContent
import typingsJapgolly.d3pie.AnonFormatter
import typingsJapgolly.d3pie.AnonHighlightLuminosity
import typingsJapgolly.d3pie.AnonLocation
import typingsJapgolly.d3pie.AnonOnClickSegment
import typingsJapgolly.d3pie.AnonPlaceholderParser
import typingsJapgolly.d3pie.locationleftID3PieTextOpt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieOptions extends js.Object {
  var callbacks: js.UndefOr[AnonOnClickSegment] = js.undefined
  var data: AnonContent
  var effects: js.UndefOr[AnonHighlightLuminosity] = js.undefined
  var footer: js.UndefOr[locationleftID3PieTextOpt] = js.undefined
  var header: js.UndefOr[AnonLocation] = js.undefined
  var labels: js.UndefOr[AnonFormatter] = js.undefined
  var misc: js.UndefOr[AnonCanvasPadding] = js.undefined
  var size: js.UndefOr[AnonCanvasHeight] = js.undefined
  var tooltips: js.UndefOr[AnonPlaceholderParser] = js.undefined
}

object ID3PieOptions {
  @scala.inline
  def apply(
    data: AnonContent,
    callbacks: AnonOnClickSegment = null,
    effects: AnonHighlightLuminosity = null,
    footer: locationleftID3PieTextOpt = null,
    header: AnonLocation = null,
    labels: AnonFormatter = null,
    misc: AnonCanvasPadding = null,
    size: AnonCanvasHeight = null,
    tooltips: AnonPlaceholderParser = null
  ): ID3PieOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (misc != null) __obj.updateDynamic("misc")(misc.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieOptions]
  }
}

