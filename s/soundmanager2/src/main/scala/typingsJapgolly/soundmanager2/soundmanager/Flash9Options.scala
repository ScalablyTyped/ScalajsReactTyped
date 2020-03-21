package typingsJapgolly.soundmanager2.soundmanager

import japgolly.scalajs.react.Callback
import typingsJapgolly.soundmanager2.soundmanager2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flash9Options extends js.Object {
  var isMovieStar: js.UndefOr[`true` | Null] = js.undefined
  var onbufferchange: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var ondataerror: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onfailure: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var useEQData: js.UndefOr[Boolean] = js.undefined
  var usePeakData: js.UndefOr[Boolean] = js.undefined
  var useWaveformData: js.UndefOr[Boolean] = js.undefined
}

object Flash9Options {
  @scala.inline
  def apply(
    isMovieStar: `true` = null,
    onbufferchange: js.UndefOr[Callback] = js.undefined,
    ondataerror: js.UndefOr[Callback] = js.undefined,
    onfailure: js.UndefOr[Callback] = js.undefined,
    useEQData: js.UndefOr[Boolean] = js.undefined,
    usePeakData: js.UndefOr[Boolean] = js.undefined,
    useWaveformData: js.UndefOr[Boolean] = js.undefined
  ): Flash9Options = {
    val __obj = js.Dynamic.literal()
    if (isMovieStar != null) __obj.updateDynamic("isMovieStar")(isMovieStar.asInstanceOf[js.Any])
    onbufferchange.foreach(p => __obj.updateDynamic("onbufferchange")(p.toJsFn))
    ondataerror.foreach(p => __obj.updateDynamic("ondataerror")(p.toJsFn))
    onfailure.foreach(p => __obj.updateDynamic("onfailure")(p.toJsFn))
    if (!js.isUndefined(useEQData)) __obj.updateDynamic("useEQData")(useEQData.asInstanceOf[js.Any])
    if (!js.isUndefined(usePeakData)) __obj.updateDynamic("usePeakData")(usePeakData.asInstanceOf[js.Any])
    if (!js.isUndefined(useWaveformData)) __obj.updateDynamic("useWaveformData")(useWaveformData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flash9Options]
  }
}

