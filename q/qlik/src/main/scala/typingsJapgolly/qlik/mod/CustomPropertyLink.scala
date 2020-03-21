package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.array
import typingsJapgolly.qlik.qlikStrings.boolean
import typingsJapgolly.qlik.qlikStrings.integer
import typingsJapgolly.qlik.qlikStrings.items
import typingsJapgolly.qlik.qlikStrings.link
import typingsJapgolly.qlik.qlikStrings.number
import typingsJapgolly.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyLink
  extends CustomPropertyCommon
     with CustomProperty {
  var component: link
  var url: js.UndefOr[String] = js.undefined
}

object CustomPropertyLink {
  @scala.inline
  def apply(
    component: link,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null,
    url: String = null
  ): CustomPropertyLink = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyLink]
  }
}

