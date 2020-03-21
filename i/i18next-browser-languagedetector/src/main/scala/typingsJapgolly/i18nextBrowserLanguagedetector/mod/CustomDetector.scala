package typingsJapgolly.i18nextBrowserLanguagedetector.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDetector extends js.Object {
  var cacheUserLanguage: js.UndefOr[js.Function2[/* lng */ String, /* options */ DetectorOptions, Unit]] = js.undefined
  var name: String
  def lookup(options: DetectorOptions): js.UndefOr[String]
}

object CustomDetector {
  @scala.inline
  def apply(
    lookup: DetectorOptions => CallbackTo[js.UndefOr[String]],
    name: String,
    cacheUserLanguage: (/* lng */ String, /* options */ DetectorOptions) => Callback = null
  ): CustomDetector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: typingsJapgolly.i18nextBrowserLanguagedetector.mod.DetectorOptions) => lookup(t0).runNow()))
    if (cacheUserLanguage != null) __obj.updateDynamic("cacheUserLanguage")(js.Any.fromFunction2((t0: /* lng */ java.lang.String, t1: /* options */ typingsJapgolly.i18nextBrowserLanguagedetector.mod.DetectorOptions) => cacheUserLanguage(t0, t1).runNow()))
    __obj.asInstanceOf[CustomDetector]
  }
}

