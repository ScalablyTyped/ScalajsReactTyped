package typingsJapgolly.promisePg.mod

import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "connect")
@js.native
object connect extends js.Object {
  def apply(connection: String): Promise[Client] = js.native
  def apply(connection: typingsJapgolly.pg.mod.ClientConfig): Promise[Client] = js.native
}

