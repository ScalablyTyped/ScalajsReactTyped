package typingsJapgolly.tarFs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackOptions extends Options {
  var dereference: js.UndefOr[Boolean] = js.undefined
  var entries: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("finalize")
  var finalize_FPackOptions: js.UndefOr[Boolean] = js.undefined
  var finish: js.UndefOr[js.Function1[/* pack */ js.Any, Unit]] = js.undefined
}

object PackOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[Boolean] = js.undefined,
    dmode: Int | Double = null,
    entries: js.Array[String] = null,
    filter: /* name */ String => CallbackTo[Boolean] = null,
    finalize: js.UndefOr[Boolean] = js.undefined,
    finish: /* pack */ js.Any => Callback = null,
    fmode: Int | Double = null,
    ignore: /* name */ String => CallbackTo[Boolean] = null,
    map: /* header */ Headers => CallbackTo[Headers] = null,
    mapStream: (/* fileStream */ ReadStream, /* header */ Headers) => CallbackTo[ReadStream] = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): PackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference.asInstanceOf[js.Any])
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => filter(t0).runNow()))
    if (!js.isUndefined(finalize)) __obj.updateDynamic("finalize")(finalize.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1((t0: /* pack */ js.Any) => finish(t0).runNow()))
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => ignore(t0).runNow()))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1((t0: /* header */ typingsJapgolly.tarFs.mod.Headers) => map(t0).runNow()))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2((t0: /* fileStream */ typingsJapgolly.node.fsMod.ReadStream, t1: /* header */ typingsJapgolly.tarFs.mod.Headers) => mapStream(t0, t1).runNow()))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackOptions]
  }
}

