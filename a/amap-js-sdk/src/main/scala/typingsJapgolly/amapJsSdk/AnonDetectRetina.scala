package typingsJapgolly.amapJsSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.amapJsSdk.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetectRetina extends js.Object {
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var errorUrl: js.UndefOr[String] = js.undefined
  var getTileUrl: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, String]] = js.undefined
  var map: Map
  var opacity: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tileUrl: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonDetectRetina {
  @scala.inline
  def apply(
    map: Map,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorUrl: String = null,
    getTileUrl: (/* x */ Double, /* y */ Double, /* z */ Double) => CallbackTo[String] = null,
    opacity: Int | Double = null,
    tileSize: Int | Double = null,
    tileUrl: String = null,
    zIndex: Int | Double = null,
    zooms: js.Array[Double] = null
  ): AnonDetectRetina = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.asInstanceOf[js.Any])
    if (errorUrl != null) __obj.updateDynamic("errorUrl")(errorUrl.asInstanceOf[js.Any])
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(js.Any.fromFunction3((t0: /* x */ scala.Double, t1: /* y */ scala.Double, t2: /* z */ scala.Double) => getTileUrl(t0, t1, t2).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetectRetina]
  }
}

