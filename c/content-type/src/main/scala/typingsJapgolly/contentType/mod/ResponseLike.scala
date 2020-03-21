package typingsJapgolly.contentType.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseLike extends js.Object {
  def getHeader(name: String): js.UndefOr[Double | String | js.Array[String]]
}

object ResponseLike {
  @scala.inline
  def apply(getHeader: String => CallbackTo[js.UndefOr[Double | String | js.Array[String]]]): ResponseLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.asInstanceOf[ResponseLike]
  }
}

