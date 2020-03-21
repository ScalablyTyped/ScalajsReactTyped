package typingsJapgolly.behavior3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategory extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonCategory {
  @scala.inline
  def apply(
    category: String = null,
    description: String = null,
    name: String = null,
    properties: js.Any = null,
    title: String = null
  ): AnonCategory = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategory]
  }
}

