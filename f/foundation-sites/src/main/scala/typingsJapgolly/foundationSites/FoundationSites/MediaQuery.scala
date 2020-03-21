package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQuery extends js.Object {
  var current: String
  var queries: js.Array[String]
  def atLeast(size: String): Boolean
  def get(size: String): String
}

object MediaQuery {
  @scala.inline
  def apply(
    atLeast: String => CallbackTo[Boolean],
    current: String,
    get: String => CallbackTo[String],
    queries: js.Array[String]
  ): MediaQuery = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    __obj.updateDynamic("atLeast")(js.Any.fromFunction1((t0: java.lang.String) => atLeast(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[MediaQuery]
  }
}

