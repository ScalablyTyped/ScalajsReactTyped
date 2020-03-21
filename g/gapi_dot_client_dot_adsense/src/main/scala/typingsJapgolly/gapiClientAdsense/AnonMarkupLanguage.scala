package typingsJapgolly.gapiClientAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMarkupLanguage extends js.Object {
  /** The markup language to use for this ad unit. */
  var markupLanguage: js.UndefOr[String] = js.undefined
  /** The scripting language to use for this ad unit. */
  var scriptingLanguage: js.UndefOr[String] = js.undefined
  /** Size of this ad unit. */
  var size: js.UndefOr[String] = js.undefined
  /** Type of this ad unit. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonMarkupLanguage {
  @scala.inline
  def apply(
    markupLanguage: String = null,
    scriptingLanguage: String = null,
    size: String = null,
    `type`: String = null
  ): AnonMarkupLanguage = {
    val __obj = js.Dynamic.literal()
    if (markupLanguage != null) __obj.updateDynamic("markupLanguage")(markupLanguage.asInstanceOf[js.Any])
    if (scriptingLanguage != null) __obj.updateDynamic("scriptingLanguage")(scriptingLanguage.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarkupLanguage]
  }
}

