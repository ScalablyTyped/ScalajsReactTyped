package typingsJapgolly.heremaps.H.ui.InfoBubble

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import typingsJapgolly.heremaps.H.util.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * content to be added to the info bubble
    */
  var content: String | Node
  /**
    * a callback to be invoked when the info bubble's state changes
    * @param event {H.util.Event}
    */
  var onStateChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(content: String | Node, onStateChange: /* event */ Event => Callback = null): Options = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.heremaps.H.util.Event) => onStateChange(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

