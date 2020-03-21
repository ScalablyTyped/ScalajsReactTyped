package typingsJapgolly.jsonfile

import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathDataOptions extends js.Object {
  def apply(path: Double, data: js.Any): Unit = js.native
  def apply(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  def apply(path: PathLike, data: js.Any): Unit = js.native
  def apply(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
}

