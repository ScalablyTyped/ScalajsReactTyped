package typingsJapgolly.pg.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.pg.pgStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Events")
@js.native
class Events () extends EventEmitter {
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* client */ Client, Unit]): this.type = js.native
}

