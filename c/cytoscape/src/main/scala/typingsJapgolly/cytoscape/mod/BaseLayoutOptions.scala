package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayoutOptions extends LayoutOptions {
  var name: String
  // on layoutready event
  var ready: js.UndefOr[LayoutHandler] = js.undefined
  // on layoutstop event
  var stop: js.UndefOr[LayoutHandler] = js.undefined
}

object BaseLayoutOptions {
  @scala.inline
  def apply(
    name: String,
    ready: /* e */ LayoutEventObject => Callback = null,
    stop: /* e */ LayoutEventObject => Callback = null
  ): BaseLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    __obj.asInstanceOf[BaseLayoutOptions]
  }
}

