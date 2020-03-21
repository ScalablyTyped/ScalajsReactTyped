package typingsJapgolly.jsonfile

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonfile.mod.FS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEOL extends js.Object {
  var EOL: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var fs: js.UndefOr[FS] = js.undefined
  var mode: js.UndefOr[String | Double] = js.undefined
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  var spaces: js.UndefOr[String | Double] = js.undefined
}

object AnonEOL {
  @scala.inline
  def apply(
    EOL: String = null,
    encoding: String = null,
    flag: String = null,
    fs: FS = null,
    mode: String | Double = null,
    replacer: (/* key */ String, /* value */ js.Any) => CallbackTo[js.Any] = null,
    spaces: String | Double = null
  ): AnonEOL = {
    val __obj = js.Dynamic.literal()
    if (EOL != null) __obj.updateDynamic("EOL")(EOL.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => replacer(t0, t1).runNow()))
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEOL]
  }
}

