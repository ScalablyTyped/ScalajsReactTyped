package typingsJapgolly.jupyterlabApputils.dialogMod

import typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.IOptions
import typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.IResult
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/dialog", "showDialog")
@js.native
object showDialog extends js.Object {
  def apply[T](): js.Promise[IResult[T]] = js.native
  def apply[T](options: Partial[IOptions[T]]): js.Promise[IResult[T]] = js.native
}

