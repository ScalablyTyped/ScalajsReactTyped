package typingsJapgolly.jupyterlabApputils.dialogMod

import typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/dialog", "showErrorMessage")
@js.native
object showErrorMessage extends js.Object {
  def apply(title: String, error: js.Any): js.Promise[Unit] = js.native
  def apply(title: String, error: js.Any, buttons: js.Array[IButton]): js.Promise[Unit] = js.native
}

