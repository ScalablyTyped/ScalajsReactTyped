package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundAudioManager extends js.Object {
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲。 是 */
  var buffered: Double
  /** 封面图url，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。 */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回 */
  val currentTime: Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返回 */
  val duration: Double
  /** 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var epname: js.UndefOr[String] = js.undefined
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放 */
  val paused: Boolean
  /** 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var singer: js.UndefOr[String] = js.undefined
  /** 音频的数据源，默认为空字符串，当设置了新的 src 时，会自动开始播放 ，目前支持的格式有 m4a, aac, mp3, wav */
  var src: js.UndefOr[String] = js.undefined
  /** 音频开始播放的位置（单位：s） */
  var startTime: js.UndefOr[Double] = js.undefined
  /** 音频标题，用于做原生音频播放器音频标题。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。 */
  var title: js.UndefOr[String] = js.undefined
  /** 背景音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 暂停 */
  def pause(): Unit
  /** 播放 */
  def play(): Unit
  /** 跳转到指定位置，单位 s */
  def seek(position: Double): Unit
  /** 停止 */
  def stop(): Unit
}

object BackgroundAudioManager {
  @scala.inline
  def apply(
    buffered: Double,
    currentTime: Double,
    duration: Double,
    onCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onError: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    seek: Double => Callback,
    stop: Callback,
    coverImgUrl: String = null,
    epname: String = null,
    singer: String = null,
    src: String = null,
    startTime: Int | Double = null,
    title: String = null
  ): BackgroundAudioManager = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
    __obj.updateDynamic("onCanplay")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onCanplay(t0).runNow()))
    __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onEnded(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onError(t0).runNow()))
    __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onPause(t0).runNow()))
    __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onPlay(t0).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onStop(t0).runNow()))
    __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onTimeUpdate(t0).runNow()))
    __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onWaiting(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    if (coverImgUrl != null) __obj.updateDynamic("coverImgUrl")(coverImgUrl.asInstanceOf[js.Any])
    if (epname != null) __obj.updateDynamic("epname")(epname.asInstanceOf[js.Any])
    if (singer != null) __obj.updateDynamic("singer")(singer.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioManager]
  }
}

