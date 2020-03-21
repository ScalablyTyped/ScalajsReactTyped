package typingsJapgolly.peerDial.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var allowStop: Boolean
  var name: String
  var pid: String
  var state: String
  def launch(launchData: String): Unit
}

object App {
  @scala.inline
  def apply(allowStop: Boolean, launch: String => Callback, name: String, pid: String, state: String): App = {
    val __obj = js.Dynamic.literal(allowStop = allowStop.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("launch")(js.Any.fromFunction1((t0: java.lang.String) => launch(t0).runNow()))
    __obj.asInstanceOf[App]
  }
}

