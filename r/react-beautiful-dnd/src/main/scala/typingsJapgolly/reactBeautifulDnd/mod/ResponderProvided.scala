package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponderProvided extends js.Object {
  var announce: Announce
}

object ResponderProvided {
  @scala.inline
  def apply(announce: /* message */ String => Callback): ResponderProvided = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("announce")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => announce(t0).runNow()))
    __obj.asInstanceOf[ResponderProvided]
  }
}

