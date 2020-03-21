package typingsJapgolly.vscodeLanguageserverProtocol

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguage extends DocumentFilter {
  /** A language id, like `typescript`. */
  var language: String
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[String] = js.undefined
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.undefined
}

object AnonLanguage {
  @scala.inline
  def apply(language: String, pattern: String = null, scheme: String = null): AnonLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguage]
  }
}

