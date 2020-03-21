package typingsJapgolly.reactSound.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSound.mod.ReactSoundProps
import typingsJapgolly.reactSound.mod.default
import typingsJapgolly.reactSound.reactSoundStrings.PAUSED
import typingsJapgolly.reactSound.reactSoundStrings.PLAYING
import typingsJapgolly.reactSound.reactSoundStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSound {
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
    volume: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactSoundProps, default, Unit, ReactSoundProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSound.mod.ReactSoundProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSound.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSound.mod.ReactSoundProps])(children: _*)
  }
  @JSImport("react-sound", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

