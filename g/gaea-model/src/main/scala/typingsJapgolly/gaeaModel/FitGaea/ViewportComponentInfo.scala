package typingsJapgolly.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportComponentInfo extends js.Object {
  /**
    * 子元素（canDragIn才有）
    * 只存子元素在 map 中的 key
    */
  var layoutChilds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 父级 mapUniqueKey, 这样不但方便寻找父级,还能根据是否为 null 判断是否为根元素
    */
  var parentMapUniqueKey: String
  /**
    * props
    */
  var props: ComponentProps
}

object ViewportComponentInfo {
  @scala.inline
  def apply(parentMapUniqueKey: String, props: ComponentProps, layoutChilds: js.Array[String] = null): ViewportComponentInfo = {
    val __obj = js.Dynamic.literal(parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (layoutChilds != null) __obj.updateDynamic("layoutChilds")(layoutChilds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportComponentInfo]
  }
}

