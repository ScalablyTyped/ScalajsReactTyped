package typingsJapgolly.reactNativeVideoPlayer.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeVideoPlayer.AnonControlButton
import typingsJapgolly.reactNativeVideoPlayer.AnonUri
import typingsJapgolly.reactNativeVideoPlayer.mod.VideoPlayerProps
import typingsJapgolly.reactNativeVideoPlayer.mod.default
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.contain
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.cover
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.none
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeVideoPlayer {
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    controlsTimeout: Int | Double = null,
    customStyles: AnonControlButton = null,
    defaultMuted: js.UndefOr[Boolean] = js.undefined,
    disableControlsAutoHide: js.UndefOr[Boolean] = js.undefined,
    disableFullscreen: js.UndefOr[Boolean] = js.undefined,
    disableSeek: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    endThumbnail: ImageSourcePropType = null,
    endWithThumbnail: js.UndefOr[Boolean] = js.undefined,
    fullScreenOnLongPress: js.UndefOr[Boolean] = js.undefined,
    hideControlsOnStart: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    onEnd: /* event */ js.Any => CallbackTo[js.Any] = null,
    onHideControls: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onLoad: /* event */ js.Any => CallbackTo[js.Any] = null,
    onMutePress: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onPlayPress: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onProgress: /* event */ js.Any => CallbackTo[js.Any] = null,
    onShowControls: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onStart: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    pauseOnPress: js.UndefOr[Boolean] = js.undefined,
    paused: js.UndefOr[Boolean] = js.undefined,
    resizeMode: stretch | contain | cover | none = null,
    style: StyleProp[ViewStyle] = null,
    thumbnail: ImageSourcePropType = null,
    video: AnonUri | Double = null,
    videoHeight: Int | Double = null,
    videoWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[VideoPlayerProps, default, Unit, VideoPlayerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (controlsTimeout != null) __obj.updateDynamic("controlsTimeout")(controlsTimeout.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMuted)) __obj.updateDynamic("defaultMuted")(defaultMuted.asInstanceOf[js.Any])
    if (!js.isUndefined(disableControlsAutoHide)) __obj.updateDynamic("disableControlsAutoHide")(disableControlsAutoHide.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreen)) __obj.updateDynamic("disableFullscreen")(disableFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSeek)) __obj.updateDynamic("disableSeek")(disableSeek.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endThumbnail != null) __obj.updateDynamic("endThumbnail")(endThumbnail.asInstanceOf[js.Any])
    if (!js.isUndefined(endWithThumbnail)) __obj.updateDynamic("endWithThumbnail")(endWithThumbnail.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreenOnLongPress)) __obj.updateDynamic("fullScreenOnLongPress")(fullScreenOnLongPress.asInstanceOf[js.Any])
    if (!js.isUndefined(hideControlsOnStart)) __obj.updateDynamic("hideControlsOnStart")(hideControlsOnStart.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: /* event */ js.Any) => onEnd(t0).runNow()))
    onHideControls.foreach(p => __obj.updateDynamic("onHideControls")(p.toJsFn))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ js.Any) => onLoad(t0).runNow()))
    onMutePress.foreach(p => __obj.updateDynamic("onMutePress")(p.toJsFn))
    onPlayPress.foreach(p => __obj.updateDynamic("onPlayPress")(p.toJsFn))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* event */ js.Any) => onProgress(t0).runNow()))
    onShowControls.foreach(p => __obj.updateDynamic("onShowControls")(p.toJsFn))
    onStart.foreach(p => __obj.updateDynamic("onStart")(p.toJsFn))
    if (!js.isUndefined(pauseOnPress)) __obj.updateDynamic("pauseOnPress")(pauseOnPress.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoHeight != null) __obj.updateDynamic("videoHeight")(videoHeight.asInstanceOf[js.Any])
    if (videoWidth != null) __obj.updateDynamic("videoWidth")(videoWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeVideoPlayer.mod.VideoPlayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeVideoPlayer.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeVideoPlayer.mod.VideoPlayerProps])(children: _*)
  }
  @JSImport("react-native-video-player", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

