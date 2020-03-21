package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** BackgroundAudioManager 实例，可通过 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 获取。
*
* **示例代码**
*
*
* ```js
const backgroundAudioManager = wx.getBackgroundAudioManager()
  
backgroundAudioManager.title = '此时此刻'
backgroundAudioManager.epname = '此时此刻'
backgroundAudioManager.singer = '许巍'
backgroundAudioManager.coverImgUrl = 'http://y.gtimg.cn/music/photo_new/T002R300x300M000003rsKF44GyaSk.jpg?max_age=2592000'
// 设置了 src 之后会自动播放
backgroundAudioManager.src = 'http://ws.stream.qqmusic.qq.com/M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&uin=346897220&vkey=6292F51E1E384E061FF02C31F716658E5C81F5594D561F2E88B854E81CAAB7806D5E4F103E55D33C16F3FAC506D1AB172DE8600B37E43FAD&fromtag=46'
``` */
trait BackgroundAudioManager extends js.Object {
  /** 音频已缓冲的时间，仅保证当前播放时间点到此时间点内容已缓冲。（只读） */
  var buffered: Double
  /** 封面图 URL，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。 */
  var coverImgUrl: String
  /** 当前音频的播放位置（单位：s），只有在有合法 src 时返回。（只读） */
  var currentTime: Double
  /** 当前音频的长度（单位：s），只有在有合法 src 时返回。（只读） */
  var duration: Double
  /** 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值。 */
  var epname: String
  /** 当前是否暂停或停止。（只读） */
  var paused: Boolean
  /** 音频协议。默认值为 'http'，设置 'hls' 可以支持播放 HLS 协议的直播音频。
    *
    * 最低基础库： `1.9.94` */
  var protocol: String
  /** 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值。 */
  var singer: String
  /** 音频的数据源（{% version('2.2.3') %} 开始支持云文件ID）。默认为空字符串，**当设置了新的 src 时，会自动开始播放**，目前支持的格式有 m4a, aac, mp3, wav。 */
  var src: String
  /** 音频开始播放的位置（单位：s）。 */
  var startTime: Double
  /** 音频标题，用于原生音频播放器音频标题（必填）。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。 */
  var title: String
  /** 页面链接，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值。 */
  var webUrl: String
  /** [BackgroundAudioManager.onCanplay(function callback)](BackgroundAudioManager.onCanplay.md)
    *
    * 监听背景音频进入可播放状态事件。但不保证后面可以流畅播放 */
  def onCanplay(/** 背景音频进入可播放状态事件的回调函数 */
  callback: BackgroundAudioManagerOnCanplayCallback): Unit
  /** [BackgroundAudioManager.onEnded(function callback)](BackgroundAudioManager.onEnded.md)
    *
    * 监听背景音频自然播放结束事件 */
  def onEnded(/** 背景音频自然播放结束事件的回调函数 */
  callback: BackgroundAudioManagerOnEndedCallback): Unit
  /** [BackgroundAudioManager.onError(function callback)](BackgroundAudioManager.onError.md)
    *
    * 监听背景音频播放错误事件 */
  def onError(/** 背景音频播放错误事件的回调函数 */
  callback: BackgroundAudioManagerOnErrorCallback): Unit
  /** [BackgroundAudioManager.onNext(function callback)](BackgroundAudioManager.onNext.md)
    *
    * 监听用户在系统音乐播放面板点击下一曲事件（仅iOS） */
  def onNext(/** 用户在系统音乐播放面板点击下一曲事件的回调函数 */
  callback: OnNextCallback): Unit
  /** [BackgroundAudioManager.onPause(function callback)](BackgroundAudioManager.onPause.md)
    *
    * 监听背景音频暂停事件 */
  def onPause(/** 背景音频暂停事件的回调函数 */
  callback: BackgroundAudioManagerOnPauseCallback): Unit
  /** [BackgroundAudioManager.onPlay(function callback)](BackgroundAudioManager.onPlay.md)
    *
    * 监听背景音频播放事件 */
  def onPlay(/** 背景音频播放事件的回调函数 */
  callback: BackgroundAudioManagerOnPlayCallback): Unit
  /** [BackgroundAudioManager.onPrev(function callback)](BackgroundAudioManager.onPrev.md)
    *
    * 监听用户在系统音乐播放面板点击上一曲事件（仅iOS） */
  def onPrev(/** 用户在系统音乐播放面板点击上一曲事件的回调函数 */
  callback: OnPrevCallback): Unit
  /** [BackgroundAudioManager.onSeeked(function callback)](BackgroundAudioManager.onSeeked.md)
    *
    * 监听背景音频完成跳转操作事件 */
  def onSeeked(/** 背景音频完成跳转操作事件的回调函数 */
  callback: BackgroundAudioManagerOnSeekedCallback): Unit
  /** [BackgroundAudioManager.onSeeking(function callback)](BackgroundAudioManager.onSeeking.md)
    *
    * 监听背景音频开始跳转操作事件 */
  def onSeeking(/** 背景音频开始跳转操作事件的回调函数 */
  callback: BackgroundAudioManagerOnSeekingCallback): Unit
  /** [BackgroundAudioManager.onStop(function callback)](BackgroundAudioManager.onStop.md)
    *
    * 监听背景音频停止事件 */
  def onStop(/** 背景音频停止事件的回调函数 */
  callback: BackgroundAudioManagerOnStopCallback): Unit
  /** [BackgroundAudioManager.onTimeUpdate(function callback)](BackgroundAudioManager.onTimeUpdate.md)
    *
    * 监听背景音频播放进度更新事件 */
  def onTimeUpdate(/** 背景音频播放进度更新事件的回调函数 */
  callback: BackgroundAudioManagerOnTimeUpdateCallback): Unit
  /** [BackgroundAudioManager.onWaiting(function callback)](BackgroundAudioManager.onWaiting.md)
    *
    * 监听音频加载中事件。当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(/** 音频加载中事件的回调函数 */
  callback: BackgroundAudioManagerOnWaitingCallback): Unit
  /** [BackgroundAudioManager.pause()](BackgroundAudioManager.pause.md)
    *
    * 暂停音乐 */
  def pause(): Unit
  /** [BackgroundAudioManager.play()](BackgroundAudioManager.play.md)
    *
    * 播放音乐 */
  def play(): Unit
  /** [BackgroundAudioManager.seek(number currentTime)](BackgroundAudioManager.seek.md)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转的位置，单位 s。精确到小数点后 3 位，即支持 ms 级别精确度 */
  currentTime: Double): Unit
  /** [BackgroundAudioManager.stop()](BackgroundAudioManager.stop.md)
    *
    * 停止音乐 */
  def stop(): Unit
}

