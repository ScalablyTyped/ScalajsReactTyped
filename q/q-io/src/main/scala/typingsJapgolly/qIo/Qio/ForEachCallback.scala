package typingsJapgolly.qIo.Qio

import typingsJapgolly.node.Buffer
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForEachCallback extends js.Object {
  def apply(chunk: String): Promise[_] = js.native
  def apply(chunk: Buffer): Promise[_] = js.native
}

