package typingsJapgolly.cwise.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.cwiseCompiler.mod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserArgs extends js.Object {
  var args: js.Array[ArgType]
  var blockSize: js.UndefOr[Double] = js.undefined
  var funcName: js.UndefOr[String] = js.undefined
  var post: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.undefined
  var pre: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.undefined
  var printCode: js.UndefOr[Boolean] = js.undefined
  def body(a: Double, args: js.Any*): Unit
}

object UserArgs {
  @scala.inline
  def apply(
    args: js.Array[ArgType],
    body: (Double, /* repeated */ js.Any) => Callback,
    blockSize: Int | Double = null,
    funcName: String = null,
    post: (/* a */ Double, /* repeated */ js.Any) => Callback = null,
    pre: (/* a */ Double, /* repeated */ js.Any) => Callback = null,
    printCode: js.UndefOr[Boolean] = js.undefined
  ): UserArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("body")(js.Any.fromFunction2((t0: scala.Double, t1: /* repeated */ js.Any) => body(t0, t1).runNow()))
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (funcName != null) __obj.updateDynamic("funcName")(funcName.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction2((t0: /* a */ scala.Double, t1: /* repeated */ js.Any) => post(t0, t1).runNow()))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction2((t0: /* a */ scala.Double, t1: /* repeated */ js.Any) => pre(t0, t1).runNow()))
    if (!js.isUndefined(printCode)) __obj.updateDynamic("printCode")(printCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserArgs]
  }
}

