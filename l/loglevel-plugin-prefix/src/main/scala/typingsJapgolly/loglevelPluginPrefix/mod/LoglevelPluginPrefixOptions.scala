package typingsJapgolly.loglevelPluginPrefix.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoglevelPluginPrefixOptions extends js.Object {
  var format: js.UndefOr[
    js.Function3[
      /* level */ String, 
      /* name */ js.UndefOr[String], 
      /* timestamp */ js.Date, 
      js.UndefOr[String]
    ]
  ] = js.undefined
  var levelFormatter: js.UndefOr[js.Function1[/* level */ String, String]] = js.undefined
  var nameFormatter: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], String]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
}

object LoglevelPluginPrefixOptions {
  @scala.inline
  def apply(
    format: (/* level */ String, /* name */ js.UndefOr[String], /* timestamp */ js.Date) => CallbackTo[js.UndefOr[String]] = null,
    levelFormatter: /* level */ String => CallbackTo[String] = null,
    nameFormatter: /* name */ js.UndefOr[String] => CallbackTo[String] = null,
    template: String = null,
    timestampFormatter: /* date */ js.Date => CallbackTo[String] = null
  ): LoglevelPluginPrefixOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3((t0: /* level */ java.lang.String, t1: /* name */ js.UndefOr[java.lang.String], t2: /* timestamp */ js.Date) => format(t0, t1, t2).runNow()))
    if (levelFormatter != null) __obj.updateDynamic("levelFormatter")(js.Any.fromFunction1((t0: /* level */ java.lang.String) => levelFormatter(t0).runNow()))
    if (nameFormatter != null) __obj.updateDynamic("nameFormatter")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => nameFormatter(t0).runNow()))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (timestampFormatter != null) __obj.updateDynamic("timestampFormatter")(js.Any.fromFunction1((t0: /* date */ js.Date) => timestampFormatter(t0).runNow()))
    __obj.asInstanceOf[LoglevelPluginPrefixOptions]
  }
}

