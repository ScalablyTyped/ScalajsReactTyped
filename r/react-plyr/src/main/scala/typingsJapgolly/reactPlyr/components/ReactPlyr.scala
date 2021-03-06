package typingsJapgolly.reactPlyr.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactPlyr.AnonActive
import typingsJapgolly.reactPlyr.AnonControls
import typingsJapgolly.reactPlyr.AnonDefault
import typingsJapgolly.reactPlyr.AnonEnabled
import typingsJapgolly.reactPlyr.AnonFocused
import typingsJapgolly.reactPlyr.AnonKey
import typingsJapgolly.reactPlyr.AnonKind
import typingsJapgolly.reactPlyr.AnonOptions
import typingsJapgolly.reactPlyr.AnonSize
import typingsJapgolly.reactPlyr.mod.OnVolumeChangeParam
import typingsJapgolly.reactPlyr.mod.Props
import typingsJapgolly.reactPlyr.mod.default
import typingsJapgolly.reactPlyr.reactPlyrStrings.audio
import typingsJapgolly.reactPlyr.reactPlyrStrings.video
import typingsJapgolly.reactPlyr.reactPlyrStrings.vimeo
import typingsJapgolly.reactPlyr.reactPlyrStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlyr {
  def apply(
    autopause: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    blankVideo: String = null,
    captions: js.Array[AnonKind] = null,
    className: String = null,
    clickToPlay: js.UndefOr[Boolean] = js.undefined,
    controls: js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableContextMenu: js.UndefOr[Boolean] = js.undefined,
    displayDuration: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fullscreen: AnonEnabled = null,
    hideControls: js.UndefOr[Boolean] = js.undefined,
    iconPrefix: String = null,
    iconUrl: String = null,
    invertTime: js.UndefOr[Boolean] = js.undefined,
    keyboard: AnonFocused = null,
    loadSprite: js.UndefOr[Boolean] = js.undefined,
    loop: AnonActive = null,
    muted: js.UndefOr[Boolean] = js.undefined,
    onCaptionsDisabled: js.UndefOr[Callback] = js.undefined,
    onCaptionsEnabled: js.UndefOr[Callback] = js.undefined,
    onEnd: js.UndefOr[Callback] = js.undefined,
    onEnterFullscreen: js.UndefOr[Callback] = js.undefined,
    onExitFullscreen: js.UndefOr[Callback] = js.undefined,
    onLoadedData: js.UndefOr[Callback] = js.undefined,
    onPause: js.UndefOr[Callback] = js.undefined,
    onPlay: js.UndefOr[Callback] = js.undefined,
    onReady: /* player */ js.UndefOr[js.Any] => Callback = null,
    onSeeked: /* time */ js.UndefOr[Double] => Callback = null,
    onTimeUpdate: /* time */ js.UndefOr[Double] => Callback = null,
    onVolumeChange: /* params */ OnVolumeChangeParam => Callback = null,
    poster: String = null,
    quality: AnonDefault = null,
    ratio: String = null,
    resetOnEnd: js.UndefOr[Boolean] = js.undefined,
    seekTime: Int | Double = null,
    settings: js.Array[String] = null,
    sources: js.Array[AnonSize] = null,
    speed: AnonOptions = null,
    storage: AnonKey = null,
    title: String = null,
    toggleInvert: js.UndefOr[Boolean] = js.undefined,
    tooltips: AnonControls = null,
    `type`: youtube | vimeo | video | audio = null,
    url: String = null,
    videoId: String = null,
    volume: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autopause)) __obj.updateDynamic("autopause")(autopause.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (blankVideo != null) __obj.updateDynamic("blankVideo")(blankVideo.asInstanceOf[js.Any])
    if (captions != null) __obj.updateDynamic("captions")(captions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToPlay)) __obj.updateDynamic("clickToPlay")(clickToPlay.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableContextMenu)) __obj.updateDynamic("disableContextMenu")(disableContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDuration)) __obj.updateDynamic("displayDuration")(displayDuration.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fullscreen != null) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(hideControls)) __obj.updateDynamic("hideControls")(hideControls.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(invertTime)) __obj.updateDynamic("invertTime")(invertTime.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(loadSprite)) __obj.updateDynamic("loadSprite")(loadSprite.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    onCaptionsDisabled.foreach(p => __obj.updateDynamic("onCaptionsDisabled")(p.toJsFn))
    onCaptionsEnabled.foreach(p => __obj.updateDynamic("onCaptionsEnabled")(p.toJsFn))
    onEnd.foreach(p => __obj.updateDynamic("onEnd")(p.toJsFn))
    onEnterFullscreen.foreach(p => __obj.updateDynamic("onEnterFullscreen")(p.toJsFn))
    onExitFullscreen.foreach(p => __obj.updateDynamic("onExitFullscreen")(p.toJsFn))
    onLoadedData.foreach(p => __obj.updateDynamic("onLoadedData")(p.toJsFn))
    onPause.foreach(p => __obj.updateDynamic("onPause")(p.toJsFn))
    onPlay.foreach(p => __obj.updateDynamic("onPlay")(p.toJsFn))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* player */ js.UndefOr[js.Any]) => onReady(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: /* time */ js.UndefOr[scala.Double]) => onSeeked(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: /* time */ js.UndefOr[scala.Double]) => onTimeUpdate(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactPlyr.mod.OnVolumeChangeParam) => onVolumeChange(t0).runNow()))
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnEnd)) __obj.updateDynamic("resetOnEnd")(resetOnEnd.asInstanceOf[js.Any])
    if (seekTime != null) __obj.updateDynamic("seekTime")(seekTime.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleInvert)) __obj.updateDynamic("toggleInvert")(toggleInvert.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPlyr.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPlyr.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPlyr.mod.Props])(children: _*)
  }
  @JSImport("react-plyr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

