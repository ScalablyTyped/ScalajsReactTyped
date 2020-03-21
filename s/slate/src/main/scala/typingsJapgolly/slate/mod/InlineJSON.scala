package typingsJapgolly.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.slate.slateStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineJSON extends NodeJSON {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nodes: js.UndefOr[js.Array[InlineJSON | TextJSON]] = js.undefined
  var `object`: js.UndefOr[`inline`] = js.undefined
  var `type`: String
}

object InlineJSON {
  @scala.inline
  def apply(
    `type`: String,
    data: StringDictionary[js.Any] = null,
    key: String = null,
    nodes: js.Array[InlineJSON | TextJSON] = null,
    `object`: `inline` = null
  ): InlineJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineJSON]
  }
}

