package typingsJapgolly.jsSearch.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexStrategy extends js.Object {
  def expandToken(token: String): js.Array[String]
}

object IIndexStrategy {
  @scala.inline
  def apply(expandToken: String => CallbackTo[js.Array[String]]): IIndexStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandToken")(js.Any.fromFunction1((t0: java.lang.String) => expandToken(t0).runNow()))
    __obj.asInstanceOf[IIndexStrategy]
  }
}

