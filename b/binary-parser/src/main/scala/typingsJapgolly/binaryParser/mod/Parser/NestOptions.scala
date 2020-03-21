package typingsJapgolly.binaryParser.mod.Parser

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestOptions extends Options {
  var `type`: typingsJapgolly.binaryParser.mod.Parser[_]
}

object NestOptions {
  @scala.inline
  def apply(
    `type`: typingsJapgolly.binaryParser.mod.Parser[_],
    assert: String | Double | (js.Function1[/* value */ Data, Boolean]) = null,
    formatter: /* value */ Data => CallbackTo[js.Any] = null
  ): NestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.binaryParser.mod.Parser.Data) => formatter(t0).runNow()))
    __obj.asInstanceOf[NestOptions]
  }
}

