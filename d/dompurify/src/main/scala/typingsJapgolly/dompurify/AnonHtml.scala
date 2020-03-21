package typingsJapgolly.dompurify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtml extends js.Object {
  var html: js.UndefOr[Boolean] = js.undefined
  var mathMl: js.UndefOr[Boolean] = js.undefined
  var svg: js.UndefOr[Boolean] = js.undefined
  var svgFilters: js.UndefOr[Boolean] = js.undefined
}

object AnonHtml {
  @scala.inline
  def apply(
    html: js.UndefOr[Boolean] = js.undefined,
    mathMl: js.UndefOr[Boolean] = js.undefined,
    svg: js.UndefOr[Boolean] = js.undefined,
    svgFilters: js.UndefOr[Boolean] = js.undefined
  ): AnonHtml = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(mathMl)) __obj.updateDynamic("mathMl")(mathMl.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (!js.isUndefined(svgFilters)) __obj.updateDynamic("svgFilters")(svgFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHtml]
  }
}