object BackgroundAudioManager {
  @scala.inline
  def apply(
    buffered: Double,
    coverImgUrl: String,
    currentTime: Double,
    duration: Double,
    epname: String,
    onCanplay: BackgroundAudioManagerOnCanplayCallback => Callback,
    onEnded: BackgroundAudioManagerOnEndedCallback => Callback,
    onError: BackgroundAudioManagerOnErrorCallback => Callback,
    onNext: OnNextCallback => Callback,
    onPause: BackgroundAudioManagerOnPauseCallback => Callback,
    onPlay: BackgroundAudioManagerOnPlayCallback => Callback,
    onPrev: OnPrevCallback => Callback,
    onSeeked: BackgroundAudioManagerOnSeekedCallback => Callback,
    onSeeking: BackgroundAudioManagerOnSeekingCallback => Callback,
    onStop: BackgroundAudioManagerOnStopCallback => Callback,
    onTimeUpdate: BackgroundAudioManagerOnTimeUpdateCallback => Callback,
    onWaiting: BackgroundAudioManagerOnWaitingCallback => Callback,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    protocol: String,
    seek: Double => Callback,
    singer: String,
    src: String,
    startTime: Double,
    stop: Callback,
    title: String,
    webUrl: String
  ): BackgroundAudioManager = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any], coverImgUrl = coverImgUrl.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], epname = epname.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], singer = singer.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], webUrl = webUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("onCanplay")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnCanplayCallback) => onCanplay(t0).runNow()))
    __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnEndedCallback) => onEnded(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnErrorCallback) => onError(t0).runNow()))
    __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnNextCallback) => onNext(t0).runNow()))
    __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnPauseCallback) => onPause(t0).runNow()))
    __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnPlayCallback) => onPlay(t0).runNow()))
    __obj.updateDynamic("onPrev")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnPrevCallback) => onPrev(t0).runNow()))
    __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnSeekedCallback) => onSeeked(t0).runNow()))
    __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnSeekingCallback) => onSeeking(t0).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnStopCallback) => onStop(t0).runNow()))
    __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnTimeUpdateCallback) => onTimeUpdate(t0).runNow()))
    __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.BackgroundAudioManagerOnWaitingCallback) => onWaiting(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[BackgroundAudioManager]
  }
}

