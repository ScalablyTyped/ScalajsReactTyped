package typingsJapgolly.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 原生控件在窗口中显示的位置
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewPosition extends js.Object {
  /**
    * 控件在页面中绝对定位，如果页面存在滚动条不随窗口内容滚动
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var absolute: js.UndefOr[String] = js.undefined
  /**
    * 控件在页面中停靠，停靠的位置通过dock属性进行定义
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var dock: js.UndefOr[String] = js.undefined
  /**
    * 控件在页面中正常定位，如果页面存在滚动条则随窗口内容滚动
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var static: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewPosition {
  @scala.inline
  def apply(absolute: String = null, dock: String = null, static: String = null): PlusWebviewWebviewPosition = {
    val __obj = js.Dynamic.literal()
    if (absolute != null) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (dock != null) __obj.updateDynamic("dock")(dock.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewPosition]
  }
}

