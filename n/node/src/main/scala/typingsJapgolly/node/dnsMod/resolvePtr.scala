package typingsJapgolly.node.dnsMod

import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "resolvePtr")
@js.native
object resolvePtr extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(hostname: String): js.Promise[js.Array[String]] = js.native
}

