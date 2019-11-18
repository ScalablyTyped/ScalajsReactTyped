package typingsJapgolly.node

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.AnyRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveAny extends js.Object {
  def apply(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[AnyRecord]] = js.native
}

