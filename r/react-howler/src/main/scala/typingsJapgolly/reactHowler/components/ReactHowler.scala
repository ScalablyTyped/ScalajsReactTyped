package typingsJapgolly.reactHowler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactHowler.mod.Props
import typingsJapgolly.reactHowler.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHowler {
  def apply(
    src: String | js.Array[String],
    format: js.Array[String] = null,
    html5: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    onEnd: js.UndefOr[Callback] = js.undefined,
    onLoad: js.UndefOr[Callback] = js.undefined,
    onLoadError: /* id */ Double => Callback = null,
    onPause: js.UndefOr[Callback] = js.undefined,
    onPlay: /* id */ Double => Callback = null,
    onStop: /* id */ Double => Callback = null,
    onVolume: /* id */ Double => Callback = null,
    playing: js.UndefOr[Boolean] = js.undefined,
    preload: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    onEnd.foreach(p => __obj.updateDynamic("onEnd")(p.toJsFn))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* id */ scala.Double) => onLoadError(t0).runNow()))
    onPause.foreach(p => __obj.updateDynamic("onPause")(p.toJsFn))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: /* id */ scala.Double) => onPlay(t0).runNow()))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: /* id */ scala.Double) => onStop(t0).runNow()))
    if (onVolume != null) __obj.updateDynamic("onVolume")(js.Any.fromFunction1((t0: /* id */ scala.Double) => onVolume(t0).runNow()))
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHowler.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHowler.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHowler.mod.Props])(children: _*)
  }
  @JSImport("react-howler", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

