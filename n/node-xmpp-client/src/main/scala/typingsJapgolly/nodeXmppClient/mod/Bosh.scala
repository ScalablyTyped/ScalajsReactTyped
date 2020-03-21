package typingsJapgolly.nodeXmppClient.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bosh extends js.Object {
  var prebind: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ js.Any, Unit]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Bosh {
  @scala.inline
  def apply(prebind: (/* error */ js.Any, /* data */ js.Any) => Callback = null, url: String = null): Bosh = {
    val __obj = js.Dynamic.literal()
    if (prebind != null) __obj.updateDynamic("prebind")(js.Any.fromFunction2((t0: /* error */ js.Any, t1: /* data */ js.Any) => prebind(t0, t1).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bosh]
  }
}

