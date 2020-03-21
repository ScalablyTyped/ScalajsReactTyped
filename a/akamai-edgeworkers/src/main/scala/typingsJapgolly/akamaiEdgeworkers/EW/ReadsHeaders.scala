package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadsHeaders extends js.Object {
  /**
    * Provides header values by header name
    */
  def getHeader(name: String): js.Array[String] | Null
}

object ReadsHeaders {
  @scala.inline
  def apply(getHeader: String => CallbackTo[js.Array[String] | Null]): ReadsHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.asInstanceOf[ReadsHeaders]
  }
}

