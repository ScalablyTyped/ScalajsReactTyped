package typingsJapgolly.jsurl

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlQuery extends js.Object {
  def clear(): Unit
}

object UrlQuery {
  @scala.inline
  def apply(clear: Callback): UrlQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[UrlQuery]
  }
}

