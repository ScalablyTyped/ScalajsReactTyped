package typingsJapgolly.jasmineAjax

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxParamParser extends js.Object {
  def parse(paramString: String): js.Any
  def test(xhr: XMLHttpRequest): Boolean
}

object JasmineAjaxParamParser {
  @scala.inline
  def apply(parse: String => CallbackTo[js.Any], test: XMLHttpRequest => CallbackTo[Boolean]): JasmineAjaxParamParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.XMLHttpRequest) => test(t0).runNow()))
    __obj.asInstanceOf[JasmineAjaxParamParser]
  }
}

