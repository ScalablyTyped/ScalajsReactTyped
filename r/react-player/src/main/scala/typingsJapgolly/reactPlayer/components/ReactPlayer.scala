package typingsJapgolly.reactPlayer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsJapgolly.reactPlayer.AnonLoaded
import typingsJapgolly.reactPlayer.mod.Config
import typingsJapgolly.reactPlayer.mod.DailyMotionConfig
import typingsJapgolly.reactPlayer.mod.FacebookConfig
import typingsJapgolly.reactPlayer.mod.FileConfig
import typingsJapgolly.reactPlayer.mod.ReactPlayerProps
import typingsJapgolly.reactPlayer.mod.SoundCloudConfig
import typingsJapgolly.reactPlayer.mod.SourceProps
import typingsJapgolly.reactPlayer.mod.VimeoConfig
import typingsJapgolly.reactPlayer.mod.WistiaConfig
import typingsJapgolly.reactPlayer.mod.YouTubeConfig
import typingsJapgolly.reactPlayer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlayer {
  def apply(
    StringDictionary: /* otherProps */ StringDictionary[js.Any] = null,
    config: Config = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    dailymotionConfig: DailyMotionConfig = null,
    facebookConfig: FacebookConfig = null,
    fileConfig: FileConfig = null,
    height: String | Double = null,
    light: Boolean | String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    onBuffer: js.UndefOr[Callback] = js.undefined,
    onBufferEnd: js.UndefOr[Callback] = js.undefined,
    onDisablePIP: js.UndefOr[Callback] = js.undefined,
    onDuration: /* duration */ Double => Callback = null,
    onEnablePIP: js.UndefOr[Callback] = js.undefined,
    onEnded: js.UndefOr[Callback] = js.undefined,
    onError: (/* error */ js.Any, /* data */ js.UndefOr[js.Any], /* hlsInstance */ js.UndefOr[js.Any], /* hlsGlobal */ js.UndefOr[js.Any]) => Callback = null,
    onPause: js.UndefOr[Callback] = js.undefined,
    onPlay: js.UndefOr[Callback] = js.undefined,
    onProgress: /* state */ AnonLoaded => Callback = null,
    onReady: js.UndefOr[Callback] = js.undefined,
    onSeek: /* seconds */ Double => Callback = null,
    onStart: js.UndefOr[Callback] = js.undefined,
    pip: js.UndefOr[Boolean] = js.undefined,
    playbackRate: Int | Double = null,
    playing: js.UndefOr[Boolean] = js.undefined,
    playsinline: js.UndefOr[Boolean] = js.undefined,
    progressInterval: Int | Double = null,
    soundcloudConfig: SoundCloudConfig = null,
    style: js.Object = null,
    url: String | (js.Array[SourceProps | String]) | MediaStream = null,
    vimeoConfig: VimeoConfig = null,
    volume: Int | Double = null,
    width: String | Double = null,
    wistiaConfig: WistiaConfig = null,
    wrapper: js.Any = null,
    youtubeConfig: YouTubeConfig = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactPlayerProps, default, Unit, ReactPlayerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (dailymotionConfig != null) __obj.updateDynamic("dailymotionConfig")(dailymotionConfig.asInstanceOf[js.Any])
    if (facebookConfig != null) __obj.updateDynamic("facebookConfig")(facebookConfig.asInstanceOf[js.Any])
    if (fileConfig != null) __obj.updateDynamic("fileConfig")(fileConfig.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    onBuffer.foreach(p => __obj.updateDynamic("onBuffer")(p.toJsFn))
    onBufferEnd.foreach(p => __obj.updateDynamic("onBufferEnd")(p.toJsFn))
    onDisablePIP.foreach(p => __obj.updateDynamic("onDisablePIP")(p.toJsFn))
    if (onDuration != null) __obj.updateDynamic("onDuration")(js.Any.fromFunction1((t0: /* duration */ scala.Double) => onDuration(t0).runNow()))
    onEnablePIP.foreach(p => __obj.updateDynamic("onEnablePIP")(p.toJsFn))
    onEnded.foreach(p => __obj.updateDynamic("onEnded")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction4((t0: /* error */ js.Any, t1: /* data */ js.UndefOr[js.Any], t2: /* hlsInstance */ js.UndefOr[js.Any], t3: /* hlsGlobal */ js.UndefOr[js.Any]) => onError(t0, t1, t2, t3).runNow()))
    onPause.foreach(p => __obj.updateDynamic("onPause")(p.toJsFn))
    onPlay.foreach(p => __obj.updateDynamic("onPlay")(p.toJsFn))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.reactPlayer.AnonLoaded) => onProgress(t0).runNow()))
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    if (onSeek != null) __obj.updateDynamic("onSeek")(js.Any.fromFunction1((t0: /* seconds */ scala.Double) => onSeek(t0).runNow()))
    onStart.foreach(p => __obj.updateDynamic("onStart")(p.toJsFn))
    if (!js.isUndefined(pip)) __obj.updateDynamic("pip")(pip.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing.asInstanceOf[js.Any])
    if (!js.isUndefined(playsinline)) __obj.updateDynamic("playsinline")(playsinline.asInstanceOf[js.Any])
    if (progressInterval != null) __obj.updateDynamic("progressInterval")(progressInterval.asInstanceOf[js.Any])
    if (soundcloudConfig != null) __obj.updateDynamic("soundcloudConfig")(soundcloudConfig.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (vimeoConfig != null) __obj.updateDynamic("vimeoConfig")(vimeoConfig.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wistiaConfig != null) __obj.updateDynamic("wistiaConfig")(wistiaConfig.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    if (youtubeConfig != null) __obj.updateDynamic("youtubeConfig")(youtubeConfig.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPlayer.mod.ReactPlayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPlayer.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPlayer.mod.ReactPlayerProps])(children: _*)
  }
  @JSImport("react-player", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

