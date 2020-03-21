package typingsJapgolly.binaryParser.mod.Parser

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringOptions extends Options {
  var encoding: js.UndefOr[String] = js.undefined
  var greedy: js.UndefOr[Boolean] = js.undefined
  var length: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typingsJapgolly.binaryParser.mod.Parser[_], Double])
  ] = js.undefined
  var stripNull: js.UndefOr[Boolean] = js.undefined
  var zeroTerminated: js.UndefOr[Boolean] = js.undefined
}

object StringOptions {
  @scala.inline
  def apply(
    assert: String | Double | (js.Function1[/* value */ Data, Boolean]) = null,
    encoding: String = null,
    formatter: /* value */ Data => CallbackTo[js.Any] = null,
    greedy: js.UndefOr[Boolean] = js.undefined,
    length: Double | String | (js.ThisFunction0[/* this */ typingsJapgolly.binaryParser.mod.Parser[_], Double]) = null,
    stripNull: js.UndefOr[Boolean] = js.undefined,
    zeroTerminated: js.UndefOr[Boolean] = js.undefined
  ): StringOptions = {
    val __obj = js.Dynamic.literal()
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.binaryParser.mod.Parser.Data) => formatter(t0).runNow()))
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(stripNull)) __obj.updateDynamic("stripNull")(stripNull.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroTerminated)) __obj.updateDynamic("zeroTerminated")(zeroTerminated.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringOptions]
  }
}

