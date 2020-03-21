package typingsJapgolly.gapiClientPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCssResponseBytes extends js.Object {
  /** Number of uncompressed response bytes for CSS resources on the page. */
  var cssResponseBytes: js.UndefOr[String] = js.undefined
  /** Number of response bytes for flash resources on the page. */
  var flashResponseBytes: js.UndefOr[String] = js.undefined
  /** Number of uncompressed response bytes for the main HTML document and all iframes on the page. */
  var htmlResponseBytes: js.UndefOr[String] = js.undefined
  /** Number of response bytes for image resources on the page. */
  var imageResponseBytes: js.UndefOr[String] = js.undefined
  /** Number of uncompressed response bytes for JS resources on the page. */
  var javascriptResponseBytes: js.UndefOr[String] = js.undefined
  /** Number of CSS resources referenced by the page. */
  var numberCssResources: js.UndefOr[Double] = js.undefined
  /** Number of unique hosts referenced by the page. */
  var numberHosts: js.UndefOr[Double] = js.undefined
  /** Number of JavaScript resources referenced by the page. */
  var numberJsResources: js.UndefOr[Double] = js.undefined
  /** Number of HTTP resources loaded by the page. */
  var numberResources: js.UndefOr[Double] = js.undefined
  /** Number of static (i.e. cacheable) resources on the page. */
  var numberStaticResources: js.UndefOr[Double] = js.undefined
  /** Number of response bytes for other resources on the page. */
  var otherResponseBytes: js.UndefOr[String] = js.undefined
  /** Number of uncompressed response bytes for text resources not covered by other statistics (i.e non-HTML, non-script, non-CSS resources) on the page. */
  var textResponseBytes: js.UndefOr[String] = js.undefined
  /** Total size of all request bytes sent by the page. */
  var totalRequestBytes: js.UndefOr[String] = js.undefined
}

object AnonCssResponseBytes {
  @scala.inline
  def apply(
    cssResponseBytes: String = null,
    flashResponseBytes: String = null,
    htmlResponseBytes: String = null,
    imageResponseBytes: String = null,
    javascriptResponseBytes: String = null,
    numberCssResources: Int | Double = null,
    numberHosts: Int | Double = null,
    numberJsResources: Int | Double = null,
    numberResources: Int | Double = null,
    numberStaticResources: Int | Double = null,
    otherResponseBytes: String = null,
    textResponseBytes: String = null,
    totalRequestBytes: String = null
  ): AnonCssResponseBytes = {
    val __obj = js.Dynamic.literal()
    if (cssResponseBytes != null) __obj.updateDynamic("cssResponseBytes")(cssResponseBytes.asInstanceOf[js.Any])
    if (flashResponseBytes != null) __obj.updateDynamic("flashResponseBytes")(flashResponseBytes.asInstanceOf[js.Any])
    if (htmlResponseBytes != null) __obj.updateDynamic("htmlResponseBytes")(htmlResponseBytes.asInstanceOf[js.Any])
    if (imageResponseBytes != null) __obj.updateDynamic("imageResponseBytes")(imageResponseBytes.asInstanceOf[js.Any])
    if (javascriptResponseBytes != null) __obj.updateDynamic("javascriptResponseBytes")(javascriptResponseBytes.asInstanceOf[js.Any])
    if (numberCssResources != null) __obj.updateDynamic("numberCssResources")(numberCssResources.asInstanceOf[js.Any])
    if (numberHosts != null) __obj.updateDynamic("numberHosts")(numberHosts.asInstanceOf[js.Any])
    if (numberJsResources != null) __obj.updateDynamic("numberJsResources")(numberJsResources.asInstanceOf[js.Any])
    if (numberResources != null) __obj.updateDynamic("numberResources")(numberResources.asInstanceOf[js.Any])
    if (numberStaticResources != null) __obj.updateDynamic("numberStaticResources")(numberStaticResources.asInstanceOf[js.Any])
    if (otherResponseBytes != null) __obj.updateDynamic("otherResponseBytes")(otherResponseBytes.asInstanceOf[js.Any])
    if (textResponseBytes != null) __obj.updateDynamic("textResponseBytes")(textResponseBytes.asInstanceOf[js.Any])
    if (totalRequestBytes != null) __obj.updateDynamic("totalRequestBytes")(totalRequestBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCssResponseBytes]
  }
}

