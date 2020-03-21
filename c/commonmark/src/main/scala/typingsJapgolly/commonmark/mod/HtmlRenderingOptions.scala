package typingsJapgolly.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlRenderingOptions extends XmlRenderingOptions {
  /**
    *  if true, raw HTML will not be passed through to HTML output (it will be replaced by comments), and potentially unsafe URLs in links and images
    *  (those beginning with javascript:, vbscript:, file:, and with a few exceptions data:) will be replaced with empty strings.
    */
  var safe: js.UndefOr[Boolean] = js.undefined
  /**
    *  if true, straight quotes will be made curly, -- will be changed to an en dash, --- will be changed to an em dash, and ... will be changed to ellipses.
    */
  var smart: js.UndefOr[Boolean] = js.undefined
  /**
    * A raw string to be used for a softbreak.
    * For example, `{ softbreak: "<br/>" }` treats a softbreak as `<br/>`.
    */
  var softbreak: js.UndefOr[String] = js.undefined
}

object HtmlRenderingOptions {
  @scala.inline
  def apply(
    safe: js.UndefOr[Boolean] = js.undefined,
    smart: js.UndefOr[Boolean] = js.undefined,
    softbreak: String = null,
    sourcepos: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Boolean] = js.undefined
  ): HtmlRenderingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart.asInstanceOf[js.Any])
    if (softbreak != null) __obj.updateDynamic("softbreak")(softbreak.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcepos)) __obj.updateDynamic("sourcepos")(sourcepos.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlRenderingOptions]
  }
}

