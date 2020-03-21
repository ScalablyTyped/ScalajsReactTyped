package typingsJapgolly.write

import typingsJapgolly.node.AnonEmitClose
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: PathLike): WriteStream = js.native
  def apply(path: PathLike, options: String): WriteStream = js.native
  def apply(path: PathLike, options: AnonEmitClose): WriteStream = js.native
}

