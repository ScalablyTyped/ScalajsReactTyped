package typingsJapgolly.reduxFirstRouter.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySerializer extends js.Object {
  def parse(queryString: String): js.Object
  def stringify(params: Params): String
}

object QuerySerializer {
  @scala.inline
  def apply(parse: String => CallbackTo[js.Object], stringify: Params => CallbackTo[String]): QuerySerializer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("stringify")(js.Any.fromFunction1((t0: typingsJapgolly.reduxFirstRouter.mod.Params) => stringify(t0).runNow()))
    __obj.asInstanceOf[QuerySerializer]
  }
}

