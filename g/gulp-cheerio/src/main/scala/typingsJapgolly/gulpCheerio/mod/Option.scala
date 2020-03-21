package typingsJapgolly.gulpCheerio.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cheerio.CheerioOptionsInterface
import typingsJapgolly.cheerio.CheerioStatic
import typingsJapgolly.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var cheerio: js.UndefOr[CheerioStatic] = js.undefined
  var parserOptions: js.UndefOr[CheerioOptionsInterface] = js.undefined
  var run: js.UndefOr[Callback] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    cheerio: CheerioStatic = null,
    parserOptions: CheerioOptionsInterface = null,
    run: (/* $ */ CheerioStatic, /* file */ File, /* done */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (cheerio != null) __obj.updateDynamic("cheerio")(cheerio.asInstanceOf[js.Any])
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction3((t0: /* $ */ typingsJapgolly.cheerio.CheerioStatic, t1: /* file */ typingsJapgolly.vinyl.mod.File, t2: /* done */ js.UndefOr[js.Function]) => run(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Option]
  }
}

