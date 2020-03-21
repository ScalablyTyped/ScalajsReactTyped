package typingsJapgolly.howler

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHowlProperties extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Array[String] | String] = js.undefined
  var html5: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var mute: js.UndefOr[Boolean] = js.undefined
  var onend: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onfade: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onload: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onloaderror: js.UndefOr[js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]] = js.undefined
  var onmute: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onpause: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onplay: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onplayerror: js.UndefOr[js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]] = js.undefined
  var onrate: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onseek: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onstop: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onunlock: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onvolume: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var pool: js.UndefOr[Double] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var sprite: js.UndefOr[IHowlSoundSpriteDefinition] = js.undefined
  var src: String | js.Array[String]
  var volume: js.UndefOr[Double] = js.undefined
  var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
}

object IHowlProperties {
  @scala.inline
  def apply(
    src: String | js.Array[String],
    autoplay: js.UndefOr[Boolean] = js.undefined,
    format: js.Array[String] | String = null,
    html5: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    onend: /* soundId */ Double => Callback = null,
    onfade: /* soundId */ Double => Callback = null,
    onload: js.UndefOr[Callback] = js.undefined,
    onloaderror: (/* soundId */ Double, /* error */ js.Any) => Callback = null,
    onmute: /* soundId */ Double => Callback = null,
    onpause: /* soundId */ Double => Callback = null,
    onplay: /* soundId */ Double => Callback = null,
    onplayerror: (/* soundId */ Double, /* error */ js.Any) => Callback = null,
    onrate: /* soundId */ Double => Callback = null,
    onseek: /* soundId */ Double => Callback = null,
    onstop: /* soundId */ Double => Callback = null,
    onunlock: /* soundId */ Double => Callback = null,
    onvolume: /* soundId */ Double => Callback = null,
    pool: Int | Double = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    rate: Int | Double = null,
    sprite: IHowlSoundSpriteDefinition = null,
    volume: Int | Double = null,
    xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  ): IHowlProperties = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (onend != null) __obj.updateDynamic("onend")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onend(t0).runNow()))
    if (onfade != null) __obj.updateDynamic("onfade")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onfade(t0).runNow()))
    onload.foreach(p => __obj.updateDynamic("onload")(p.toJsFn))
    if (onloaderror != null) __obj.updateDynamic("onloaderror")(js.Any.fromFunction2((t0: /* soundId */ scala.Double, t1: /* error */ js.Any) => onloaderror(t0, t1).runNow()))
    if (onmute != null) __obj.updateDynamic("onmute")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onmute(t0).runNow()))
    if (onpause != null) __obj.updateDynamic("onpause")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onpause(t0).runNow()))
    if (onplay != null) __obj.updateDynamic("onplay")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onplay(t0).runNow()))
    if (onplayerror != null) __obj.updateDynamic("onplayerror")(js.Any.fromFunction2((t0: /* soundId */ scala.Double, t1: /* error */ js.Any) => onplayerror(t0, t1).runNow()))
    if (onrate != null) __obj.updateDynamic("onrate")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onrate(t0).runNow()))
    if (onseek != null) __obj.updateDynamic("onseek")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onseek(t0).runNow()))
    if (onstop != null) __obj.updateDynamic("onstop")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onstop(t0).runNow()))
    if (onunlock != null) __obj.updateDynamic("onunlock")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onunlock(t0).runNow()))
    if (onvolume != null) __obj.updateDynamic("onvolume")(js.Any.fromFunction1((t0: /* soundId */ scala.Double) => onvolume(t0).runNow()))
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHowlProperties]
  }
}

