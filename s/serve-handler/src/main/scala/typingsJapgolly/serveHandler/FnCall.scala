package typingsJapgolly.serveHandler

import typingsJapgolly.node.AnonAutoClose
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: PathLike): ReadStream = js.native
  def apply(path: PathLike, options: String): ReadStream = js.native
  def apply(path: PathLike, options: AnonAutoClose): ReadStream = js.native
}

