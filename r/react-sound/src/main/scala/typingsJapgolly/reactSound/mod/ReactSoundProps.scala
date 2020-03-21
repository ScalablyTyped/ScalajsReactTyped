package typingsJapgolly.reactSound.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSound.reactSoundStrings.PAUSED
import typingsJapgolly.reactSound.reactSoundStrings.PLAYING
import typingsJapgolly.reactSound.reactSoundStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSoundProps extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var onBufferChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFinishedPlaying: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoading: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlaying: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onResume: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var playFromPosition: js.UndefOr[Double] = js.undefined
  var playStatus: PLAYING | STOPPED | PAUSED
  var playbackRate: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var url: String
  var volume: js.UndefOr[Double] = js.undefined
}

object ReactSoundProps {
  @scala.inline
  def apply(
    playStatus: PLAYING | STOPPED | PAUSED,
    url: String,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onBufferChange: js.UndefOr[Callback] = js.undefined,
    onError: js.UndefOr[Callback] = js.undefined,
    onFinishedPlaying: js.UndefOr[Callback] = js.undefined,
    onLoad: js.UndefOr[Callback] = js.undefined,
    onLoading: js.UndefOr[Callback] = js.undefined,
    onPause: js.UndefOr[Callback] = js.undefined,
    onPlaying: js.UndefOr[Callback] = js.undefined,
    onResume: js.UndefOr[Callback] = js.undefined,
    onStop: js.UndefOr[Callback] = js.undefined,
    playFromPosition: Int | Double = null,
    playbackRate: Int | Double = null,
    position: Int | Double = null,
    volume: Int | Double = null
  ): ReactSoundProps = {
    val __obj = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    onBufferChange.foreach(p => __obj.updateDynamic("onBufferChange")(p.toJsFn))
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    onFinishedPlaying.foreach(p => __obj.updateDynamic("onFinishedPlaying")(p.toJsFn))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    onLoading.foreach(p => __obj.updateDynamic("onLoading")(p.toJsFn))
    onPause.foreach(p => __obj.updateDynamic("onPause")(p.toJsFn))
    onPlaying.foreach(p => __obj.updateDynamic("onPlaying")(p.toJsFn))
    onResume.foreach(p => __obj.updateDynamic("onResume")(p.toJsFn))
    onStop.foreach(p => __obj.updateDynamic("onStop")(p.toJsFn))
    if (playFromPosition != null) __obj.updateDynamic("playFromPosition")(playFromPosition.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSoundProps]
  }
}

