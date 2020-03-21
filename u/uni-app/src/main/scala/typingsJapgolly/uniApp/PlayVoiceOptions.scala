package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayVoiceOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * original 原图，compressed 压缩图，默认二者都有
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要播放的语音文件的文件路径
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PlayVoiceOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    duration: Int | Double = null,
    fail: js.UndefOr[Callback] = js.undefined,
    filePath: String = null,
    success: js.UndefOr[Callback] = js.undefined
  ): PlayVoiceOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[PlayVoiceOptions]
  }
}

