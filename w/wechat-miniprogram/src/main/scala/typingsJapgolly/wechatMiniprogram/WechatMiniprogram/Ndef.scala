package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ndef extends StObject {
  
  /** [Ndef.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.close.html)
    *
    * 断开连接
    *
    * 最低基础库： `2.11.2` */
  def close(): Unit = js.native
  def close(option: NdefCloseOption): Unit = js.native
  
  /** [Ndef.connect(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.connect.html)
    *
    * 连接 NFC 标签
    *
    * 最低基础库： `2.11.2` */
  def connect(): Unit = js.native
  def connect(option: NdefConnectOption): Unit = js.native
  
  /** [Ndef.isConnected(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.isConnected.html)
    *
    * 检查是否已连接
    *
    * 最低基础库： `2.11.2` */
  def isConnected(): Unit = js.native
  def isConnected(option: IsConnectedOption): Unit = js.native
  
  /** [Ndef.offNdefMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.offNdefMessage.html)
    *
    * 取消监听 Ndef 消息
    *
    * 最低基础库： `2.11.2` */
  def offNdefMessage(callback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
  
  /** [Ndef.onNdefMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.onNdefMessage.html)
    *
    * 监听 Ndef 消息
    *
    * 最低基础库： `2.11.2` */
  def onNdefMessage(callback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
  
  /** [Ndef.setTimeout(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.setTimeout.html)
    *
    * 设置超时时间
    *
    * 最低基础库： `2.11.2` */
  def setTimeout(option: SetTimeoutOption): Unit = js.native
  
  /** [Ndef.writeNdefMessage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.writeNdefMessage.html)
    *
    * 重写 Ndef 标签内容
    *
    * 最低基础库： `2.11.2` */
  def writeNdefMessage(option: WriteNdefMessageOption): Unit = js.native
}
