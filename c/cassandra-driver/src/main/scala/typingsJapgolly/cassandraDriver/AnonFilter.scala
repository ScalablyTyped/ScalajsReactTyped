package typingsJapgolly.cassandraDriver

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.mod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: js.UndefOr[js.Function1[/* host */ Host, Boolean]] = js.undefined
  var localDc: js.UndefOr[String] = js.undefined
}

object AnonFilter {
  @scala.inline
  def apply(filter: /* host */ Host => CallbackTo[Boolean] = null, localDc: String = null): AnonFilter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* host */ typingsJapgolly.cassandraDriver.mod.Host) => filter(t0).runNow()))
    if (localDc != null) __obj.updateDynamic("localDc")(localDc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

