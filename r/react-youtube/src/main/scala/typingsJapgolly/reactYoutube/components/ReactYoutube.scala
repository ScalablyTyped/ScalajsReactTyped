package typingsJapgolly.reactYoutube.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactYoutube.AnonData
import typingsJapgolly.reactYoutube.AnonDataTarget
import typingsJapgolly.reactYoutube.AnonTarget
import typingsJapgolly.reactYoutube.mod.Options
import typingsJapgolly.reactYoutube.mod.YouTubeProps
import typingsJapgolly.reactYoutube.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactYoutube {
  def apply(
    className: String = null,
    containerClassName: String = null,
    id: String = null,
    onEnd: /* event */ AnonData => Callback = null,
    onError: /* event */ AnonData => Callback = null,
    onPause: /* event */ AnonData => Callback = null,
    onPlay: /* event */ AnonData => Callback = null,
    onPlaybackQualityChange: /* event */ AnonDataTarget => Callback = null,
    onPlaybackRateChange: /* event */ AnonData => Callback = null,
    onReady: /* event */ AnonTarget => Callback = null,
    onStateChange: /* event */ AnonData => Callback = null,
    opts: Options = null,
    videoId: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[YouTubeProps, default, Unit, YouTubeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactYoutube.AnonData) => onEnd(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactYoutube.AnonData) => onError(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactYoutube.AnonData) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactYoutube.AnonData) => onPlay(t0).runNow()))
    if (onPlaybackQualityChange != null) __obj.updateDynamic("onPlaybackQualityChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactYoutube.AnonDataTarget) => onPlaybackQualityChange(t0).runNow()))
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactYoutube.AnonData) => onPlaybackRateChange(t0).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactYoutube.AnonTarget) => onReady(t0).runNow()))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactYoutube.AnonData) => onStateChange(t0).runNow()))
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactYoutube.mod.YouTubeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactYoutube.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactYoutube.mod.YouTubeProps])(children: _*)
  }
  @JSImport("react-youtube", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

