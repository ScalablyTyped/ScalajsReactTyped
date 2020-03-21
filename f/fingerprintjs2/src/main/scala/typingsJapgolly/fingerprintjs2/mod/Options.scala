package typingsJapgolly.fingerprintjs2.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fingerprintjs2.AnonAdBlock
import typingsJapgolly.fingerprintjs2.AnonDetectScreenOrientation
import typingsJapgolly.fingerprintjs2.AnonExcludeIE
import typingsJapgolly.fingerprintjs2.AnonExcludeIOS11
import typingsJapgolly.fingerprintjs2.AnonExtendedJsFonts
import typingsJapgolly.fingerprintjs2.AnonGetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ERROR: js.UndefOr[String] = js.undefined
  var EXCLUDED: js.UndefOr[String] = js.undefined
  var NOT_AVAILABLE: js.UndefOr[String] = js.undefined
  var audio: js.UndefOr[AnonExcludeIOS11] = js.undefined
  var excludes: js.UndefOr[AnonAdBlock] = js.undefined
  var extraComponents: js.UndefOr[js.Array[AnonGetData]] = js.undefined
  var fonts: js.UndefOr[AnonExtendedJsFonts] = js.undefined
  var plugins: js.UndefOr[AnonExcludeIE] = js.undefined
  var preprocessor: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  var screen: js.UndefOr[AnonDetectScreenOrientation] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ERROR: String = null,
    EXCLUDED: String = null,
    NOT_AVAILABLE: String = null,
    audio: AnonExcludeIOS11 = null,
    excludes: AnonAdBlock = null,
    extraComponents: js.Array[AnonGetData] = null,
    fonts: AnonExtendedJsFonts = null,
    plugins: AnonExcludeIE = null,
    preprocessor: (/* key */ String, /* value */ js.Any) => CallbackTo[js.Any] = null,
    screen: AnonDetectScreenOrientation = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ERROR != null) __obj.updateDynamic("ERROR")(ERROR.asInstanceOf[js.Any])
    if (EXCLUDED != null) __obj.updateDynamic("EXCLUDED")(EXCLUDED.asInstanceOf[js.Any])
    if (NOT_AVAILABLE != null) __obj.updateDynamic("NOT_AVAILABLE")(NOT_AVAILABLE.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (extraComponents != null) __obj.updateDynamic("extraComponents")(extraComponents.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (preprocessor != null) __obj.updateDynamic("preprocessor")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => preprocessor(t0, t1).runNow()))
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

