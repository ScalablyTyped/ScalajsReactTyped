package typingsJapgolly.reactPlayer.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsJapgolly.reactPlayer.AnonLoaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPlayerProps
  extends /* otherProps */ StringDictionary[js.Any] {
  var config: js.UndefOr[Config] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var dailymotionConfig: js.UndefOr[DailyMotionConfig] = js.undefined
  var facebookConfig: js.UndefOr[FacebookConfig] = js.undefined
  var fileConfig: js.UndefOr[FileConfig] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var light: js.UndefOr[Boolean | String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var onBuffer: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBufferEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDisablePIP: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDuration: js.UndefOr[js.Function1[/* duration */ Double, Unit]] = js.undefined
  var onEnablePIP: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function4[
      /* error */ js.Any, 
      /* data */ js.UndefOr[js.Any], 
      /* hlsInstance */ js.UndefOr[js.Any], 
      /* hlsGlobal */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* state */ AnonLoaded, Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function1[/* seconds */ Double, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pip: js.UndefOr[Boolean] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
  var playing: js.UndefOr[Boolean] = js.undefined
  var playsinline: js.UndefOr[Boolean] = js.undefined
  var progressInterval: js.UndefOr[Double] = js.undefined
  var soundcloudConfig: js.UndefOr[SoundCloudConfig] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[String | (js.Array[SourceProps | String]) | MediaStream] = js.undefined
  var vimeoConfig: js.UndefOr[VimeoConfig] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
  var wistiaConfig: js.UndefOr[WistiaConfig] = js.undefined
  var wrapper: js.UndefOr[js.Any] = js.undefined
  var youtubeConfig: js.UndefOr[YouTubeConfig] = js.undefined
}

object ReactPlayerProps {
  @scala.inline
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
    youtubeConfig: YouTubeConfig = null
  ): ReactPlayerProps = {
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
    __obj.asInstanceOf[ReactPlayerProps]
  }
}

