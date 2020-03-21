package typingsJapgolly.colorHash.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorHashOptions extends js.Object {
  var hash: js.UndefOr[HashFunction] = js.undefined
  var hue: js.UndefOr[Hue] = js.undefined
  var lightness: js.UndefOr[Lightness] = js.undefined
  var saturation: js.UndefOr[Saturation] = js.undefined
}

object ColorHashOptions {
  @scala.inline
  def apply(
    hash: /* input */ String => CallbackTo[Double] = null,
    hue: Hue = null,
    lightness: Lightness = null,
    saturation: Saturation = null
  ): ColorHashOptions = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => hash(t0).runNow()))
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (lightness != null) __obj.updateDynamic("lightness")(lightness.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHashOptions]
  }
}

