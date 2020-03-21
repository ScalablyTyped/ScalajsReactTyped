package typingsJapgolly.squirrelly.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeHelper extends js.Object {
  var blocks: js.UndefOr[Blocks] = js.undefined
  var helperEnd: js.UndefOr[js.Function0[String]] = js.undefined
  var helperStart: js.UndefOr[
    js.Function2[/* param */ js.UndefOr[String], /* id */ js.UndefOr[String], String]
  ] = js.undefined
  var selfClosing: js.UndefOr[js.Function1[/* param */ js.UndefOr[String], String]] = js.undefined
}

object NativeHelper {
  @scala.inline
  def apply(
    blocks: Blocks = null,
    helperEnd: js.UndefOr[CallbackTo[String]] = js.undefined,
    helperStart: (/* param */ js.UndefOr[String], /* id */ js.UndefOr[String]) => CallbackTo[String] = null,
    selfClosing: /* param */ js.UndefOr[String] => CallbackTo[String] = null
  ): NativeHelper = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    helperEnd.foreach(p => __obj.updateDynamic("helperEnd")(p.toJsFn))
    if (helperStart != null) __obj.updateDynamic("helperStart")(js.Any.fromFunction2((t0: /* param */ js.UndefOr[java.lang.String], t1: /* id */ js.UndefOr[java.lang.String]) => helperStart(t0, t1).runNow()))
    if (selfClosing != null) __obj.updateDynamic("selfClosing")(js.Any.fromFunction1((t0: /* param */ js.UndefOr[java.lang.String]) => selfClosing(t0).runNow()))
    __obj.asInstanceOf[NativeHelper]
  }
}

