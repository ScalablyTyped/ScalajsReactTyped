package typingsJapgolly.shipitCli.mod

import typingsJapgolly.node.childProcessMod.ExecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shipit-cli", "remote")
@js.native
object remote extends js.Object {
  def apply(command: String): js.Thenable[ShipitLocal] = js.native
  def apply(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  def apply(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
}

