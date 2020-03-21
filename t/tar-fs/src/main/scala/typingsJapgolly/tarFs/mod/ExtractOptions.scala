package typingsJapgolly.tarFs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractOptions extends Options {
  @JSName("filter")
  var filter_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.undefined
  @JSName("ignore")
  var ignore_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.undefined
}

object ExtractOptions {
  @scala.inline
  def apply(
    dmode: Int | Double = null,
    filter: (/* name */ String, /* header */ js.UndefOr[Headers]) => CallbackTo[Boolean] = null,
    fmode: Int | Double = null,
    ignore: (/* name */ String, /* header */ js.UndefOr[Headers]) => CallbackTo[Boolean] = null,
    map: /* header */ Headers => CallbackTo[Headers] = null,
    mapStream: (/* fileStream */ ReadStream, /* header */ Headers) => CallbackTo[ReadStream] = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* header */ js.UndefOr[typingsJapgolly.tarFs.mod.Headers]) => filter(t0, t1).runNow()))
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* header */ js.UndefOr[typingsJapgolly.tarFs.mod.Headers]) => ignore(t0, t1).runNow()))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1((t0: /* header */ typingsJapgolly.tarFs.mod.Headers) => map(t0).runNow()))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2((t0: /* fileStream */ typingsJapgolly.node.fsMod.ReadStream, t1: /* header */ typingsJapgolly.tarFs.mod.Headers) => mapStream(t0, t1).runNow()))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractOptions]
  }
}

