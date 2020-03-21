package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderManager extends js.Object {
  /** [RecorderManager.onError(function callback)](RecorderManager.onError.md)
    *
    * 监听录音错误事件 */
  def onError(/** 录音错误事件的回调函数 */
  callback: RecorderManagerOnErrorCallback): Unit
  /** [RecorderManager.onFrameRecorded(function callback)](RecorderManager.onFrameRecorded.md)
    *
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。 */
  def onFrameRecorded(/** 已录制完指定帧大小的文件事件的回调函数 */
  callback: OnFrameRecordedCallback): Unit
  /** [RecorderManager.onInterruptionBegin(function callback)](RecorderManager.onInterruptionBegin.md)
    *
    * 监听录音因为受到系统占用而被中断开始事件。以下场景会触发此事件：微信语音聊天、微信视频聊天。此事件触发后，录音会被暂停。pause 事件在此事件后触发
    *
    * 最低基础库： `2.3.0` */
  def onInterruptionBegin(/** 录音因为受到系统占用而被中断开始事件的回调函数 */
  callback: OnInterruptionBeginCallback): Unit
  /** [RecorderManager.onInterruptionEnd(function callback)](RecorderManager.onInterruptionEnd.md)
    *
    * 监听录音中断结束事件。在收到 interruptionBegin 事件之后，小程序内所有录音会暂停，收到此事件之后才可再次录音成功。
    *
    * 最低基础库： `2.3.0` */
  def onInterruptionEnd(/** 录音中断结束事件的回调函数 */
  callback: OnInterruptionEndCallback): Unit
  /** [RecorderManager.onPause(function callback)](RecorderManager.onPause.md)
    *
    * 监听录音暂停事件 */
  def onPause(/** 录音暂停事件的回调函数 */
  callback: RecorderManagerOnPauseCallback): Unit
  /** [RecorderManager.onResume(function callback)](RecorderManager.onResume.md)
    *
    * 监听录音继续事件 */
  def onResume(/** 录音继续事件的回调函数 */
  callback: OnResumeCallback): Unit
  /** [RecorderManager.onStart(function callback)](RecorderManager.onStart.md)
    *
    * 监听录音开始事件 */
  def onStart(/** 录音开始事件的回调函数 */
  callback: OnStartCallback): Unit
  /** [RecorderManager.onStop(function callback)](RecorderManager.onStop.md)
    *
    * 监听录音结束事件 */
  def onStop(/** 录音结束事件的回调函数 */
  callback: RecorderManagerOnStopCallback): Unit
  /** [RecorderManager.pause()](RecorderManager.pause.md)
    *
    * 暂停录音 */
  def pause(): Unit
  /** [RecorderManager.resume()](RecorderManager.resume.md)
    *
    * 继续录音 */
  def resume(): Unit
  /** [RecorderManager.start(Object object)](RecorderManager.start.md)
    *
    * 开始录音
    *
    * **采样率与编码码率限制**
    *
    *
    *  每种采样率有对应的编码码率范围有效值，设置不合法的采样率或编码码率会导致录音失败，具体对应关系如下表。
    *
    * | 采样率 | 编码码率       |
    * | ------ | -------------- |
    * | 8000   | 16000 ~ 48000  |
    * | 11025  | 16000 ~ 48000  |
    * | 12000  | 24000 ~ 64000  |
    * | 16000  | 24000 ~ 96000  |
    * | 22050  | 32000 ~ 128000 |
    * | 24000  | 32000 ~ 128000 |
    * | 32000  | 48000 ~ 192000 |
    * | 44100  | 64000 ~ 320000 |
    * | 48000  | 64000 ~ 320000 | */
  def start(option: RecorderManagerStartOption): Unit
  /** [RecorderManager.stop()](RecorderManager.stop.md)
    *
    * 停止录音 */
  def stop(): Unit
}

object RecorderManager {
  @scala.inline
  def apply(
    onError: RecorderManagerOnErrorCallback => Callback,
    onFrameRecorded: OnFrameRecordedCallback => Callback,
    onInterruptionBegin: OnInterruptionBeginCallback => Callback,
    onInterruptionEnd: OnInterruptionEndCallback => Callback,
    onPause: RecorderManagerOnPauseCallback => Callback,
    onResume: OnResumeCallback => Callback,
    onStart: OnStartCallback => Callback,
    onStop: RecorderManagerOnStopCallback => Callback,
    pause: Callback,
    resume: Callback,
    start: RecorderManagerStartOption => Callback,
    stop: Callback
  ): RecorderManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.RecorderManagerOnErrorCallback) => onError(t0).runNow()))
    __obj.updateDynamic("onFrameRecorded")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnFrameRecordedCallback) => onFrameRecorded(t0).runNow()))
    __obj.updateDynamic("onInterruptionBegin")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnInterruptionBeginCallback) => onInterruptionBegin(t0).runNow()))
    __obj.updateDynamic("onInterruptionEnd")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnInterruptionEndCallback) => onInterruptionEnd(t0).runNow()))
    __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.RecorderManagerOnPauseCallback) => onPause(t0).runNow()))
    __obj.updateDynamic("onResume")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnResumeCallback) => onResume(t0).runNow()))
    __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnStartCallback) => onStart(t0).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.RecorderManagerOnStopCallback) => onStop(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.RecorderManagerStartOption) => start(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[RecorderManager]
  }
}

