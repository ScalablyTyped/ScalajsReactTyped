package typingsJapgolly.baiduApp.swan

import typingsJapgolly.baiduApp.AnonBottom
import typingsJapgolly.baiduApp.AnonDataset
import typingsJapgolly.baiduApp.AnonId
import typingsJapgolly.baiduApp.AnonPropertiesAny
import typingsJapgolly.baiduApp.AnonScrollLeft
import typingsJapgolly.baiduApp.AnonWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: AnonDataset
  var id: AnonId
  var properties: AnonPropertiesAny
  var rect: AnonBottom
  var scrollOffset: AnonScrollLeft
  var size: AnonWidth
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: AnonDataset,
    id: AnonId,
    properties: AnonPropertiesAny,
    rect: AnonBottom,
    scrollOffset: AnonScrollLeft,
    size: AnonWidth
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}

