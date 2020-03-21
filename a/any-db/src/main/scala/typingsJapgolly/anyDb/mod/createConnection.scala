package typingsJapgolly.anyDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("any-db", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(opts: ConnectOpts): Connection = js.native
  def apply(opts: ConnectOpts, callback: js.Function2[/* error */ js.Error, /* connection */ Connection, Unit]): Connection = js.native
  def apply(url: String): Connection = js.native
  def apply(url: String, callback: js.Function2[/* error */ js.Error, /* connection */ Connection, Unit]): Connection = js.native
}

