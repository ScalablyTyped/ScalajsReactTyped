package typingsJapgolly.broccoliOutputWrapper

import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallFileDataOptions extends js.Object {
  def apply(file: Double, data: js.Any): Unit = js.native
  def apply(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: js.Any): Unit = js.native
  def apply(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
}

