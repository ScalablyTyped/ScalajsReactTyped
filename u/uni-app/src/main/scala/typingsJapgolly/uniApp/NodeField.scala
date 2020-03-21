package typingsJapgolly.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeField extends js.Object {
  /**
    * 指定样式名列表，返回节点对应样式名的当前值
    */
  var computedStyle: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 是否返回节点对应的 Context 对象
    */
  var context: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否返回节点 dataset
    */
  var dataset: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否返回节点 id
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    * 指定属性名列表，返回节点对应属性名的当前属性值（只能获得组件文档中标注的常规属性值，id class style 和事件绑定的属性值不可获取）
    */
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 是否返回节点布局位置（left right top bottom）
    */
  var rect: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否返回节点的 scrollLeft scrollTop，节点必须是 scroll-view 或者 viewport
    */
  var scrollOffset: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否返回节点尺寸（width height）
    */
  var size: js.UndefOr[Boolean] = js.undefined
}

object NodeField {
  @scala.inline
  def apply(
    computedStyle: js.Array[String] = null,
    context: js.UndefOr[Boolean] = js.undefined,
    dataset: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    properties: js.Array[String] = null,
    rect: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Boolean] = js.undefined
  ): NodeField = {
    val __obj = js.Dynamic.literal()
    if (computedStyle != null) __obj.updateDynamic("computedStyle")(computedStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(dataset)) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(rect)) __obj.updateDynamic("rect")(rect.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOffset)) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeField]
  }
}

