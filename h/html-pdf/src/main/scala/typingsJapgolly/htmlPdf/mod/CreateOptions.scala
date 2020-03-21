package typingsJapgolly.htmlPdf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.htmlPdf.AnonBottom
import typingsJapgolly.htmlPdf.AnonContents
import typingsJapgolly.htmlPdf.AnonDetached
import typingsJapgolly.htmlPdf.AnonDomain
import typingsJapgolly.htmlPdf.AnonHeight
import typingsJapgolly.htmlPdf.htmlPdfStrings.A3
import typingsJapgolly.htmlPdf.htmlPdfStrings.A4
import typingsJapgolly.htmlPdf.htmlPdfStrings.A5
import typingsJapgolly.htmlPdf.htmlPdfStrings.Legal
import typingsJapgolly.htmlPdf.htmlPdfStrings.Letter
import typingsJapgolly.htmlPdf.htmlPdfStrings.Tabloid
import typingsJapgolly.htmlPdf.htmlPdfStrings.jpeg
import typingsJapgolly.htmlPdf.htmlPdfStrings.landscape
import typingsJapgolly.htmlPdf.htmlPdfStrings.manual
import typingsJapgolly.htmlPdf.htmlPdfStrings.pdf
import typingsJapgolly.htmlPdf.htmlPdfStrings.png
import typingsJapgolly.htmlPdf.htmlPdfStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  // Rendering options
  var base: js.UndefOr[String] = js.undefined
  // Page options
  var border: js.UndefOr[String | AnonBottom] = js.undefined
  // To run Node application as Windows service
  var childProcessOptions: js.UndefOr[AnonDetached] = js.undefined
  // Export options
  var directory: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[AnonHeight] = js.undefined
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
  var header: js.UndefOr[AnonContents] = js.undefined
  // Papersize Options: http://phantomjs.org/api/webpage/property/paper-size.html
  var height: js.UndefOr[String] = js.undefined
  // HTTP Cookies that are used for requests
  var httpCookies: js.UndefOr[js.Array[AnonDomain]] = js.undefined
  // HTTP Headers that are used for requests
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var paginationOffset: js.UndefOr[Double] = js.undefined
  var phantomArgs: js.UndefOr[js.Array[String]] = js.undefined
  // Script options
  var phantomPath: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[String] = js.undefined
  // Time we should wait after window load
  var renderDelay: js.UndefOr[manual | Double] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  // File options
  var `type`: js.UndefOr[png | jpeg | pdf] = js.undefined
  var width: js.UndefOr[String] = js.undefined
  // Zooming option, can be used to scale images if `options.type` is not pdf
  var zoomFactor: js.UndefOr[String] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    base: String = null,
    border: String | AnonBottom = null,
    childProcessOptions: AnonDetached = null,
    directory: String = null,
    footer: AnonHeight = null,
    format: A3 | A4 | A5 | Legal | Letter | Tabloid = null,
    header: AnonContents = null,
    height: String = null,
    httpCookies: js.Array[AnonDomain] = null,
    httpHeaders: StringDictionary[String] = null,
    orientation: portrait | landscape = null,
    paginationOffset: Int | Double = null,
    phantomArgs: js.Array[String] = null,
    phantomPath: String = null,
    quality: String = null,
    renderDelay: manual | Double = null,
    script: String = null,
    timeout: Int | Double = null,
    `type`: png | jpeg | pdf = null,
    width: String = null,
    zoomFactor: String = null
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (childProcessOptions != null) __obj.updateDynamic("childProcessOptions")(childProcessOptions.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (httpCookies != null) __obj.updateDynamic("httpCookies")(httpCookies.asInstanceOf[js.Any])
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paginationOffset != null) __obj.updateDynamic("paginationOffset")(paginationOffset.asInstanceOf[js.Any])
    if (phantomArgs != null) __obj.updateDynamic("phantomArgs")(phantomArgs.asInstanceOf[js.Any])
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (renderDelay != null) __obj.updateDynamic("renderDelay")(renderDelay.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
}

