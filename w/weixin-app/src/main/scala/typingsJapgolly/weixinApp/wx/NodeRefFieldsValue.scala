package typingsJapgolly.weixinApp.wx

import typingsJapgolly.weixinApp.AnonBottom
import typingsJapgolly.weixinApp.AnonDataset
import typingsJapgolly.weixinApp.AnonHeight
import typingsJapgolly.weixinApp.AnonId
import typingsJapgolly.weixinApp.AnonPropertiesAny
import typingsJapgolly.weixinApp.AnonScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: AnonDataset
  var id: AnonId
  var properties: AnonPropertiesAny
  var rect: AnonBottom
  var scrollOffset: AnonScrollLeft
  var size: AnonHeight
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: AnonDataset,
    id: AnonId,
    properties: AnonPropertiesAny,
    rect: AnonBottom,
    scrollOffset: AnonScrollLeft,
    size: AnonHeight
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}

