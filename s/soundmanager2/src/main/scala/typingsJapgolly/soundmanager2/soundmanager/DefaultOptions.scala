package typingsJapgolly.soundmanager2.soundmanager

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[Double | Null] = js.undefined
  var loops: js.UndefOr[Double] = js.undefined
  var multiShot: js.UndefOr[Boolean] = js.undefined
  var multiShotEvents: js.UndefOr[Boolean] = js.undefined
  var onerror: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onfinish: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onid3: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onload: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onpause: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onplay: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onposition: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onresume: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onstop: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var pan: js.UndefOr[Double] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Double | Null] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[Double | Null] = js.undefined
  var `type`: js.UndefOr[String | Null] = js.undefined
  var usePolicyFile: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var whileloading: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var whileplaying: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    from: Int | Double = null,
    loops: Int | Double = null,
    multiShot: js.UndefOr[Boolean] = js.undefined,
    multiShotEvents: js.UndefOr[Boolean] = js.undefined,
    onerror: js.UndefOr[Callback] = js.undefined,
    onfinish: js.UndefOr[Callback] = js.undefined,
    onid3: js.UndefOr[Callback] = js.undefined,
    onload: js.UndefOr[Callback] = js.undefined,
    onpause: js.UndefOr[Callback] = js.undefined,
    onplay: js.UndefOr[Callback] = js.undefined,
    onposition: js.UndefOr[Callback] = js.undefined,
    onresume: js.UndefOr[Callback] = js.undefined,
    onstop: js.UndefOr[Callback] = js.undefined,
    pan: Int | Double = null,
    playbackRate: Int | Double = null,
    position: Int | Double = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    to: Int | Double = null,
    `type`: String = null,
    usePolicyFile: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null,
    whileloading: js.UndefOr[Callback] = js.undefined,
    whileplaying: js.UndefOr[Callback] = js.undefined
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loops != null) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (!js.isUndefined(multiShot)) __obj.updateDynamic("multiShot")(multiShot.asInstanceOf[js.Any])
    if (!js.isUndefined(multiShotEvents)) __obj.updateDynamic("multiShotEvents")(multiShotEvents.asInstanceOf[js.Any])
    onerror.foreach(p => __obj.updateDynamic("onerror")(p.toJsFn))
    onfinish.foreach(p => __obj.updateDynamic("onfinish")(p.toJsFn))
    onid3.foreach(p => __obj.updateDynamic("onid3")(p.toJsFn))
    onload.foreach(p => __obj.updateDynamic("onload")(p.toJsFn))
    onpause.foreach(p => __obj.updateDynamic("onpause")(p.toJsFn))
    onplay.foreach(p => __obj.updateDynamic("onplay")(p.toJsFn))
    onposition.foreach(p => __obj.updateDynamic("onposition")(p.toJsFn))
    onresume.foreach(p => __obj.updateDynamic("onresume")(p.toJsFn))
    onstop.foreach(p => __obj.updateDynamic("onstop")(p.toJsFn))
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(usePolicyFile)) __obj.updateDynamic("usePolicyFile")(usePolicyFile.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    whileloading.foreach(p => __obj.updateDynamic("whileloading")(p.toJsFn))
    whileplaying.foreach(p => __obj.updateDynamic("whileplaying")(p.toJsFn))
    __obj.asInstanceOf[DefaultOptions]
  }
}

