package typingsJapgolly.spectrogram.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsJapgolly.spectrogram.AnonEnable
import typingsJapgolly.spectrogram.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpectrogramOptions extends js.Object {
  var audio: js.UndefOr[AnonEnable] = js.undefined
  var canvas: js.UndefOr[AnonHeight] = js.undefined
  var colors: js.UndefOr[
    js.Function1[/* steps */ Double, js.Array[String | CanvasGradient | CanvasPattern]]
  ] = js.undefined
}

object SpectrogramOptions {
  @scala.inline
  def apply(
    audio: AnonEnable = null,
    canvas: AnonHeight = null,
    colors: /* steps */ Double => CallbackTo[js.Array[String | CanvasGradient | CanvasPattern]] = null
  ): SpectrogramOptions = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(js.Any.fromFunction1((t0: /* steps */ scala.Double) => colors(t0).runNow()))
    __obj.asInstanceOf[SpectrogramOptions]
  }
}

