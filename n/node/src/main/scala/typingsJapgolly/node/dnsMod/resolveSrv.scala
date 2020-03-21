package typingsJapgolly.node.dnsMod

import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "resolveSrv")
@js.native
object resolveSrv extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
}

