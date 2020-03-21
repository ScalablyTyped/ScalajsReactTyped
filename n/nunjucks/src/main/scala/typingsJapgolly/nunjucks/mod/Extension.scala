package typingsJapgolly.nunjucks.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var tags: js.Array[String]
  // Parser API is undocumented it is suggested to check the source: https://github.com/mozilla/nunjucks/blob/master/src/parser.js
  def parse(parser: js.Any, nodes: js.Any, lexer: js.Any): js.Any
}

object Extension {
  @scala.inline
  def apply(parse: (js.Any, js.Any, js.Any) => CallbackTo[js.Any], tags: js.Array[String]): Extension = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => parse(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Extension]
  }
}

