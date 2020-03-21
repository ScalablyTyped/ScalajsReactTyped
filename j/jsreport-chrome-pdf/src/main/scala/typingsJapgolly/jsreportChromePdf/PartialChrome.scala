package typingsJapgolly.jsreportChromePdf

import typingsJapgolly.jsreportChromePdf.jsreportChromePdfStrings.print
import typingsJapgolly.jsreportChromePdf.jsreportChromePdfStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.Chrome> */
trait PartialChrome extends js.Object {
  var displayHeaderFooter: js.UndefOr[Boolean] = js.undefined
  var footerTemplate: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var headerTemplate: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var landscape: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[AnonBottom] = js.undefined
  var marginBottom: js.UndefOr[String | Double] = js.undefined
  var marginLeft: js.UndefOr[String | Double] = js.undefined
  var marginRight: js.UndefOr[String | Double] = js.undefined
  var marginTop: js.UndefOr[String | Double] = js.undefined
  var mediaType: js.UndefOr[screen | print] = js.undefined
  var pageNumber: js.UndefOr[Double] = js.undefined
  var pageRanges: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var preferCSSPageSize: js.UndefOr[Boolean] = js.undefined
  var printBackground: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var totalPages: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var waitForJS: js.UndefOr[Boolean] = js.undefined
  var waitForNetworkIddle: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object PartialChrome {
  @scala.inline
  def apply(
    displayHeaderFooter: js.UndefOr[Boolean] = js.undefined,
    footerTemplate: String = null,
    format: String = null,
    header: String = null,
    headerTemplate: String = null,
    height: String | Double = null,
    landscape: js.UndefOr[Boolean] = js.undefined,
    margin: AnonBottom = null,
    marginBottom: String | Double = null,
    marginLeft: String | Double = null,
    marginRight: String | Double = null,
    marginTop: String | Double = null,
    mediaType: screen | print = null,
    pageNumber: Int | Double = null,
    pageRanges: String = null,
    path: String = null,
    preferCSSPageSize: js.UndefOr[Boolean] = js.undefined,
    printBackground: js.UndefOr[Boolean] = js.undefined,
    scale: Int | Double = null,
    totalPages: Int | Double = null,
    url: String = null,
    waitForJS: js.UndefOr[Boolean] = js.undefined,
    waitForNetworkIddle: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null
  ): PartialChrome = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayHeaderFooter)) __obj.updateDynamic("displayHeaderFooter")(displayHeaderFooter.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (pageRanges != null) __obj.updateDynamic("pageRanges")(pageRanges.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(preferCSSPageSize)) __obj.updateDynamic("preferCSSPageSize")(preferCSSPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(printBackground)) __obj.updateDynamic("printBackground")(printBackground.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForJS)) __obj.updateDynamic("waitForJS")(waitForJS.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForNetworkIddle)) __obj.updateDynamic("waitForNetworkIddle")(waitForNetworkIddle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChrome]
  }
}

