package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackgroundAudioOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 封面url
    */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  /**
    * 音乐链接，目前支持的格式有 m4a, aac, mp3, wav
    */
  var dataUrl: js.UndefOr[String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 音乐标题
    */
  var title: js.UndefOr[String] = js.undefined
}

object GetBackgroundAudioOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    coverImgUrl: String = null,
    dataUrl: String = null,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined,
    title: String = null
  ): GetBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (coverImgUrl != null) __obj.updateDynamic("coverImgUrl")(coverImgUrl.asInstanceOf[js.Any])
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundAudioOptions]
  }
}

