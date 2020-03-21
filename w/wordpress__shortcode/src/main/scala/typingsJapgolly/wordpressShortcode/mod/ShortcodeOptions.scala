package typingsJapgolly.wordpressShortcode.mod

import typingsJapgolly.wordpressShortcode.PartialShortcodeAttrs
import typingsJapgolly.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typingsJapgolly.wordpressShortcode.wordpressShortcodeStrings.closed
import typingsJapgolly.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcodeOptions extends js.Object {
  var attrs: js.UndefOr[PartialShortcodeAttrs | String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var tag: String
  var `type`: js.UndefOr[closed | `self-closing` | single] = js.undefined
}

object ShortcodeOptions {
  @scala.inline
  def apply(
    tag: String,
    attrs: PartialShortcodeAttrs | String = null,
    content: String = null,
    `type`: closed | `self-closing` | single = null
  ): ShortcodeOptions = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcodeOptions]
  }
}

