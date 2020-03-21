package typingsJapgolly.urlTemplate.mod.UrlTemplate

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateParser extends js.Object {
  def parse(template: String): Template
}

object TemplateParser {
  @scala.inline
  def apply(parse: String => CallbackTo[Template]): TemplateParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[TemplateParser]
  }
}

