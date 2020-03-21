package typingsJapgolly.next

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.nextBooleans.`false`
import typingsJapgolly.next.serverRouterMod.Params
import typingsJapgolly.next.serverRouterMod.RouteMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var `match`: RouteMatch
  var page: String
}

object AnonPage {
  @scala.inline
  def apply(`match`: /* pathname */ js.UndefOr[String | Null] => CallbackTo[`false` | Params], page: String): AnonPage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: /* pathname */ js.UndefOr[java.lang.String | scala.Null]) => `match`(t0).runNow()))
    __obj.asInstanceOf[AnonPage]
  }
}

