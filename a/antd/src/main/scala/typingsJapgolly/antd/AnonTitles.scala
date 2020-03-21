package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitles extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: Node
  var searchPlaceholder: String
  var titles: js.Array[String]
}

object AnonTitles {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    searchPlaceholder: String,
    titles: js.Array[String],
    notFoundContent: VdomNode = null
  ): AnonTitles = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitles]
  }
}

