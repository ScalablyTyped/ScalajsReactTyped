package typingsJapgolly.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InterstitialAd")
@js.native
class InterstitialAd () extends BannerAd {
  /**
    * 加载视频广告
    */
  def load(): js.Promise[Unit] = js.native
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def offClose(callback: js.Function1[/* res */ AnonIsEnded, Unit]): Unit = js.native
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def onClose(callback: js.Function1[/* res */ AnonIsEnded, Unit]): Unit = js.native
}

