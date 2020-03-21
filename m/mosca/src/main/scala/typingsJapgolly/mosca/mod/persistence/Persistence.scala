package typingsJapgolly.mosca.mod.persistence

import japgolly.scalajs.react.Callback
import typingsJapgolly.mosca.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistence extends js.Object {
  def wire(server: Server): Unit
}

object Persistence {
  @scala.inline
  def apply(wire: Server => Callback): Persistence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wire")(js.Any.fromFunction1((t0: typingsJapgolly.mosca.mod.Server) => wire(t0).runNow()))
    __obj.asInstanceOf[Persistence]
  }
}

