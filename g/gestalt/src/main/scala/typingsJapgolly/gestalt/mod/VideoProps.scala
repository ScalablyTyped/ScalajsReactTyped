package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.Anon2
import typingsJapgolly.gestalt.Anon3
import typingsJapgolly.gestalt.AnonDuration
import typingsJapgolly.gestalt.AnonFullscreen
import typingsJapgolly.gestalt.AnonLoaded
import typingsJapgolly.gestalt.AnonSrc
import typingsJapgolly.gestalt.AnonTime
import typingsJapgolly.gestalt.AnonVolume
import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.metadata
import typingsJapgolly.gestalt.gestaltStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProps extends js.Object {
  var accessibilityMaximizeLabel: js.UndefOr[String] = js.undefined
  var accessibilityMinimizeLabel: js.UndefOr[String] = js.undefined
  var accessibilityMuteLabel: js.UndefOr[String] = js.undefined
  var accessibilityPauseLabel: js.UndefOr[String] = js.undefined
  var accessibilityPlayLabel: js.UndefOr[String] = js.undefined
  var accessibilityUnmuteLabel: js.UndefOr[String] = js.undefined
  var aspectRatio: Double
  var captions: String
  var controls: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var onDurationChange: js.UndefOr[js.Function1[/* args */ AnonDuration, Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function1[/* args */ Anon2, Unit]] = js.undefined
  var onFullscreenChange: js.UndefOr[js.Function1[/* args */ AnonFullscreen, Unit]] = js.undefined
  var onLoadedChange: js.UndefOr[js.Function1[/* args */ AnonLoaded, Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* args */ Anon3, Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* args */ Anon3, Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* args */ Anon2, Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function1[/* args */ Anon2, Unit]] = js.undefined
  var onTimeChange: js.UndefOr[js.Function1[/* args */ AnonTime, Unit]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* args */ AnonVolume, Unit]] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
  var playing: js.UndefOr[Boolean] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[auto | metadata | none] = js.undefined
  var src: String | js.Array[AnonSrc]
  var volume: Double
}

object VideoProps {
  @scala.inline
  def apply(
    aspectRatio: Double,
    captions: String,
    src: String | js.Array[AnonSrc],
    volume: Double,
    accessibilityMaximizeLabel: String = null,
    accessibilityMinimizeLabel: String = null,
    accessibilityMuteLabel: String = null,
    accessibilityPauseLabel: String = null,
    accessibilityPlayLabel: String = null,
    accessibilityUnmuteLabel: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onDurationChange: /* args */ AnonDuration => Callback = null,
    onEnded: /* args */ Anon2 => Callback = null,
    onFullscreenChange: /* args */ AnonFullscreen => Callback = null,
    onLoadedChange: /* args */ AnonLoaded => Callback = null,
    onPause: /* args */ Anon3 => Callback = null,
    onPlay: /* args */ Anon3 => Callback = null,
    onReady: /* args */ Anon2 => Callback = null,
    onSeek: /* args */ Anon2 => Callback = null,
    onTimeChange: /* args */ AnonTime => Callback = null,
    onVolumeChange: /* args */ AnonVolume => Callback = null,
    playbackRate: Int | Double = null,
    playing: js.UndefOr[Boolean] = js.undefined,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    preload: auto | metadata | none = null
  ): VideoProps = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    if (accessibilityMaximizeLabel != null) __obj.updateDynamic("accessibilityMaximizeLabel")(accessibilityMaximizeLabel.asInstanceOf[js.Any])
    if (accessibilityMinimizeLabel != null) __obj.updateDynamic("accessibilityMinimizeLabel")(accessibilityMinimizeLabel.asInstanceOf[js.Any])
    if (accessibilityMuteLabel != null) __obj.updateDynamic("accessibilityMuteLabel")(accessibilityMuteLabel.asInstanceOf[js.Any])
    if (accessibilityPauseLabel != null) __obj.updateDynamic("accessibilityPauseLabel")(accessibilityPauseLabel.asInstanceOf[js.Any])
    if (accessibilityPlayLabel != null) __obj.updateDynamic("accessibilityPlayLabel")(accessibilityPlayLabel.asInstanceOf[js.Any])
    if (accessibilityUnmuteLabel != null) __obj.updateDynamic("accessibilityUnmuteLabel")(accessibilityUnmuteLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonDuration) => onDurationChange(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.Anon2) => onEnded(t0).runNow()))
    if (onFullscreenChange != null) __obj.updateDynamic("onFullscreenChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonFullscreen) => onFullscreenChange(t0).runNow()))
    if (onLoadedChange != null) __obj.updateDynamic("onLoadedChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonLoaded) => onLoadedChange(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.Anon3) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.Anon3) => onPlay(t0).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.Anon2) => onReady(t0).runNow()))
    if (onSeek != null) __obj.updateDynamic("onSeek")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.Anon2) => onSeek(t0).runNow()))
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonTime) => onTimeChange(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonVolume) => onVolumeChange(t0).runNow()))
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
}

