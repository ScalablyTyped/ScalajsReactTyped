package typingsJapgolly.objection.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnexMappers extends js.Object {
  def postProcessResponse(response: js.Any): js.Any
  def wrapIdentifier(identifier: String, origWrap: js.Function1[/* identifier */ String, String]): String
}

object KnexMappers {
  @scala.inline
  def apply(
    postProcessResponse: js.Any => CallbackTo[js.Any],
    wrapIdentifier: (String, js.Function1[/* identifier */ String, String]) => CallbackTo[String]
  ): KnexMappers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postProcessResponse")(js.Any.fromFunction1((t0: js.Any) => postProcessResponse(t0).runNow()))
    __obj.updateDynamic("wrapIdentifier")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* identifier */ java.lang.String, java.lang.String]) => wrapIdentifier(t0, t1).runNow()))
    __obj.asInstanceOf[KnexMappers]
  }
}

