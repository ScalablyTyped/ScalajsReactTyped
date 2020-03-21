package typingsJapgolly.easyXapi.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.easyXapi.AnonLevel
import typingsJapgolly.express.mod.Application_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var log: AnonLevel
  var name: String
  var port: Double
  var root: String
  var xHeaderDefaults: js.UndefOr[js.Object] = js.undefined
  def mount(app: Application_): Unit
}

object Config {
  @scala.inline
  def apply(
    log: AnonLevel,
    mount: Application_ => Callback,
    name: String,
    port: Double,
    root: String,
    xHeaderDefaults: js.Object = null
  ): Config = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.updateDynamic("mount")(js.Any.fromFunction1((t0: typingsJapgolly.express.mod.Application_) => mount(t0).runNow()))
    if (xHeaderDefaults != null) __obj.updateDynamic("xHeaderDefaults")(xHeaderDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

