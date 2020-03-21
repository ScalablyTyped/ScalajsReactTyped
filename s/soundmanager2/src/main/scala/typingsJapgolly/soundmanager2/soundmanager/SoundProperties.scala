package typingsJapgolly.soundmanager2.soundmanager

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundProperties extends DefaultOptions {
  var id: js.UndefOr[String] = js.undefined
  var url: String
}

object SoundProperties {
  @scala.inline
  def apply(
    url: String,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    from: Int | Double = null,
    id: String = null,
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
  ): SoundProperties = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[SoundProperties]
  }
}

