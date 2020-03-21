package typingsJapgolly.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，微信小程序信息
  * 用于配置分享小程序的参数，如小程序标识、页面路径等。
  * 	注意：分享的小程序需要在微信开放平台关联的开发者账号下，否则会分享失败。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
trait PlusShareWeixinMiniProgramOptions extends js.Object {
  /**
    * 微信小程序ID
    * 注意：是微信小程序的原始ID（"g_"开头的字符串）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * 微信小程序打开的页面路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * 微信小程序版本类型
    * 可取值：
    * 	0-正式版；
    * 	1-测试版；
    * 	2-体验版。
    * 	默认值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var `type`: js.UndefOr[Double] = js.undefined
  /**
    * 兼容低版本的网页链接
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var webUrl: js.UndefOr[String] = js.undefined
}

object PlusShareWeixinMiniProgramOptions {
  @scala.inline
  def apply(id: String = null, path: String = null, `type`: Int | Double = null, webUrl: String = null): PlusShareWeixinMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusShareWeixinMiniProgramOptions]
  }
}

