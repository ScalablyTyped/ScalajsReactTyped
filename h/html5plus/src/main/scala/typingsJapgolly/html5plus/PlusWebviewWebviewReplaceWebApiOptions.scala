package typingsJapgolly.html5plus

import typingsJapgolly.html5plus.html5plusStrings.alldevice
import typingsJapgolly.html5plus.html5plusStrings.auto
import typingsJapgolly.html5plus.html5plusStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 替换H5标准API配置信息
  * 目前仅支持替换H5标准定位接口
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewReplaceWebApiOptions extends js.Object {
  /**
    * 替换H5标准定位接口(navigator.geolocation.*)
    * 由于网络原因，在部分手机上可能无法调用标准H5定位接口(navigator.geolocation.*)获取定位数据，此时可以通过此属性配置使用原生定位模块替换标准H5定位接口，可取值：
    * 		"alldevice" - 在所有设备上替换标准H5定位接口(navigator.geolocation.*)；
    * 		"auto" - 自动替换H5标准定位接口，仅在调用标准H5定位接口无法获取数据的设备上替换；
    * 		"none" - 不替换H5标准定位接口(navigator.geolocation.*)。
    * 	默认值为"none"。
    * 	注意：替换H5标准定位接口，会导致页面加载速度延迟100ms左右，推荐使用"auto"模式。
    * - alldevice: 
    * 	强制替换H5标准定位接口(navigator.geolocation.*)		
    * 								
    * - auto: 
    * 	自动替换标准H5定位接口，仅在调用标准H5定位接口无法获取数据的设备上替换
    * 								
    * - none: 
    * 	不替换标准H5定位接口(navigator.geolocation.*)
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var geolocation: js.UndefOr[alldevice | auto | none] = js.undefined
}

object PlusWebviewWebviewReplaceWebApiOptions {
  @scala.inline
  def apply(geolocation: alldevice | auto | none = null): PlusWebviewWebviewReplaceWebApiOptions = {
    val __obj = js.Dynamic.literal()
    if (geolocation != null) __obj.updateDynamic("geolocation")(geolocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewReplaceWebApiOptions]
  }
}

