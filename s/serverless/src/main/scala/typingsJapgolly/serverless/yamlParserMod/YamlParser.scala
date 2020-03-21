package typingsJapgolly.serverless.yamlParserMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YamlParser extends js.Object {
  def parse(yamlFilePath: String): js.Promise[_]
}

object YamlParser {
  @scala.inline
  def apply(parse: String => CallbackTo[js.Promise[js.Any]]): YamlParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[YamlParser]
  }
}

