package typingsJapgolly.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterAsync[SchemaT] extends BaseAdapter[SchemaT] {
  def write(state: js.Object): js.Promise[Unit] = js.native
}

