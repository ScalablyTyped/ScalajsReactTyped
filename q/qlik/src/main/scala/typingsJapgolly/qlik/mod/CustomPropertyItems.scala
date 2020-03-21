package typingsJapgolly.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.qlik.qlikStrings.items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyItems
  extends CustomPropertyCommon
     with CustomProperty {
  var items: StringDictionary[CustomProperty]
  @JSName("type")
  var type_CustomPropertyItems: items
}

object CustomPropertyItems {
  @scala.inline
  def apply(
    items: StringDictionary[CustomProperty],
    `type`: items,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyItems]
  }
}

