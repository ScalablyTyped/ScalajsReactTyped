package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
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
import typingsJapgolly.gestalt.mod.VideoProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Video {
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
    preload: auto | metadata | none = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[VideoProps, typingsJapgolly.gestalt.mod.Video, Unit, VideoProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.VideoProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Video](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.VideoProps])(children: _*)
  }
  @JSImport("gestalt", "Video")
  @js.native
  object componentImport extends js.Object
  
}

