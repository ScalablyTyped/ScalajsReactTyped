package typingsJapgolly.du.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var disk: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[js.Function1[/* dir */ String, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(disk: js.UndefOr[Boolean] = js.undefined, filter: /* dir */ String => CallbackTo[Boolean] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disk)) __obj.updateDynamic("disk")(disk.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* dir */ java.lang.String) => filter(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

